
public class Principal {
	public static void main(String[] args) {
		
		Produto p;
		
		p = new Produto();
		
		p.codigo = 123;
		p.preco = 29.90;
		p.nome = "Bolsa Luis Vintao";
		p.qtde = 10;
		p.categoria = "Acessorios";
		
		System.out.println("Código: " + p.codigo + " | Preço: " + p.preco);
		System.out.println("Nome: " + p.nome);
		System.out.println("Quantidade: " + p.qtde);
		System.out.println("Categoria: " + p.categoria);
	}
}
