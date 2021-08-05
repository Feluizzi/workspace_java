
public class Carro {
// apenas declarar as vari�veis
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;

	void exibirInfo() {
		System.out.println("Autom�vel: "+ marca + " - " + modelo);
		System.out.println("      Ano: " + ano);
		System.out.println("      Cor: " + cor);
		System.out.println("    Pre�o: R$" + preco);
	}
	
	int ExibirAno() {
		return ano;
	}
	
	void aplicarDesconto(double percentual) {
		preco = preco - (preco * percentual/100);
	}
	
	double calcularIPVA() {
		double ipva;
		
		if (ano < 2000) {
			ipva=0;
		} else {
			ipva = preco * 0.02;
		}
		
		return ipva;
	}

}
