class assignment
{
    //merupakan operator yang cukup simpel dan diwakilkan dengan simbol operator '= '

    void operasi_assgignment()
    {
        int nilai = 10;
        int nilai_2 = 30;
        System.out.println("nilai 1 = " + nilai);
        System.out.println("nilai 2 = "+nilai_2);
    }
}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("hello indy!");

        assignment operasi_assgignment = new assignment();
        operasi_assgignment.operasi_assgignment();
    }
}