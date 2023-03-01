/*
Course : SWEN-601- Exam1
Name : Sagar Kate
email : sk5817@rit.edu
 */
package Problem1;

import java.util.Scanner;

public class SumDivionsClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


     //   int num=10;
        String choice ;

         do{
             System.out.println("Enter Number greater than 0 (positive) : ");
             int num = sc.nextInt();
            if(num>0)
            {
                System.out.println("The Sum is : "+ SumDivisions(num));
            }
            else{
                System.out.println("Invalid Input");
            }
            System.out.println(" Do you want to continue  (y/Y) :  ");
            choice = sc.next();
        }while("Y".equalsIgnoreCase(choice));
    }
    /*
    function name : SumDivisions
    arg : int
    return :  float
    desc :  performs the summation as mentioned in the problem and returns the sum
     */
    private static float SumDivisions(int num) {
        float sum =0;
        for(float i=1;i<=num;i++)
        {
            sum+=1/i;
            //System.out.println(i + "  "+sum );
        }
        return sum;
    }
}
