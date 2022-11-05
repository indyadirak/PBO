/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobalab;

public class CobaLab extends Thread {
    @Override
    public void run() 
    {
     System.out.println("thread berjalan.....");
    }
    
    public static void main(String[] args)
    {
        CobaLab t1 = new CobaLab();
        t1.start();
    }
    
}
