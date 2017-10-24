package nl.hhs.dsal.week7.pascaltriangle;

public class PascalTriangle {
    /*
    *1
    *11
    *121
    *1331
    *14641
    */



    public static int pascal(int c, int r){
       if(c < 1  || c >= r){
       return 1;    
       }
  
       return pascal(c-1,r-1) + pascal(c,r-1);
    }



}
