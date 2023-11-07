import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';
        
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);

                if (answer < number) {
                    System.out.println("Lebih besar dari " + answer);
                } else if (answer > number) {
                    System.out.println("Lebih kecil dari " + answer);
                } else {
                    success = true;
                }

            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (y/n) ? ");
            menu = input.nextLine().charAt(0);

            if (menu == 'n' || menu == 'N') {
                System.out.println("Keluar dari permainan....");
                break;
            }
        } while (menu == 'y' || menu == 'Y');
    }
}