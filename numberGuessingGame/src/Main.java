import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random num = new Random();
        int randomNumber = num.nextInt(100) + 1;
        int chance=9;
        //System.out.println("Random Number : " +randomNumber);
        System.out.println("Welcome To The Number Guessing Game");
        System.out.println("Total Chances 10. So Let's Begin");

        while(true){

            System.out.println("Guess the number(Between 1-100): ");
            Scanner sc=new Scanner(System.in);
            int guess=sc.nextInt();
            if(guess<0 || guess>100){
                System.out.println("Enter valid number between 1 to 100. ONLY!!");
            }
            if(guess==randomNumber){
                System.out.println("Congrats !!  You Win");
                break;
            }
            else if(guess<randomNumber){
                System.out.println("Nope! The number is Higher. Guess Again.Chances Left  "
                        +chance);
                chance--;
            }
            else{
                System.out.println("Nope! The number is Lower. Guess Again.Chances Left  "
                        +chance);
                chance--;
            }

            if(chance==-1){
                System.out.println("You Lose! No Worries Try Again Next Time");
                break;
            }
        }



}
}