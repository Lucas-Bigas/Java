package Exercicios;

import javax.swing.JOptionPane;

public class MediaAluno {

    public void calcularMedia (){

        String aluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
        String resposta1 = JOptionPane.showInputDialog("Digite a sua primeira nota:");
        String resposta2 = JOptionPane.showInputDialog("Digite a sua segunda nota:");
        String resposta3 = JOptionPane.showInputDialog("Digite a sua terceira nota:");

        int nota1 = Integer.parseInt(resposta1);
        int nota2 = Integer.parseInt(resposta2);
        int nota3 = Integer.parseInt(resposta3);
        int media = Divisao(nota1, nota2, nota3);

        System.out.println("Nota final:" + media);

        if ((media) >= Integer.parseInt("6")) {
            System.out.println("A nota final é: " + media);
            System.out.println("O Aluno " + aluno + " está aprovado!");
        } else

            if ((media >= 4 && media < 6)) {
                System.out.println("A nota final é: " + media);
                System.out.println("O Aluno " + aluno + " deverá realizar a prova!");
            } else {

            if ((media) < Integer.parseInt("4")){
                System.out.println("A nota final é: " + media);
                System.out.println("O Aluno " + aluno + " está reprovado!");
                }
            }

        }

private int Divisao (int nota1, int nota2, int nota3){
        return (nota1 + nota2 + nota3) / 3;

}

}


