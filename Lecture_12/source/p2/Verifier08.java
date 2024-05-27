public class Verifier08 implements Verifier {
    @Override
    public boolean check(int[] guess, int[] answer) {
        int guessOnes = countOnes(guess);
        int answerOnes = countOnes(answer);
        return guessOnes == answerOnes;
    }

    private int countOnes(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value == 1) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Number of 1s in the code";
    }
}
