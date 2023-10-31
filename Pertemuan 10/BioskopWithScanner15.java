import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String [4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihMenu = sc.nextInt();
            sc.nextLine();

            switch (pilihMenu) {
                case 1:
                    System.out.print("Masukkan nama  : ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris : ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    if ((baris > 0 && baris <= penonton.length) && (kolom > 0 && kolom <= penonton[0].length)) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Kursi masih tersedia");
                        } else {
                            System.out.println("Kursi telah terisi oleh penonton lain");
                            System.out.print("Apakah anda ingin memilih kursi lainnya? (y/n) : ");
                            next = sc.nextLine();
                            if (next.equalsIgnoreCase("n")) {
                                break;
                            }
                        }
                    } else {
                        System.out.println("Kursi tidak tersedia");
                    }
                    break;

                case 2:
                    System.out.println("Daftar penonton:");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Penonton pada baris " + (i+1) + ", Kolom " + (j+1) + "    : " + penonton[i][j]);
                            } else {
                                System.out.println("Kursi kosong pada baris " + (i+1) + ", kolom " + (j+1) + ": ***");
                            }
                        }
                    }
                    break;
            
                case 3:
                    System.out.println("Keluar dari program");
                    return;
                
                default:
                    System.out.println("Pilihan menu tidak sesuai. Silahkan pilih 1, 2, atau 3.");
                    break;
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}