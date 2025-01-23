import java.util.Random;
import java.util.Scanner;


class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a how many random numbers to generate: ");
        int input =sc.nextInt();

        Random r = new Random();

        System.out.println("Random numbers:");
        for(int i=0;i<input;i++){
            int number =r.nextInt(1000);
            System.out.println(number+" ");
        }



    }
}