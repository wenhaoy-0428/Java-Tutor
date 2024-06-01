import java.util.Arrays;
import java.util.List;

class Machine {
    private int[] answer;
    private List<Verifier> verifiers;

    public Machine(int[] answer, Verifier[] verifiers) throws IncorrectDataException {
        validateInput(answer);
        this.answer = answer;
        this.verifiers = Arrays.asList(verifiers);
    }

    public Machine(int[] answer, List<Verifier> verifiers) throws IncorrectDataException {
        validateInput(answer);
        this.answer = answer;
        this.verifiers = verifiers;
    }

    private void validateInput(int[] input) throws IncorrectDataException {
        if (input.length != 3) {
            throw new IncorrectDataException();
        }
        for (int value : input) {
            if (value < 1 || value > 5) {
                throw new IncorrectDataException();
            }
        }
    }

    private void validateVerifierChoices(char[] verifierChoices) throws IncorrectDataException {
        if (verifierChoices.length > verifiers.size() || verifierChoices.length != 3) {
            throw new IncorrectDataException();
        }
        for (char verifierChoice : verifierChoices) {
            if (!(verifierChoice >= 'A' && verifierChoice < (char)('A' + verifiers.size())) && !(verifierChoice >= 'a' && verifierChoice < (char)('a' + verifiers.size() ))) {
                throw new IncorrectDataException();
            }

        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Verifiers:\n");
        char verifierChar = 'A';
        for (int i = 0; i < verifiers.size(); i++) {
            Verifier verifier = verifiers.get(i);
            sb.append(verifierChar).append(") ").append(verifier.toString());
            if (i < verifiers.size() - 1) {
                sb.append("\n");
            }
            verifierChar++;
        }
        return sb.toString();
    }

    public String turn(int[] guess, char[] verifierChoices) throws IncorrectDataException {
        validateInput(guess);
        validateVerifierChoices(verifierChoices);

        StringBuilder sb = new StringBuilder();
        sb.append("Results for guess ");
        for (int value : guess) {
            sb.append(value);
        }
        sb.append(":\n");
        
        int[] indexes = new int[verifierChoices.length];
        for (int i = 0; i < verifierChoices.length; i++) {
            char verifierChoice = verifierChoices[i];
            int verifierIndex = Character.toUpperCase(verifierChoice) - 'A';
            indexes[i] = verifierIndex;
        }
        Arrays.sort(indexes);

        for (int i = 0; i < verifierChoices.length; i++) {
            int verifierIndex = indexes[i];
            Verifier verifier = verifiers.get(verifierIndex);
            boolean result = verifier.check(guess, this.answer);
            sb.append((char)('A' + verifierIndex)).append(") ").append(result);
            if (i < verifierChoices.length - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public String turn(int[] guess, String verifierChoices) throws IncorrectDataException {
        String[] parts = verifierChoices.split(",");
    
        // Create a char array with the same length as the number of parts
        char[] verifierChars = new char[parts.length];
        
        // Iterate through the parts and convert each part to a char
        for (int i = 0; i < parts.length; i++) {
            verifierChars[i] = parts[i].trim().charAt(0);
        }
        
        return turn(guess, verifierChars);
    }

    public boolean finalGuess(int[] guess) throws IncorrectDataException {
        validateInput(guess);
        for (Verifier verifier : verifiers) {
            if (!verifier.check(guess, this.answer)) {
                return true;
            }
        }
        return false;
    }
}