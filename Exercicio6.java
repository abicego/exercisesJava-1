//Read a person's age expressed in years and display it expressed in days (consider that a year has 365 days)

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void main(String[] args){
        String idadeAnosT;
        int idadeAnosN, idadeDiasN;
        
        //Digitar a Idade
        idadeAnosT = JOptionPane.showInputDialog("Digite sua idade em anos:");

        // Salvar a Idade
        idadeAnosN = Integer.parseInt(idadeAnosT);

        // Transformar Anos em Dias
        idadeDiasN = (idadeAnosN * 365);

        // Mostrar resultado
        System.out.println(idadeDiasN);
    }
}
