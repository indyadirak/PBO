public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(23);
        Class3D volume_persegi = new Class3D(persegi.output_luas(), 2);
        System.out.println("=============");
        System.out.println("persegi");
        System.out.println("luas = " + persegi.output_luas());
        System.out.println("=============");
        System.out.println();

        System.out.println("=============");
        Persegi_Panjang persegi_panjang = new Persegi_Panjang(10, 12);
        System.out.println("persegi panjang");
        System.out.println("jari - jari = " + persegi_panjang.output_luas());
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");
        Lingkaran lingkaran = new Lingkaran(14);
        System.out.println(" lingkaran");
        System.out.println("jari - jari = " + lingkaran.Output_luas());
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");
        Segitiga segitiga = new Segitiga(5, 5);
        System.out.println(" Segitiga");
        System.out.println("jari - jari = " + segitiga.output_luas());
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");
        Class3D volume_kubus = new Class3D(persegi.output_luas(), 2);
        System.out.println(" Kubus");
        volume_kubus.output_volume();
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");
        Class3D volume_balok = new Class3D(persegi_panjang.output_luas(), 4);
        System.out.println(" Balok");
        volume_balok.output_volume();
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");
        Class3D volume_prisma_segitiga = new Class3D(segitiga.output_luas(), 2);
        System.out.println(" Prisma Segitiga");
        volume_prisma_segitiga.output_volume();
        System.out.println("=============");

        System.out.println();
        System.out.println("=============");
        Class3D volume_Tabung = new Class3D(lingkaran.Output_luas(), 2);
        System.out.println(" Tabung");
        volume_Tabung.output_volume();
        System.out.println("=============");
    }
}