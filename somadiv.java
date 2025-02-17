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
				  
		  if (X == N) // parada, pois caso N seja igual a 1, 1/1 será igual a 1 e não é mais necessario as divisões
		  {return 1 ;}
		  
		  else 
		  {  S = S + (X /(double) N);
			  return S = S + soma(N-1);
			  
		  }
		      
	  }
}
