import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int tahun;
        String praktikum;

        System.out.printf("praktikum : ");
        praktikum = input.next();
        System.out.printf("angkatan  : ");
        tahun = input.nextInt();

        System.out.println("");
        System.out.println("hasil    :");
        System.out.printf("praktikum %s ", praktikum );
        System.out.printf("angkatan  %d ", tahun);
    }
}