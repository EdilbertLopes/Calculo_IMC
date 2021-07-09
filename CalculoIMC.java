package ProgramasDecisões;

import javax.swing.JOptionPane;

public class CalculoIMC {

	public static void main(String[] args) {
		
		double altura;
		double peso;
		double imc;
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
	
		imc = peso / (altura*altura);
		
		if ((imc >=0) && (imc <=70)) {
	
			if (imc <=24.9)
				System.out.println("Peso normal");
				else if (imc <=29.9)
				System.out.println("Sobrepeso");
				else if (imc <=34.9)
				System.out.println("Obesidade Grau I");	
				else if (imc <=39.9)
				System.out.println("Obesidade Grau II");
				else if (imc <=40)
				System.out.println("Obesidade Mórbida");
				
				else
				System.out.println("Você ainda tem solução!");		
		}

	}

}
