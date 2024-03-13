
import java.util.Scanner;

public class mainForChees {
    public static String[][] tahta = {
        {"k ", "a ", "f ", "v ", "ş ", "f ", "a ", "k "},
        {"p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8"},
        {"  ", "  ", "  ","  ","  ","  ", "  ", "  "},
        {"  ", "  ", "  ","  ","  ","  ", "  ", "  "},
        {"  ", "  ", "  ","  ","  ","  ", "  ", "  "},
        {"  ", "  ", "  ","  ","  ","  ", "  ", "  "},
        {"P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8"},
        {"K ", "A ", "F ", "V ", "Ş ", "F ", "A ", "K "}
    };
    public static char hamlesirasi;
    public static void main(String[] args) {
        System.out.println("---- Satranç Oyunu ----");
        Scanner scanner = new Scanner(System.in);
        oyuntahtasi();
        System.out.println("tarafınızı seçin(siyah='S' beyaz='B')");
        hamlesirasi = scanner.next().charAt(0);
        while (true) { 
            System.out.println("oyundan çıkmak için x yerine 8 e basın");
            System.out.println("hangi koordinattaki taşı seçeceksiniz? \n koordinatları giriniz:");
            System.out.println("x için: ");
            int x = scanner.nextInt();
            if(x == 8){
                break;
            }
            System.out.println("y için: ");
            int y = scanner.nextInt();
            //pieces e veriler gönderilecek (gidebileceği yerleri gösterir)
            System.out.println("hangisine gitmek istiyorsunuz? ");
            int secim_x = scanner.nextInt();
            int secim_y = scanner.nextInt();
            tahta[secim_x][secim_y]=tahta[x][y];
            tahta[x][y]="  ";
            oyuntahtasi();
 

        }
        
    }
//silinen kısım
    public static void oyuntahtasi(){
    
        System.out.println("    0   1   2   3   4   5   6   7");
        for(int i=0; i<8;i++){
            System.out.print(i+ " ||");
            for(int j=0; j<8;j++){
                System.out.print(tahta[i][j]+" |");
                
            }
            System.out.println();
            
        }
    }  
}