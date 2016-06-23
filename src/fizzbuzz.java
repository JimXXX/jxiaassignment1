/**
 * Created by Jim on 6/22/16.
 */

import java.util.Scanner;

public class fizzbuzz{
    public static void main (String[] args){

        int max;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter how many numbers you want the system run: ");

        //Validate user's input is an integer
        while (!input.hasNextInt()){
            input.next();
            System.out.println("Please enter an integer: ");
        }

        max = input.nextInt(); // get the number

        //Output format
        for(int i=1; i <= max; i++){
            if (i % 5 == 0 && i % 7 == 0){
                System.out.print("FizzBuzz" + " ");
            }
            else if (i % 5 == 0){
                System.out.print("Fizz" + " ");
            }
            else if (i % 7 ==0){
                System.out.print("Buzz" + " ");
            }
            else{
                System.out.print(i + " ");
            }
        }
    }
}
