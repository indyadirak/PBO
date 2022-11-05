public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("=============");
        Persegi input_persegi;
        input_persegi = new Persegi(5);
        volume_bangunan_kubus kubus = new volume_bangunan_kubus(input_persegi,5);
        System.out.println(" Kubus");
        kubus.output_kubus();
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");

        System.out.println(" Balok");
        Persegi_Panjang input_persegi_panjang;
        input_persegi_panjang = new Persegi_Panjang(10,5);
        Volume_Bangunan_balok  balok = new Volume_Bangunan_balok(input_persegi_panjang,5);
        balok.output_volume_balok();

        System.out.println("=============");

        System.out.println();
        System.out.println("=============");

        System.out.println(" Prisma Segitiga");
        Segitiga input_segitiga;
        input_segitiga = new Segitiga(10,20);
        Volume_Bangunan_prisma_segitiga prisma_segitiga = new Volume_Bangunan_prisma_segitiga(input_segitiga,10);
        prisma_segitiga.Output_prisma_segitiga();
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");
        Lingkaran input_lingkaran;
        input_lingkaran = new Lingkaran(11);
        Volume_bangunan_tabung tabung = new Volume_bangunan_tabung(input_lingkaran,11);
        System.out.println(" Tabung");
        tabung.Output_tabung();

        System.out.println("=============");
    }
}