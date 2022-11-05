class operator_1
{
    void Assignment() //l) merupakan operator yang cukup simpel dan diwakilkan dengan simbol operator ‘=’.
    {
        int nilai_1 = 2;
        int nilai_2 = 4;
        System.out.println(" nilai ke - 1 = " + nilai_1);
        System.out.println("nilai ke - 2 = " + nilai_2);
    }
}

class operator_2
{
    void aritmatika()
    {
        int a = 5;
        int b = 10;
        int pertambahan = a + b;
        int perkalian = a * b;
        int pengurangan = a - b;
        float pembagian = a/b;
        float hasil_sisa_bagi = a%b;

        System.out.print("hasil dari " + a );
        System.out.println(" dan " +b);
        System.out.println(" hasil pertambahan = " + pertambahan);
        System.out.println("hasil pengurangan  = " + pengurangan);
        System.out.println("phasil perkalian   = "+perkalian);
        System.out.println("hasil pembagian    = "+pembagian);
        System.out.println("hasil sisa bagi    = "+hasil_sisa_bagi);
    }
}

class operator_3
{
    void unary()
    {

    }
}
public class Main {
    public static void main(String[] args)
    {
        operator_1 operasi_assignment = new operator_1();
        operator_2 operasi_aritmatika = new operator_2();

        System.out.println("Hello Indy!");
        System.out.println();
        operasi_assignment.Assignment();
        operasi_aritmatika.aritmatika();

    }
}