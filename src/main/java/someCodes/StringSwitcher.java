package someCodes;

public class StringSwitcher {
    public static void main(String[] args) {
        String status = "connect";
        System.out.println("status.hashCode() before = " + status.hashCode());

        switch (status) {
            case ("connect"):
                System.out.println("Connecting to date base");
                status = "reconnect";
                System.out.println("status.hashCode() after change = " + status.hashCode());
                System.out.println("status set like reconnect");
            case ("test"):
                System.out.println("reconnecting right now");
                break;
            case ("reconnect"):
                System.out.println("reconnecting right now");
                break;

        }


    }
}
