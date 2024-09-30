// Priemira pergunta
public class Perguntas {
    public static void main(String[] args) {
        Questao p1 = new Questao();
        p1.pergunta="1-Qual foi a primeira sombra de sung-jiwoo ?";
        p1.opcaoA="A - Igris";
        p1.opcaoB="B - Tank";
        p1.opcaoC="C - iron";
        p1.opcaoD="D - Tuks";
        p1.opcaoE ="E - Kaisel";

        p1.escrevaQuestao();
        String resposta = p1.leiaResposta();
        System.out.println(resposta);
        p1.isCorreta(resposta);
        

    }

}
