
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1;
		Empregado e2;

		e1 = new Empregado();
		e2 = new Empregado();

		e1.nome = "Felizberto";
		e1.cargo = "analista";
		e1.salario = 1000;
		e2.nome = "Josias";
		e2.cargo = "gerente";
		e2.salario = 5000;
		
		e1.imprimir();
		e2.imprimir();
		e1.aumentarSalario(10);
		e2.aumentarSalario(10);
		e1.imprimir();
		e2.imprimir();

	}
}
