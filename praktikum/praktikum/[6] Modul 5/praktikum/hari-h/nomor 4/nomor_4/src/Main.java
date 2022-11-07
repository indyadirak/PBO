import java.util.ArrayList;
import java.util.Arrays;

public class Main {
     static ArrayList  <Mahasiswa> mahasiswa = new ArrayList <Mahasiswa>();

    public static void main(String[] args)
    {
        mahasiswa.add(new Mahasiswa("Indy Adira Khalfani","06.2021.1.07434"));
        mahasiswa.add(new Mahasiswa("Adira Khalfani","06.2021.1.07435"));
        mahasiswa.add(new Mahasiswa("Khalfani","06.2021.1.07436"));

        for(int perulangan = 0; perulangan < mahasiswa.toArray().length ;perulangan++)
        {
            System.out.println("nama : "+mahasiswa.get(perulangan).nama);
            System.out.println("npm  : "+mahasiswa.get(perulangan).npm);
        }
    }
}