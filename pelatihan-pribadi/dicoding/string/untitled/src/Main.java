class kumpulan
{
    void hello_world()
    {
        String isi = "hello world";
        System.out.println(isi);
    }


    void dicoding()
    {
        Character[] dicoding_isi = {'d','i','c','o','d','i','g'};
        System.out.println(dicoding_isi);
        String dicoding_string = "dicoding";
        int panjang = dicoding_string.length();
        System.out.println("panjang char dicoding = " + panjang);
    }

}

public class Main
{
    public static void main(String[] args)
    {
        kumpulan data = new kumpulan();

        data.hello_world();
        data.dicoding();
    }
}