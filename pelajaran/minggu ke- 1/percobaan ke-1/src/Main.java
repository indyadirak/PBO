class persegi_panjang
{
    int panjang;
    int lebar;

    void  luas()
    {
        int luas = this.lebar*this.panjang;
        System.out.println("luas persegi panjang= "+luas);
    }
    void keliling()
    {
        int keliling = 2*(this.panjang*this.lebar);
        System.out.println("keliling persegi panjang = "+keliling);
    }
}
class segitiga
{
    float tinggi;
    float alas;

    void luas()
    {
        double luas = 0.5*(this.alas*this.tinggi);
        System.out.println("luas segitiga = "+ luas);
    }
}
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hallo pertemuan pertama");
        persegi_panjang objek_pp = new persegi_panjang();
        segitiga objek_segitiga = new segitiga();

        //input
        objek_pp.lebar = 5;
        objek_pp.panjang = 10;

        objek_pp.luas();
        objek_pp.keliling();

        objek_segitiga.alas = 8;
        objek_segitiga.tinggi = 7;
        objek_segitiga.luas();
    }
}