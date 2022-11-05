/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementsrunnable;

public class ImplementsRunnable implements Runnable{
    @Override
    public void run()
    {
        System.out.println("Sedang berjalan.....");
    }
    public static void main(String[] args) 
    {
       ImplementsRunnable ml = new ImplementsRunnable();
       Thread t1 = new Thread(ml);
       t1.start();
    }
}
