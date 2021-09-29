//Read 4 numbers, calculate the square for each one, add all the squares and show the result.

import javax.swing.JOptionPane;


public class Exercicio2{
    public static void main(String[] args){
        String primeiroTexto, segundoTexto, terceiroTexto, quartoTexto;
        double primeiroNumero, segundoNumero, terceiroNumero, quartoNumero, totalNumero;

        // 1 - Pedir 4 números
        primeiroTexto = JOptionPane.showInputDialog("Digite o primeiro número: ");
        segundoTexto = JOptionPane.showInputDialog("Digite o segundo número: ");
        terceiroTexto = JOptionPane.showInputDialog("Digite o terceiro número: ");
        quartoTexto = JOptionPane.showInputDialog("Digite o quarto número: ");
        
        //2 - Armazenar os números
        //Fazer o quadrado de cada
        primeiroNumero = Double.parseDouble(primeiroTexto);
        segundoNumero  = Double.parseDouble(segundoTexto);
        terceiroNumero = Double.parseDouble(terceiroTexto);
        quartoNumero   = Double.parseDouble(quartoTexto);

        primeiroNumero = Math.pow(primeiroNumero,2);
        segundoNumero  = Math.pow(segundoNumero ,2);
        terceiroNumero = Math.pow(terceiroNumero,2);
        quartoNumero   = Math.pow(quartoNumero  ,2);

        //Fazer a Soma e mostrar

        totalNumero = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero);
        System.out.println(totalNumero);
    }

}