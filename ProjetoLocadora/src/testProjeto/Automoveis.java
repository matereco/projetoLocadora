package testProjeto;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Automoveis extends AutomoveisInfo {
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public Automoveis(String chassi, String placa, int numFabri, String modelo, String cor,String marca, double valorDia) {
		super(chassi, placa, numFabri, modelo, cor,marca, valorDia);
		// TODO Auto-generated constructor stub
	}
 static int a;
 static Aluguel aluguel = new Aluguel();
 static Cliente cliente = new Cliente();
 

 
 
 
	public static void carrosSimples() {
		
		a= 1;
		Scanner sc = new Scanner(System.in);
		AutomoveisInfo auto = new AutomoveisInfo("", "", 0, "", "","", 0);
		
		AutomoveisInfo Hb20 = new AutomoveisInfo("9BWHE21JX24060960", "PIA19", 2015, "Hb20", "Branco","Hyundai", 200 );
		AutomoveisInfo Uno = new AutomoveisInfo("935SLNFNYDB91732", "BRA12", 2017, "Uno", "Preto","Fiat", 200 );
		AutomoveisInfo Gol = new AutomoveisInfo("983KFALNW523851", "JPQ93", 2019, "Gol", "Prata","Volkswagen", 200);
		AutomoveisInfo Sedan = new AutomoveisInfo("924FLPWS87321", "ABR32", 2018, "Sedan", "vermelho","Toyota", 200);
		
		System.out.println("Escolha o carro: ");
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("\n  1. Hb20\n");
	    cars.add("2. Uno\n");
	    cars.add("3. Gol\n");
	    cars.add("4. Sedan\n");
	    System.out.println(cars);
	    int carro = sc.nextInt();
	    
		switch (carro) {
			case 1:
				auto = Hb20;
				break;
			case 2:
				auto = Uno;
				break;
			case 3:
				auto = Gol;
				break;
			case 4:
				auto=Sedan;
				break;
	
			default:
				
				break;
			}
		System.out.printf(
				"Modelo do carro: "+ auto.getModelo() 
				+"%nMarca:" + auto.getMarca()
				+ "%nCor: " + auto.getCor()
				+ "%nPlaca: " + auto.getPlaca() 
				+ "%nChassi: " + auto.getChassi()
				+ "%nNumero de fabricação:" + auto.getNumFabri()
				+ "%nValor da Diaria:" + auto.getValorDia());
		System.out.println();
		
		System.out.println("------------------ ");
		System.out.println("Preencha as informações");
		System.out.println("Nome: ");
		cliente.setName(sc.nextLine());
		System.out.print("CPF: ");
		cliente.setCpf(sc.nextDouble());
		System.out.print("Idade: ");
		cliente.setIdade(sc.nextInt());
		System.out.println("Quantos dias pretende alugar o " + auto.getModelo()+"?");
		aluguel.setDiasAlug(sc.nextDouble());
		System.out.println("Valor total do aluguel: ");
		System.out.println(aluguel.aluguelSimples());
		System.out.println("Check-Out:");
		System.out.printf(cliente.getName() 
				+ "Alugou o " + auto.getModelo()	        
		        +" por " +aluguel.getDiasAlug()+"dias "
		        +"CPF: " + cliente.getCpf()
		        +" IDADE: "+ cliente.getIdade());
		        
		        
	
		
		
			
		}
		public static void carrosDeLuxo() {
			a=2;
			Scanner sc = new Scanner(System.in);
			AutomoveisInfo auto = new AutomoveisInfo("", "", 0, "", "","", 0);
			
			AutomoveisInfo LandRover = new AutomoveisInfo("121212", "12345", 123, "Ranger", "Branco","", 200 );
			AutomoveisInfo Honda = new AutomoveisInfo("121212", "12345", 123, "Civic", "Preto","", 200 );
			AutomoveisInfo Ferrari = new AutomoveisInfo("121212", "12345", 123, "La Ferrari", "Prata","", 200);
			AutomoveisInfo Audi = new AutomoveisInfo("121212", "12345", 123, "R8", "vermelho","", 200);
			
			System.out.println("Escolha seu carro");
			
			ArrayList<String> cars = new ArrayList<String>();
			cars.add("\n  1. Ranger\n");
		    cars.add("2. Civic\n");
		    cars.add("3. La Ferrari\n");
		    cars.add("4. R8\n");
		    System.out.println(cars);
		    int carro = sc.nextInt();
		    
			switch (carro) {
			case 1:
				auto = LandRover;
				break;
			case 2:
				auto = Honda;
				break;
			case 3:
				auto = Ferrari;
				break;
			case 4:
				auto= Audi;
				break;

			default:
				break;
			}
		
		/*ArrayList<AutomoveisInfo> cars = new ArrayList<AutomoveisInfo>();
		cars.add(hb20);
	    cars.add(Uno);
	    cars.add(Gol);
	    cars.add(Fiesta);
	    System.out.println(cars);*/
		
		//JOGAR NA CLASSE CLIENTE
		System.out.printf(
		"Modelo do carro: "+ auto.getModelo() 
		+ "%nCor é: " + auto.getCor()
		+ "%nPlaca: " + auto.getPlaca() 
		+ "%nChassi: " + auto.getChassi()
		+ "%nAno de fabricação:" + auto.getNumFabri()
		+ "%nValor da Diaria:" + auto.getValorDia());
		System.out.println();
		System.out.println("------------------ ");
		System.out.println("Quantos dias pretende alugar o " + auto.getModelo()+"?");
		aluguel.setDiasAlug(sc.nextDouble());
		System.out.println("Valor total do aluguel: ");
		System.out.println(aluguel.aluguelLuxo());
		System.out.println("Pedido Finalizado");
		
		sc.close();
	}
	
 
}
