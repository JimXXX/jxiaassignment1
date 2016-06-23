/**
 * Created by Jim on 6/22/16.
 */

import java.util.Scanner;

public class fizzbuzz{
    public static void main (String[] args){

        int max;
        Scanner m = new Scanner (System.in);
        System.out.println("Please enter how many numbers you want the system run: ");
        max = m.nextInt();

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
