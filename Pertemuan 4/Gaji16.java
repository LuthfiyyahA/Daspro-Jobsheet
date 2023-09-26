import java.util.Scanner;
public class Gaji16{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, gaji, potGaji, totGaji;
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Besaran Gaji ");
        gaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan Besaran Potongan Gaji");
        potGaji=input.nextInt();
        totGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +totGaji);
    }
}