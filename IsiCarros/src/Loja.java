
public class Loja {
	public static void main(String[] args) {
		Carro c1;
		Carro c2;

		c1 = new Carro();
		c2 = new Carro();

		c2.ano = 1998;
		c2.marca = "ford";
		c2.cor = "preto";
		c2.modelo = "ka";
		c2.preco = 72000;

		c1.ano = 2021;
		c1.cor = "verde";
		c1.marca = "ferrari";
		c1.modelo = "enzo";
		c1.preco = 999999;

	/*	System.out.println("Carro 1: " + c1.marca + " modelo: " + c1.modelo);
		System.out.println("    ano: " + c1.ano);
		System.out.println("  preço: R$" + c1.preco);
		System.out.println("    cor: " + c1.cor);
		System.out.println();
		System.out.println("Carro 2: " + c2.marca + " modelo: " + c2.modelo);
		System.out.println("    ano: " + c2.ano);
		System.out.println("  preço: R$" + c2.preco);
		System.out.println("    cor: " + c2.cor);
	*/
		c1.exibirInfo();
		c2.exibirInfo();
		
		System.out.println("ano do objeto: " + c1.ExibirAno());
		
		System.out.println("aplicado o desconto");
		c2.aplicarDesconto(10);
		c2.aplicarDesconto(10);
		
		c1.exibirInfo();
		c2.exibirInfo();
		
		double ipvaC1 = c1.calcularIPVA();
		double ipvaC2 = c2.calcularIPVA();
		
		System.out.println("IPVA C1: " + ipvaC1);
		System.out.println("IPVA C2: " + ipvaC2);
		
	}

}
