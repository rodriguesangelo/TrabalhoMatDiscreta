import java.util.Scanner;

public class CavaleiroDasFuncoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pontuacao = 0;

        System.out.print("Digite o nome do seu cavaleiro: ");
        String nome = sc.nextLine();

        limparTela();

        // ===== HISTÓRIA =====
        String historia =
                "Em um mundo antigo e repleto de mistérios...\n\n" +
                        "Existia a lendária Caixa das Funções.\n" +
                        "Ela guardava o poder caótico das funções matemáticas.\n\n" +
                        "Durante séculos, o Guardião das Funções manteve esse poder selado.\n" +
                        "Mas a caixa foi aberta...\n" +
                        "E o caos matemático se espalhou.\n\n" +
                        "Agora, " + nome + ", você deve restaurar o equilíbrio.\n\n";

        imprimirComDelay(historia, 30);
        pausa(sc);
        limparTela();

        // ===== TUTORIAL =====
        String tutorial =
                "=== MANUAL DO CAVALEIRO DAS FUNÇÕES ===\n\n" +

                        "OBJETIVO:\n" +
                        "Responda corretamente às perguntas para restaurar o equilíbrio.\n\n" +

                        "COMO JOGAR:\n" +
                        "- Cada pergunta tem A, B ou C.\n" +
                        "- Digite a letra e pressione ENTER.\n\n" +

                        "PONTUAÇÃO:\n" +
                        "- Cada acerto vale 10 pontos.\n" +
                        "- Máximo: 110 pontos.\n\n" +

                        "FINAIS:\n" +
                        "- Quanto melhor sua pontuação, melhor o final.\n\n"

                        ;


        imprimirComDelay(tutorial, 20);
        pausa(sc);
        limparTela();

        System.out.println("=== INÍCIO DA JORNADA ===\n");

        // ===== QUESTÕES =====

        if (pergunta(sc, nome,
                "1) Uma função é chamada de INJETORA quando:",
                "A) Todos os valores do contradomínio são utilizados",
                "B) Valores diferentes do domínio sempre geram resultados diferentes",
                "C) Existem dois valores diferentes com o mesmo resultado",
                "B")) pontuacao += 10;

        if (pergunta(sc, nome,
                "2) Uma função é chamada de SOBREJETORA quando:",
                "A) Pelo menos um valor do contradomínio não é atingido",
                "B) Todos os valores do contradomínio são atingidos por algum valor do domínio",
                "C) Apenas um valor do contradomínio é atingido",
                "B")) pontuacao += 10;

        if (pergunta(sc, nome,
                "3) Uma função é BIJETORA quando:",
                "A) É apenas injetora",
                "B) É apenas sobrejetora",
                "C) É ao mesmo tempo injetora e sobrejetora",
                "C")) pontuacao += 10;

        if (pergunta(sc, nome,
                "4) Dada a função f(x) = x + 3, qual é sua função inversa?",
                "A) f⁻¹(x) = x - 3",
                "B) f⁻¹(x) = x + 3",
                "C) f⁻¹(x) = 3x",
                "A")) pontuacao += 10;

        if (pergunta(sc, nome,
                "5) Se f(x) = 2x e g(x) = x + 1, qual é o resultado de f(g(x))?",
                "A) 2x + 1",
                "B) 2x + 2",
                "C) x + 3",
                "B")) pontuacao += 10;

        if (pergunta(sc, nome,
                "6) Uma função NÃO é injetora quando:",
                "A) Dois valores diferentes do domínio geram o mesmo resultado",
                "B) Todos os valores são diferentes",
                "C) A função não tem domínio",
                "A")) pontuacao += 10;

        if (pergunta(sc, nome,
                "7) Qual das funções abaixo é bijetora considerando os números reais (R)?",
                "A) f(x) = x²",
                "B) f(x) = x + 1",
                "C) f(x) = |x|",
                "B")) pontuacao += 10;

        if (pergunta(sc, nome,
                "8) Qual é a função inversa de f(x) = 2x?",
                "A) f⁻¹(x) = x/2",
                "B) f⁻¹(x) = 2x",
                "C) f⁻¹(x) = x - 2",
                "A")) pontuacao += 10;

        if (pergunta(sc, nome,
                "9) Se uma função é bijetora, então podemos afirmar que:",
                "A) Ela não possui função inversa",
                "B) Ela possui função inversa",
                "C) Ela é constante",
                "B")) pontuacao += 10;

        if (pergunta(sc, nome,
                "10) A função f(x) = x² é injetora considerando todos os números reais?",
                "A) Sim",
                "B) Não, pois valores diferentes podem ter o mesmo resultado",
                "C) Sim, pois todos os valores são diferentes",
                "B")) pontuacao += 10;

        if (pergunta(sc, nome,
                "11) Qual das expressões abaixo representa corretamente uma função composta?",
                "A) f(x) + g(x)",
                "B) f(g(x))",
                "C) f.x",
                "B")) pontuacao += 10;

        // ===== FINAL =====
        System.out.println("\n=== RESULTADO FINAL ===\n");
        System.out.println(nome + ", pontuação: " + pontuacao + "/110\n");

        if (pontuacao == 110) {
            System.out.println("🏆 FINAL LENDÁRIO: Você selou o caos na caixa das funções! Agora o mundo está livre novamente do caos matemático");
        } else if (pontuacao >= 70) {
            System.out.println("⚔️ FINAL HONROSO: Equilíbrio restaurado! Parabéns, cavaleiro, o caixa das funções foi selada novamente");
        } else if (pontuacao >= 40) {
            System.out.println("🛡️ FINAL MEDIANO: Ainda precisa treinar, cavaleiro, se você realmente quer vencer o caos matemático...");
        } else {
            System.out.println("💀 FINAL TRÁGICO: O caos matemático venceu. Não foi dessa vez, cavaleiro ...");
        }

        sc.close();
    }

    // ===== MÉTODOS =====

    public static void imprimirComDelay(String texto, int delay) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean pergunta(Scanner sc, String nome, String pergunta,
                                   String a, String b, String c, String correta) {

        System.out.println("\n" + pergunta);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.print("Resposta: ");

        String resp = sc.nextLine();

        if (resp.equalsIgnoreCase(correta)) {
            System.out.println("✔ Correto, " + nome + "!");
            return true;
        } else {
            System.out.println("✘ Errado, " + nome + "!");
            return false;
        }
    }

    public static void pausa(Scanner sc) {
        System.out.println("\n(Pressione ENTER para continuar...)");
        sc.nextLine();
    }

    public static void limparTela() {
        for (int i = 0; i < 30; i++) System.out.println();
    }
}