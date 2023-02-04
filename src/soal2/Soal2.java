package soal2;
import java.util.Scanner; //menambahkan library untuk menggunakan Scanner scan = new Scanner(System.in)
/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class Soal2 {
    public static void main(String[] args) {
        String[] strArr; //mendeklarasikan sebuah array of string bernama strArr
        int[] intArr; //mendeklarasikan sebuah array of integer bernama intArr
        try (Scanner scan = new Scanner(System.in)) { //membuat objek baru bernama scan untuk menerima input dari user
            strArr = new String[3]; //menginisialisasi sebuah array of string dengan ukuran 3
            intArr = new int[3]; //menginisialisasi sebuah array of integer dengan ukuran 3
            for (int i = 0; i < 3; i++) { //perulangan yang digunakan sebanyak 3 kali untuk menerima input dari user
                strArr[i] = scan.next(); //mengisi elemen ke-i pada array strArr dengan input dari user.
                intArr[i] = scan.nextInt(); //mengisi elemen ke-i pada array intArr dengan input dari user
            }   
        }
    System.out.println("================================");
    for (int i = 0; i < 3; i++) { //perulangan sebanyak 3x
        System.out.printf("%-15s%03d\n", strArr[i], intArr[i]);
        /*
            mencetak isi dari strArr[i] dan intArr[i] dengan format yang ditentukan.
            "%-15s" menandakan bahwa isi dari strArr[i] akan dicetak dengan jarak 15 karakter dari kanan.
            "%03d" menandakan bahwa isi dari intArr[i] akan dicetak dengan 3 digit dan dalam hal ini, 
            jika jumlah digit kurang dari 3, akan ditambahkan 0 pada depan.
            "\n" menandakan bahwa setiap cetakan akan berada pada baris baru
        */
    }
    System.out.println("================================");
  }
}