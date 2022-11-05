/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainarray;
import OperasiArray;

public class MainArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] array = {2,0,2,1,0,7,4,3,4};
        
        OperasiArray oArray;
        oArray = new OperasiArray(array);
        
        System.out.println("a"+oArray.totalAngka());
        System.out.println("b"+oArray.rerataAngka());
    }
    
}
