import java.util.Scanner;
//Pratik - Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
public class pratik1 {

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

    }
}