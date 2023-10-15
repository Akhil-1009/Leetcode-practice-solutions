// class Solution {
//     public int numWays(int steps, int arrLen) {
//         int[][] dp=new int[arrLen][steps+1];
//         int mod=1000000007;
//         for(int i=0;i<=steps&&i<arrLen;i++)
//         {
//             dp[i][i]=1;
//         }
//         for(int g=1;g<=steps;g++)
//         { //      int j=0;
//             for(int i=0,j=g;i<arrLen&&j<=steps;i++,j++)
//             {   if(i==0)
//             {   long a=dp[i+1][j-1];
//                 dp[i][j]=(int)((dp[i][j-1]+a)%mod);
//             }
//              else if(i==arrLen-1)
//              {    long a=dp[i-1][j-1];
//                  dp[i][j]=(int)((dp[i][j-1]+a)%mod);
//              }
//              else{   long a=dp[i+1][j-1];
//                 dp[i][j]=(int)((dp[i][j-1]+(dp[i-1][j-1]+a))%mod); 
//              }
//              // j++;
//             }
//         }
//         return dp[0][steps];
//     }
// }
import java.util.Arrays ; 
import java.io.PrintStream; 
import java.util.Vector ; 

class Solution {
     
     public static long[][] nested  ; 
     public static  int MODULO = (int)Math.pow(10,9 )+7 ;  
     /*if(br==0&&br<width-1){ source[vt][br] = source[vt+1][br+1]+source[vt+1][br] ;
           if(br==width-1&&br>0){source[vt][br] =source[vt+1][br-1 ]+source[vt+1][br] ; }  */
    public static void  compute(int  width,int height,long[][] source){
        for(int vt=height-1;vt>=0;vt--){
            for(int br=width-1;br>=0;br--){
            if( br<width-1){source[vt][br]+=source[ vt+1][br+1] ; }
            if(br>0){source[vt][br]+=source[vt+1][br-1] ; } 
            source[vt][br]+=source[vt+1][br] ; 
    source[vt][br] = source[vt][br]%MODULO ; 
            }
        }
    }  
    /*  
    if (br>0&&br<width-1){source[vt][br] = source[vt+1][br-1]+source[vt+1][br]+
    source[vt+1][br+1] ; }  */
      // source[nt][my] = 0 ; 
    public int numWays(int steps, int arrLen) {  
        int below = Math.min(arrLen,steps) ; 
        nested = new  long[steps+1][below] ;    
        for(int nt=0;nt<=steps;nt++){
            for(int my=0;my<below;my++){
             nested[nt][my] = 0 ;     }    }
        nested[steps][0] = 1 ; 
        compute(below,steps,nested) ;   
       // System.out.println (Arrays .deepToString (nested) ) ; 
        return  (int)nested[0][0] ;            
    }
}