
public class Factorial {
	private int num;

	public Factorial(int n) {
		// TODO Auto-generated constructor stub
		num= n;
	}
	
	
	public int calcularfact() {
		int factorial=1;
		
	 if (num== 0 || num==1 )
		{
			factorial =1;
			
		}
		else {
			
			for (int i=2;i<=num;i++)
			{
				
				factorial =factorial*i;
			}
			
			
		}
		
		
		
		return factorial;
	}
	

}
