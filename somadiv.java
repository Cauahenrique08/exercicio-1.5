package ex5;

public class somadiv {
	public somadiv()
	  { super();
		  
	  }
	  
	  public double  soma(int  N) 
	  { 
		//condição de parada 
		  
		  double S = 0;
		  double X= 1;
				  
		  if (X == N)
		  {return 1 ;}
		  
		  else 
		  {  S = S + (X /(double) N);
			  return S = S + soma(N-1);
			  
		  }
		      
	  }
}