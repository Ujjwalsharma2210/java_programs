public class SwitchStatements {
    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You are an admin.");
                break;
            case "User":
                System.out.println("You are a user.");
                break;
            default:
                System.out.println("You are a guest.");
        }
    }
}
