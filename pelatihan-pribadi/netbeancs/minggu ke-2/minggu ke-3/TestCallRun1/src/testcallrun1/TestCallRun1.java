/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcallrun1;

/**
 *
 * @author Indy Adira Khalfani
 */
public class TestCallRun1 {
    public class void run()
    {
        System.out.println("Sedang berjalan.....");
    }
    public static void main(String[] args)
    {
        TestCallRun1 t1 = new TestCallRun1();
        t1.run();//fine, but does not start a separate call stack
    }
    
}
