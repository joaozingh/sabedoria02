import java.util.Scanner;

public class QUESTAO {

    public static void main(String[] args) {
        // Instanciando a classe Questao
        Questao questao = new Questao();

        // Exibindo a pergunta
        questao.escrevaQuestao();

        // Lendo a resposta do usuário
        String resposta = questao.leiaResposta();

        // Verificando se a resposta está correta
        questao.isCorreta(resposta);
    }

    // CLASSE PARA O TRABALHO
    static class Questao {
        // Variáveis da questão
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

        // Método para verificar se a resposta está correta
        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns, resposta correta! - Letra: " + this.correta);
                return true;
            } else {
                System.out.println("Resposta errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                return false;
            }
        }

        // Método para ler a resposta do usuário
        public String leiaResposta() {
            // Instanciando Scanner corretamente
            Scanner scanner = new Scanner(System.in);
            String resposta;
            do {
                System.out.println("Digite a resposta (A, B, C, D ou E): ");
                resposta = scanner.next();
            } while (!respostaValida(resposta));
            return resposta;
        }

        // Método para validar a resposta
        private boolean respostaValida(String resposta) {
            if (resposta.equalsIgnoreCase("A") || resposta.equalsIgnoreCase("B") || resposta.equalsIgnoreCase("C") ||
                    resposta.equalsIgnoreCase("D") || resposta.equalsIgnoreCase("E")) {
                return true;
            }
            System.out.println("Resposta inválida! Digite A, B, C, D ou E.");
            return false;
        }

        // Método para exibir a questão
        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
        }
    }
}

