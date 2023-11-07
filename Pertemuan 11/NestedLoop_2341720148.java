import java.util.Scanner;
public class NestedLoop_2341720148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] temps = new double [5][7];
        double total = 0;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke- " + i);

            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke- " + (j+1) + " : ");
                temps [i][j] = sc.nextDouble ();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke- " + (i+1) + " : ");
            
            for (double j : temps [i]) {
                System.out.print(j + " ");
                total += j;
            }
            System.out.println();
            double rata2 = total / temps [i].length;
            System.out.println("Rata-rata suhu : " + rata2);
        }
    }
}