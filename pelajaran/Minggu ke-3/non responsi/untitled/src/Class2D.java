class Persegi

{

    private double sisi;



    public Persegi(double Sisi)

    {

        this.sisi = Sisi;

    }

    double output_luas()

    {

        return this.sisi*this.sisi;

    }



}



class Lingkaran

{

    private double Diameter;



    public Lingkaran(double diameter)

    {

        this.Diameter = diameter;

    }



    double Output_luas()

    {

        return this.Diameter/2;

    }

}



class Persegi_Panjang

{

    private double Panjang;

    private double Lebar;



    public Persegi_Panjang(double panjang, double lebar)

    {

        this.Panjang = panjang;

        this.Lebar = lebar;

    }



    double output_luas()

    {

        return Panjang*Lebar;

    }

}



class Segitiga

{

    private double Alas;

    private double Tinggi;



    public Segitiga(double alas,double tinggi)

    {

        this.Alas = alas;

        this.Tinggi = tinggi;

    }



    double output_luas()

    {

        return 0.5*this.Alas*this.Tinggi;

    }

}

public class Class2D

{



} 

 