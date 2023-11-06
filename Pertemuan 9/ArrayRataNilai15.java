import java.util.Scanner;
public class ArrayRataNilai15 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    
    System.out.print("Masukkan jumlah mahasiswa : ");
    int jmlMhs = sc.nextInt();
    
    int [] nilaiMhs = new int[jmlMhs];
    double totLulus = 0;
    double totGagal = 0;
    int counter1 = 0;
    int counter2 = 0;

    for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();

        if (nilaiMhs[i] > 70) {
            totLulus+= nilaiMhs[i];
            counter1++;
        } else {
            totGagal += nilaiMhs[i];
            counter2++;
        }
    }
    double ratalulus = (counter1 > 0) ? totLulus / counter1 : 0;
    double ratagagal = (counter2 > 0) ? totGagal / counter2 : 0;

    System.out.print("Rata-rata nilai lulus = " +ratalulus);
    System.out.print("Rata-rata nilai tidak lulus = " +ratagagal);
    }
}