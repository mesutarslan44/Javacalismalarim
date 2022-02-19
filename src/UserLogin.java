import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {

        String userName, password;
        int select;


        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("mstrsln") && password.equals("patika44")) {
            System.out.println("Giriş Başarılı...");
        } else {
            System.out.println("Bilgileriniz Yanlış ! Şifrenizi Sıfırlamak İster misiniz?  ");
            System.out.println("Şifrenizi Sıfırlamak İstiyorsanız  '1' ' e basın. ");
            System.out.println("Şifrenizi Sıfırlamak İstemiyorsanız '2' ' e basın.");
            System.out.print("Şeçiminiz : ");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Lütfen Yeni Bir Şifre Giriniz:");
                    System.out.print("Yeni Şifreniz : ");
                    Scanner inp1 = new Scanner(System.in);
                    password = inp1.nextLine();

                    if (password.equals("patika44")) {
                        System.out.println("Yeni Şifreniz Eskisi İle Aynı Olamaz ");
                    } else {
                        System.out.println("Yeni Şifre Oluşturuldu! ");
                    }
                    break;
                case 2:
                    System.out.println("Lütfen Tekrar Deneyin");
                    break;
            }


        }
    }
}