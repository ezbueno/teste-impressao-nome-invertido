package impressao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();

			String qtde = JOptionPane.showInputDialog("Digite a quantidade de produtos: ");
			int qtd = Integer.parseInt(qtde);
			
			for (int i = 0; i < qtd; i++) {
				Produto prod = new Produto();
				String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto " + (i+1) + ":");
				prod.setNome(nomeProduto);
				produtos.add(prod);			
			}
			
			System.out.println("Lista de Produtos impressos: " );
			for (Produto prod : produtos) {
				System.out.println(prod.getNome());
			}
			
			System.out.println();
			
			System.out.println("Lista de Produtos impressos com a impressão ao contrário: " );
			for (int i = 0, j = produtos.size() -1 ; i < produtos.size(); i++, j--) {
				System.out.println(produtos.get(j).getNome());			
			}
			
			System.out.println();
			
			System.out.println("Lista de Produtos impressos com os nomes dos produtos invertidos: " );
			
			for (int i = 0; i < produtos.size(); i++) {
				String nomeProd = produtos.get(i).getNome();
				String nomeProdInvertido = new StringBuilder(nomeProd).reverse().toString();
				System.out.println(nomeProdInvertido);				
			}
				

			
			
		
			
//		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Digite a quantidade de produtos: ");
//			int qtd = sc.nextInt();
//			


	}
}
