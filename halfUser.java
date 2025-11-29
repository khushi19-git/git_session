// // import java.text.SimpleDateFormat;
import java.util.Scanner;
// // import java.util.Date;
// // import java.text.ParseException;
// class User{
//     public static final String Red = "\u001B[31m";
//    public static final String Green = "\u001B[32";
//    public static final String Yellow = "\u001B[33m";
//    public static final String Blue = "\u001B[34m";
//    public static final String White = "\u001B[35m";
//    public static final String Reset = "\u001B[0m";
//    public static final String Black = "\u001B[30m";
//    public static final String Purple = "\u001B[35m";
//    public static final String bg_BROWN = "\u001B[48;2;122;28;28m";
   
//    //public static final String RESET = "\u001B[0m";
//     public static final String BG_RED = "\u001B[41m";
//     public static final String BG_GREEN = "\u001B[42m";
//     public static final String BG_BLUE = "\u001B[44m";
//     public static final String BG_purple = "\u001B[45";
//     public static final String PEACH = "\u001B[48;2;255;218;185m";
// //    static String name,num,bookingDate;
   
// //         public static void main(String args[]){
// //         Scanner sc = new Scanner(System.in);
// //         //Customer name
// //         while(true){
// //         System.out.print("Enter Customer Name: ");
// //          name = sc.nextLine();
// //         if(name.matches("[a-zA-Z ]+")){   //new mwthod
// //             break;
// //         }else{
// //             System.out.println("Invalid Name!. Enter Character Only!");
// //             //name=sc.nextLine();
// //         }}

// //         //mobile number
// //         while(true){
// //         System.out.println("Enter Number");
// //         num= sc.nextLine();                //wy int not because didn't take more than 10 
// //         if(num.matches("\\d{10}")){
// //            break;
// //         }else{
// //             System.out.println("Enter mobile number ");
// //         }}//acc=sc.next();

// //         //date booking
// //          SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
// //         sdf.setLenient(false); // strict checking (no 32-13-2025 etc.)

// //         Date bookingDate = null;

// //         while (bookingDate == null) { // jab tak sahi date na mile loop chalega
// //             System.out.print("Enter Booking Date (dd-mm-yyyy): ");
// //             String input = sc.nextLine();
// //             try{
// //                 bookingDate = sdf.parse(input); // parse karke check karega
// //             } catch (ParseException e) {
// //                 System.out.println("Invalid date! Please enter in dd-mm-yyyy format.");
// //             }
// //         }

// //         System.out.println("Booking Date confirmed: " + sdf.format(bookingDate));
// //         sc.close();
        



// //        // Menu obj = new  Menu();
// //         //obj.menu();
// //         // System.out.println("Enter Choice :");
// //         // int choice = sc.nextInt();
// //         // choose(choice);
// //     }
// // }    

// void SoupChoice() {
//         Scanner sc = new Scanner(System.in);
//         System.out.printf(PEACH+bg_BROWN+"%-60s" + Reset + "\n", " OPTIONS FOR SOUPS ");
//         System.out.printf(PEACH+Black+ "%-60s" + Reset + "\n", "1. Tomato Soup           (Rs 50)");
//         System.out.printf(PEACH+Black+ "%-60s" + Reset + "\n", "2. Veg Manchow Soup      (Rs 60)");
//         System.out.printf(PEACH+Black+ "%-60s" + Reset + "\n", "3. Hot and Sour Veg Soup (Rs 70)");
//         System.out.printf(PEACH+Black+ "%-60s" + Reset + "\n", "4. Lemon Coriander Soup  (Rs 65)");
//         while(true){
//         System.out.println("Enter Soup Choice :");
//         int soupChoice = sc.nextInt();
//         switch (soupChoice) {
//                 case 1:
//                     System.out.println("Tomato Soup");
//                     break;
//                 case 2: 
//                     System.out.println("Veg Manchow");break;
//                 case 4:
//                     System.out.println("Lemon Coriander");break;
//                 case 3:
//                     System.out.println("Hot & Sour Veg");break;
//                 default:
//                 System.out.println("Invalid Enter again ");
//                 soupChoice = sc.nextInt();
//         }
//      }
//     }
//     void DrinkChoice() {
//         Scanner sc = new Scanner(System.in);
//         System.out.printf(PEACH + bg_BROWN+ "%-60s" + Reset + "\n", " OPTIONS FOR WELCOME DRINKS ");
//         System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "1. Orange Juice    (Rs 40)");
//         System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "2. Mango Juice     (Rs 50)");
//         System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "3. Apple Juice     (Rs 45)");
//         System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "4. Blueberry Juice (Rs 55)");
//         while(true){
//         System.out.println("Enter Drink Choice :");
//         int drinkChoice = sc.nextInt();
//         switch (drinkChoice) {
//             case 1: System.out.println("Orange Juice "); break;
//             case 2: System.out.println("Mango Juice "); break;
//             case 3: System.out.println( "Apple JUice"); break;
//             case 4: System.out.println( "Blueberry Juice"); break;
//             default: System.out.println("Invalid choice for Drink!");
//             drinkChoice = sc.nextInt();
//         }
//     }
// }
// }
static final double thali1 = 310,thali2 = 360,thali3 = 410,thali4 = 470,thali5 = 600;
// class Bill{
    
//     int bookMem ,actualMem;
//     double tax = 3;
//     double discount=5;

//     void getData(){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Number Of Menbers");
//     bookMem = sc.nextInt();

//     System.out.println("Enter Member Come");
//     actualMem = sc.nextInt();
//     }
//     void setData(int bookMem,int actualMem){
//         this.bookMem = bookMem;
//         this.actualMem= actualMem;
//     }
//    int extraMem = 0;
//    if(actualMem>bookMem){
//       extraMem = actualMem - bookMem;
//       System.out.println("Extra Memeber : "+extraMem);  
//    }
// //    private static void backMenu() {
// //  //----------------------------------------------------------------------------------------
     
// //      //----------------------------------------------------------------------------------------
// //      // ===>START
// //      System.out.printf("%-60s%s%-97s%s%n",bgBlack,tcWhite,"WEL COME TO JMB (JAIN MITHAI BHANDHAR )", RESET);  
// //      System.out.printf(String.format("%-30s%s%-80s%-57s%s%n", bgMaroon,tcWhite , "{VEGETABLES}","{DAL}", RESET));
// //      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Nav Ratan Korma ","*Methi Mutter Malai",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",bgWhite,tcBlack,"*Dal Fry ","*Dal Makhani",RESET,RESET));
// //      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*lohori Aloo with Mutter ","*Haryali Kofla",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",bgWhite,tcBlack,"*Dal Tadka","*Dal Panchrangi",RESET,RESET));
// //      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Mix Veg ","*Chana Masala",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%-32s%-51s%s",bgMaroon,tcWhite,"{RICE} ",RESET,RESET));
// //    //   System.out.printf("%-60s","------------------");
// //      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Green Chana (Seasonal)","*Bhindi Masala",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",bgWhite,tcBlack,"*Rice ","*Veg Pulao",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Corn Palak ","*Jeera Aloo",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",bgWhite,tcBlack,"*Jeera Rice ","*Veg Fried Rice",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Aloo 65 ","*Dum Aloo",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",bgWhite,tcBlack,"*Green Peas Pulao ","*Veg Biryani",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Alloo Mutter ","*Gujrati Aloo",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%-32s%-51s%s",bgMaroon,tcWhite,"{ROTI} ",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Aloo Capsicum ","*Tinda Masala",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",bgWhite,tcBlack,"*Roti ","*Naan",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Aloo Do Pyaza ","*Aloo Palak",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",bgWhite,tcBlack,"*Paratha ","*Missi Roti",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Aloo Gobhi/Tomatto ","*Seasonal Veg",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",bgWhite,tcBlack,"*Kulcha ","*Methi Poori",RESET,RESET));
// //======> TERMS AND CONDITION
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Gobhi Mutter ","*Bhindi Do Pyaza",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%-28s%-55s%s",bgMaroon,tcWhite,"{TERMS & CONDITION} ",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Kadi Panjabi ","*Veg Kolhapuri",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*Non Refundable advance.",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Veg. Kofla(Gol) ","*Corn Capsicum",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*100% Amount has to be paid before the function Date.",RESET,RESET));

// //=====>SNACKS
//      System.out.println((String.format("%-8s%-25s%-53s%s",bgMaroon,tcWhite,"{SNACKS} ",RESET,RESET))+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*Food Parcel from the buffets strictly prohibited. ",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Idli/Vada Shambhar ","*Noodlies",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*All walking children will be charged full rate. ",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Pav Bhaji ","*Chhole Bhatura",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*Buffet minimum 25 Person will be compulsory,",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Chhola Kulcha ","*Chhola Poori",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack," Hi-Tea minimum 15 Person will be compulsory.",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Methi Paratha ","*Paratha with Dahi(Limited)",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*Taxes & Charges as applicable.",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Stuffed Paratha","*Aloo Paratha",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*Hall rent included in rates (for 3 hrs.) DJ, ",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Muli Paratha ","*Gobhi Paratha",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack," Tent House rate will be applicable.",RESET,RESET));

// //=========>STARTER
//       System.out.println((String.format("%-8s%-25s%-53s%s",bgMaroon,tcWhite,"{STARTER} ",RESET,RESET))+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*Starter will not be served after the lunch or dinner starts.",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Mix Veg Pakoda ","*Veg Cutlet",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*No Item will be served on the table.Starter is limited.",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Veg Finger","*Veg Kothey",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*If starter is served in buffet in lunch or dinner 20/-per person extra.",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Bread Pakoda ","*Hara Bhara Kabab",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*An advance of 50% of the total estimated amount will enable",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Methi Kabab ","*Corn Chat",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack," us to confirm your banquet booking. Payment is on guaranteed ",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Moong Pakoda","*Aloo Chat",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack," person or onactual head count which ever is more.",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Dragon Aloo ","*Saboo Dana vada",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*Any change in menu has to be intimated at least 5 days in ",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Saboo Dana ","*Veg Manchurian Dry",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack," advance, Any menu item beyond our Banquet Menu shall be charged",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Finger Chips ","*Tandori Manchurian",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack," as per our Restaurant menu.",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Aloo Corn Kabab ","*Chinese Corn Kabab",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*Booking confirmed in the open air is at customers risk with",RESET,RESET));

// //=========>cHINESE & CONTINENTAL
//      System.out.println((String.format("%-8s%-25s%-53s%s",bgMaroon,tcWhite,"{CHINESE & CONTINENTAL} ",RESET,RESET))+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack," regards to any unfavorable climatic conditions Buffet of the",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Backed Veg ","*Backed Palak",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack," Party will be served till 11.",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Veg Manchurian","*Veg Singapoori Noodles",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack,"*Hotel is not responsible for any gifts items, gifts vouchers,",RESET,RESET));
//      System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Veg Noodles","*Veg Fried Rice ",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",bgWhite,tcBlack," Owner him self is responsible for all his items.",RESET,RESET));

//      System.out.printf("%-60s%s%-97s%s%n",bgRed,tcBlack,"Parking of Vechicle is at  Vechicle Owner Risk",RESET);
//      System.out.printf("%-70s%s%-87s%s",bgRed,tcBlack,"THANK YOU FOR VISITING",RESET);
//      System.out.println();
//    }
// }  
     
     
    //  System.out.printf(String.format("%-30s%s%-80s%s%n", bgMaroon,tcWhite , "{VEGETABLES}", RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Nav Ratan Korma ","*Methi Mutter Malai",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*lohori Aloo with Mutter ","*Haryali Kofla",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Mix Veg ","*Chana Masala",RESET,RESET));

    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Green Chana (Seasonal)","*Bhindi Masala",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Corn Palak ","*Jeera Aloo",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Aloo 65 ","*Dum Aloo",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Alloo Mutter ","*Gujrati Aloo",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Aloo Capsicum ","*Tinda Masala",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Aloo Do Pyaza ","*Aloo Palak",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Aloo Gobhi/Tomatto ","*Seasonal Veg",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Gobhi Mutter ","*Bhindi Do Pyaza",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Kadi Panjabi ","*Veg Kolhapuri",RESET,RESET));
    //  System.out.println(String.format("%-8s%s%-25s%-45s%s",bgWhite,tcBlack,"*Veg. Kofla(Gol) ","*Corn Capsicum",RESET,RESET));

       
   


//RESET
    //    public static final String RESET = "\u001B[0m";
    //  //TEST COLOURS
    //    public static final String tcBlack="\u001B[30m"; // Black
    //    public static final String tcRed="\u001B[31m"; // Red
    //    public static final String tcGreen="\u001B[32m"; // Green
    //    public static final String tcYellow="\u001B[33m"; // Yellow
    //    public static final String tcBlue="\u001B[34m"; // Blue
    //    public static final String tcPurple="\u001B[35m"; // Purple
    //    public static final String tcCyan="\u001B[36m"; // Cyan
    //    public static final String tcWhite="\u001B[37m"; // White
    //    public static final String tcBrightBlack="\u001B[90m"; // Bright Black (Gray)
    //    public static final String tcBrightWhite="\u001B[97m"; // Bright White
    //    public static final String tcMaroon = "\u001B[31m";  // Red

    //  // Background Colours
    //    public static final String bgBlack="\u001B[40m";  // Black
    //    public static final String bgRed="\u001B[41m";  // Red
    //    public static final String bgGreen="\u001B[42m";  // Green
    //    public static final String bgYellow="\u001B[43m";  // Yellow
    //    public static final String bgBlue="\u001B[44m";  // Blue
    //    public static final String bgPurple="\u001B[45m";  // Purple
    //    public static final String bgCyan="\u001B[46m";  // Cyan
    //    public static final String bgWhite="\u001B[47m";  // White
    //    public static final String bgBrightBlack="\u001B[100m"; // Bright Black
    //    public static final String bgBrightWhite="\u001B[107m"; // Bright White
    //    public static final String bgMaroon = "\u001B[48;2;128;0;0m";

