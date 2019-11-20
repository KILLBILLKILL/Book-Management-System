import classes.User;

public class Main {

    public static void main(String[] args) throws Exception {

            User currentUser = User.login();
            boolean isQuit =false;
            do {
                currentUser.menu();
                currentUser.input();

            } while (!isQuit);

            System.out.println("欢迎下次光临");

    }
}
