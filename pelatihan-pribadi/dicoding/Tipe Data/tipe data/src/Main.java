class salam
{
    void berkata()
    {
        System.out.println("halo indy");
    }
}
public class Main
{

    public static void main(String[] args)
    {
        salam berkata = new salam();
        berkata.berkata();
        byte nilai_1 = 10;
        System.out.println("byte = " + nilai_1);
        short nilai_2 = 15000;
        System.out.println("nilai_2 = " +nilai_2);
        int nilai_3 = 150000;
        System.out.println("nilai 3 = " + nilai_3 );
        long nilai_4 = 150000L;
        System.out.println("nilai 4 = " + nilai_4);
        float nilai_5 = 3.5f;
        System.out.println("nilai 5 = " + nilai_5);
    }
}