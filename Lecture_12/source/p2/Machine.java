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
        if (verifierChoices.length > verifiers.size()) {
            throw new IncorrectDataException();
        }
        for (char verifierChoice : verifierChoices) {
            if (!(verifierChoice > 'A' && verifierChoice < 'Z') || (verifierChoice > 'a' && verifierChoice < 'z')) {
                throw new IncorrectDataException();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Verifiers:\n");
        char verifierChar = 'A';
        for (Verifier verifier : verifiers) {
            sb.append(verifierChar).append(") ").append(verifier.toString()).append("\n");
            verifierChar++;
        }
        return sb.toString();
    }

    public String turn(int[] guess, char[] verifierChoices) throws IncorrectDataException {
        validateInput(guess);
        validateVerifierChoices(verifierChoices);

        StringBuilder sb = new StringBuilder();
        sb.append("Results for guess ");
        sb.append(Arrays.toString(guess));
        sb.append(":\n");

        for (char verifierChoice : verifierChoices) {
            int verifierIndex = Character.toUpperCase(verifierChoice) - 'A';
            Verifier verifier = verifiers.get(verifierIndex);
            boolean result = verifier.check(guess, this.answer);
            sb.append(Character.toUpperCase(verifierChoice)).append(") ").append(result).append("\n");
        }

        return sb.toString();
    }

    public String turn(int[] guess, String verifierChoices) throws IncorrectDataException {
        char[] verifierChars = verifierChoices.toCharArray();
        return turn(guess, verifierChars);
    }

    public boolean finalGuess(int[] guess) throws IncorrectDataException {
        validateInput(guess);
        for (Verifier verifier : verifiers) {
            if (!verifier.check(guess, this.answer)) {
                return false;
            }
        }
        return true;
    }
}