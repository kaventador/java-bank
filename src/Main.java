import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("لطفا مبلغ وام را وارد کنید : ");
        int Vam = scanner.nextInt();
        System.out.print("باز پرداخت چند  ساله : ");
        int BazPardakht = scanner.nextInt();
        System.out.print("در صد سود : ");
        int Sood = scanner.nextInt();

        int Ghest = BazPardakht*10 ;
        double SoodM = (double) Sood/(12*100) ;
        double x = Math.pow((1+SoodM),Ghest);

        double GhestM = ( Vam * SoodM * x ) / x-1;
        System.out.print( "مبلغ هر قست : ");
        System.out.print(GhestM);
    }
}