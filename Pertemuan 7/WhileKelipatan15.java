import java.util.Scanner;
public class WhileKelipatan15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input15.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        double rataRata = (double) jumlah / counter;
        System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rataRata);
    }
}