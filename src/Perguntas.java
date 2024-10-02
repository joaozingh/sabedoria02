// Priemira pergunta
public class Perguntas {
    public static void main(String[] args) {
        Questao p1 = new Questao();
        p1.pergunta="1-Qual foi a primeira sombra de sung ji-woo ?";
        p1.opcaoA="A - Igris";
        p1.opcaoB="B - Tank";
        p1.opcaoC="C - iron";
        p1.opcaoD="D - Tuks";
        p1.opcaoE ="E - Kaisel";
        p1.correta="A- igris";

        p1.escrevaQuestao();
        String resposta = p1.leiaResposta();
        System.out.println(resposta);
        p1.isCorreta(resposta);


        //Segunda pergunta
        Questao p2 = new Questao();
        p2.pergunta= "2-Qual é a sombra mais forte de sung ji-woo ? ";
        p2.opcaoA="A - Igris";
        p2.opcaoB="B - Beru";
        p2.opcaoC="C - Bellion";
        p2.opcaoD="D - Tuks";
        p2.opcaoE ="E - Kaisel";
        p2.correta="C- Bellion";

        p2.escrevaQuestao();
        resposta = p2.leiaResposta();
        System.out.println(resposta);
        p2.isCorreta(resposta);

        //Terceira pergunta

        Questao p3 = new Questao();
        p3.pergunta="3- Qual é a segunda sombra mais forte de sung ji-woo ? ";
        p3.opcaoA="A - Igris";
        p3.opcaoB="B - Beru";
        p3.opcaoC="C - iron";
        p3.opcaoD="D - Tuks";
        p3.opcaoE ="E - Kaisel";
        p3.correta="B- Beru";

        p3.escrevaQuestao();
        resposta = p3.leiaResposta();
        System.out.println(resposta);
        p3.isCorreta(resposta);

        //Quarta pergunta

        Questao p4 = new Questao();
        p4.pergunta="4- Qual o personagem mais forte de solo leveling ?";
        p4.opcaoA="A - Cha Hae-in ";
        p4.opcaoB="B - Sung jin-woo";
        p4.opcaoC="C - Gon Gun-Hee";
        p4.opcaoD="D - Sung Il-Hwan";
        p4.opcaoE ="E - Hanwg Dong-su";
        p4.correta="B- Sun jin-woo";

        p4.escrevaQuestao();
        resposta = p4.leiaResposta();
        System.out.println(resposta);
        p4.isCorreta(resposta);


        // quinta questão

        Questao p5 = new Questao();
        p5.pergunta="5- Quais desses caçadores é nível nacional ?";
        p5.opcaoA= "A- Cha Hae-in ";
        p5.opcaoB="B - Sung Jin-woo";
        p5.opcaoC="C- Gon Gun-Hee";
        p5.opcaoD="D - Sung Il-Hwan";
        p5.opcaoE="E - Hanwg Dong-su";
        p5.correta="B- Sun jin-woo";

        p5.escrevaQuestao();
        resposta = p5.leiaResposta();
        System.out.println(resposta);
        p5.isCorreta(resposta);

        //quastão seis

        Questao p6 = new Questao();




    }

}
