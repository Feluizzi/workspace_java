
public class Empregado {
	String nome;
	String cargo;
	double salario;

	void imprimir() {
		System.out.println("nome: " + nome);
		System.out.println("cargo: " + cargo);
		System.out.println("salario: R$" + salario);

	}
	
	void aumentarSalario(double perc) {
		
		salario = salario + (salario*perc/100);
	}
	
}
