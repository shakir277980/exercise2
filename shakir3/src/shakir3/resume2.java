package shakir3;

import java.util.Scanner;

public class resume2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		printExercise7();
		printExercise12();
		printExercise13();
		printExercise44();
		printExercise2();
		printExercise52();
		printExercise32();
		printExercise6();
		printExercise3();
		printExercise5();
		

	}

	
    public static void printExercise7() {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("^^^Exercise7^^^");
    	System.out.print("Input a number: ");
    	int num1 = input.nextInt();
    	   
    	for (int i=0; i< 10; i++)
    	System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
    	   
    	  }
    	  
    
    public static void printExercise12() {
    	Scanner input = new Scanner(System.in);

    	System.out.println("^^^Exercise12^^^");
        System.out.print("Input first number: ");
        int num1 = input.nextInt();
     
        System.out.print("Input second number: ");
        int num2 = input.nextInt();
     
        System.out.print("Input third number: ");
        int num3 = input.nextInt();
     
        System.out.print("Input fourth number: ");
        int num4 = input.nextInt();
    
        System.out.print("Enter fifth number: ");
        int num5 = input.nextInt();
     
     
        System.out.println("Average of five numbers is: " + 
        (num1 + num2 + num3 + num4 + num5) / 5);
          
    }

    
    public static void printExercise13() {
    	Scanner input = new Scanner(System.in);

    	System.out.println("^^^Exercise13^^^");
    	final double width = 5.6;
    	final double height = 8.5;

    	double perimeter = 2*(height + width);
	
    	double area = width * height;			
	
    	System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

    	System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
    	
    }

    
    public static void printExercise44() {
    	Scanner input = new Scanner(System.in);

    	System.out.println("^^^Exercise44^^^");
    	int n;
    	char s1, s2, s3;
    	Scanner in = new Scanner(System.in);
    	System.out.print("Input number: ");
    	n = in .nextInt();
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
    	 
    }

	
    public static void printExercise2() {
        Scanner input = new Scanner(System.in);

        System.out.println("^^^Exercise2^^^");
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int d = (a/b);
        System.out.println();
        System.out.println("The division of a and b is:" +d);
        
    }

	
    public static void printExercise52() {
        Scanner input = new Scanner(System.in);

        System.out.println("^^^Exercise52^^^");
        System.out.print("Input the first number : ");
        int x = input.nextInt();  
        System.out.print("Input the second number: ");
    	int y = input.nextInt(); 
    	System.out.print("Input the third number : ");
        int z = input.nextInt(); 
        System.out.print("The result is: "+sumoftwo(x, y, z));
    	System.out.print("\n");
    }
        
    public static boolean sumoftwo(int p, int q, int r)
          {	
        return ((p + q) == r || (q + r) == p || (r + p) == q);	
             
    }

    
    public static void printExercise55() {
        Scanner input = new Scanner(System.in);

        System.out.println("^^^Exercise55^^^");
        System.out.print("Input seconds: ");
    	int seconds = input.nextInt(); 
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);
        System.out.print("\n");
        
    }  

	
     public static void printExercise32() {
        Scanner input = new Scanner(System.in);

        System.out.println("^^^Exercise32^^^");
        // create Scanner to obtain input from command window       
        int number1; // first number to compare       
        int number2; // second number to compare  
            
        System.out.print( "Input first integer: " ); // prompt        
        number1 = input.nextInt(); // read first number from user   
       
        System.out.print( "Input second integer: " ); // prompt        
        number2 = input.nextInt(); // read second number from user               
              
        if ( number1 == number2 )           
        System.out.printf( "%d == %d\n", number1, number2 );  
        if ( number1 != number2 )          
        System.out.printf( "%d != %d\n", number1, number2 );  
        if ( number1 < number2 )          
        System.out.printf( "%d < %d\n", number1, number2 );  
        if ( number1 > number2 )          
        System.out.printf( "%d > %d\n", number1, number2 );  
        if ( number1 <= number2 )          
        System.out.printf( "%d <= %d\n", number1, number2 );  
        if ( number1 >= number2 )          
        System.out.printf( "%d >= %d\n", number1, number2 );  
        
    }
        
     
    public static void printExercise6() {
    	Scanner input = new Scanner(System.in);

    	System.out.println("^^^Exercise6^^^");
    	System.out.print("Input first number: ");
    	int num1 = input.nextInt();
    	   
    	System.out.print("Input second number: ");
    	int num2 = input.nextInt();
    	   
    	 
    	System.out.println(num1 + " + " + num2 + " = " + 
    	(num1 + num2));
    	   
    	System.out.println(num1 + " - " + num2 + " = " + 
    	(num1 - num2));
    	   
    	System.out.println(num1 + " x " + num2 + " = " + 
    	(num1 * num2));
    	   
    	System.out.println(num1 + " / " + num2 + " = " + 
    	(num1 / num2));
    	 	
        System.out.println(num1 + " mod " + num2 + " = " + 
        (num1 % num2));
        	 
   }
        
    
   public static void printExercise3() {
	   Scanner input = new Scanner(System.in);

   	   System.out.println("^^^Exercise3^^^");
   	   System.out.print("Input the first number: ");
       int num1 = input.nextInt();
       System.out.print("Input the second number: ");
       int num2 = input.nextInt();
       int sum = num1 + num2;
       System.out.println();
       System.out.println("Sum: "+sum);
       	
   }
        
        
   public static void printExercise5() {
	   Scanner input = new Scanner(System.in);

   	   System.out.println("^^^Exercise5^^^");
   	   System.out.print("Input first number: ");
   	   int num1 = input.nextInt();
    
   	   System.out.print("Input second number: ");
       int num2 = input.nextInt();
    
   	   System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
   	 	
       }


}
