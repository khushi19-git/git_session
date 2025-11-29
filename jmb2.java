import java.util.Scanner;
class Thali{
    String[] Thalis = {"Thali A", "Thali B", "Thali C", "Thali D", "Thali E", "Thali F"};
    String[] ThalisP = {"Rs. 310/-", "Rs. 360/-", "Rs. 410/-", "Rs. 480/-", "Rs. 600/-", "Rs. 700/-"};
    
    // Menu options for customization
    String[] soupOptions = {"Tomato Soup", "Veg Mancho", "Hot & Sour Soup", "Lemon Coriander"};
    String[] welcomeDrinkOptions = {"Blue Lagoon", "Orange Pink City", "Blowgun Kesher Pista", "Jaljeera" , "Strawberry Delight","Fresh Lime Water","Butter Milk" , "Rasna Water"};
    String[] vegetableOptions = {"Nav Ratan Korma","Lahori Aloo with Mutter","Mix Veg","Green Chana (Seasonal)","Corn Palak","Aloo 65","Aloo Mutter","Aloo Capsicum","Aloo Do Pyaza","Aloo Gobhi/Tomato","Gobhi Mutter","Kadi Punjabi","Veg. Kofta (Gol)","Methi Mutter Malai","Haryali Kofta","Chana Masala","Bhindi Masala","Jeera Aloo","Dum Aloo","Gujrati Aloo","Tinda Masala","Aloo Palak","Seasonal Veg.","Bhindi Do Pyaza","Veg. Kohlapuri","Corn Capsicum"};
    String[] dalOptions = {"Dal Tadka", "Dal Makhani", "Dal Fry", "Panchmel Dal"};
    String[] riceOptions = {"Steamed Rice", "Jeera Rice", "Pulao", "Fried Rice","Green Peas Pulao"};
    String[] breadOptions = {"Roti", "Butter Naan", "Tandoori Roti", "Laccha Paratha", "Butter Paratha", "Kulcha"};
    String[] starterOptions = {"Paneer Tikka", "Veg Manchurian", "Spring Roll", "Chilli Potato"};
    String[] sweetDishOptions = {"Gulab Jamun", "Rasgulla", "Ice Cream", "Rasmalai"};
    String[] saladOptions = {"Green Salad", "Fruit Salad", "Kachumber"};
    String[] papadOptions = {"Plain Papad", "Masala Papad", "Fried Papad"};
    String[] pickleOptions = {"Mango Pickle", "Mixed Pickle", "Lemon Pickle"};
    String[] curdOptions = {"Plain Curd", "Raita", "Boondi Raita"};
}

class Breakfast{

}
class JMB2{
    public static final String RESET = "\u001B[0m";

    public static final String BLACK = "\u001B[30m";
    public static final String WHITE = "\u001B[37m";

    public static final String RED_BG = "\u001B[48;5;52m";
    public static final String GREEN_BG = "\u001B[48;5;52m";
    public static final String YELLOW_BG = "\u001B[48;5;52m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
    public static final String CYAN_BG = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String MAROON = "\u001B[48;5;52m";

    static void printLunch(String text){
        System.out.printf(WHITE_BACKGROUND + ANSI_BLACK + "   %-72s" + RESET + "%n", text);
    }

    static void printHeading(String text){
    System.out.printf(WHITE_BACKGROUND + ANSI_BLACK + "   %-72s" + RESET + "%n", " ");
    System.out.printf(WHITE + YELLOW_BG + "   %-72s" + RESET + "%n", text);
    System.out.printf(WHITE_BACKGROUND + ANSI_BLACK + "   %-72s" + RESET + "%n", " ");
    }    
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        
        while(true){
        System.out.println();
        System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
        System.out.printf(MAROON + WHITE + "%-28s%s%28s" + RESET + "%n", "", "Jain Mithai Bhandar", "");
        System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
        System.out.println(CYAN_BG + BLACK+"=============================Enter Your Choice============================="+RESET);
        System.out.println(RED_BG + WHITE+"                                      " + RESET + YELLOW_BG + BLACK + "                                     "+RESET);
        System.out.println(RED_BG + WHITE+"                                      " + RESET + YELLOW_BG + BLACK + "                                     "+RESET);
        System.out.println(RED_BG + WHITE + "             1. LUNCH                 " + RESET + YELLOW_BG + WHITE + "             2. BREAKFAST            "+RESET);
        System.out.println(RED_BG + WHITE+"                                      "  + RESET + YELLOW_BG + BLACK + "                                     "+RESET);
        System.out.println(RED_BG + WHITE+"                                      "  + RESET + YELLOW_BG + BLACK + "                                     "+RESET);
        System.out.println(WHITE_BACKGROUND+BLACK+"1. LUNCH                                                                   "+RESET);
        System.out.println(WHITE_BACKGROUND+BLACK+"2. BREAKFAST                                                               "+RESET);
        System.out.println(WHITE_BACKGROUND+BLACK+"Enter Your Choice :                                                        "+RESET);
        int firstChoice = sc.nextInt(); 

        if(firstChoice == 1){
        System.out.println(RED_BG + WHITE+"                                                                           "+RESET);
        System.out.println(RED_BG + WHITE+"                                                                           "+RESET);
        System.out.println(RED_BG + WHITE+"                             VEGETARIAN MENU                               "+RESET);
        System.out.println(RED_BG + WHITE+"                                                                           "+RESET);
        System.out.println(RED_BG + WHITE+"                                                                           "+RESET);

        //Lunch
        printHeading("A) Thali - Rs. 310/-");
        printLunch("Soup/Welcome Drink");
        printLunch("Vegetable Dish");
        printLunch("Dal");
        printLunch("Rice");
        printLunch("Roti/Naan/Paratha");
        printLunch("Pickle, Salad, Papad");
        printLunch("Sweet Dish");

        printHeading("B) Thali - Rs. 360/-");
        printLunch("Soup/Welcome Drink");
        printLunch("Paneer Dish");
        printLunch("Vegetable Dish");
        printLunch("Dal, Rice");
        printLunch("Roti/Naan/Paratha");
        printLunch("Pickle, Salad, Papad");
        printLunch("Sweet Dish / Ice-cream");

        printHeading("C) Thali - Rs. 410/-");
        printLunch("Soup/Welcome Drink");
        printLunch("Starter");
        printLunch("Paneer Dish");
        printLunch("Vegetable Dish");
        printLunch("Curd Dish");
        printLunch("Dal, Rice");
        printLunch("Roti/Naan/Paratha");
        printLunch("Sweet Dish, Ice-cream");

        printHeading("D) Thali - Rs. 470/-");
        printLunch("Soup/Welcome Drink");
        printLunch("Starter");
        printLunch("Paneer Dish");
        printLunch("Vegetable Dish");
        printLunch("Curd Dish");
        printLunch("Dal, Rice");
        printLunch("Roti/Naan/Paratha");
        printLunch("Sweet Dish, Ice-cream / Coffee");

        printHeading("E) Thali - Rs. 600/-");
        printLunch("Soup/Welcome Drink");
        printLunch("1 Starter, 1 Paneer Starter");
        printLunch("1 Pasta (Any Type)");
        printLunch("Paneer Dish, Vegetable Dish");
        printLunch("Dal, Rice");
        printLunch("Roti/Naan/Paratha");
        printLunch("Curd Dish");
        printLunch("Sweet Dish, Ice-cream");

        printHeading("F) Thali - Rs. 700/-");
        printLunch("Soup/Welcome Drink");
        printLunch("2 Starters + Paneer Starter");
        printLunch("Same Item + 2 Paneer Dish");
        printLunch("Vegetable Dish + Curd Dish");
        printLunch("Dal, Rice");
        printLunch("Roti/Naan/Paratha");
        printLunch("2 Sweet Dishes, Ice-cream");
        break;
        }

        else if(firstChoice == 2){
        // Breakfast Menu
        System.out.println(GREEN_BG + WHITE+"                                                                           "+RESET);
        System.out.println(GREEN_BG + WHITE+"                                                                           "+RESET);
        System.out.println(GREEN_BG + WHITE+"                             BREAKFAST MENU                                "+RESET);
        System.out.println(GREEN_BG + WHITE+"                                                                           "+RESET);
        System.out.println(GREEN_BG + WHITE+"                                                                           "+RESET);

        printHeading("A) Breakfast 1 Rs. 200/-");
        printLunch("Poha");
        printLunch("Jalebi");
        printLunch("Bread Item");
        printLunch("Tea/Coffee");

        printHeading("B) Breakfast 2 Rs. 230/-");
        printLunch("Poha");
        printLunch("Jalebi");
        printLunch("Bread Item");
        printLunch("Tea/Coffee");

        printHeading("C) Breakfast 3 Rs. 250/-");
        printLunch("Poha");
        printLunch("Jalebi");
        printLunch("Bread Item");
        printLunch("Tea/Coffee");
        break;
        }
        else{
            printHeading("Invalid Input!!!");
        }
    }
    
        //Thali Choice
        //while(true){
        System.out.println();
        System.out.println(WHITE_BACKGROUND + BLACK+ "Enter Thali Choice : "+RESET);
        char thaliChoice = sc.next().toLowerCase().charAt(0);

        switch(thaliChoice){
            case 'a' : 
                System.out.println();
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(MAROON + WHITE + "%-28s%s%28s" + RESET + "%n", "", "Jain Mithai Bhandar", "");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(WHITE_BACKGROUND + ANSI_BLACK + "   %-72s" + RESET + "%n", " ");
                printHeading("A) Thali - Rs. 310/-");
                printLunch("Soup/Welcome Drink");
                printLunch("Vegetable Dish");
                printLunch("Dal");
                printLunch("Rice");
                printLunch("Roti/Naan/Paratha");
                printLunch("Pickle, Salad, Papad");
                printLunch("Sweet Dish");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                break;
                
                case 'b':
                System.out.println();
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(MAROON + WHITE + "%-28s%s%28s" + RESET + "%n", "", "Jain Mithai Bhandar", "");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(WHITE_BACKGROUND + ANSI_BLACK + "   %-72s" + RESET + "%n", " ");
                printHeading("B) Thali - Rs. 360/-");
                printLunch("Soup/Welcome Drink");
                printLunch("Paneer Dish");
                printLunch("Vegetable Dish");
                printLunch("Dal, Rice");
                printLunch("Roti/Naan/Paratha");
                printLunch("Pickle, Salad, Papad");
                printLunch("Sweet Dish / Ice-cream");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                break;
                
                case 'c':    
                System.out.println();
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(MAROON + WHITE + "%-28s%s%28s" + RESET + "%n", "", "Jain Mithai Bhandar", "");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(WHITE_BACKGROUND + ANSI_BLACK + "   %-72s" + RESET + "%n", " ");
                printHeading("C) Thali - Rs. 410/-");
                printLunch("Soup/Welcome Drink");
                printLunch("Starter");
                printLunch("Paneer Dish");
                printLunch("Vegetable Dish");
                printLunch("Curd Dish");
                printLunch("Dal, Rice");
                printLunch("Roti/Naan/Paratha");
                printLunch("Sweet Dish, Ice-cream");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                break;
                
                case 'd':
                System.out.println();
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(MAROON + WHITE + "%-28s%s%28s" + RESET + "%n", "", "Jain Mithai Bhandar", "");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(WHITE_BACKGROUND + ANSI_BLACK + "   %-72s" + RESET + "%n", " ");
                printHeading("D) Thali - Rs. 470/-");
                printLunch("Soup/Welcome Drink");
                printLunch("Starter");
                printLunch("Paneer Dish");
                printLunch("Vegetable Dish");
                printLunch("Curd Dish");
                printLunch("Dal, Rice");
                printLunch("Roti/Naan/Paratha");
                printLunch("Sweet Dish, Ice-cream / Coffee");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                break;
                
                case 'e':
                System.out.println();
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(MAROON + WHITE + "%-28s%s%28s" + RESET + "%n", "", "Jain Mithai Bhandar", "");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(WHITE_BACKGROUND + ANSI_BLACK + "   %-72s" + RESET + "%n", " ");
                printHeading("E) Thali - Rs. 600/-");
                printLunch("Soup/Welcome Drink");
                printLunch("1 Starter, 1 Paneer Starter");
                printLunch("1 Pasta (Any Type)");
                printLunch("Paneer Dish, Vegetable Dish");
                printLunch("Dal, Rice");
                printLunch("Roti/Naan/Paratha");
                printLunch("Curd Dish");
                printLunch("Sweet Dish, Ice-cream");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                break;
                
                case 'f':
                System.out.println();
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(MAROON + WHITE + "%-28s%s%28s" + RESET + "%n", "", "Jain Mithai Bhandar", "");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                System.out.printf(WHITE_BACKGROUND + ANSI_BLACK + "   %-72s" + RESET + "%n", " ");
                printHeading("F) Thali - Rs. 700/-");
                printLunch("Soup/Welcome Drink");
                printLunch("2 Starters + Paneer Starter");
                printLunch("Same Item + 2 Paneer Dish");
                printLunch("Vegetable Dish + Curd Dish");
                printLunch("Dal, Rice");
                printLunch("Roti/Naan/Paratha");
                printLunch("2 Sweet Dishes, Ice-cream");
                System.out.printf(MAROON + "   %-72s" + RESET + "%n", " ");
                break;
                
                default: printHeading("Invalid Input!!!");
            }
        //}
    }
}
