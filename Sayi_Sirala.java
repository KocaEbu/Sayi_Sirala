import java.util.Scanner;
public class Sayi_Sirala {

    public static void main(String[] args) {
        double a,b,c;

        Scanner input=new Scanner(System.in);

        System.out.println("3 adet sayi giriniz : ");
        a= input.nextDouble();
        b= input.nextDouble();
        c= input.nextDouble();

        if (a<b && a<c){
            if(b>c){
                System.out.println("Buyukten kucuge sayilar : "+b + "," +c+ "," +a);
            }
            else{
                System.out.println("Buyukten kucuge sayilar : "+c + "," +b + "," +a);
            }

        }
        else if (b<a && b<c) {
            if(a>c){

                System.out.println("Buyukten kucuge sayilar : "+a + "," +c+ "," +b);

            }
            else {
                System.out.println("Buyukten kucuge sayilar : "+c + "," +a+ "," +b);
            }

        }
        else if (c<a && c<b){
            if(a>b){
                System.out.println("Buyukten kucuge sayilar : "+a + "," +b+ "," +c);
            }
            else {
                System.out.println("Buyukten kucuge sayilar : "+b + "," +a+ "," +c);
            }

        }

        else{
            System.out.println("Sayilar esittir.");
        }



    }
}
