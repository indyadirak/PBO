class Volume_Bangunan_balok
{
    private Persegi_Panjang Luas;
    private double Tinggi;

    public Volume_Bangunan_balok(double panjang, double lebar, double tinggi)
    {
        this.Luas = new Persegi_Panjang(panjang,lebar);
        this.Tinggi = tinggi;
    }

    public void output_volume_balok()
    {
        double proses = this.Luas.output_luas()*this.Tinggi;
        System.out.println("volume = "+proses);
    }
}

class volume_bangunan_kubus
{
    private Persegi Luas;
    private double Tinggi;

    public volume_bangunan_kubus(double sisi)
    {
        this.Luas = new Persegi(sisi);
        this.Tinggi = sisi;
    }

    public void output_kubus()
    {
        double proses = this.Luas.output_luas()*Tinggi;
        System.out.println("Volume  = " + proses);
    }

}

class Volume_Bangunan_prisma_segitiga
{
    private Segitiga Luas;
    private double Tinggi;
    public Volume_Bangunan_prisma_segitiga(double alas, double tinggi)
    {
        this.Luas = new Segitiga(alas,tinggi);
        Tinggi = tinggi;
    }

    public void Output_prisma_segitiga()
    {
        double proses = this.Luas.output_luas() * Tinggi;
        System.out.println("Volume = " +proses);
    }

}

class Volume_bangunan_tabung
{
    private Lingkaran Luas;
    private double Tinggi;

    public Volume_bangunan_tabung(Lingkaran luas, double tinggi)
    {
        this.Luas = new Lingkaran(diameter);
        this.Tinggi = tinggi;
    }
    public void Output_tabung()
    {
        double proses = Luas.Output_luas()*Tinggi;
        System.out.println("volume = " +proses);
    }
}