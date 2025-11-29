import java.util.Scanner;
    class Result{
        public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

         final  String bgWhite = "\u001B[47m";
         final String GBg = "\u001B[102m";
         final String blueBg = "\u001B[44m";
         final String Black = "\u001B[30m";
         final String red = "\u001B[31m";
         final String bold = "\u001B[1m";
         final String reset = "\u001B[0m";
         final String yellow = "\u001B[43m";
         final String blueBg2= "\u001B[104m";
         final String purple ="\u001B[33m";
         final String wtext = "\u001B[97m";



        //Student Details 
        String name;
        String  Stuclass;
        int rollno;
        String fname;
        String mName;
        String clg;
        int year;
        String enroll ;
        char status ; 

            System.out.println("Enter details: ");
            System.out.println("Enter College Name : ");
           // sc.nextLine();
            clg = sc.nextLine();

            System.out.println("Enter Year : ");
             year = sc.nextInt();

            System.out.println("Name: ");
            sc.nextLine();
            name=sc.nextLine();
            
            System.out.println("Roll no : ");
            rollno=sc.nextInt();

            System.out.println("Student Class : ");
            sc.nextLine();
            Stuclass =sc.nextLine();

            System.out.println("Father Name : ");
           // sc.nextLine();
            fname = sc.nextLine();

            System.out.println("Mather Name : ");
            //sc.nextLine();
            mName = sc.nextLine();

            System.out.println("EnrollMent ");
            enroll = sc.nextLine();

            System.out.println("Status (R/P)");
            status = sc.next().charAt(0);
            
        
        String subject1, subject2, subject3, subject4, subject5;
        int mark1, mark2, mark3, mark4, mark5;

    
        String practical1, practical2;
        int practicalMark1, practicalMark2;

        System.out.print("Enter name of Subject 1: ");
        //sc.nextLine();
        subject1 = sc.nextLine();
        System.out.print("Enter marks obtained in " + subject1 + " (out of 100): ");
        mark1 = sc.nextInt();

        System.out.print("Enter name of Subject 2: ");
        sc.nextLine(); 
        subject2 = sc.nextLine();
        System.out.print("Enter marks obtained in " + subject2 + " (out of 100): ");
        mark2 = sc.nextInt();

        System.out.print("Enter name of Subject 3: ");
        sc.nextLine();  
        subject3 = sc.nextLine();
        System.out.print("Enter marks obtained in " + subject3 + " (out of 100): ");
        mark3 = sc.nextInt();

        System.out.print("Enter name of Subject 4: ");
       sc.nextLine(); 
        subject4 = sc.nextLine();
        System.out.print("Enter marks obtained in " + subject4 + " (out of 100): ");
        mark4 = sc.nextInt();

        System.out.print("Enter name of Subject 5: ");
        sc.nextLine(); 
        subject5 = sc.nextLine();
        System.out.print("Enter marks obtained in " + subject5 + " (out of 100): ");
        mark5 = sc.nextInt();

        System.out.print("\nEnter name of Practical 1: ");
        sc.nextLine(); 
        practical1 = sc.nextLine();
        System.out.print("Enter marks obtained in " + practical1 + " (out of 25): ");
        practicalMark1 = sc.nextInt();

        System.out.print("Enter name of Practical 2: ");
        sc.nextLine();
        practical2 = sc.nextLine();
        System.out.print("Enter marks obtained in " + practical2 + " (out of 25): ");
        practicalMark2 = sc.nextInt();
        String practical3="-";
        String practical4="-";
        String practical5="-";

        int totalTheoryFails = 0;
        int totalMarks = 0;

        if (mark1 < 33) totalTheoryFails++;
        if (mark2 < 33) totalTheoryFails++;
        if (mark3 < 33) totalTheoryFails++;
        if (mark4 < 33) totalTheoryFails++;
        if (mark5 < 33) totalTheoryFails++;

        
        totalMarks = mark1 + mark2 + mark3 + mark4 + mark5 + practicalMark1 + practicalMark2;

        int maxTotal = (5 * 100) + (2 * 25); 
        float percentage = (totalMarks * 100.0f) / maxTotal;


        String remark;
        if (totalTheoryFails >= 3) {
            remark = "Year Back";
        } else if (totalTheoryFails > 0) {
            remark = "ATKT";
        } else {
            remark = "Pass";
        }


        String grade;
        if (percentage >= 90) grade = "A+";
        else if (percentage >= 80) grade = "A";
        else if (percentage >= 70) grade = "B+";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 50) grade = "C";
        else if (percentage >= 40) grade = "D";
        else grade = "F";

        String principle,hod ;
        System.out.println("Enter principle Name : ");
        sc.nextLine();
        principle = sc.nextLine();
        System.out.println("Enter HOD Name : ");
        hod = sc.nextLine();
        
        
    
        System.out.printf(blueBg2+wtext+"%-80s"+reset,"=============================== MARKSHEET ================================");System.out.println();
        System.out.printf(blueBg2+bold+Black+"%-80s"+reset,"                          " +clg);System.out.println();
        System.out.printf(blueBg2+Black+bold+"%-80s"+reset,"                              "+ Stuclass);System.out.println();
        System.out.printf(blueBg2+red+bold+"%-80s"+reset,"                                   Year :"+year);System.out.println();
         System.out.printf(blueBg2+"%-80s"+reset,"===============================================================================");System.out.println();
        System.out.printf(bgWhite+purple+"Roll Number :%-25s  Name : %-30s"+reset,rollno ,name);System.out.println();
        System.out.printf(bgWhite+purple+"Enrollment  :%-25s  Status : %-30s"+reset,enroll ,status);System.out.println();
        
        //System.out.println(rollno);
        //System.out.println(Stuclass);
        System.out.printf(bgWhite+purple+"Father Name :%-25s Mother Name : %-27s"+reset,fname ,mName);System.out.println();
       // System.out.printf(bgWhite+" %-48s%n");
        System.out.printf(purple+bgWhite+"%-80s"+reset,"------------------------------------------------------------------------ ------");System.out.println();
        System.out.printf(GBg+Black+bold+"%-20s %-19s %-18s %-20s"+reset,"Subject","Theory ","Practical","Total Marks ");System.out.println();
        System.out.printf(purple+bgWhite+"%-80s"+reset,"-------------------------------------------------------------------------------");System.out.println();
        System.out.printf(bgWhite+Black+"%-20s %-19s %-18s %-20s"+reset,subject1 , mark1 ,practicalMark1 ,(mark1+practicalMark1));System.out.println();
        System.out.printf(bgWhite+Black+"%-20s %-19s %-18s %-20s"+reset,subject2 , mark2 ,practicalMark2 ,(mark2+practicalMark2));System.out.println();
        System.out.printf(bgWhite+Black+"%-20s %-19s %-18s %-20s"+reset,subject3 , mark3 ,practical3 ,mark3);System.out.println();
        System.out.printf(bgWhite+Black+"%-20s %-19s %-18s %-20s"+reset,subject4 , mark4 ,practical4,  mark4);System.out.println();
        System.out.printf(bgWhite+Black+"%-20s %-19s %-18s %-20s"+reset,subject5 , mark5 ,practical5, mark5);System.out.println();

       // System.out.println("\nPractical Subjects:");
       // System.out.println(practical1 + ": " + practicalMark1 + "/25");;;
       // System.out.println(practical2 + ": " + practicalMark2 + "/25");
        System.out.printf(bgWhite+Black+"%-80s"+reset,"=============================================================================");System.out.println();
      //System.out.print(lightGreenBg+ red +bold+"                                  RESULT ");
     // System.out.println();
      //System.out.println(red+"--------------------------------------------------------------------------------------------------------------------------"+reset);
        System.out.printf(blueBg+bold+Black+"%-80s"+reset,"                  Total Marks              :  " + totalMarks + "/" + maxTotal);System.out.println();
        System.out.printf(bgWhite+bold+Black+"%-80s"+reset,"--------------------------------------------------------------------------- ");System.out.println();
        System.out.printf(bgWhite+bold+Black+"%-80s"+reset,"Remark             : " + remark);System.out.println();
        System.out.printf(bgWhite+bold+Black+"%-80s"+reset,"Percentage         : "+ percentage);System.out.println();
        System.out.printf(bgWhite+bold+Black+"%-80s"+reset,"Grade              : " + grade);System.out.println();
        System.out.printf(bgWhite+bold+Black+"%-80s"+reset,"Priciple Signature : "+principle);System.out.println();
        System.out.printf(bgWhite+bold+Black+"%-80s"+reset,"HOD Signature      : "+hod);System.out.println();
        System.out.printf(blueBg2+bold+Black+"%-80s"+reset,"==========================================================================");
        
    }
}
