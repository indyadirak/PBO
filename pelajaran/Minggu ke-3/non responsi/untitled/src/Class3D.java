public class Class3D
{
    private double Luas;
    private double Tinggi;

    public Class3D(double luas, double tinggi)
    {
        this.Luas=luas;
        this.Tinggi=tinggi;
    }

    void output_volume()
    {
        double proses = this.Luas*this.Tinggi;
        System.out.println("volume = "+proses);
    }
}
