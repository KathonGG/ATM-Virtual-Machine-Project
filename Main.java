import java.util.Scanner;
public class Main {
    public void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int invalidAttempts = 0;
        final int MAX_INVALID_ATTEMPTS = 6;

        System.out.println("Hello dear customer, this is MonetaryATM service.");
        System.out.println("You'll be transfered into a login or register page.");

            while (true) {
        System.out.println("\nPlease choose one of the options bellow");
        System.out.println("");
        System.out.println("1: Log in");
        System.out.println("2: Create an account");
        System.out.println("3: Can't remember my account/Needs further assistance");
        System.out.println("");

        
        int customer_choice = scanner.nextInt();

        if(customer_choice == 1){
            System.out.println("");
            System.out.println("You choose to log in.");
            System.out.println("");
            break;
        }else if(customer_choice == 2){
            System.out.println("");
            System.out.println("You choose to create an account.");
            System.out.println("");
            break;
        }else if(customer_choice == 3){
            System.out.println("");
            System.out.println("You choose to have further assistance to log in.");
            System.out.println("");
            break;
        }else{
            System.out.println("");
            System.out.println("Invalid choice, please select one of the options listed.");
            
            invalidAttempts++;

        if(invalidAttempts == 3){
            System.out.println("\nDear customer. You have 3 more attempts before the system's server close your tries and is put into an cooldown.\\n" + //
                                " Read the options carefully\n");
        }else if(invalidAttempts == 4){
            System.out.println("\nDear customer. You have 2 more attempts before the system's server close your tries and is put into an cooldown.\\n" + //
                                " Read the options carefully\n");
        }else if(invalidAttempts == 5){
            System.out.println("\nDear customer. You have 1 more attempts before the system's server close your tries and is put into an cooldown.\\n" + //
                                " Read the options carefully\n");
        }else if(invalidAttempts >= MAX_INVALID_ATTEMPTS){
            System.out.println("\nDear customer. You have made too many invalid attempts. Please contact customer support for assistance.\n");
            break;
        }
            }
        
            }

        scanner.close();
    }
}
