import java.util.Scanner;
import java.util.Random;
public class WhoWinsTheGirl 
{
	public static void main(String[] args)
	{
	int a,b;
	
	Random rn = new Random();
	int valuem = rn.nextInt(100); 
	int valueb=rn.nextInt(100);
    System.out.println(valuem);
    System.out.println(valueb);
    if(valuem>valueb)
    {
    	
    	System.out.println("Michael you win.....Bruce forget the girl");
    }
    else
    {
    	System.out.println("Bruce you win.....Michael forget the girl");
    }
	}

}
