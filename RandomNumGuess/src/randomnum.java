import java.util.Scanner;

public class randomnum {
    public static void main(String[] args) {
        //random number guess
        int num, ran;
        ran = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);


        System.out.println("--------instruction--------");
        System.out.println("1.Keep guessing.");
        System.out.println("2.Enter a negative number to exit.\n");
        System.out.println("Guess the number between 1 to 100");
        do{
            System.out.print("Enter Number: ");
            num = sc.nextInt();
            if(num == ran){
                System.out.println("You Win Champ! :)");
                break;
            }
            else if(num < ran){
                System.out.println("big from your number");
            }
            else {
                System.out.println("small from your number");
            }
        }while(num>=1);
        System.out.println("END");

    }
}

