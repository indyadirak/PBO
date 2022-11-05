
package bangunruang;

public class BangunRuang {

    public static void main(String[] args) 
    {
        Kubus kubus = new Kubus();
        System.out.print(kubus.nama());
    }
    
}

class Kubus
{
    int sisi = 4;
}

class Balok
{
    int sisi = 5;
}

class Lingkaran
{
    int diameter = 10;
}
