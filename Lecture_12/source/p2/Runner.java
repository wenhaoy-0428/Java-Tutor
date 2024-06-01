

public class Runner {
    public static void main(String[] args) {
        Verifier verifier03 = new Verifier03();
        Verifier verifier08 = new Verifier08();
        Verifier verifier11 = new Verifier11();
        Verifier verifier21 = new Verifier21();
        Verifier[] verifiers = {verifier03, verifier08, verifier11, verifier21};
        try {
            Machine machine = new Machine(new int[]{1, 2, 3}, verifiers);

            System.out.println(machine.turn(new int[]{2,3,1}, "a,b,f"));
        } catch (IncorrectDataException e) {
            // Handle the exception appropriately
            System.out.println("Error: " + e.getMessage());
        }
    }
}
