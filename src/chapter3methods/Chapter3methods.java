package chapter3methods;

public class Chapter3methods 
{

    public static void main(String[] args) 
    {
        int num1 = 10;
        int num2 = 15;
        int add;
                
        add = myFunction(num1,num2);
        
        System.out.println(add);
        
    }
    
    public static int myFunction(int x, int y)
    {
        int answer;
        answer = x+y;
        return(answer);
    }
}
