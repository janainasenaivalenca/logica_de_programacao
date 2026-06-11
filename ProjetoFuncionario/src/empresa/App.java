package empresa;

public class App {

	public static void main(String[] args) {
		Gerente gerente1 = Gerente();
		
		gerente1.setNome("João");
		gerente1.setSalario(5000);
		gerente1.setBonus(5000);
		
		Funcionario funcionario1 = new funcionario();
		
		funcionario1.setNome("João");
		funcionario1.setSalario("5000");
		
		funcionario1.exibirDados();
		System.out.println();
		gerente1.exibirDados();
			

	}

}
