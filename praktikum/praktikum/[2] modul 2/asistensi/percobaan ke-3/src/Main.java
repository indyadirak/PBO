import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int command_berhenti;
        Scanner input_data = new Scanner(System.in);
        String Email;
        String Password;
        int jumlah_pasien = 1;

        do
        {
            System.out.println("masukkan email = ");
            Email= input_data.nextLine();
            System.out.println("masukkan password = ");
            Password = input_data.nextLine();
            data_rumah_sakit pasien_1 = new data_rumah_sakit(Email,Password,jumlah_pasien);
            System.out.println();
            System.out.println("apakah anda ingin mengisi ulang lagi ?");
            System.out.println("1. ya");
            System.out.println("2. tidak");
            System.out.println();
            System.out.println("masukkan inputan = ");
            command_berhenti = input_data.nextInt();




        }while (command_berhenti != 2);
    }
}
// terapkan looping pada project kalian.