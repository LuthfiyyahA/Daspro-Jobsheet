import java.util.Scanner;
public class LinearSearch15 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array : ");
        int nilai = sc.nextInt();

        int [] arrayInt = new int[nilai];
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        int key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt [i] == key) {
                hasil = i;
                break;
            }
        }
        if (arrayInt[hasil] == key) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}