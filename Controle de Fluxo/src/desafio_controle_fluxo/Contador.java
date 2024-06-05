package desafio_controle_fluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException exception) {
			// TODO: handle exception
			System.out.println("O primeiro parametro não pode ser maior que o segundo!");
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois) {
			throw new ParametrosInvalidosException();
		}
		else {
			int contagem = parametroDois - parametroUm;
			
			for(int num = 0; num <= contagem; num++) {
				System.out.println("Imprimindo o número: " + num);
			}
		}
	}
	
}
