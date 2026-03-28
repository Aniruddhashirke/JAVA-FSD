import java.util.Scanner; public class pract7 { 
    public void main(String args[]){         int a,b; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter two number to divide:");         a= sc.nextInt(); 
        b=sc.nextInt();         try{ 
            double res = a/b; 
           System.out.println("Quotient is "+res); 
        }catch(ArithmeticException e) { 
            System.out.println("Invalid Input!! try again."); 
        } 
        finally{ 
            System.out.println("All lines of code has been executed"); 
        } 
    } 
} 
