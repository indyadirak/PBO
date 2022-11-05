/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthreadtwice1;
public class TestThreadTwice1 extends Thread{
    public void run()
    {
        System.out.println("sedang berjalan.....");
    }
    
    public static void main(String[] args)  {
        TestThreadTwice1 ti = new TestThreadTwice1();
        ti.run();
        ti.run();
    }
    
}
