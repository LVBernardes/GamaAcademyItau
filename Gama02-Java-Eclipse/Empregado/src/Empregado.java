
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String imprimir() {
		String dados = "Nome: " + this.nome + " | Cargo: " + this.cargo + " | Salario: " + String.format("%.2f", this.salario);
		return dados;
	}
	
	public void aumentarSalario(double aumento) {
		this.salario *= (1 + aumento/100f);
	}
}

