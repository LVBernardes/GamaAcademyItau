
public class GestaoEmpregrados {
	public static void main(String[] args) {
			
		Empregado empl1 = new Empregado();
		Empregado empl2 = new Empregado();
		Empregado empl3 = new Empregado();
		
		empl1.setNome("Rafael");
		empl1.setCargo("Engenheiro");
		empl1.setSalario(7000.00);
		
		empl2.setNome("Pedro");
		empl2.setNome("Analista de TI");
		empl2.setSalario(5000.00);
		
		empl3.setNome("Rafaela");
		empl3.setCargo("Gerente de Projetos");
		empl3.setSalario(6000.00);
		
		System.out.println(empl1.imprimir());
		System.out.println(empl2.imprimir());
		System.out.println(empl3.imprimir());
		System.out.println();
		
		empl1.aumentarSalario(5);
		empl2.aumentarSalario(10);
		empl3.aumentarSalario(4.5);
		
		System.out.println(empl1.imprimir());
		System.out.println(empl2.imprimir());
		System.out.println(empl3.imprimir());
		
	}
}
