import java.util.*; 
class arithmetic {     
    int a,b;     
    Scanner s1=new Scanner(System.in);     
    arithmetic()     
    {         
        System.out.println("Enter any 2 Integers");        
        a=s1.nextInt();         
        b=s1.nextInt();     
    }     void display()     
    {         
        System.out.println("Addition = "+(a+b));         
        System.out.println("Subtraction = "+(a-b));         
        System.out.println("Multiplication = "+(a*b));         
        System.out.println("Division = "+(a/b));    
    }     arithmetic(float a1, float b1)     {         
        System.out.println("Addition = "+(a1+b1));        
        System.out.println("Subtraction = "+(a1-b1));        
        System.out.println("Multiplication = "+(a1*b1));        
        System.out.println("Division = "+(a1/b1));     }     
    void display(int x)     
    {         
        System.out.println("Square of "+x+" is "+(x*x));    
    }
} 
class Prg1a 
    {     public static void main(String args[])    
    {         Scanner s1=new Scanner(System.in);         
    System.out.println("ARITHMETIC OPERATIONS ON INTEGER");        
    arithmetic a=new arithmetic();         
    a.display();        
    System.out.println("\nARITHMETIC OPERATIONS ON FLOAT");        
    System.out.println("Enter any 2 Float Numbers");        
    float a1=s1.nextFloat();        
    float a2=s1.nextFloat();        
    arithmetic arth1=new arithmetic(a1,a2);         
    System.out.println("\nEnter Number to Find Square");         
    int x=s1.nextInt();         
    a.display(x);     } } 