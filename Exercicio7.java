// Read a person's age expressed in years, months and days and display that person's age
// expressed only in days. Consider year with 365 days and month with 30 days.

import javax.swing.JOptionPane;

public class Exercicio7 {


    public static void main(String[] args){

    String anosT, mesesT, diasT;
    int anosN, mesesN, diasN, diasTotaisN;

    // Digitar Idade em anos, meses e dias
    anosT = JOptionPane.showInputDialog("Digite a quantidade de ANOS da sua idade:");
    mesesT = JOptionPane.showInputDialog("Digite a quantidade de MESES da sua idade:");
    diasT = JOptionPane.showInputDialog("Digite a quantidade de DIAS da sua idade:");

    // Salvar Idade em anos, meses e dias
    anosN = Integer.parseInt(anosT);
    mesesN = Integer.parseInt(mesesT);
    diasN = Integer.parseInt(diasT);
    
    // Fazer calculo total
    anosN = (anosN*365);
    mesesN = (mesesN*30);

    diasTotaisN = (anosN + mesesN + diasN);

    // Mostrar Resultado
    System.out.println(diasTotaisN);

    }
}
