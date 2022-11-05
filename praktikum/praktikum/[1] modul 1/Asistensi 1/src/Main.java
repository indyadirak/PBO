import  java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int input_perulangan;
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah perulangan = ");

        input_perulangan = input.nextInt();
        for (int perulangan = 1; perulangan<= input_perulangan; perulangan++)
        {
            System.out.println(perulangan+". Indy Adira K");
        }

    }
}
//soal
//buatlah program menggunakan bahasa pemrograman java yang menerapkan perulangan dengan input dan output