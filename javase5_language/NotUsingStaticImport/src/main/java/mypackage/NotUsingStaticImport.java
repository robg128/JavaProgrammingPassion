package mypackage;

public class NotUsingStaticImport{

    public static void main( String[] args ) {

        System.out.println( "Here are the attributes of a employee who will be hired: " );
        System.out.println( "Minimum Salary is: " + testpackage.EmpAttributes.MINSALARY );
        System.out.println( "Maximum Salary is: " + testpackage.EmpAttributes.MAXSALARY );
        System.out.println( "Max Vacation Days: " + testpackage.EmpAttributes.MAXVACATION );
        System.out.println( "Max Raise Percentage: " + testpackage.EmpAttributes.MAXANNUALRAISEPERCENTAGE );

        double x = Math.sin(34);
        System.out.println("Math.sin(34): " + x);
    }

}