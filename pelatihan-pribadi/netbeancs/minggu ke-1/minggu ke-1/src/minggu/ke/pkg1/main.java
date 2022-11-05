/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu.ke.pkg1;

import javax.lang.model.SourceVersion;

/**
 *
 * @author Indy Adira Khalfani
 */
public class main 
{
    public static void output()
    {
        System.out.print( "hallo");
    }  

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
    
}
