import nucleo.Conta;
import nucleo.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		
		Conta c1, c2;
		//ContaEspecial c2; - nao esta errado
		
		c2 = new ContaEspecial("Jão", "22222-20", 2222, 500.20);
		
		c1 = new Conta("Felipe" , "123123-12" , 1111);
		
		System.out.println(c1.toString());
		
		c1.creditar(500);
		
		System.out.println(c1.toString());
		
		System.out.println(c2.toString());
		
		if (c2.debitar(600)) {
			System.out.println("debitou!");
		}
		else {
			System.out.println("deu ruim no debito, vc nao tem saldo");
		}
		
		System.out.println(c2.toString());

		
	}
}
