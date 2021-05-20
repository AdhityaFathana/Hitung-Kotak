
import java.lang.reflect.Constructor;
import java.util.Scanner;

class Kubus implements hitung1 {
    int sisi;
    Kubus(int s){
        this.sisi = s;
    }
    public void luas(){
        int luas = 6 *(sisi*sisi);
        System.out.println("Luasnya adalah :"+luas);
    }
    public void volume(){
        int volume = sisi * sisi * sisi;
        System.out.println("Volumenya adalah :"+volume);
    }
    public void keliling(){
        int keliling = 12 * sisi;
        System.out.println("Kelilingnya adalah :"+keliling);
    }
}

class Persegi extends hitung2{
    int sisi;
    Persegi(int s){
        this.sisi = s;
    }
    public void luas(){
        int luas = sisi * sisi;
        System.out.println("Luasnya adalah :"+luas);
    }
}

public class hitungKotak{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Hitung Kubus");
        System.out.println("2. Hitung Persegi");
        System.out.println("Masukan pilihan : ");
        int pilihan = scan.nextInt();
        if (pilihan == 1){
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Sisi :");
            int sisi = input.nextInt();
            Kubus mycube = new Kubus(sisi);
            mycube.luas();
            mycube.volume();
            mycube.keliling();
        }
        else if (pilihan == 2){
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Sisi :");
            int sisi = input.nextInt();
            Persegi mysquare = new Persegi(sisi);
            mysquare.luas();
            mysquare.keliling(sisi);
        }
    }
}