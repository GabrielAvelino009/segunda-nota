import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        //Gabriel Avelino turma:3ºB
        //Segunda nota
        int quan;
        float No1 = 0;
        float No2 = 0;
        float No3 = 0;

        String nome;

        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas notas tem a matéria: ");
        System.out.println("São 2 ou 3 notas? ");
        quan = ler.nextInt();

        if (quan == 2) {
            System.out.println("Digite a primeira nota: ");
            No1 = ler.nextFloat();
            System.out.println("Digite a segunda nota: ");
            No2 = ler.nextFloat();
            float soma = No1 + No2;
            float divi = soma / quan;
            System.out.println("A média do estudante foi de: " + divi);

            if (divi < 7.0) {
                System.out.println("Então o aluno foi reprovado.");
            } else if (divi == 7.0) {
                System.out.println("Então o aluno foi aprovado batendo na trave para a reprovação.");
            } else if (divi > 7.0 && divi <= 10.0) {
                System.out.println("O aluno foi aprovado com uma nota muito boa.");
            }
        }
            if (quan == 3) {
                System.out.println("Digite a primeira nota: ");
                No1 = ler.nextFloat();
                System.out.println("Digite a segunda nota: ");
                No2 = ler.nextFloat();
                System.out.println("Digite a terceira nota: ");
                No3 = ler.nextFloat();
                float soma = No1 + No2 + No3;
                float divi = soma / quan;
                System.out.println("A média do estudante foi de: " + divi);

                if (divi < 7.0) {
                    System.out.println("Então o aluno foi reprovado.");
                } else if (divi == 7.0) {
                    System.out.println("Então o aluno foi aprovado batendo na trave para a reprovação.");
                } else if (divi > 7.0 && divi <= 10.0) {
                    System.out.println("O aluno foi aprovado com uma nota muito boa.");
                }
            }
        }
    }
