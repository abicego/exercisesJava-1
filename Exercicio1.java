//Read the dollar quote and the dollar amount. Convert to real and show result

import javax.swing.JOptionPane;


public class Exercicio1{
    public static void main(String[] args){
        String cotacaoTexto;
        String quantidadeTexto;
        double valorCotacao;
        double quantidadeDolares;
        double valorEmReais;

        
        //1a etapa: Leitura da cotação e da quantidade dólares
        cotacaoTexto = JOptionPane.showInputDialog("Digite a cotação: ");
        quantidadeTexto = JOptionPane.showInputDialog("Digite a quantidade: ");

        //2a etapa: converter de dolar para real
        valorCotacao = Double.parseDouble(cotacaoTexto);
        quantidadeDolares = Double.parseDouble(quantidadeTexto);
        valorEmReais = valorCotacao * quantidadeDolares;

        //3a etapa: mostra o resultado da conversão
        System.out.println(valorEmReais);
    }
}