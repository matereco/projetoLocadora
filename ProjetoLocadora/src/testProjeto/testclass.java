package testProjeto;

import java.util.Iterator;
import java.util.Scanner;

public class testclass extends Automoveis {

	public testclass(String chassi, String placa, int numFabri, String modelo, String cor,String marca, double valorDia) {
		super(chassi, placa, numFabri, modelo, cor,marca, valorDia);
	
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Aluguel aluguel = new Aluguel();
		
		System.out.println("Seja Bem vindos a Fusquinha & CIA");
		/*System.out.println("Preencha as informações");
		System.out.print("Nome: ");
		cliente.setName(sc.nextLine());
		System.out.print("CPF: ");
		cliente.setCpf(sc.nextDouble());
		System.out.print("Idade: ");
		cliente.setIdade(sc.nextInt());*/
		
		
		int a = 0;
		
		do {
			System.out.println("Escolha o tipo de carro que o senhor(a) deseja: ");
			System.out.println("1. Carro Simples");
			System.out.println("2. Carro De Luxo");
			a = sc.nextInt();
			
			switch(a) {
				case 1:
					
			  System.out.println("Carros simples selecionado");
			  carrosSimples();
			  
			  	break;
				case 2:
					
		    carrosDeLuxo();
				break;
				
				default:
					
					System.out.println("Não tem esse seu bosta");
		    
				}
		
			}while(a!=1 && a!=2);
	
		
		
		}
	
	
		
		
	}


