package view;

import javax.swing.JOptionPane;


import ex5.somadiv; // importando biblioteca com a recursividade

public class principal5 
{

	public static void main(String[] args) 
 {
		somadiv somadiv =new somadiv();
		
		 int numero;
	     
			 numero = Integer.parseInt(JOptionPane.showInputDialog
	             ("Insira um número inteiro maior que zero: "));
		 
	 
    
    double resultado = somadiv.soma(numero); // double para armazenar os resusltados das operações feitas dentro da recursivade
    System.out.println(resultado);
	}



 }
