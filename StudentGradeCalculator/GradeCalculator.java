

package com.mycompany.gradecalculator;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Total number of Subjects: ");
        int numSub=sc.nextInt();
        
        int totalMarks=0;
         System.out.println("enter marks obtain in each subject( out of 100 ):");
         for(int i=1;i<=numSub;i++){
              System.out.println("subject"+i+":");
              int marks=sc.nextInt();
              totalMarks+=marks;
         }
         double avgPercentage=(double)totalMarks/(numSub*100)*100;
         String grade=calculateGrade(avgPercentage);
         
          System.out.println("Total Marks: "+totalMarks);
           System.out.println("Average Percentage: "+avgPercentage+"%");
           System.out.println("Grade: "+grade);
         
        
    }
    public static  String calculateGrade( double avgPercentage){
        if(avgPercentage>=90)
            return"A+";
        else  if(avgPercentage>=80)
            return"A";
        else if(avgPercentage>=70)
            return"B";
        else  if(avgPercentage>=60)
            return"C";
        else   if(avgPercentage>=50)
            return"D";
         else  
            return"E";
        
    }
}
