
public class Verifier03 implements Verifier {
    @Override
    public boolean check(int[] guess, int[] answer) {
        return guess[1] < 3 && answer[1] < 3 || guess[1] == 3 && answer[1] == 3 || guess[1] > 3 && answer[1] > 3;
    }

    @Override
    public String toString() {
        return "Compares the 2nd digit to the value '3' (is it < 3, = 3 or > 3?)";
    }
}