/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author Indy Adira Khalfani
 */
public class Main 
{
    public static void main(String[] args)
    {
    Mahasiswa mahasiswa = new Mahasiswa("Indy Adira Khalfani","06.2021.1.07434" );
    System.out.println("");
    System.out.println("data mahasiswa :");
    System.out.println("nama = "+mahasiswa.namaMhs);
    System.out.println("npm  = "+mahasiswa.npm);
    }
}
