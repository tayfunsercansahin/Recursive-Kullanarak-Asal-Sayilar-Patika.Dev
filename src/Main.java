import java.util.Scanner;

public class Main {
    static boolean check(int number,int x){
        if(number <= 2){
            return number == 2;
        }
        if(number % x == 0){
            return false;
        }
        if(x*x > number){
            return true;
        }
        return check(number,x+1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Sayi giriniz: ");
            int number = input.nextInt();

            if (number == 0){
                break;
            }

            if (check(number,2)){
                System.out.println(number + " asal sayidir.");
            }
            else {
                System.out.println(number + " asal sayi degildir.");
            }

            System.out.println("Cikmak icin 0'i giriniz.");
        }
    }
}