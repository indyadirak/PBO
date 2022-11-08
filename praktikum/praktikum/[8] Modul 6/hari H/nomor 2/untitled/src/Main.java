import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan angka   : ");
        int num = input.nextInt();

        System.out.println("masukkan kata : ");
        String kata = input.next();

        System.out.println("angka = "+num);
        System.out.println("kata  = "+kata);
    }
}