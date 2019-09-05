package koperasisekolah;
import java.util.Scanner;
public class KoperasiSekolah {

    public static void main(String[] args) {
        int pendapatan;
        double jasa, bonus, total;
        
        //deklarasi
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pendapatan Siswa");
        pendapatan = scanner.nextInt();
        
        if (pendapatan >= 0 && pendapatan <= 20000) {
            jasa = 10000 + (pendapatan);
            System.out.println("\nUang Jasa " + (int)jasa);
            
            bonus = 0.10 * pendapatan;
            System.out.println("\nUang bonus " + (int) bonus);
            
            total = jasa + bonus;
            System.out.println("Uang Total " + (int)total);           
        }
        else if (pendapatan >= 20000 && pendapatan <= 50000) {
            jasa = 20000 + pendapatan;
            System.out.println("\nUang Jasa" + (int) jasa);
            
            bonus = 0.15 * pendapatan;
            System.out.println("Uang Bonus " + (int)bonus);
            
            total = jasa + bonus;
            System.out.println("Uang Total " + (int)total);
        }
        else if(pendapatan >= 50000 && pendapatan <= 100000) {
            jasa = 30000 + pendapatan;
            System.out.println("\nUaang Jasa " + jasa);
            
            bonus = 0.20 * pendapatan;
            System.out.println("Uang bonus " + bonus);
            
            total = jasa + bonus;
            System.out.println("Uang Total " + total);      
    }
        else if (pendapatan >=100000 && pendapatan <= 150000) {
            jasa = 50000 + pendapatan;
            System.out.println("\nUang Jasa " + jasa);
            
            bonus = 0.30 * pendapatan;
            System.out.println("Uang bonus " + bonus);
            
            total = jasa + bonus;
            System.out.println("Uang Total " + total);
        }
        else if (pendapatan >= 150000) {
            jasa = 75000 + pendapatan;
            System.out.println("\nUang Jasa " + jasa);
            
            bonus = 0.40 * pendapatan;
            System.out.println("Uang bonus " + bonus);
            
            total = jasa + bonus;
            System.out.println("Uang total " + total);
        }
        }
    }   
    

