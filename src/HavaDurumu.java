import java.util.Scanner;

public class HavaDurumu {

    public static void main(String[] args){
        int sicaklik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sıcaklığı giriniz: ");
        sicaklik = inp.nextInt();
        int derece = 0;

        if(sicaklik < 5.0){
            derece = 0;
        }
        if(sicaklik < 15.0 && sicaklik > 5.0){
            derece = 1;
        }
        if(sicaklik > 15.0 && sicaklik < 25.0){
            derece = 2;
        }
        if(sicaklik > 25.0){
            derece = 3;
        }


        switch(derece){
            case 0:
                System.out.println("Kayak yapabilirsiniz.");
                break;
            case 1:
                System.out.println("Sinemaya gidebilirisniz.");
                break;
            case 2:
                System.out.println("Piknik yapabilirsiniz.");
                break;
            case 3:
                System.out.println("Yüzmeye gidebilirsiniz.");
                break;
        }

    }

}