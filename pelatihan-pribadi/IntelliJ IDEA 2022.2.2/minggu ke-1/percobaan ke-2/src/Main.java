

class suara
{
    void bunyi_gitar()
    {
        String bunyinya_gitar = "jreng...";
        System.out.println("bunyinya gitar adalah = "+ bunyinya_gitar);
    }
}
public class Main {
    public static void main(String[] args)
    {
        suara bunyi = new suara();
        bunyi.bunyi_gitar();
    }
}