package j8perulanganwhile;
import java.util.Scanner;
public class J8PerulanganWhile {

    public static void main(String[] args) {
        // membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        
        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("Jawab [Ya/Tidak]> ");
            
            jawab = scan.nextLine();
            
            // cek jawabnnya, klau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
    }
    
}
