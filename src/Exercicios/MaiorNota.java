package Exercicios;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.*;

public class MaiorNota {

    public static final String MENSAGEM = "\nEstá é a maior nota entre as três!";

    public void retornarMaiorNota() {

        String resposta1 = JOptionPane.showInputDialog("Digite a sua primeira nota:");
        String resposta2 = JOptionPane.showInputDialog("Digite a sua segunda nota:");
        String resposta3 = JOptionPane.showInputDialog("Digite a sua terceira nota:");

        float nota1 = Float.parseFloat(resposta1);
        float nota2 = Float.parseFloat(resposta2);
        float nota3 = Float.parseFloat(resposta3);


        if ((nota1 > nota2) && (nota1 > nota3)) {
            JOptionPane.showMessageDialog(null, "Nota 01: " + nota1 + MENSAGEM);
            //return ;
        } else if ((nota2 > nota1) && (nota2 > nota3)) {
            JOptionPane.showMessageDialog(null, "Nota 02: " + nota2 + MENSAGEM);
        } else {
            JOptionPane.showMessageDialog(null, "Nota 03: " + nota3 + MENSAGEM);
        }

    }
}
