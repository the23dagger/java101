import java.util.Scanner;
//Pratik - Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
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
        Scanner inp = new Scanner(System.in);
        //sayıyı al
        System.out.print("Bir sayı Giriniz : ");
        int num=inp.nextInt();
        for(int i=0;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("deneme");

    }
    static void oyuntahtasi(){
    
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