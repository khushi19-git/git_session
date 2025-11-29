import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
class Menu {
    public static final String RESET = "\u001B[0m";
    public static final String bgBlack="\u001B[40m";  
    public static final String bgRed="\u001B[41m";
     //TEST COLOURS
    public static final String tcWhite="\u001B[37m"; 
    public static final String bgMaroon = "\u001B[48;2;128;0;0m";
   public static final String Red = "\u001B[31m";
   public static final String Green = "\u001B[32";
   public static final String Yellow = "\u001B[33m";
   public static final String Blue = "\u001B[34m";
   public static final String White = "\u001B[35m";
   public static final String Reset = "\u001B[0m";
   public static final String Black = "\u001B[30m";
   public static final String Purple = "\u001B[35m";
   public static final String bg_BROWN = "\u001B[48;2;122;28;28m";
   
   //public static final String RESET = "\u001B[0m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_purple = "\u001B[45";
    public static final String bgWhite = "\u001B[47m";
    public static final String PEACH = "\u001B[48;2;255;218;185m";


    //******************MENU Display ****************************
    public static void backMenu() {
 //----------------------------------------------------------------------------------------
     
     //----------------------------------------------------------------------------------------
     // ===>START
     System.out.printf("%-60s%s%-91s%s%n",bgBlack,tcWhite,"WEL COME TO JMB (JAIN MITHAI BHANDHAR )", RESET);  
     System.out.printf(String.format("%-30s%s%-80s%-51s%s%n", bgMaroon,tcWhite , "{VEGETABLES}","{DAL}", RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Nav Ratan Korma ","*Methi Mutter Malai",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",PEACH,Black,"*Dal Fry ","*Dal Makhani",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*lohori Aloo with Mutter ","*Haryali Kofla",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",PEACH,Black,"*Dal Tadka","*Dal Panchrangi",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Mix Veg ","*Chana Masala",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%-32s%-48s%s",bgMaroon,tcWhite,"{RICE} ",RESET,RESET));
   //   System.out.printf("%-60s","------------------");
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Green Chana (Seasonal)","*Bhindi Masala",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",PEACH,Black,"*Rice ","*Veg Pulao",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Corn Palak ","*Jeera Aloo",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",PEACH,Black,"*Jeera Rice ","*Veg Fried Rice",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Aloo 65 ","*Dum Aloo",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",PEACH,Black,"*Green Peas Pulao ","*Veg Biryani",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Alloo Mutter ","*Gujrati Aloo",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%-32s%-48s%s",bgMaroon,tcWhite,"{ROTI} ",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Aloo Capsicum ","*Tinda Masala",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",PEACH,Black,"*Roti ","*Naan",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Aloo Do Pyaza ","*Aloo Palak",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",PEACH,Black,"*Paratha ","*Missi Roti",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Aloo Gobhi/Tomatto ","*Seasonal Veg",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-25s%-50s%s",PEACH,Black,"*Kulcha ","*Methi Poori",RESET,RESET));
//======> TERMS AND CONDITION
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Gobhi Mutter ","*Bhindi Do Pyaza",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%-28s%-52s%s",bgMaroon,tcWhite,"{TERMS & CONDITION} ",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Kadi Panjabi ","*Veg Kolhapuri",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*Non Refundable advance.",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Veg. Kofla(Gol) ","*Corn Capsicum",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*100% Amount has to be paid before the function Date.",RESET,RESET));

//=====>SNACKS
     System.out.println((String.format("%-8s%-25s%-50s%s",bgMaroon,tcWhite,"{SNACKS} ",RESET,RESET))+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*Food Parcel from the buffets strictly prohibited. ",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Idli/Vada Shambhar ","*Noodlies",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*All walking children will be charged full rate. ",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Pav Bhaji ","*Chhole Bhatura",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*Buffet minimum 25 Person will be compulsory,",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Chhola Kulcha ","*Chhola Poori",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black," Hi-Tea minimum 15 Person will be compulsory.",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Methi Paratha ","*Paratha with Dahi(Limited)",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*Taxes & Charges as applicable.",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Stuffed Paratha","*Aloo Paratha",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*Hall rent included in rates (for 3 hrs.) DJ, ",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Muli Paratha ","*Gobhi Paratha",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black," Tent House rate will be applicable.",RESET,RESET));

//=========>STARTER
      System.out.println((String.format("%-8s%-25s%-50s%s",bgMaroon,tcWhite,"{STARTER} ",RESET,RESET))+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*Starter will not be served after the lunch or dinner starts.",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Mix Veg Pakoda ","*Veg Cutlet",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*No Item will be served on the table.Starter is limited.",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Veg Finger","*Veg Kothey",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*If starter is served in buffet in lunch or dinner 20/-per person extra.",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Bread Pakoda ","*Hara Bhara Kabab",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*An advance of 50% of the total estimated amount will enable",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Methi Kabab ","*Corn Chat",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black," us to confirm your banquet booking. Payment is on guaranteed ",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Moong Pakoda","*Aloo Chat",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black," person or onactual head count which ever is more.",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Dragon Aloo ","*Saboo Dana vada",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*Any change in menu has to be intimated at least 5 days in ",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Saboo Dana ","*Veg Manchurian Dry",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black," advance, Any menu item beyond our Banquet Menu shall be charged",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Finger Chips ","*Tandori Manchurian",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black," as per our Restaurant menu.",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Aloo Corn Kabab ","*Chinese Corn Kabab",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*Booking confirmed in the open air is at customers risk with",RESET,RESET));

//=========>cHINESE & CONTINENTAL
     System.out.println((String.format("%-8s%-25s%-50s%s",bgMaroon,tcWhite,"{CHINESE & CONTINENTAL} ",RESET,RESET))+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black," regards to any unfavorable climatic conditions Buffet of the",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Backed Veg ","*Backed Palak",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black," Party will be served till 11.",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Veg Manchurian","*Veg Singapoori Noodles",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black,"*Hotel is not responsible for any gifts items, gifts vouchers,",RESET,RESET));
     System.out.println(String.format("%-8s%s%-25s%-45s%s",PEACH,Black,"*Veg Noodles","*Veg Fried Rice ",RESET,RESET)+bgMaroon+"|"+RESET+String.format("%-8s%s%-75s%s",PEACH,Black," Owner him self is responsible for all his items.",RESET,RESET));

     System.out.printf("%-60s%s%-91s%s%n",bgRed,Black,"Parking of Vechicle is at  Vechicle Owner Risk",RESET);
     System.out.printf("%-70s%s%-81s%s",bgRed,Black,"THANK YOU FOR VISITING",RESET);
     System.out.println();
   }
  
     
    //********************************************************* */
     double totalBill;
     String billDetails;
     String starterp="Not Include ",starterp1="Not Include ";
     String soup="Not Include ",drink="Not Include ",veg_="Not Include ",veg_2="Not Include ",p_starter="Not Include ",Nstarter="Not Include ",p_dish="Not Include ",curd_="Not Include ",sweet_="Not Include ",ice_cream="Not Include ",snacks_="Not Include ",chinese_="Not Include ",Dal_,rice_="Not Include ",heavy_="Not Include ",bread_="Not Include ",choose="Not Include ",tea="Not Include ",coffee="Not Include ",torc;

    
     
    static int getIntInRange(Scanner sc, int min, int max) {
        int value;
        while (true) {
            System.out.print("Enter an integer between " + min + " and " + max + ": ");
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                if (value >= min && value <= max) {
                    return value;   // valid input
                } else {
                    System.out.println("Out of range. Try again.");
                }
            } else {
                System.out.println("Not an integer. Try again.");
                sc.next(); // discard invalid token
            }
        }
    }
     
     void SoupChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.printf(PEACH+bg_BROWN+"%-60s" + Reset + "\n", " OPTIONS FOR SOUPS ");
        System.out.printf(PEACH+Black+ "%-60s" + Reset + "\n", "1. Tomato Soup           (Rs 50)");
        System.out.printf(PEACH+Black+ "%-60s" + Reset + "\n", "2. Veg Manchow Soup      (Rs 60)");
        System.out.printf(PEACH+Black+ "%-60s" + Reset + "\n", "3. Hot and Sour Veg Soup (Rs 70)");
        System.out.printf(PEACH+Black+ "%-60s" + Reset + "\n", "4. Lemon Coriander Soup  (Rs 65)");
        while(true){
        System.out.println("Enter Soup Choice :");
        int soupChoice = getIntInRange(sc, 1, 4);
        switch (soupChoice) {
                case 1:soup="Tomato Soup";
                    System.out.println("Tomato Soup");
                    break;
                case 2:soup="Veg Maenchow ";
                    System.out.println("Veg Manchow");break;
                case 4:soup="Lemon Coriander ";
                    System.out.println("Lemon Coriander");break;
                case 3:soup="Hot & Sour Veg ";
                    System.out.println("Hot & Sour Veg");break;
                default:
                System.out.println("Invalid Enter again ");
                continue;
        }break;
     }
    }
    void DrinkChoice() {
        System.out.printf(PEACH + bg_BROWN+ "%-60s" + Reset + "\n", " OPTIONS FOR WELCOME DRINKS ");
        System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "1. Orange Juice    ");
        System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "2. Mango Juice     ");
        System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "3. Apple Juice     ");
        System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "4. Blueberry Juice ");
        System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "5. Rasna ");
        System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "6. Coca Cola ");
        System.out.printf(PEACH + Black+ "%-60s" + Reset + "\n", "7. Sprite ");


        while(true){
        System.out.println("Enter Drink Choice :");
        int drinkChoice = getIntInRange(sc, 1, 7);
        switch (drinkChoice) {
            case 1:drink ="Orange Juice ";
             System.out.println("Orange Juice "); break;
            case 2:drink ="Mango Juice";
             System.out.println("Mango Juice "); break;
            case 3:drink ="Apple Juice"; 
            System.out.println( "Apple JUice"); break;
            case 4:drink ="Bluberry Juice ";
             System.out.println( "Blueberry Juice"); break;
             case 5:drink ="Rasna ";
             System.out.println( "Rasna"); break;
             case 6:drink ="Coca Cola";
             System.out.println( "Coca Cola"); break;
             case 7:drink ="Sprite ";
             System.out.println( "Sprite"); break;
            default: System.out.println("Invalid choice for Drink!");
            continue;
        }break;
    }
}
    void p_start(){
        System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------PANEER STARTERS-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Paneer Chilli","4.Paneer Pudina Tikka");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Paneer tikka ","5.Panner Achari Tikka");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Dargon Paneer ","6.paneer 65 ");
        while(true){
        System.out.println("Enter Starter choice :");
        int p_start = getIntInRange(sc, 1, 6);
        switch(p_start){
        case 1: p_starter="Paneer Chilli ";
        System.out.println("Paneer Chilli "); break;
        case 2: p_starter="Paneer tikka ";
        System.out.println("Paneer tikka "); break;
        case 3: p_starter="Dargon Paneer ";
        System.out.println("Dargon Paneer");break;
        case 4: p_starter="Paneer Pudina tikka ";
         System.out.println("Paneer Pudina Tikka ");break;
        case 5: p_starter="Paneer Achari Tikka ";
         System.out.println("Achari Tikka");break; 
        case 6: p_starter="Panner 65";
        System.out.println("Paneer 65");break;
        default : System.out.println("Invalid Enter Again ");
        continue;
        }break;
    }
}

    void p_Dish(){
        System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------PANEER DISH-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Paneer Butter Masala","7.Panner Kadai");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Paneer Punjab","8.Methi Paneer");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Panner Palak","9.Corn Paneer");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","4.Paneer Mutter","10.Paneer Kolhapuri");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","5.Paneer Do Pyaza","11.Paneer Kaju");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","6.Paneer Tikka Masala","12.Shahi Paneer ");
        while(true){
        System.out.println("Enter Paneer Dish :");
        int dish = getIntInRange(sc, 1, 12);
        switch (dish) {
                    case 1:p_dish="Paneer Butter Masala";
                        System.out.println(" Paneer Butter Masala");break;
                    case 2: p_dish="Panner Punjabi";
                        System.out.println("Paneer Punjabi ");break;
                     case 3:p_dish="Panner Palak";
                        System.out.println("Paneer Palak ");break;
                         case 4:p_dish="Panner Mutter";
                        System.out.println("Paneer Mutter  ");break;
                         case 5:p_dish="Paneer Do Pyaza";
                        System.out.println("Paneer Do Pyaza");break;
                         case 6:p_dish="Paneer Tikka masal";
                        System.out.println("Paneer Tikka Masala ");break;
                         case 7:p_dish="Paneer Kadai";
                        System.out.println("Paneer Kadai  ");break;
                         case 8:p_dish="Methi Paneer";
                        System.out.println("Methi Paneer");break;
                         case 9:p_dish="Corn Paneer";
                        System.out.println("Corn Paneer ");break;
                         case 10:p_dish="Paneer KolhaPuri";
                        System.out.println("Paneer Kolhapuri  ");break;
                         case 11:p_dish="Paneer Kaju";
                        System.out.println("Paneer Kaju");break;
                        case 12:p_dish="Shahi Paneer";
                        System.out.println("Sahi Paneer");break;
                        default:
                          System.out.println("Invalid Enter again ");
                          continue;
        } break;
    }}
      void curd(){
        System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","-----CURD DISH-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Veg Raita","4.Boondi Raita");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Loki Raita","5.Fruit Raita");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Aloo Raita ","6.Dahi Vada ");
        while(true){
        System.out.println("Enter Curd choice :");
        int curd = getIntInRange(sc, 1, 6);
        switch(curd){
        case 1:curd_ = "Veg Raita";
        System.out.println("Veg Raita"); break;
        case 2: curd_ = "Loki Raita";
        System.out.println("Loki Raita"); break;
        case 3:curd_ = "Aloo Raita"; 
        System.out.println("Aloo Raita");break;
        case 4:curd_= "Boondi Raita";
        System.out.println("Boondi Raita");break;
        case 5:curd_ = "Fruit Raita"; 
        System.out.println("Fruit Raita");break; 
        case 6:curd_ = "Dahi Vada";
         System.out.println("Dahi Vada");
        default : System.out.println("Invalid Enter Again");
        continue;
     }break;
    }
}
     void sweet(){
         System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","-----SWEET DISH-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Gulab Jamun","5.Aam Khand");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Gajar Halwa","6.Rasgulla ");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Moong Halwa","7.Rabdi");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","4.Shree Khand","8.Sitaphal Rabdi");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","9.Kheer","10.Ras Malai");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","11.Sewaiya Kheer","12.Caramel Kheer");
        while(true){
        System.out.println("Enter Sweet choice :");
        int sweet = getIntInRange(sc, 1, 12);
        switch(sweet){
        case 1:sweet_="Gulab Jamun";
         System.out.println("Gulab Jamun"); break;
        case 2:sweet_="Gajar Halwa";
         System.out.println("Gajar Halwa"); break;
        case 3:sweet_="Moong Halwa"; 
        System.out.println("Moong Halwa");break;
        case 4:sweet_="Shree Khand";
         System.out.println("shree Khand");break;
        case 5: sweet_="Aam Khand";
        System.out.println("aam Khand");break; 
        case 6: sweet_="Rasgulla";
        System.out.println("Rasgulla");break;
        case 7:sweet_="Rabdi";
         System.out.println("Rabdi");break; 
        case 8: sweet_="Sitaphal Rabdi";
        System.out.println("Sitaphal Rabdi");break; 
        case 9: sweet_="Kheer";
        System.out.println("Kheer");break; 
        case 10: sweet_="Ras Malai";
        System.out.println("Ras  malai");break; 
        case 11: sweet_="Sewaiya Kheer";
        System.out.println("Sewaiya Kheer");break; 
        case 12: sweet_="Caramel Kheer";
        System.out.println("Carmal Kheer");break; 
        default : System.out.println("Invalid Enter Again");
        continue;
     }break;
    }
}
void iceCream(){
     System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","-----ICE-CREAM-----");
     System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Vanila Icecream","3.Butter Scotch");
     System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Strawberry Icecream ","4.Peanut Butter ");
     while(true){
        System.out.println("Enter Sweet choice :");
        int cream = getIntInRange(sc, 1, 4);
        switch(cream){
        case 1: ice_cream="Vanila Icecream";
        System.out.println("Vanila Icecream"); break;
        case 2: ice_cream="Strawberry Icecream";
        System.out.println("Strawberry Icecream"); break;
        case 3:ice_cream="Butter Scotch"; 
        System.out.println("Butter Scotch");break;
        case 4: ice_cream="Peanut Butter";
        System.out.println("Peanut Butter");break;
        default: System.out.println("Invalid ");continue; 
        }break;
     }
    }
    void Vegetable(){
        System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------VEGETABLES-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Nav Ratan Korma","14.Mathi Mutter Malai");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Lahori Aloo With Mutter ","15.Hariyani Kofta");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Mix Veg ","16.Chana Masala");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","4.Green Chana ","17.Bhindi Masala"); 
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","5.Corn Palak ","18.Jeera Aloo");
        System.out.printf(PEACH+Black+"%-35s%-15s"+Reset+"\n","6.Aloo 65","19.Dum Aloo");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","7.Aloo Mutter ","20.Gujrati Aloo");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","8.Aloo Capsicum ","21.Tinda Masala ");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","9.Aloo Do Pyaza","22.Aloo Palak"); 
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","10.Aloo Gobhi/Tomato","23.Seasonal Veg");  
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","11.Gobhi Mutter ","24.Bhindi Do Pyaza ");  
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","12.Kadi Punjabi ","25.Veg KolhaPuri");  
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","13.Veg. Kofta ","26.Corn Capsicum"); 
        int veg;
        while(true){
        System.out.println("Enter 2 Vegetables choice :");
         veg = getIntInRange(sc, 1, 26);
         
        switch (veg) {
            case 1:veg_="Nav Ratan Korma"; 
            System.out.println( "Nav Ratan");break;
            case 2:veg_="Lahori Aaloo";  
            System.out.println("Lahori Aaloo ");break;  
            case 3:veg_="Mix Veg";  
            System.out.println("Mix Veg");break; 
            case 4:veg_="Green chana"; 
            System.out.println("Green Chana");break; 
            case 5:veg_="Corn Palak"; 
            System.out.println("Corn Palak");break; 
            case 6:veg_="Alaa 65"; 
            System.out.println("Aloo 65");break; 
            case 7:veg_="Aloo Mutter"; 
            System.out.println("Aloo Mutter");break;
            case 8:veg_="Aloo Capcicum";  
            System.out.println("Aaloo Capcicum ");break; 
            case 9:veg_="Aaloo Do Pyaza"; 
            System.out.println("aaloo Da pyaaza ");break; 
            case 10:veg_="Aalo Gobhi";  
            System.out.println("Aloo Gobhi ");break; 
            case 11:veg_="Gobhi Mutter";  
            System.out.println("Gobhi mutter ");break; 
            case 12:veg_="Kadi Punjabi";  
            System.out.println("Kadi Punjabi ");break; 
             case 13: veg_="Veg Kofta"; 
            System.out.println("Veg Kofta");break;
            case 14:veg_="Methi Mutter"; 
            System.out.println("Methi Mutter");break;
            case 15:veg_="Hariyani Kofta";  
            System.out.println("Hariayni Kofta ");break;  
            case 16: veg_="Chana Masala"; 
            System.out.println("Chana Masala ");break;     
            case 17:veg_="Bhindi Masala";  
            System.out.println("Bhindi Masala");break; 
            case 18:veg_="Jeera Aaloo"; 
            System.out.println("Jeera AAloo ");break; 
            case 19:veg_="Dum Aloo";  
            System.out.println("Dum Aloo ");break; 
            case 20:veg_="Gujrati Aloo"; 
            System.out.println("Gujarati Aloo");break; 
            case 21:veg_="Tinda Masala"; 
            System.out.println("Tinda Masala");break; 
            case 22:veg_="Aaloo Palak"; 
            System.out.println("Aaloo Palak ");break; 
             case 23:veg_="Seasonal veg"; 
            System.out.println("Seasonal Veg ");break; 
            case 24:veg_="Bindi Do Pyaza"; 
             System.out.println("Corn capcicum ");break; 
            case 25:veg_="Veg Kohlapoori";  
            System.out.println("veg kohlpoori ");break;        
             case 26:veg_="Corn Capcicum"; 
            System.out.println("Corn capcicum ");break; 

        }break;
    }
       int veg2;
         while(true){
        System.out.println("Enter One More ");
          veg2 = getIntInRange(sc, 1, 26);
        if(veg == veg2){
            System.out.println("You choose Same ");
        }else{ 
        switch (veg2) {
          case 1:veg_2="Nav Ratan Korma"; 
            System.out.println( "Nav Ratan");break;
            case 2:veg_2="Lahori Aaloo";  
            System.out.println("Lahori Aaloo ");break;  
            case 3:veg_2="Mix Veg";  
            System.out.println("Mix Veg");break; 
            case 4:veg_2="Green chana"; 
            System.out.println("Green Chana");break; 
            case 5:veg_2="Corn Palak"; 
            System.out.println("Corn Palak");break; 
            case 6:veg_2="Alaa 65"; 
            System.out.println("Aloo 65");break; 
            case 7:veg_2="Aloo Mutter"; 
            System.out.println("Aloo Mutter");break;
            case 8:veg_2="Aloo Capcicum";  
            System.out.println("Aaloo Capcicum ");break; 
            case 9:veg_2="Aaloo Do Pyaza"; 
            System.out.println("aaloo Da pyaaza ");break; 
            case 10:veg_2="Aalo Gobhi";  
            System.out.println("Aloo Gobhi ");break; 
            case 11:veg_2="Gobhi Mutter";  
            System.out.println("Gobhi mutter ");break; 
            case 12:veg_2="Kadi Punjabi";  
            System.out.println("Kadi Punjabi ");break; 
             case 13: veg_2="Veg Kofta"; 
            System.out.println("Veg Kofta");break;
            case 14:veg_2="Methi Mutter"; 
            System.out.println("Methi Mutter");break;
            case 15:veg_2="Hariyani Kofta";  
            System.out.println("Hariayni Kofta ");break;  
            case 16: veg_2="Chana Masala"; 
            System.out.println("Chana Masala ");break;     
            case 17:veg_2="Bhindi Masala";  
            System.out.println("Bhindi Masala");break; 
            case 18:veg_2="Jeera Aaloo"; 
            System.out.println("Jeera AAloo ");break; 
            case 19:veg_2="Dum Aloo";  
            System.out.println("Dum Aloo ");break; 
            case 20:veg_2="Gujrati Aloo"; 
            System.out.println("Gujarati Aloo");break; 
            case 21:veg_2="Tinda Masala"; 
            System.out.println("Tinda Masala");break; 
            case 22:veg_2="Aaloo Palak"; 
            System.out.println("Aaloo Palak ");break; 
             case 23:veg_2="Seasonal veg"; 
            System.out.println("Seasonal Veg ");break; 
            case 24:veg_2="Bindi Do Pyaza"; 
             System.out.println("Corn capcicum ");break; 
            case 25:veg_2="Veg Kohlapoori";  
            System.out.println("veg kohlpoori ");break;        
             case 26:veg_2="Corn Capcicum"; 
            System.out.println("Corn capcicum ");break; 

        }break;
    }}
}
     void snacks(){
        System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------SNACKS-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Idli Shambhar","7.Noodles");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Chhola Kulcha ","8.Chhole Bhatura");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Methi Paratha ","9.Chhole Poori ");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","4.Stuffed Paratha ","10.Paratha & Dahi"); 
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","5.pav Bhaji ","11.Aloo Paratha");
        System.out.printf(PEACH+Black+"%-35s%-15s"+Reset+"\n","6.Muli Paratha","12.Gobhi Paratha");
        while(true){
        System.out.println("Enter Snacks choice :");
        int snack = getIntInRange(sc, 1, 12);
        switch (snack) {
            case 1:snacks_="Idli Shambhar";
            System.out.println( "Idli Shambhar");break; 
            case 2:snacks_="Chhola Kulacha";
            System.out.println("Chhola Kulcha");break; 
            case 3:snacks_="Methi Paratha"; 
            System.out.println("Methi Paratha");break; 
            case 9:snacks_="Chhole Poori";
            System.out.println("Chhole Poori");break; 
            case 5:snacks_="Chhole Bhatura";
            System.out.println("Choole Bhatura");break; 
            case 4: snacks_="Stuffed Paratha";
            System.out.println("Stuffed Paratha");break; 
            case 10:snacks_="Paratha With Dahi";
            System.out.println("Paratha with Dahi");break; 
            case 8: snacks_="Pav Bhaji";
            System.out.println("Pav Bhaji");break; 
             case 11:snacks_="Aloo Paratha";    
              System.out.println("Aloo Paratha");break;
              case 6:snacks_="Multi Paratha";    
              System.out.println("Multi Paratha");break;
              case 12:snacks_="Gobhi Paratha";    
              System.out.println("Gobhi Paratha");break;
              case 7:snacks_="Noodles";    
              System.out.println("Noodles");break;
              default:    
              System.out.println("Invalid Choice Enter Again");
              continue;
        }break;
     }}
     void Default(){
         System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n"," Pickle "," Salad ");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n"," Papad "," Chutney ");
        
     }
     void chinese(){
        System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------CHINESE CONTINENTIAL-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Backed Veg","4.Backed Palak");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Veg Manchurian ","5.Veg Singapoori Noodles");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Veg Noodles ","6.Veg Fried Rice ");
        while(true){
        System.out.println("Enter roti choice ");
        int chinese = getIntInRange(sc, 1, 6);
        switch (chinese) {
            case 1:chinese_="Backed Veg"; 
            System.out.println("Backed Veg");break; 
            case 2:chinese_="Veg Manchurian";  
            System.out.println("Veg Manchurian");break; 
            case 3:chinese_="Veg Noodles"; 
            System.out.println("Veg Noodles");break; 
             case 4:chinese_="Backed Palak"; 
            System.out.println("Backed Palak");break; 
             case 5:chinese_="Missi v=veg Singaporri Noodles"; 
            System.out.println("Missi Ved Singapoori Noodles");break; 
             case 6:chinese_="Veg fried Rice"; 
                System.out.println("Veg Fried Rice");break; 
                
            default:
                 System.out.println("Invalid again ");
                 continue;
        }break;
    }
     }
     void Dal(){
        System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------DAL-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Dal Fry","2.Dal Makhani");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Dal Tadka ","4.Dal Panchrangi");
        while(true){
        System.out.println("Enter Dal Choice ");
        int dal = getIntInRange(sc, 1, 4);
         switch (dal) {
            case 1:Dal_="Tadka Dal";
                System.out.println("Tadka Dal");break; 
            case 2:Dal_="Dal Makhani";
                 System.out.println("Dal Makhani");break; 
            case 3:Dal_="Panchmel Dal";
                 System.out.println("Panchmel Dal");break; 
            case 4:Dal_="Moong Dal";
                 System.out.println("Moong Dal");break; 
            default :
                System.out.println("Invalid Enter again");
                continue;
        }break;
    }
        
     }
     void roti(){
        System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------ROTI-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Roti ","4.Naan ");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Paratha ","5.Misti Poori");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Kulcha ","6.Methi Poori");
        while(true){
        System.out.println("Enter roti choice ");
        int roti = getIntInRange(sc, 1, 6);
        switch (roti) {
            case 1: 
            System.out.println("Roti");break; 
            case 2: 
            System.out.println("Paratha");break; 
            case 3:
            System.out.println("Kulcha");break; 
                case 4:
            System.out.println("Naan");break; 
                case 5:
            System.out.println("Missi Roti");break; 
                    case 6:
                System.out.println("Methi Poori");break; 
                
            default:
                 System.out.println("Invalid again ");
                 continue;
        }break;
    }
     }
     void rice(){
        System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------RICE-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Rice ","4.Veg Pulao");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Jeera Rice ","5.Veg Fried Rice");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Green peas pulao ","6.veg biryani ");
        while(true){
        System.out.println("Enter Rice Choice ");
        int rice = getIntInRange(sc, 1, 6);
        switch (rice) {
            case 1:rice_="Rice "; 
            System.out.println(" Rice");break; 
            case 2:rice_="Jeera Rice"; 
            System.out.println("Jeera Rice");break; 
            case 4:rice_="Veg Pulao"; 
            System.out.println("Veg Pulao");break; 
            case 3:rice_="Green Peas Pulao"; 
            System.out.println("Green peas pulao");break; 
            case 5:rice_="Fried Rice"; 
            System.out.println("Fried Rice");break; 
            case 6:rice_="Veg Biryani"; 
            System.out.println("Veg Biryani ");break; 
            default :
            System.out.println("Invalid Enter Again ");
            continue;
        }break;
     }
    }
    int starter ;
     void Starter() {

        System.out.printf(PEACH+bg_BROWN+ "%-50s" + Reset + "\n", "STARTER ");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "1. Mix Veg Pakoda");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "2. Veg Finger");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "3. Bread Pakoda");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "4. Methi Kabab");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "5. Moong Pakoda");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "5. Dragon Aloo");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "7. Sabudana Vada");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "8. Finger Chips");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "9. Aloo Corn Kabad");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "10. veg Cutlet");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "11. Veg Kothey ");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "12. Hara Bhara Kabab");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "13. Corn Chat");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "14. Aloo Chat");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "15. Sabudana chat ");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "15. Veg Manchurian Dry");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "17. Tandori Manchurian ");
        System.out.printf(PEACH + Black + "%-50s" + Reset + "\n", "18. Chinese Corn Kabab");

        while(true){
            System.out.println( "ENTER YOUR CHOICE IN STARTER");
             starter = getIntInRange(sc, 1, 18);
        
            switch (starter) {

                case 1:
                    starterp = "Mix Veg Pakoda";
                    System.out.println( "1. Mix Veg Pakoda");
                    break;
                case 2:
                    starterp = "Veg Finger";
                    System.out.println( "2. Veg Finger");
                    break;
                case 3:
                    starterp = "Bread Pakoda";
                    System.out.println( "3. Bread Pakoda");
                    break;
                case 4:
                    starterp = "Methi Kabab";
                    System.out.println( "4. Methi Kabab");
                    break;
                case 5:
                    starterp = " Moong Pakoda";
                    System.out.println( "5. Moong Pakoda");
                    break;
                case 6:
                    starterp = "Dragon Aloo";
                    System.out.println( "6. Dragon Aloo");
                    break;
                case 7:
                    starterp = " Sabudana Vada";
                    System.out.println( "7. Sabudana Vada");
                    break;
                case 8:
                    starterp = " Finger Chips";
                    System.out.println( "8. Finger Chips");
                    break;
                case 9:
                    starterp = "Aloo Corn Kabad";
                    System.out.println( "9. Aloo Corn Kabad");
                    break;
                case 10:
                    starterp = " Veg Cutlet";
                    System.out.println( "10. Veg Cutlet");
                    break;
                case 11:
                    starterp = " Veg Kothey ";
                    System.out.println( "11. Veg Kothey ");
                    break;
                case 12:
                    starterp = "Hara Bhara Kabab";
                    System.out.println( "12. Hara Bhara Kabab");
                    break;
                case 13:
                    starterp = "Corn Chat";
                    System.out.println( "13. Corn Chat");
                    break;
                case 14:
                    starterp = " Aloo Chat";
                    System.out.println( "14. Aloo Chat");
                    break;
                case 15:
                    starterp = " Sabudana chat ";
                    System.out.println( "15. Sabudana chat ");
                    break;
                case 16:
                    starterp = " Veg Manchurian Dry";
                    System.out.println( "16. Veg Manchurian Dry");
                    break;
                case 17:
                    starterp = " Tandori Manchurian ";
                    System.out.println( "17. Tandori Manchurian ");
                    break;
                case 18:
                    starterp = " Chinese Corn Kabab";
                    System.out.println( "18. Chinese Corn Kabab");
                    break;
                default:
                    System.out.println( "INVALID CHOICE!");
                    continue;    
            }break;
        }
}
void bread(){
    System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------Bread Dish-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Sandwich","3.Bread Pakora");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Bread Pizza","4.Bread Roll");
        while(true){
        System.out.println("Enter Bread Choice ");
        int bread = getIntInRange(sc, 1, 4);
         switch (bread) {
            case 1:bread_="Sandwitch";
                System.out.println("Sandwhich");break; 
            case 2:bread_="Bread Pakora";
                 System.out.println("Bread Pokora");break; 
            case 3:bread_="Bread Pizza";
                 System.out.println("Bread Pizza");break; 
            case 4:bread_="Bread Roll";
                 System.out.println("Bread Roll");break; 
            default :
                System.out.println("Invalid Enter again");
                continue;
        }break;
    }
        
} void heavy(){
     System.out.printf(PEACH+bg_BROWN+"%-50s"+Reset+"\n","------HEAVY FOOD-----");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1.Samosa ","4.Kachori");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2.Pav Bhaji ","4.panner roll");
        System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","3.Burger","6.Spring Roll");
        while(true){
        System.out.println("Enter Heavy Food Choice ");
        int heavy = getIntInRange(sc, 1, 6);
        switch (heavy) {
            case 1:heavy_="Samosa";
            System.out.println("Samosa");break; 
            case 2:heavy_="Kachori";
            System.out.println("Kachori");break; 
            case 4:heavy_="Pav Bhaji";
            System.out.println("Pav Bhaji");break; 
            case 3:heavy_="Panner Roll";
            System.out.println("Panner Roll");break; 
            case 5:heavy_="Burger";
            System.out.println("Burger");break; 
            case 6:heavy_="Spring roll";
            System.out.println("Spring Roll");break; 
            default :
            System.out.println("Invalid Enter Again");
            continue;
        }break;
     }  
}
void TeaOrCoffee(){
    while(true){
    System.out.println("Enter Tea or coffe(T/C)");
    char tC = sc.next().toUpperCase().charAt(0);
    switch(tC){
        case 'T': tea ="Tea";
        torc = tea;
        System.out.println("Tea");break;
        case 'C': coffee ="Coffee";
        torc = coffee;
         System.out.println("Coffee");break;
        default: System.err.println("Enter T or C ");
    }break;

}
}


// Menu Start.....................
    Scanner sc = new Scanner(System.in);
    double breakPrice ;
    double thaliPrice ;
    double lPrice ;
    static char thali ;
    int choice;
  
    
    
    void menu(){
         
        System.out.printf(PEACH+"              "+bg_BROWN+"---Enter Your CHOICE---"+PEACH+"             "+Reset );
        System.out.println();
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1. VEGETARIAN MENU ");
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","2. BREAK FAST MENU ");
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","3. LADIES PARTY ");
        while(true){
        System.out.println("Enter choice(1 or 2 or 3)");
        choice = getIntInRange(sc, 1, 3);
        switch(choice){
        case 1:
            System.out.printf(bg_BROWN+"%-50s"+Reset+"\n","             --VEGETARIAN Thali--" );
            System.out.printf(PEACH+Black+"%-50S"+Reset+"\n"," A-Regular Thali          RS 310/- ");
            System.out.printf(PEACH+Black+"%-50S"+Reset+"\n"," B-Special Thali          RS 360/- ");
            System.out.printf(PEACH+Black+"%-50S"+Reset+"\n"," C-Jain Thali             RS 410/- ");
            System.out.printf(PEACH+Black+"%-50S"+Reset+"\n"," D-Maharaja Thali         RS 470/- ");
            System.out.printf(PEACH+Black+"%-50S"+Reset+"\n"," E-Royal Thali            RS 600/- ");
            while(true){
            System.out.println("Enter Thali ");
            thali = sc.next().toUpperCase().charAt(0);
        
            switch(thali){
                case 'A':{
                    thaliPrice = 310;
                    System.out.printf(bg_BROWN+"%-35s%-15s"+Reset+"\n","(A)Regular Thali","Rs 310/-");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 soup or Welcome Drink","Roti,Naan,");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2 Vegetable Dish","Butter Paratha ");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Dal","Pickle,Salad,Papad"); 
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Rice","1 Sweet Dish "); 
                    while(true){
                    System.out.println("Which you want  Soup or Drink(S or D) ");
                
                    char ch2 = sc.next().toUpperCase().charAt(0);
                    if(ch2=='S'){
                    SoupChoice();
                    choose=soup;
                    }else if(ch2=='D'){
                       DrinkChoice(); 
                       choose=drink; 
                    }else{
                        System.out.println("Please Enter s or D");
                        continue;
                    }break;
                   }
                    Vegetable();
                    Dal();
                    rice();
                    roti();
                    Default();
                    while(true){
                    System.out.println("Which you want Sweet or Icecream (S/I)");
                    char methai = sc.next().toUpperCase().charAt(0);
                    if(methai=='S'){
                    sweet();
                    }else if(methai=='I'){
                       iceCream(); 
                    }else{
                        System.out.println("Please Enter s or i");
                        continue;
                    }break;
                }
                
                    break; 
                }
                case 'B':{
                    thaliPrice = 360;
                    System.out.printf(bg_BROWN+"%-35s%-15s"+Reset+"\n"," (B)Special Thali","Rs 360/-");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 soup or Welcome Drink","Roti,Butter Naan,");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2 Vegetable Dish","Butter Paratha ");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Paneer Dish","1 Sweet Dish ");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Dal","Pickle,Salad,Papad"); 
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Rice","Ice-Cream "); 
                    while(true){
                    System.out.println("Which you want  Soup or Drink(S or D) ");
                    char ch2 = sc.next().toUpperCase().charAt(0);
                    if(ch2=='S'){
                    SoupChoice();
                    choose = soup;
                    }else if(ch2=='D'){
                       DrinkChoice();
                       choose=drink;  
                    }else{
                        System.out.println("Please Enter S or D");
                        continue;
                    }break;
                }
                    p_Dish();
                    Vegetable();
                    Dal();
                    rice();
                    roti();
                    Default();
                    while(true){
                    System.out.println("Which you want Sweet or Icecream (S/I)");
                    char methai = sc.next().toUpperCase().charAt(0);
                    if(methai=='S'){
                    sweet();
                    }else if(methai=='I'){
                       iceCream(); 
                    }else{
                        System.out.println("Please Enter s or i");
                        continue;
                    }
                    break; 
                }
              break;
                }
                case 'C':{
                    thaliPrice = 410;
                    System.out.printf(bg_BROWN+"%-35s%-15s"+Reset+"\n"," (C)Jain Thali","Rs 410/-");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 soup or Welcome Drink","1 Rice,");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Starter","Roti,Butter,Naan,");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2 Vegetable Dish","Butter Paratha ");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Paneer Dish","Pickle,Salad,Papad");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Curd Dish ","1 Sweet Dish"); 
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Dal","Ice-Cream ");  
                    while(true){
                    System.out.println("Which you want  Soup or Drink(S or D) ");
                    char ch2 = sc.next().toUpperCase().charAt(0);
                    if(ch2=='S'){
                    SoupChoice();
                    choose=soup;
                    }else if(ch2=='D'){
                       DrinkChoice();
                       choose = drink;  
                    }else{
                        System.out.println("Please Enter S or D");
                        continue;
                    }break;
                }
                    Starter();
                    Vegetable();
                    p_Dish();
                    curd();
                    Dal();
                    rice();
                    roti();
                    Default();
                    while(true){
                    System.out.println("Which you want Sweet or Icecream (S/I)");
                    char methai = sc.next().toUpperCase().charAt(0);
                    if(methai=='S'){
                    sweet();
                    }else if(methai=='I'){
                       iceCream(); 
                    }else{
                        System.out.println("Please Enter s or i");
                        continue;
                    }break;
                
                
                }break;
                
                }
                case 'D':{
                    thaliPrice = 470;
                    System.out.printf(bg_BROWN+"%-35s%-15s"+Reset+"\n"," (D)Maharaja Thali","Rs 470/-");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 soup or Welcome Drink","1 Rice,");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2 Starter","Roti,Butter,Naan,");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2 Vegetable Dish","Butter Paratha ");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Paneer Dish","Pickle,Salad,Papad");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Curd Dish ","1 Sweet Dish"); 
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Dal","Ice-Cream or Coffee "); 
                    while(true){
                    System.out.println("Which you want  Soup or Drink(S or D) ");
                    char ch2 = sc.next().toUpperCase().charAt(0);
                    if(ch2=='S'){
                    SoupChoice();
                    choose = soup;
                    }else if(ch2=='D'){
                       DrinkChoice();  
                    choose=drink;
                    }else{
                        System.out.println("Please Enter s or D");
                        continue;
                    }break;
                    
                }
                    Starter();
                    p_start();
                    Vegetable();
                    curd();
                    p_Dish();
                    Dal();
                    rice();
                    roti();
                    Default();
                    
                    System.out.println("Which you want Sweet or Icecream (S/I)");
                    char methai = sc.next().toUpperCase().charAt(0);
                    if(methai=='S'){
                    sweet();
                    }else if(methai=='I'){
                       iceCream(); 
                    }else{
                        System.out.println("Please Enter s or i");
                        continue;
                    }
                    break;
                }
                case 'E':{
                    thaliPrice = 600;
                    System.out.printf(bg_BROWN+"%-35s%-15s"+Reset+"\n"," (E)Royal Thali","Rs 600/-");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 soup or Welcome Drink","1 Curd Dish,");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2 Starter","1 Dal");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","2 Paneer Starter","1 Rice");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Pasta(1 Type)","Pickle,Salad,Papad");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 paneer Dish ","Roti,Naan,Paratha");
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n","1 Vegetable Dish","1 Sweet Dish"); 
                    System.out.printf(PEACH+Black+"%-30s%-20s"+Reset+"\n"," ","Ice-Cream or Coffee "); 
                    while(true){
                    System.out.println("Which you want  Soup or Drink(S or D) ");
                    char ch2 = sc.next().toUpperCase().charAt(0);
                    if(ch2=='S'){
                    SoupChoice();
                    choose = soup;
                    }else if(ch2=='D'){
                       DrinkChoice(); 
                    choose = drink;
                    }else{
                        System.out.println("Please Enter s or D");
                        continue;
                    } break;
                }
                    
                Starter();
                  
                 while(true){
                System.out.println( "ENTER YOUR CHOICE IN STARTER");
                int starter1 = sc.nextInt();
                if(starter == starter1){
                    System.out.println("You choose Same ");
                    continue;
                }else{
                switch (starter1) { 
                case 1:
                    starterp1 = "Mix Veg Pakoda";
                    System.out.println( "1. Mix Veg Pakoda");
                    break;
                case 2:
                    starterp1 = "Veg Finger";
                    System.out.println( "2. Veg Finger");
                    break;
                case 3:
                    starterp1 = "Bread Pakoda";
                    System.out.println( "3. Bread Pakoda");
                    break;
                case 4:
                    starterp1 = "Methi Kabab";
                    System.out.println( "4. Methi Kabab");
                    break;
                case 5:
                    starterp1 = " Moong Pakoda";
                    System.out.println( "5. Moong Pakoda");
                    break;
                case 6:
                    starterp1 = "Dragon Aloo";
                    System.out.println( "6. Dragon Aloo");
                    break;
                case 7:
                    starterp1 = " Sabudana Vada";
                    System.out.println( "7. Sabudana Vada");
                    break;
                case 8:
                    starterp1 = " Finger Chips";
                    System.out.println( "8. Finger Chips");
                    break;
                case 9:
                    starterp1 = "Aloo Corn Kabad";
                    System.out.println( "9. Aloo Corn Kabad");
                    break;
                case 10:
                    starterp1 = " Veg Cutlet";
                    System.out.println( "10. Veg Cutlet");
                    break;
                case 11:
                    starterp1 = " Veg Kothey ";
                    System.out.println( "11. Veg Kothey ");
                    break;
                case 12:
                    starterp1 = "Hara Bhara Kabab";
                    System.out.println( "12. Hara Bhara Kabab");
                    break;
                case 13:
                    starterp1 = "Corn Chat";
                    System.out.println( "13. Corn Chat");
                    break;
                case 14:
                    starterp1 = " Aloo Chat";
                    System.out.println( "14. Aloo Chat");
                    break;
                case 15:
                    starterp1 = " Sabudana chat ";
                    System.out.println( "15. Sabudana chat ");
                    break;
                case 16:
                    starterp1= " Veg Manchurian Dry";
                    System.out.println( "16. Veg Manchurian Dry");
                    break;
                case 17:
                    starterp1 = " Tandori Manchurian ";
                    System.out.println( "17. Tandori Manchurian ");
                    break;
                case 18:
                    starterp1 = " Chinese Corn Kabab";
                    System.out.println( "18. Chinese Corn Kabab");
                    break;
                default:
                    System.out.println( "INVALID CHOICE!");
                    continue;    
            }
        }break;
        }
                    
                    p_start();
                    Vegetable();
                    p_Dish();
                    curd();
                    Dal();
                    rice();
                    roti();
                    sweet();
                    sweet();
                    Default();
                    iceCream();
                }break;
            
                default :
                   System.out.println("Not Valid!....");
                   continue;
            }break;
        }
        break;
        case 2:{
            
            System.out.printf(bg_BROWN+"%-50s"+Reset+"\n","             --BREAKFAST MENU--" );
            System.out.printf(PEACH+Black+"%-50S"+Reset+"\n"," A-Regular     RS 200/- ");
            System.out.printf(PEACH+Black+"%-50S"+Reset+"\n"," B-Special     RS 350/- ");
            System.out.printf(PEACH+Black+"%-50S"+Reset+"\n"," C-Heavy       RS 410/- ");
            while(true){
            System.out.println("Enter BreakFast Plates ");
            char ch2 = sc.next().toUpperCase().charAt(0);
            switch(ch2){
                case 'A':
                {
                
                  breakPrice=200;
                  System.out.printf(bg_BROWN+"%-25s%-25s"+Reset+"\n"," (A)","Rs 200/-");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Poha");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Jalebi");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Bread Iteam");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Tea and Coffee");
                  bread();
                  TeaOrCoffee();
                  break;
                }
                case 'B':
                {
                  breakPrice=230;
                  System.out.printf(bg_BROWN+"%-25S%-25s"+Reset+"\n"," (B)","Rs 230/-");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Poha");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Jalebi");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Bread Iteam");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Heavy Snaks");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Tea and Coffee");
                  heavy();
                  bread();
                  TeaOrCoffee();
                  break;
                }
                case 'C':
                {
                  breakPrice=250;
                  System.out.printf(bg_BROWN+"%-25s%-25s"+Reset+"\n"," (C)","Rs 250/-");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Poha");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Jalebi");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Bread Iteam");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","2 Heavy Snaks");
                  System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","1 Tea and Coffee");
                  heavy();
                  bread();
                  TeaOrCoffee();
                  break;
                }
                default :
                  System.out.println("Not valid!...");
                  continue;
            }break;
        } break;
        }
        case 3:{
            System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","      ONLY FOR LADIES - TIMING 4 TO 6PM      ");
            System.out.printf(PEACH+Black+"%-50s"+Reset+"\n","(AFTER 6PM 20/- PER HOUR/PER HEAD EXTRA");
        
        System.out.printf(bg_BROWN+"%-50s"+Reset+"\n","===== LADIES SPECIAL MENU (4 to 6 PM) =====");
        System.out.printf(bg_BROWN+"%-50S"+Reset+"\n","  (A).                 Rs. 250/-");
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n"," 1 Soup or Welcome Drink    1 Starter");
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n"," 1 Snacks  1 Sweet Dish     1 Tea or Coffee");
        System.out.printf(PEACH+"--------------------------------------------------"+Reset);System.out.println();
        System.out.printf(bg_BROWN+"%-50s"+Reset+"\n","(B).                   Rs. 300/-");
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n"," 1 Soup or Welcome Drink    1 Starter");
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n"," 1 Snacks  1 Sweet Dish     1 Tea Or Coffee");
        System.out.printf(PEACH+"--------------------------------------------------"+Reset);System.out.println();
        System.out.printf(bg_BROWN+"%-50s"+Reset+"\n","(C).                   Rs. 350/-");
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n"," 1 Soup or Welcome Drink    1 Paneer Starter");
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n"," 1 Paneer Starter           1 Sweet Dish");
        System.out.printf(PEACH+Black+"%-50s"+Reset+"\n"," 1 Snacks          1 Tea or Coffee or Ice-Cream");
        System.out.printf(PEACH+"--------------------------------------------------"+Reset);System.out.println();
       while(true){
        System.out.println("Enter your choice (A / B / C): ");
        char choice = sc.next().toUpperCase().charAt(0);

        switch(choice) {
            case 'A':
                 lPrice = 250;
                System.out.println("\nMENU A - Rs.250");
                
                while(true){
                    System.out.println("Which you want  Soup or Drink(S or D) ");
                    char ch2 = sc.next().toUpperCase().charAt(0);
                    if(ch2=='S'){
                    SoupChoice();
                    choose = soup;
                    }else if(ch2=='D'){
                       DrinkChoice();  
                       choose=drink;
                    }else{
                        System.out.println("Please Enter s or D");
                        continue;
                    } break;
                }
                Starter();
                snacks();
                sweet();
                TeaOrCoffee();
            
                
                break;

            case 'B':
                lPrice = 300;
                System.out.println("\nYou selected MENU B - Rs.300");
                while(true){
                    System.out.println("Which you want  Soup or Drink(S or D) ");
                    char ch2 = sc.next().toUpperCase().charAt(0);
                    if(ch2=='S'){
                    SoupChoice();  
                    choose = soup;
                    }else if(ch2=='D'){
                       DrinkChoice();  
                       choose = drink;
                    }else{
                        System.out.println("Please Enter s or D");
                        continue;
                    } break;
                }Starter();
                snacks();
                sweet();
                TeaOrCoffee();
                iceCream();
                
                break;

            case 'C':
            lPrice = 350;
                System.out.println("\nYou selected MENU C - Rs.350");
                while(true){
                    System.out.println("Which you want  Soup or Drink(S or D) ");
                    char ch2 = sc.next().toUpperCase().charAt(0);
                    if(ch2=='S'){
                    SoupChoice();
                    choose = soup;
                    }else if(ch2=='D'){
                       DrinkChoice();  
                       choose = drink;
                    }else{
                        System.out.println("Please Enter s or D");
                        continue;
                    } break;
                }Starter();
                snacks();
                p_start();
                sweet();
                TeaOrCoffee();
                iceCream();
                
                break;

            default:
                System.out.println("Invalid Choice! Please select A, B or C.");
                continue;
            }break;
        }break;
    }
        default :
            System.out.println("Invalid enter again");
            continue;
        }break;
    }
        
 }
 double totalPrice2 = breakPrice;
void printBill2(String customerName, String mobile, String bookingDate) {
    System.out.println("How Many Person ");
    int person = sc.nextInt();
    double total = breakPrice*person;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
       
        System.out.print(bgWhite+Black+"=================================================="+Reset);System.out.println();
        System.out.printf(bgWhite+Purple+"%-50s"+Reset,"                JMB CATERING BILL           ");System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"==================================================");System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Customer Name :  ", customerName);System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Mobile No.    :  ", mobile);System.out.println();
        System.out.printf(bgWhite+Yellow+"%-25s %-24s"+Reset,"Date          :       ",String.format(bookingDate));System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"--------------------------------------------------");System.out.println();
    //     System.out.println(bgWhite+Purple+"  YOU CHOOSE THIS ITEMS IN Plate : pls Check it "+Reset);
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Soup or Drink:  ",choose);System.out.println();
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Heavy     :  ",heavy_ );System.out.println();
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"bread      :  ",bread_ );System.out.println();
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Poha  ","Jalebi" );System.out.println();
    //    // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"bread      :  ",bread_ );System.out.println();
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Tea or coffee:  ",torc );System.out.println();

        System.out.printf(bgWhite+Black+"%-50s"+Reset,"--------------------------------------------------");System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24d"+Reset,"total Palates  :   ",person);System.out.println();
         System.out.printf(bgWhite+Black+"%-25s %-24.2f"+Reset,"Price         :  ", breakPrice);System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"-------------------------------------------------");System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24.2f"+Reset,"Total Amount  :        Rs", total);System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"==================================================");System.out.println();
        System.out.printf(bgWhite+Red+"%-50s"+Reset,"             Thank you! Visit Again.        ");System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"==================================================");
    }
    void printBill3(String customerName, String mobile, String bookingDate) {
    System.out.println("How Many Person ");
    int person = sc.nextInt();
    double total = lPrice*person;
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
       
        System.out.print(bgWhite+Black+"=================================================="+Reset);System.out.println();
        System.out.printf(bgWhite+Purple+"%-50s"+Reset,"                JMB CATERING BILL           ");System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"==================================================");System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Customer Name :  ", customerName);System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Mobile No.    :  ", mobile);System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Booking Date  :    ",String.format(bookingDate));System.out.println();
         System.out.printf(bgWhite+Black+"%-50s"+Reset,"--------------------------------------------------");System.out.println();
    //     System.out.println(bgWhite+Purple+"   YOU CHOOSE THIS ITEMS IN THALI : pls Check it  "+Reset);
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Soup or Drink:  ",choose);System.out.println();
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Starter      :  ",starterp );System.out.println();
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Snacks      :  ",snacks_ );System.out.println();
    //    // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"     :  ", );System.out.println();
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Sweet Dish   :  ",sweet_ );System.out.println();
    //     System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Ice_cream    :  ",ice_cream );System.out.println();
    //      System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Tea or Coffee  :  ",torc );System.out.println();

        System.out.printf(bgWhite+Black+"%-50s"+Reset,"-------------------------------------------------");System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24d"+Reset,"total Palates :   ",person);System.out.println();
         System.out.printf(bgWhite+Black+"%-25s %-24.2f"+Reset,"Price         :  ", lPrice);System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"-------------------------------------------------");System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24.2f"+Reset,"Total Amount  :        Rs", total);System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"==================================================");System.out.println();
        System.out.printf(bgWhite+Red+"%-50s"+Reset,"             Thank you! Visit Again.        ");System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"==================================================");
    }
}

class Bill {
    // Scanner sc = new Scanner(System.in);
    // double[] thaliPrice = {0.0, 120.50, 150.0, 180.75, 200.0, 250.25};
    // int thali;
    //     while (true) {
    //         System.out.println("Select Thali:");
    //         System.out.println("1. Regular (₹120.50)\n2. Deluxe (₹150.00)\n3. Special (₹180.75)\n4. Royal (₹200.00)\n5. Maharaja (₹250.25)");
    //         System.out.print("Enter thali number (1-5): ");
    //         if (sc.hasNextInt()) {
    //             thali = sc.nextInt();
    //             if (thali >= 1 && thali <= 5) break;
    //         } else sc.next();        // invalid token 
    //         System.out.println("Invalid! Try again.");
    //     }
    // 
// double priceRegular = 310.0;
// double priceSpecial = 360.0;
// double priceJain    = 410.0;
// double priceMaharaja= 470.0;
// double priceRoyal   = 600.0;
public static final String Black = "\u001B[30m";
   public static final String Purple = "\u001B[35m";
   public static final String Green = "\u001B[32";
   public static final String Yellow = "\u001B[33m";
   public static final String Reset = "\u001B[0m";
   public static final String bgWhite = "\u001B[47m";
   public static final String PEACH = "\u001B[48;2;255;218;185m";

    int bookMem,actualMem;
    int extraMem = 0;
    int ThaliCount=0;
    double totalPrice ;
    double tax = 5.0;
    double discount=5;
    Menu menu;
    double taxAmt;

    public Bill(Menu menu){
        this.menu = menu;
    }

    void getData(){
    Scanner sc = new Scanner(System.in);
    System.out.println(Yellow+"---------------------------------------"+Reset);
     System.out.println(Purple+"Confirm Number Of  Members you book for Come"+Reset);
     bookMem = sc.nextInt();
    System.out.println(Purple+"  You choose thali "+menu.thali+Reset);
    System.out.println(Purple+"Thali Price is Rs :"+menu.thaliPrice+Reset);
    System.out.println(Purple+"Your order Done SuccsseFully  "+Reset);
     System.out.println(Yellow+"---------------------------------------"+Reset);
    System.out.println(Purple+"Enter Member Actually Come "+Reset);
    actualMem = sc.nextInt();
    }
    // void setData(int bookMem,int actualMem){
    //     this.bookMem = bookMem;
    //     this.actualMem= actualMem;
    // }

   double billTotal(){
   if(actualMem>bookMem){
      extraMem = actualMem - bookMem;
      System.out.println("Extra Memeber : "+extraMem); 
      if(extraMem > 10){
        ThaliCount = extraMem - 10 + bookMem;
      }else{
        ThaliCount = bookMem;
      }
   } else {
        ThaliCount = bookMem;
    }
   //Menu menu = new Menu();
     double Price = this.menu.thaliPrice * ThaliCount ;
      taxAmt = Price *(tax /100);
     totalPrice = Price + taxAmt;
      return  totalPrice;
      //soup,drink,veg_,veg_2,p_starter,Nstarter,p_dish,curd_,sweet_,ice_cream,snacks_,chinese_,Dal_,rice_,heavy_,bread_;
   }
   void printBill(String customerName, String mobile, String bookingDate) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print(bgWhite+Black+"=================================================="+Reset);System.out.println();
        System.out.printf(bgWhite+Purple+"%-50s"+Reset,"                JMB CATERING BILL           ");System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"==================================================");System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Customer Name :  ", customerName);System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Mobile No.    :  ", mobile);System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Booking Date  :  ",String.format(bookingDate));System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"--------------------------------------------------");System.out.println();
        // System.out.printf(bgWhite+Black+"%-50s"+Reset,"--------------------------------------------------");System.out.println();
        // System.out.println(bgWhite+Purple+"   YOU CHOOSE THIS ITEMS IN THALI : pls Check it  "+Reset);
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Soup or Drink:  ",menu.choose);System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"vegetable1   :  ",menu.veg_ );System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"vegetable2   :  ",menu.veg_2 );System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Panneer starter:  ",menu.p_starter);System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Starter      :  ",menu.starterp );System.out.println();
        //  System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Starter 2     :  ",menu.starterp1 );System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Panner Dish  :  ",menu.p_dish );System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Curd Dish    :  ",menu.curd_ );System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Sweet Dish   :  ",menu.sweet_ );System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Ice_cream    :  ",menu.ice_cream );System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Dal          :  ",menu.Dal_ );System.out.println();
        // System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Rice         :  ",menu.rice_ );System.out.println();
        // System.out.printf(bgWhite+Black+"Roti/Butter Naan/Paratha  ,Pickle ,Salad   ,Papad " +Reset);System.out.println();
         
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"--------------------------------------------------");System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Booked Members:  ", bookMem);System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Actual Members:  ", actualMem);System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Extra Members :  ", extraMem);System.out.println();
         System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Tax 5%        :  ", taxAmt);System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Thali Price   :  ", menu.thaliPrice);System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24s"+Reset,"Thalis Count  :  ", ThaliCount);System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"--------------------------------------------------");System.out.println();
        System.out.printf(bgWhite+Black+"%-25s %-24.2f"+Reset,"Total Amount  : Rs",totalPrice);System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"==================================================");System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"              Thank you! Visit Again.        ");System.out.println();
        System.out.printf(bgWhite+Black+"%-50s"+Reset,"==================================================");
    }
}


public class JMB{
     public static void main(String args[]){
      String name,num;
        Scanner sc = new Scanner(System.in);
        //Customer name
        while(true){
        System.out.print("Enter Customer Name: ");
         name = sc.nextLine();
        if(name.matches("[a-zA-Z ]+")){   //new mwthod
            break;
        }else{
            System.out.println("Invalid Name!. Enter Character Only!");
            //name=sc.nextLine();
        }}

        //mobile number
        while (true) {
    System.out.print("Enter Customer Mobile Number : ");
    num = sc.nextLine().trim();

    char first = num.charAt(0);

    if (first >= '6' && num.matches("\\d{10}")) { 
        break;
    } else {
        System.out.println("Invalid mobile number! Please enter a 10-digit Valid mobile number.");}
  }
        
        //date booking
         SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false); // strict checking (no 32-13-2025 etc.)

        Date bookingDate = null;

        while (bookingDate == null) { // jab tak sahi aur future date na mile loop chalega
    System.out.print("Enter Booking Date (dd-MM-yyyy): ");
    String input = sc.nextLine();
    try {
        bookingDate = sdf.parse(input); // String ko Date me convert karega

        // Check if entered date is after today
        Date today = new Date();
        if (!bookingDate.after(today)) {
            System.out.println("Date must be in the future (upcoming)!");
            bookingDate = null; // loop fir se chalega
        }

    } catch (ParseException e) {
        System.out.println("Invalid date! Please enter in dd-MM-yyyy format.");
    }
}

        System.out.println("Booking Date confirmed: " + sdf.format(bookingDate));
        System.out.println("Enter Number Of Member will came");
        int m = sc.nextInt();
        Menu obj = new Menu();
        obj.backMenu();
        System.out.println("\n");
        obj.menu();
        if(obj.choice ==3){
         obj.printBill3(name,num,sdf.format(bookingDate));
        }
        else if(obj.choice == 2){ 
        obj.printBill2(name,num,sdf.format(bookingDate));
        }else if(obj.choice == 1){ 
             
        Bill bill = new Bill(obj);
        //new Bill(new Menu());
        bill.getData();
        bill.billTotal();
        bill.printBill(name,num,sdf.format(bookingDate));
        }else{
            System.out.println("Invlaid Choice");
        }
        // System.out.println("Enter Choice :");
        // int choice = sc.nextInt();
        // choose(choice);
    }
}    
