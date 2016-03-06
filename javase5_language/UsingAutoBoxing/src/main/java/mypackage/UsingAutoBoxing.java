package mypackage;


public class UsingAutoBoxing{

    // Suppose the internal variables are in Wrapper types
    Integer iObj;
    Float fObj;
    Long lObj;
    Double dObj;

    public UsingAutoBoxing() {

    }

    public static void main( String[] args ) {
        UsingAutoBoxing a = new UsingAutoBoxing();
        // a.iObj = new Integer( 22 );  
        a.iObj = 22;                                 // Using AutoBoxing
         
        // a.fObj = new Float( 22.0 );
        a.fObj = 22.0f ;                            // Using AutoBoxing
       
        // a.lObj = new Long ( 22L );
        a.lObj = 22L;                               // Using AutoBoxing
       
        // a.dObj = new Double( 22 );
        a.dObj = 22d;                              // Using AutoBoxing

        System.out.println( " int Value of iObj is: " + a.iObj );             
        System.out.println( " float Value of iObj is: " + a.fObj );         
        System.out.println( " long Value of iObj is: " + a.lObj );         
        System.out.println( " double Value of iObj is: " + a.dObj ); 

    }
}