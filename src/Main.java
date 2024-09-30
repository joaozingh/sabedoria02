import java.util.Scanner;

// CLASSE PARA O TRABALHO
class Questao {
    public String opcaoE;
    String pergunta = "Qual desses lugares nevam ?:";
        String opcaoA = "xique-xique-Bahia";
        String opcaoB = "Lagoa nova-Maranhão";
        String opcaoC = "Ottawa-Canadá";
        String opcaoD = "Goiânia-Góias";
        String correta = "opcaoC";

        public boolean isCorreta(String resposta){
            if(resposta.equalsIgnoreCase(this.correta)){
                System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                System.out.println("C");
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                System.out.println("C");
                return false;
            }
        }

        public String leiaResposta() {
            Scanner ler = new Scanner(System.in);
            String resp;
            do {
                System.out.println("Digite a resposta: ");
                resp = ler.next();
            } while (!respostaValida(resp));
            return resp;
        }

        private boolean respostaValida(String resp){
            if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                    resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
                return true;
            }
            System.out.println("Resposta inválida! Digite opção A, B, C ou D. ");
            System.out.println("tente de novo");
            return false;
        }

        public void escrevaQuestao(){
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println();
        }

    }
