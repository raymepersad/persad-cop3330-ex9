/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 9 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.
 */



package org.example;
import java.util.Scanner;

public class practiceexample9 {
    public static void main(String []args){
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the length then the width of the ceiling in feet"); // prompt for length and width input

        float length = st.nextFloat();
        float breadth = st.nextFloat();
        float area = length * breadth; //calculating area

        //calculating number of gallons when 1 gallon covers 350 square feet

        int result = (int) Math.ceil(area / 350); //math equation - area divided by 350 sq feet per gal
        System.out.println("You will need to purchase "+result+" gallons of paint to cover "+area+" square feet");
    }
}
