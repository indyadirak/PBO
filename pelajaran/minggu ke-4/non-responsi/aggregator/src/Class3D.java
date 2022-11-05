class Volume_Bangunan_balok
{
    private Persegi_Panjang Luas;
    private double Tinggi;

    public Volume_Bangunan_balok(Persegi_Panjang persegi_panjang, double tinggi)
    {
        this.Luas = persegi_panjang;
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

    public volume_bangunan_kubus(Persegi persegi,double tinggi)
    {
        this.Luas = persegi;
        this.Tinggi = tinggi;
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
    public Volume_Bangunan_prisma_segitiga(Segitiga segitiga, double tinggi)
    {
        this.Luas = segitiga;
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

    public Volume_bangunan_tabung(Lingkaran lingkaran, double tinggi)
    {
        this.Luas = lingkaran;
        this.Tinggi = tinggi;
    }
    public void Output_tabung()
    {
        double proses = Luas.Output_luas()*Tinggi;
        System.out.println("volume = " +proses);
    }
}