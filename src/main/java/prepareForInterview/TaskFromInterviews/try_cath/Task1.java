package prepareForInterview.TaskFromInterviews.try_cath;

public class Task1 {
    //what will happen when:
    public static void main(String[] args) {
        meth();

    }

    private static int meth() {
        try {
            return 7;
        } catch (RuntimeException e) {
            return 6;
        } finally {
            return 8;
        }
//        return 9;
    }
}
