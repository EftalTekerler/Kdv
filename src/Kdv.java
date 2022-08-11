import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
double kdvTutar = tutar * kdvOran ;
System.out.println(kdvTutar);
double kdvliTutar = tutar + kdvTutar ;
System.out.println(kdvliTutar);
    }
}
