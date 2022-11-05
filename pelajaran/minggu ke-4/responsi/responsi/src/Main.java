public class Main {
    public static void main(String[] args) {
//        Persegi persegi = new Persegi(23);
//        System.out.println("=============");
//        System.out.println("persegi");
//        System.out.println("luas = " + persegi.output_luas());
//        System.out.println("=============");
//        System.out.println();
//
//        System.out.println("=============");
//        Persegi_Panjang persegi_panjang = new Persegi_Panjang(10, 12);
//        System.out.println("persegi panjang");
//        System.out.println("Luas = " + persegi_panjang.output_luas());
//        System.out.println("=============");
//
//        System.out.println();
//        System.out.println("=============");
//        Lingkaran lingkaran = new Lingkaran(14);
//        System.out.println(" lingkaran");
//        System.out.println("jari - jari = " + lingkaran.Output_luas());
//        System.out.println("=============");
//
//        System.out.println();
//        System.out.println("=============");
//        Segitiga segitiga = new Segitiga(5, 5);
//        System.out.println(" Segitiga");
//        System.out.println("luas = " + segitiga.output_luas());
//        System.out.println("=============");

        System.out.println();
        System.out.println("=============");
        volume_bangunan_kubus kubus = new volume_bangunan_kubus(5);
        System.out.println(" Kubus");
        kubus.output_kubus();
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");

        System.out.println(" Balok");
        Volume_Bangunan_balok  balok = new Volume_Bangunan_balok(5,6,7);
        balok.output_volume_balok();

        System.out.println("=============");

        System.out.println();
        System.out.println("=============");

        System.out.println(" Prisma Segitiga");
        Volume_Bangunan_prisma_segitiga prisma_segitiga = new Volume_Bangunan_prisma_segitiga(4,7);
        prisma_segitiga.Output_prisma_segitiga();
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");
        Volume_bangunan_tabung tabung = new Volume_bangunan_tabung(10,20);
        System.out.println(" Tabung");
        tabung.Output_tabung();

        System.out.println("=============");
    }
}