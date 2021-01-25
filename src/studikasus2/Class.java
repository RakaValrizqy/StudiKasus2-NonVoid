package studikasus2;
import java.util.Scanner;
public class Class {
    Scanner io = new Scanner (System.in);
    String nama, isi, total;
    int hutang, bayar, kembalian, sisa, hitung;
    
    String isi () {
        System.out.println("--------Program Bayar Hutang--------");
        System.out.print("Masukkan nama  : ");
        nama = io.nextLine();
        System.out.print("Jumlah hutang  : ");
        hutang = io.nextInt();
        System.out.print("Jumlah dibayar : ");
        bayar = io.nextInt();
        return isi;
    }
    
    int hitung () {
        sisa = hutang - bayar;
        kembalian = bayar - hutang;
        return hitung;
    }
    
    String total () {
        System.out.println("------------------------------");
        System.out.println("Nama         : "+nama);
        System.out.println("Total Hutang : Rp "+hutang);
        System.out.println("Dibayar      : Rp "+bayar);
        
        if (bayar > hutang) {
            System.out.println("Kembalian    : Rp "+kembalian);
        }
        else if (hutang > bayar) {
            System.out.println("Sisa hutang  : Rp "+sisa);
        }
        else if (hutang == bayar) {
            System.out.println("Uang pas");
        }
        return total;
    }
}
