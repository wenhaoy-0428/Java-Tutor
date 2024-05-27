public class Runner {
    public static void main(String[] args) {
        Bug bug1 = new Bug();
        Bug bug2 = new Bug();
        System.out.println(Bug.bugCount());
        bug1.solved();
        System.out.println(Bug.bugCount());
        bug1.solved();
        System.out.println(Bug.bugCount());
    }
}