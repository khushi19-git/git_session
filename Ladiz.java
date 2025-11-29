import java.util.Scanner;

class LadiesMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== LADIES SPECIAL MENU (4 to 6 PM) =====");
        System.out.println("A. Rs. 250/-");
        System.out.println("   1 Soup or Welcome Drink");
        System.out.println("   1 Snacks");
        System.out.println("--------------------------------");
        System.out.println("B. Rs. 300/-");
        System.out.println("   1 Soup or Welcome Drink");
        System.out.println("   2 Snacks");
        System.out.println("--------------------------------");
        System.out.println("C. Rs. 350/-");
        System.out.println("   1 Soup or Welcome Drink");
        System.out.println("   1 Paneer Starter");
        System.out.println("   1 Snacks");
        System.out.println("--------------------------------");

        System.out.print("Enter your choice (A / B / C): ");
        char choice = sc.next().toUpperCase().charAt(0);

        switch(choice) {
            case 'A':
                System.out.println("\nYou selected MENU A - Rs.250");
                System.out.println("Includes:");
            
                
                break;

            case 'B':
                System.out.println("\nYou selected MENU B - Rs.300");
                System.out.println("Includes:");
                
                break;

            case 'C':
                System.out.println("\nYou selected MENU C - Rs.350");
                System.out.println("Includes:");
                
                break;

            default:
                System.out.println("Invalid Choice! Please select A, B or C.");
        }

        
    }
}
