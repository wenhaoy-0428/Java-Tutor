public class Bug {
    String message;
    static int bugsGenerated;
    // MODIFICATION #4
    boolean isSolved = false;

    public Bug() {
        // MODIFICATION #1
        this.message = "Unknown cause";
        // MODIFICATION #2
        Bug.bugsGenerated++;
    }

    public Bug(String cause) {
        this.message = cause;
        bugsGenerated++;
    }

    public void solved() {
        // MODIFICATION #3
        if (isSolved) {
            return;
        }
        this.isSolved = true;
        bugsGenerated--;
    }

    public static boolean bugFree() {
        boolean bugFree = bugsGenerated == 0;
        if (bugFree = true) {
            return true;
        } else {
            return false;
        }
    }

    public String getMessage() {
        return this.message;
    }

    public static int bugCount() {
        return bugsGenerated;
    }

}