package Class3D;
import Class2D.Lingkaran;

public class Tabung extends Lingkaran
{
    private  double tinggi;
    public Tabung(double diameter, double tinggi)
    {
        super(diameter);
        this.tinggi = tinggi;
    }

    public void output_tabung()
    {
        double proses = Luas_Lingkaran()*this.tinggi;
        System.out.println("volume Tabung = " + proses);
    }
}
