package JavaFundamentalsCoding.PrimaClasa;

public class TryCatchExample {
    public static void main(String[] args) {


        try {
            System.out.println("Try");
            float a = 1 / 0;

            //some more code

            /// some more code
        } catch (Exception e) {
            // exception caught as send email to admin, log errors, etc
            System.out.println("Exception caught");
        } finally {

            // send email anyway, close connections, etc
            System.out.println("Finally");
        }
    }
}
