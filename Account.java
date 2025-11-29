import java.util.Scanner;
import java.io.Console;
class Q23{
    static String name, email, password,acc;
    static int age ;

    
    // static String accountType = "";
    // static String relatedName = "";
    // static int relatedAge = 0;
    // static double balance = 0;
    // static String lastTransaction = "No Transaction Yet"; // only keep latest transaction
    // static Scanner sc = new Scanner(System.in);

    // Colors for menu
    static final String Reset = "\u001B[0m";
    static final String Red = "\u001B[31m";
    static final String Green = "\u001B[32m";
    static final String Yellow = "\u001B[33m";
    static final String Blue = "\u001B[34m";
    static final String Cyan = "\u001B[36m";
    static final String White = "\u001B[47m";
    static final String Purple = "\u001B[105m";

    // Clear Screen
    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.print("Enter Holder Full Name: ");
         name = sc.nextLine();
        if(name.matches("^[a-zA-Z ]{3,}$")){   //new mwthod
            break;
        }else{
            System.out.println("Invalid Name!. Enter Character Only!");
            //name=sc.nextLine();
        }
    }

        while(true){
        System.out.println("Enter Account Number");
        acc=sc.next();                //wy int not because didn't take more than 10 
        if(acc.matches("\\d{12}")){
           break;
        }else{
            System.out.println("Enter 12 digit accont number ");
        }}//acc=sc.next();

        
        sc.nextLine();
        while(true){
        System.out.print("Enter Email ID: ");
        email = sc.nextLine();
        if(email.indexOf('@')>0&&email.indexOf('.')>email.indexOf("@")){   //new method
            break;
        }else{
            System.out.println("Invalid Email. Please Enter Again!");
            
        }}
        
        while(true){
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        if(age<18){
            System.out.println("age");
            break;
        }else if(age > 100){
            System.out.println("Invalid age ");
        }else{
            break;
        }}
       
        //Password
        Console console = System.console();    //new method 
        char pass[] = console.readPassword("Enter password");
        String password = new String(pass);
        System.out.println("Details Get Successfully!");

        System.out.println( Blue+"Select Account Type:"+Reset);
        System.out.println(Green+"1. Joint Account (Min 5000)"+Reset);
        System.out.println(Yellow+"2. Saving Account (Min 2000)"+Reset);
        System.out.println(Green+"3. Child Account (Min 1000)"+Reset);
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        String accountType = "";
        double balance = 0;
        String relatedName = "";
        int relatedAge = 0;
        

        if (choice == 1) {
            accountType = "Joint Account";
            System.out.print("Spouse Name: ");
            while(true){
            relatedName = sc.nextLine();
            if(relatedName.matches("^[a-zA-Z ]{3,}$")){   //new mwthod
              break;
            }else{
            System.out.println("Invalid Name!. Enter Character Only!");
            //name=sc.nextLine();
            }
            }
            System.out.print("Spouse Age: ");
            while(true){
            relatedAge = sc.nextInt();
            if(relatedAge >100&&relatedAge<0){
                System.out.println("Invalid Age");
            }else{
                break;
            }
            }
            balance = 5000;
        
        }else if (choice == 2) {
            accountType = "Saving Account";
            System.out.print("Nominee Name: ");
            while(true){
            relatedName = sc.nextLine();
            if(relatedName.matches("^[a-zA-Z ]{3,}$")){   //new mwthod
              break;
            }else{
            System.out.println("Invalid Name!. Enter Character Only!");
            //name=sc.nextLine();
            }
            }
            System.out.print("Nominee Age: ");
            while(true){
            relatedAge = sc.nextInt();
            if(relatedAge <100&&relatedAge>0){
                break;
            }else{
                System.out.println("Invalid Age");
            }
            }
            balance = 2000;
        } else if (choice == 3) {
            accountType = "Child Account";
            System.out.print("Guardian Name: ");
            while(true){
            relatedName = sc.nextLine();
            if(relatedName.matches("^[a-zA-Z ]{3,}$")){   //new mwthod
              break;
            }else{
            System.out.println("Invalid Name!. Enter Character Only!");
            //name=sc.nextLine();
            }
            }
            System.out.print("Guardian Age: ");
            while(true){
            relatedAge = sc.nextInt();
            if(relatedAge<100&&relatedAge>0){
                break;
            }else{
                System.out.println("Invalid Age");
            }
            }
            balance = 1000;
        }
        boolean exit = false;
        sc.nextLine();
         double with=0,dep=0;
        while (!exit) {
            clearScreen();
            System.out.println(Blue+"\n=========Bank Menu:=========="+Reset);
            System.out.println(Yellow+"1. Deposit"+Reset);
            System.out.println(Red+"2. Withdraw"+Reset);
            System.out.println(Green+"3. Show Account Details"+Reset);
            System.out.println(Red+"4. Exit"+Reset);
            System.out.print(Cyan+"Choose: "+Reset);
            int op = sc.nextInt();
            sc.nextLine();
            char entpass[] = console.readPassword("Enter password");
            String enteredPass = new String(entpass);
            if (!enteredPass.equals(password)) {
                System.out.println("Incorrect Password!");
                continue;
            }
            if (op == 1) {
                System.out.print("Enter amount to deposit: ");
                dep = sc.nextDouble();
                balance += dep;
                System.out.println("Deposited: " + 
                dep + ". Current Balance: " + balance);
                clearScreen();
            }
            
            else if (op == 2) {
                System.out.print("Enter amount to withdraw: ");
                with = sc.nextDouble();
                if (with > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                     balance -= with;
                    System.out.println("Withdrawn: " + with + ". Current Balance: " + balance);
                clearScreen();
                }

            } else if (op == 3) {
                System.out.printf(Purple+Blue+"\n==================== Account Details ==================="+Reset);System.out.println();
                System.out.printf(Purple+Yellow+"%-15s %-35s"+Reset,"Name              : ",name);System.out.println();
                System.out.printf(Purple+Red+ "%-15s %-35s"+Reset,"Account Number    : ",acc);System.out.println();
                System.out.printf(Purple+Red+ "%-15s %-35s"+Reset,"Email             : ",email);System.out.println();
                System.out.printf(Purple+Cyan+"%-15s %-35s"+Reset,"Age               : " , age);System.out.println();
                System.out.printf(Purple+Green+ "%-15s %-35s"+Reset,"Account Type      : " , accountType);System.out.println();
                System.out.printf(Purple+Yellow+"%-15s %-35s"+Reset,"Related Name      : " , relatedName);System.out.println();
                System.out.printf(Purple+Red+ "%-15s %-35s"+Reset ,"Related Age       : " , relatedAge);System.out.println();
                System.out.printf(Purple+Blue+"%-15s %-35s"+Reset,  "Deposite          : ",dep);System.out.println();
                System.out.printf(Purple+Blue+"%-15s %-35s"+Reset,  "Withdraw          : ",with);System.out.println();
                System.out.printf(Purple+Blue+"%-15s %-35s"+Reset,"Balance           : ", balance);
                
                
             } else if (op == 4) {
                 System.out.println("Exiting. Thank you!");
                

            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
