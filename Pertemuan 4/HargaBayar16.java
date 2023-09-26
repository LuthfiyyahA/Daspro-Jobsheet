import java.util.Scanner;
public class HargaBayar16{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah, jmlHalaman;
        double dis, total, bayar, jmlDis;
        char merkBuku;
        System.out.println("Masukkan Merk Buku");
        merkBuku=input.next().charAt(0);
        System.out.println("Masukkan Jumlah Halaman Buku");
        jmlHalaman=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan Diskon Yang Diterima");
        dis=input.nextInt();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}