import java.util.HashMap;

public class Verifier21 implements Verifier {
    @Override
    public boolean check(int[] guess, int[] answer) {
        return hasNumberExactlyTwice(answer) == hasNumberExactlyTwice(guess);
    }

    private boolean hasNumberExactlyTwice(int[] array) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int value : array) {
            count.put(value, count.getOrDefault(value, 0) + 1);
        }

        // iterate through all the entries of the hash map
        for (int value : count.values()) {
            if (value == 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "If there is a number present exactly twice";
    }
}