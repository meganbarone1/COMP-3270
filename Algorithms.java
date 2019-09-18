import java.lang.Math;
import java.io.File;
import java.util.Scanner;
/** COMP 3270 Programming Assignment
 *  Megan Barone
 *  Different algorithms to find the maximum sum in an array
 *  i.e. in array {1, 2, 3, -4, 5, -2} the max sum is 1+2+3.
 */
public class Algorithms {


   public static int algorithm1(int[] x) {
      int sum;
      int maxSoFar = 0;
      for (int i = 0; i < x.length; i++) {
         for (int j = i; j < x.length; j++) {
            sum = 0;
            for (int k = i; k <= j; k++) {
               sum = sum + x[k];
            }
            maxSoFar = Math.max(maxSoFar, sum);
         }
      }
      return maxSoFar;
   }

   public static int algorithm2(int[] x) {
      int sum;
      int maxSoFar = 0;
      for (int i = 0; i < x.length; i++) {
         sum = 0;
         for (int j = i; j < x.length; j++) {
            sum = sum + x[j];
            maxSoFar = Math.max(maxSoFar, sum);
            }
      }
      return maxSoFar;
   }
   
   public static int maxSum(int[] x, int L, int U) {
      
      if (L > U) {
         return 0;
      }
      else if (L == U) {
         return Math.max(0, x[L]);
         
      } 
      int M = (L + U) / 2;
      int sum = 0;
      int maxToLeft = 0;
      for (int i = M; i >= L; i--) {
         sum += x[i];
         maxToLeft = Math.max(sum, maxToLeft);
      }  
      sum = 0;
      int maxToRight = 0;
      for (int j = M + 1; j <= U; j++) {
         sum += x[j];
         maxToRight = Math.max(sum, maxToRight);
      }
      int maxCrossing = maxToLeft + maxToRight;
      int maxInA = maxSum(x, L, M);
      
      int maxInB = maxSum(x, M+1, U);
     
      int max = Math.max(maxCrossing, maxInA);
      max = Math.max(max, maxInB);
      return max;
      
   }
   
   public static int algorithm4(int[] x) {
      int maxSoFar = 0;
      int maxEndingHere = 0;
      for (int i = 0; i < x.length; i++) {
         maxEndingHere = Math.max(0, maxEndingHere + x[i]);
         maxSoFar = Math.max(maxSoFar, maxEndingHere);
         
      }
      return maxSoFar;
      
   }

   public static void main(String[] args) {
      System.out.println("y");
      File file = new File("phw_input.txt");
      Scanner scan = new Scanner(file);
      
      while (scan.hasNextLine()) {
         
      }

      
   }






}