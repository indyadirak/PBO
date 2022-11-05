public class Main
    public static void main(String args[])
    {
        int bil;
        
         System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
        for (int i=0; i<=20; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }    
   }
}   