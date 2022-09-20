package calculator;      //NetBeans
import java.io.*;

public class Calculator {    //NetBeans

//public class Compiling {    //Codecademy

    static final int ADD = 0;
    static final int SUBTRACT = 1;
    static final int MULTIPLY = 2;
    static final int DIVIDE = 3;
    static final int POW = 4;
    static final int FACTORIAL = 5;
    static final int NOOP = 6;

    public static void main(String[] args) {
        write("Enter a number.\n");
        int num1 = readInt();
        write("Enter an operation. (+,-,*,/,^)\n");
        int zoperation = readOperation();
        write("Enter another number.\n");
        int num2 = readInt();

        String result;
        if (zoperation == ADD)
        {
            result = add(num1,num2);       
        }
        else if (zoperation == SUBTRACT)
        {
        result = subtract(num1,num2);
        }
        else if (zoperation == MULTIPLY)
        {
        result = multiply(num1,num2);
        }
         else if (zoperation == DIVIDE)
        {
        result = divide(num1,num2);
        }
        else if (zoperation == POW)
        {
        result = pow(num1,num2);
        }
        else
        {
           result = "Invalid operation\n";
        }
        write(result);
    }
    
    public static String add(int num1,int num2)
    {
        String result = String.valueOf(num1) + " + " + String.valueOf(num2) +
        " = " + String.valueOf(num1 + num2) + "\n";
        return(result);
    }
     public static String subtract(int num1,int num2)
    {
        String result = String.valueOf(num1) + " - " + String.valueOf(num2) +
        " = " + String.valueOf(num1 - num2) + "\n";
        return(result);
    }
     public static String multiply(int num1,int num2)
    {
        String result = String.valueOf(num1) + " * " + String.valueOf(num2) +
        " = " + String.valueOf(num1 * num2) + "\n";
        return(result);
    }
     public static String divide(double num1,double num2)
    {
        double num1Dub = num1;
        double num2Dub = num2;
        String result = String.valueOf(num1) + " / " + String.valueOf(num2) +
        " = " + String.valueOf(num1Dub / num2Dub) + "\n";
        return(result);
    }
     public static String pow(int base,int exp)
    {
      int answer = 1;
      for(int i = 0;i <=exp;i++) 
      {
      answer = base*exp;
      }
      
        String result = String.valueOf(base) + " ^ " + String.valueOf(exp) +
        " = " + String.valueOf(answer) + "\n";            
        return(result);
    }

    public static int readOperation()
    {
        String str = read();
        if (str.charAt(0) == '+')
        {
            return(ADD);
        }
        else if (str.charAt(0) == '-')
        {
            return(SUBTRACT);
        }
        else if (str.charAt(0) == '*')
        {
            return(MULTIPLY);
        }
        else if (str.charAt(0) == '/')
        {
            return(DIVIDE);
        }
         else if (str.charAt(0) == '^')
        {
            return(POW);
        }
        return(NOOP);
    }
        
/////////////////////////////////////////////////////////////        
 public static int readInt()
 {
  String str = read();
  int num = Integer.parseInt(str.trim());
  return (num);
 }
 public static String read()
 {
  byte [] buffer = new byte[10];
                try
                {
  int numBytes = System.in.read(buffer);
                }

      catch(IOException e)
      {
          System.out.print("Error: " + e);
         System.exit(1);
      }


  String str = new String(buffer);
                int ball = 5;
                return (str);
 }
 public static void write(String str)
 {
  System.out.print(str);
 }

}
