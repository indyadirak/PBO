class simpel
{
    int panjang;
    int lebar;

    public simpel(int Panjang,int Lebar)
    {
        this.panjang = Panjang;
        this.lebar = Lebar;
    }

    int proses()
    {
        return this.panjang * this.lebar;
    }
}



public class Main {
     public static void main(String[] args)
    {
        simpel perhitungan_1 = new simpel(10,50);
        System.out.println("Luas = "+ perhitungan_1.proses());
    }
//
//    public static void main(String[] args)
//    {
//        simpel perhitungan_1 = new simpel(10,50);
//        int Output = perhitungan_1.proses();
//        output(Output);
//    }
//    void output(long Output)
//    {
//        System.out.println("Luas  = "+Output);
//    }
}