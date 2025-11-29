1import java.util.Scanner;
class Marksheet
{
    //Variable for Personal Info
    String name,course,roll,enroll,father,mother,status,period;
    int sem;
    void personalInfo()
    {
        Scanner sc = new Scanner(System.in);
        //Personal
        System.out.print("Enter your Name : ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Enter you Stream : ");
        course = sc.nextLine().toUpperCase();
        System.out.print("Enter your Roll No : ");
        roll = sc.nextLine();
        System.out.print("Enter your Enrolment No : ");
        enroll = sc.nextLine().toUpperCase();
        System.out.print("Enter your Semester : ");
        sem = sc.nextInt();
        sc.nextLine();
        // char temp;
        System.out.print("Enter your Status(REGULAR/PRIVATE) : ");
        status=sc.nextLine().toUpperCase();
        System.out.print("Enter Examination Period : ");
        period=sc.nextLine().toUpperCase();
        // do{
        //     temp = sc.next().toUpperCase().charAt(0);
        //     if(temp=='R')
        //         status="REGULAR";
        //     else if(temp=='P')
        //         status="PRIVATE";
        //     else
        //         System.out.println("Enter Again");
        // }while(temp!='R'||temp!='P');
        System.out.print("Enter your Father Name : ");
        father = sc.nextLine().toUpperCase();
        System.out.print("Enter your Mother Name : ");
        mother = sc.nextLine().toUpperCase();
        System.out.println();
    }

    //Variable for Subjective Info
    String subName[] = new String[5];
    int subMarks[] = new int[5];
    String subNamePrac[] = new String[2];
    int subMarksPrac[] = new int[2];
    int outOf,outOfPrac;
    void subjectInfo()
    {
        Scanner sc = new Scanner(System.in);
        //Theory Subject Detail
        System.out.println("Enter 5 theory Subject Name");
        for(int i=0 ; i<5 ; i++)
        {
            subName[i] = sc.nextLine().toUpperCase();
        }
        System.out.println();
        //Input for Out of Marks
        System.out.print("\nEnter Total Marks for each Subject : ");
        outOf= sc.nextInt();
        //Input for Out of Marks
        System.out.println("Enter Obtained Marks : --");
        for(int i=0 ; i<5 ; i++)
        {
            do{
                System.out.print("Enter "+subName[i]+" Marks(0-"+outOf+")  :  ");
                subMarks[i] = sc.nextInt();
            }while(subMarks[i]<0||subMarks[i]>outOf);
        }
        System.out.println();

        //Practical subject Detalis
        System.out.println("Enter 2 Practical Subject Name : --");
        sc.nextLine();
        for(int i=0 ; i<2 ; i++)
        {
            subNamePrac[i] = sc.nextLine();
        }
        for(int i=0 ; i<2 ; i++)
        {
            subNamePrac[i] = subNamePrac[i].toUpperCase();
        }
        System.out.println();
        //Input for Out of Marks
        System.out.print("Enter Out of Marks for each Practical :");
        outOfPrac= sc.nextInt();
        System.out.println();
        //Input for Practical sub
        System.out.println("Enter your Practicle sub marks : --");
        for(int i=0 ; i<2 ; i++)
        {
            do{
                System.out.print("Enter "+subNamePrac[i]+" Marks(0-"+outOfPrac+")  :  ");
                subMarksPrac[i] = sc.nextInt();
            }while(subMarksPrac[i]<0||subMarksPrac[i]>outOfPrac);
        }
        calculat();
    }
    
    //Variable for Calculation 
    float totals,obtainedThy=0;
    float obtained,obtainedPrac=0;
    double percentage;
    String grade,result;
    String remark;
    int promotion;
    void calculat()
    {
        //PERCENT CALCULATION
        totals = outOf*5+outOfPrac*2;
        for(int i=0 ; i<5 ; i++)
        {
            obtainedThy += subMarks[i];
        }
        for(int i=0 ; i<2 ; i++)
        {
            obtainedPrac += subMarksPrac[i];
        }
        obtained = obtainedThy+obtainedPrac;
        percentage = ((obtained)/(totals))*100;

        //REMARK
        int count=0;
        for(int i=0 ; i<5 ; i++)
        {
            if(subMarks[i]<33)
                count++;
        }
        if(count>=3)
            remark = "sem Back";
        else if(count>0&&count<3)
            remark = "ATKT";
        else 
            remark = "Pass";

        if(remark=="Pass")
        {
             result = "PASS";
             promotion=sem+1; 
        }
        else
            result="FAIL";

        //GRADE
        if(percentage>=90)
            grade = "A+";
        else if(percentage>=80&&percentage<=89)
            grade = "A";
        else if(percentage>=70&&percentage<=79)
            grade = "B+";
        else if(percentage>=60&&percentage<=69)
            grade = "B";
        else if(percentage>=50&&percentage<=59)
            grade = "C";
        else if(percentage>=33&&percentage<=49)
            grade = "D";
        else if(percentage<33)
            grade = "F";
    }

    public static final String RESET = "\u001B[0m";
    public static final String PURPUL = "\u001B[35m";
    public static final String RED = "\u001B[31m";
    public static final String BLACK = "\u001B[30m";
    public static final String GREEN = "\u001B[32m";
    public static final String WHITE = "\u001B[37m";
    public static final String WHITE_BRIGHT = "\u001B[97m";
    public static final String WHITE_BG = "\u001B[47m";
    public static final String RED_BG = "\u001B[41m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPUL_BG = "\u001b[45m";

    void display()
    {
        System.out.println();
        System.out.println();
        System.out.println(BLUE_BG+WHITE_BRIGHT+"======================================================"+RESET);
        System.out.println(BLUE_BG+WHITE_BRIGHT+"       Govt. Holkar Science College Indore(M.P.)      "+RESET);
          System.out.println(BLUE_BG+RED+"                    GRADE_SHEET                       "+RESET);
        System.out.printf(BLUE_BG+WHITE_BRIGHT+"%-2s%-4s%-2d%-9s MAIN EXAMINATION %-19s"+RESET," ",course,sem,"SEMESTER,",period);System.out.println();
        System.out.println(WHITE_BRIGHT+BLUE_BG+"======================================================"+RESET);
        System.out.printf(BLACK+WHITE_BG+"%-54s"+RESET," ");System.out.println();
        System.out.printf(BLACK+WHITE_BG+"%-14s%-8s%-13s:%-18s"+RESET,"Enrollment No:",enroll,"Name:",name);System.out.println();
        System.out.printf(BLACK+WHITE_BG+"%-13s:%-8s%-14s%-18s"+RESET,"Roll No.",roll,"Father's Name:",father);System.out.println();
        System.out.printf(BLACK+WHITE_BG+"%-13s:%-8s%-14s%-18s"+RESET,"Status",status,"Mother's Name:",mother);System.out.println();
        System.out.printf(BLACK+WHITE_BG+"%-54s"+RESET," ");System.out.println();
        System.out.println(PURPUL_BG+WHITE_BRIGHT+"------------------------------------------------------"+RESET);
        System.out.printf(PURPUL_BG+WHITE_BRIGHT+"%-15s %-12s%-14s %-9s"+RESET,"SUBJECT","PAPER","TOTAL M.","OBTAINED M.");
        System.out.println();
        System.out.println(PURPUL_BG+WHITE_BRIGHT+"------------------------------------------------------"+RESET);
        for(int i=0 ; i<subMarks.length ; i++)
        {
            System.out.printf(GREEN+WHITE_BG+"%-15s %-12s%-15d %-10d"+RESET,subName[i],"TH",outOf,subMarks[i]);
            System.out.println();
        }
        for(int i=0 ; i<subMarksPrac.length ; i++)
        {
            System.out.printf(GREEN+WHITE_BG+"%-15s %-12s%-15d %-10d"+RESET,subNamePrac[i],"PR",outOfPrac,subMarksPrac[i]);
            System.out.println();
        }
        // System.out.printf(BLACK+WHITE_BG+"------------------------------------------------"+RESET);System.out.println();
        // System.out.printf(BLACK+WHITE_BG+"%-15s %-15.2f %-16.2f"+RESET,"THEORY TOTAL",tempt,totals);System.out.println();
        // System.out.printf(BLACK+WHITE_BG+"------------------------------------------------"+RESET);System.out.println();
        System.out.printf(BLACK+WHITE_BG+"------------------------------------------------------"+RESET);System.out.println();
        System.out.printf(PURPUL+WHITE_BG+"%-27s"+BLACK+" %-15.2f %-10.2f"+RESET,"     TOTAL",totals,obtained);System.out.println();
        // System.out.println(BLACK+WHITE_BG+"------------------------------------------------------"+RESET);
        // System.out.printf(RED+WHITE_BG+"%-20s %-5s %-5.2f/%-14.2f"+RESET,"THEORY TOTAL OBT",":",totals,tempt);System.out.println();
        // System.out.printf(RED+WHITE_BG+"%-20s %-5s %-5.2f/%-15.2f"+RESET,"PRACTICAL TOTAL OBT",":",pObt,tempp);System.out.println();
        // System.out.printf(RED+WHITE_BG+"%-20s %-5s %-5.2f/%-14.2f"+RESET,"GRAND TOTAL",":",(totals+pObt),(tempt+tempp));System.out.println();
        System.out.println(BLACK+WHITE_BG+"------------------------------------------------------"+RESET);
        System.out.printf(WHITE_BG+PURPUL+"%-11s"+BLACK+"%-4s%-23s%-16s"+RESET,"REMARK",":",remark,"PRINCIPLE");System.out.println();
        System.out.printf(WHITE_BG+PURPUL+"%-11s"+BLACK+"%-4s%-21.2f%-18s"+RESET,"PERCENTAGE",":",percentage,"Suresh T.Silawat");System.out.println();
        System.out.printf(WHITE_BG+PURPUL+"%-11s"+BLACK+"%-4s%-26s%-13s"+RESET,"GRADE",":",grade," ");System.out.println();
        System.out.println(BLACK+WHITE_BG+"------------------------------------------------------"+RESET);
        System.out.printf(WHITE_BG+PURPUL+"%-10s"+BLACK+"|"+RED+"%-10s"+BLACK+"|"+RED+"%-10.2f"+BLACK+"|%-12s"+RED+"%-9d"+RESET,"  RESULT",result,percentage,"Pramoted to",promotion);System.out.println();
        System.out.println(BLACK+WHITE_BG+"------------------------------------------------------"+RESET);
        System.out.printf(WHITE_BG+PURPUL+"%-7s"+BLACK+"|%-45s"+RESET," Note*","The student will promoted to the next semester");System.out.println();
        System.out.printf(WHITE_BG+PURPUL+"%-7s"+BLACK+"|%-46s"+RESET," "," only if");System.out.println();
        System.out.printf(WHITE_BG+PURPUL+"%-7s"+BLACK+"|%-46s"+RESET," "," 1.He/She secure at least half of the total");System.out.println();
        System.out.printf(WHITE_BG+PURPUL+"%-7s"+BLACK+"|%-46s"+RESET," ","  credits in a semester");System.out.println();
        System.out.printf(WHITE_BG+PURPUL+"%-7s"+BLACK+"|%-46s"+RESET," "," 2.The student should not get ATKT in more");System.out.println();
        System.out.printf(WHITE_BG+PURPUL+"%-7s"+BLACK+"|%-46s"+RESET," ","  then two subjects.");System.out.println();
        System.out.println(BLUE_BG+WHITE_BRIGHT+"======================================================"+RESET);

    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Marksheet obj = new Marksheet();
         obj.personalInfo();
         obj.subjectInfo();
        obj.display();
    }
}





