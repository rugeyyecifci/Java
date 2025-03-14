import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int[] notlar=new int[7];
double sonuc=0;
int toplam=0;
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen notlarınızı sırayla giriniz:");
System.out.println("Mat1");
notlar[0]= scan.nextInt();
        System.out.println("türkçe1");
        notlar[1]= scan.nextInt();

        System.out.println("fizik");
        notlar[2]= scan.nextInt();
        System.out.println("tarih");
        notlar[3]= scan.nextInt();
        System.out.println("kimya");
        notlar[4]= scan.nextInt();
        System.out.println("beden");
        notlar[5]= scan.nextInt();
        System.out.println("müzik");
        notlar[6]= scan.nextInt();


        for(int not : notlar){
toplam+=not;

        }

        System.out.println("Ortalama:"+(toplam/ notlar.length));
    }
}