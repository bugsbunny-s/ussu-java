import java.util.Scanner;
public class ussu {
    public static void main(String[] args) throws Exception {
        int a,b,total=1;

        Scanner inp = new Scanner (System.in);
        System.out.print("üssü alınacak sayı : ");
        a = inp.nextInt();
        System.out.print("üs olucak sayı : ");
        b = inp.nextInt();

        for (int i = 1; i <= b; i++){
            total *= a;
        }
        System.out.println("Cevap : " + total);
    }
}