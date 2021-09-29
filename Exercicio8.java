// Read the total number of voters in a municipality, the number of blank, null and valid.
// Calculate and write the percentage that each represents in relation to the total of voters.

import javax.swing.JOptionPane;

public class Exercicio8 {
  public static void main(String[] args)  {
    String brancosT, nulosT, validosT;
    float brancosN, nulosN, validosN, votosTotal;
    double brancosPorcentagem, nulosPorcentagem, validosPorcentagem;

    // Pegar a quantidade de votos:
    brancosT = JOptionPane.showInputDialog("Digite a quantidade de votos BRANCOS: ");
    nulosT = JOptionPane.showInputDialog("Digite a quantidade de votos NULOS: ");
    validosT = JOptionPane.showInputDialog("Digite a quantidade de votos VÁLIDOS: ");

    // Salvar a quantidade de cada tipo de voto
    brancosN = Integer.parseInt(brancosT);
    nulosN = Integer.parseInt(nulosT);
    validosN = Integer.parseInt(validosT);

    // Fazer o total de votos
    votosTotal = (brancosN + nulosN + validosN);

    //Fazer a porcentagem de cada tipo voto
    brancosPorcentagem = (brancosN/votosTotal)*100; 
    nulosPorcentagem = (nulosN/votosTotal)*100; 
    validosPorcentagem = (validosN/votosTotal)*100; 

    // Mostrar o resultado
    String msg_total = String.format("%.0f", votosTotal);
    String msg_brancos = String.format("%.1f", brancosPorcentagem);
    String msg_nulos = String.format("%.1f", nulosPorcentagem);
    String msg_validos = String.format("%.1f", validosPorcentagem);

    System.out.print("A quantidade total de votos é " + msg_total + 
    ", sendo a porcentagem de votos bracos de " + msg_brancos + "%, a de nulos de " +
    msg_nulos + "% e a de válidos de " + msg_validos + "%.");

    


  }
}
