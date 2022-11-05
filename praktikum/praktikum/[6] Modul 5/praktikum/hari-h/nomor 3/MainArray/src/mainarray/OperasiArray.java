package mainarray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indy Adira Khalfani
 */

public class OperasiArray
{
    int[] arrayAngka;
    public OperasiArray(int[] arrayAngka)
    {
        this.arrayAngka = arrayAngka;
    }
    
    public int totalAngka()
    {
        int total = 0;
        for(int perulangan = 0; perulangan < 10; perulangan ++)
        {
            total = total + arrayAngka[perulangan];
        }
        arrayAngka[0] = total;
        return total;
    }
    
    public double rerataAngka()
    {
        double proses = arrayAngka[0]/9;
        return proses;
    }
}
