import java.util.Scanner;

public class miniproje8 {
    public static void main(String[] args){
        //Vize final not hesaplama

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci vize notunuzu girin: ");
        double vize1 = scan.nextDouble();
        System.out.print("İkinci vize notunuzu girin: ");
        double vize2 = scan.nextDouble();
        System.out.print("Final notunuzu girin: ");
        double Final = scan.nextDouble();
        System.out.print("Okul ortalamanızı girin: ");
        double okulort = scan.nextDouble();

        double ort = (vize1 * (30/100.0) ) + (vize2 * (30/100.0) ) + (Final * (40/100.0) ); // tam değer alabilmek için .0 yaparak double değer yapmam gerek

        System.out.println("ort: " + ort);
        if ( ort >= 90)
            System.out.println("AA aldınız...");
        else if(ort >= 85 )
            System.out.println("BA aldınız...");
        else if(ort >= 80 )
            System.out.println("BB aldınız...");
        else if (ort >= 75)
            System.out.println("CB aldınız...");
        else if (ort >= 70)
            System.out.println("CC aldınız...");
        else if(ort >= 60)
            System.out.println("DC aldınız...");
        else if (ort>= 55)
            System.out.println("DD aldınız...");
            if (okulort<2.50)
                System.out.println("DD aldınız ve  not ortalamanız düşük, bu dersi tekrar almayı düşünebilirsiniz...");
        else if (ort>=50)
            System.out.println("FD aldınız ve kaldınız...");
        else
            System.out.println("FF aldınız ve kaldınız...");





    }
}
