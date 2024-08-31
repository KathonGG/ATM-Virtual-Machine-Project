import java.util.Scanner;
public class login_account {
    void login_account(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter login and password information.");
        System.out.println("");
        System.out.println("Login:");
        System.out.println("");
        String loginScanner = scanner.nextLine();
        System.out.println("");
        System.out.println("Password:");
        System.out.println("");
        String passwordScanner = scanner.nextLine();
        scanner.close();
        
    }
}
