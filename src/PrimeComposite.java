import java.util.*;

public class PrimeComposite {

    int count;

    public void identifyNumber() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();


        for(int i = 1;i<= number; i++) {

            int remander = number%i;
            if(remander == 0) {
                count++;
            }

        }

        if(count == 2) {
            System.out.println("The number is Prime Number!!!");
        } else if (number == 1 ) {
            System.out.println("It is neither composite nor Prime number");
        } else {}
        System.out.println("The number is composite Number!!!");

    }

    public static void main(String[]args) {
        new PrimeComposite().identifyNumber();
    }

}