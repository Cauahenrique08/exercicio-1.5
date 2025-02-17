package view;

import javax.swing.JOptionPane;

import ex2.ordenar;
import ex5.somadiv;

public class principal5 
{

	public static void main(String[] args) 
 {
		somadiv somadiv =new somadiv();
		
		 int numero;
	     
			 numero = Integer.parseInt(JOptionPane.showInputDialog
	             ("Insira um número inteiro maior que zero: "));
		 
	 
    
    double resultado = somadiv.soma(numero);
    System.out.println(resultado);
	}



 }
