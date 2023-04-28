import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
      int includeChpt;
      
      // Get the chapter selections
      for (int i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt(); 
         if (includeChpt==1) {
            chptList[i] = true;
         }
         else {
            chptList[i] = false;
         }
      }
      
      for(int i=1; i < chptList.length; i++){
         
         if(i < 13){
            /* Lookahead*/
            if(chptList[i] && chptList[i+1] && chptList[i+2]){
               System.out.print(i + "-" + (i+2) + " ");
               i += 2;
            } else if (chptList[i]){
               System.out.print(i + " ");
            }
         }
      }
      
      /* End with new line*/
      System.out.println();
      
   }
}