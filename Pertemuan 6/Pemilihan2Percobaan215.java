import java.util.Scanner;
public class Pemilihan2Percobaan215 {
    public static void main (String [] args) {
        Scanner input15 = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat sudut 1 : ");
        float sudut1 = input15.nextFloat();
        System.out.print("Masukkan bilangan bulat sudut 2 : ");
        float sudut2 = input15.nextFloat();
        System.out.print("Masukkan bilangan bulat sudut 3 : ");
        float sudut3 = input15.nextFloat();

        float totalSudut;
        totalSudut = sudut1+sudut2+sudut3;

        if (totalSudut == 180) {
            if (((sudut1 == sudut2) && (sudut3 != sudut1)) || ((sudut1 == sudut3) && (sudut2) != (sudut1)) || ((sudut2 == sudut3) && (sudut1 != sudut2))) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else {
                if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                    System.out.println("Segitiga tersebut adalah segitiga siku-siku");
                } else {
                    System.out.println("Segitiga tersebut adalah segitiga sembarang");
                }
            } 
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}