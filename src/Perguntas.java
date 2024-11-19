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
        p6.pergunta="6- Quantos monarcas existem ?";
        p6.opcaoA="A- seis";
        p6.opcaoB="B- nove";
        p6.opcaoC="C- sete";
        p6.opcaoD="D- oito";
        p6.opcaoE="E- Dez";
        p6.correta="B- nove ";

        p6.escrevaQuestao();
        resposta = p6.leiaResposta();
        System.out.println(resposta);
        p6.isCorreta(resposta);


        //questão sete

        Questao p7 = new Questao();
        p7.pergunta="7- Quais dos monarcas é o mais forte ? ";
        p7.opcaoA="A - Antares";
        p7.opcaoB="B - Ashborn";
        p7.opcaoC="C -  Baran";
        p7.opcaoD="D-  Hochwan";
        p7.opcaoE="E- Sung Jin-woo";
        p7.correta="E- Sung Jin-wo";

        p7.escrevaQuestao();
        resposta = p7.leiaResposta();
        System.out.println(resposta);
        p7.isCorreta(resposta);

        //questão oito

        Questao p8 = new Questao();
        p8.pergunta= " Como Sung Jin-Woo se refere ao sistema que aparece para ele ? ";
        p8.opcaoA="A - Deus do Rank";
        p8.opcaoB="B - O Sistema";
        p8.opcaoC="C - Mestre das Dungeons";
        p8.opcaoD="D - Protetor";
        p8.opcaoE="E - Sombra";
        p8.correta="B- o sistema ";

        p8.escrevaQuestao();
        resposta = p8.leiaResposta();
        System.out.println(resposta);
        p8.isCorreta(resposta);

        //questão nove

        Questao p9 = new Questao();
        p9.pergunta= "O que faz Sung Jin-Woo ganhar suas habilidades especiais ?";
        p9.opcaoA="A -  Um treinamento secreto com um mestre lendário";
        p9.opcaoB="B - Uma poção mágica encontrada em uma dungeon";
        p9.opcaoC="C - Uma missão misteriosa após sobreviver a uma dungeon dupla ";
        p9.opcaoD="D - Um artefato lendário que ele descobre ";
        p9.opcaoE="E - Um desejo concedido por um deus ";
        p9.correta="C- Uma missão misteriosa após sobreviver a uma dungeon dupla ";

        p9.escrevaQuestao();
        resposta = p9.leiaResposta();
        System.out.println(resposta);
        p9.isCorreta(resposta);

        //quetsão dez

        Questao p10 = new Questao();
        p10.pergunta="Qual é a habilidade principal de Sung Jin-Woo após se tornar mais forte ? ";
        p10.opcaoA="A - Controle de sombras";
        p10.opcaoB="B -  Manipulação de fogo";
        p10.opcaoC="C-Invocação de dragões ";
        p10.opcaoD="D - Velocidade sobre-humana ";
        p10.opcaoE="E - Controle de tempestades";
        p10.correta="A- Controle de sombras ";

        p10.escrevaQuestao();
        resposta = p10.leiaResposta();
        System.out.println(resposta);
        p10.isCorreta(resposta);

        //questão onze
        Questao p11 = new Questao();
        p11.pergunta="Qual é o objetivo principal do Sistema que guia Sung Jin-Woo ? ";
        p11.opcaoA="A - Torná-lo o caçador mais rico do mundo ";
        p11.opcaoB="B - Prepará-lo para lutar contra os Monarcas ";
        p11.opcaoC="C - Impedir que os Portais sejam abertos ";
        p11.opcaoD="D - Fazer dele o rei das guildas ";
        p11.opcaoE="E - Ajudá-lo a proteger sua irmã ";
        p11.correta="B- PRepará-lo para a luta contra os Monarcas ";

        p11.escrevaQuestao();
        resposta = p11.leiaResposta();
        System.out.println(resposta);
        p11.isCorreta(resposta);

        //quetsão doze
        Questao p12 = new Questao();
        p12.pergunta="Qual é o nome da guilda mais poderosa da Coreia do Sul ? ";
        p12.opcaoA="A-Hunters ";
        p12.opcaoB="B- Ah-jin ";
        p12.opcaoC="C- Scavenger ";
        p12.opcaoD="D- White Tiger";
        p12.opcaoE="E- Knights";
        p12.correta="B- Ah-jin ";

        p12.escrevaQuestao();
        resposta = p12.leiaResposta();
        System.out.println(resposta);
        p12.isCorreta(resposta);

        //questão treze
        Questao p13 = new Questao();
        p13.pergunta=" Quem é Cha Hae-In? ";
        p13.opcaoA="A- Uma invocadora de dragões lendária";
        p13.opcaoB="B- Uma caçadora rank-S e membro da guilda Hunters";
        p13.opcaoC="C- A irmã mais nova de Sung Jin-Woo ";
        p13.opcaoD="D- Líder da guilda White Tiger";
        p13.opcaoE="E- Criadora do Sistema";
        p13.correta="B- Uma caçadora rank-S e membro da guilda Hunters ";

        p13.escrevaQuestao();
        resposta = p13.leiaResposta();
        System.out.println(resposta);
        p13.isCorreta(resposta);

        //questão quatorze
        Questao p14 = new Questao();
        p14.pergunta="Qual foi o primeiro país fora da Coreia do Sul a notar as habilidades extraordinárias de Sung Jin-Woo ? ";
        p14.opcaoA="A- Japão";
        p14.opcaoB="B- China";
        p14.opcaoC="C- Estados Unidos";
        p14.opcaoD="D- França";
        p14.opcaoE="E- Rússia";
        p14.correta="C- Estados Unidos";

        p14.escrevaQuestao();
        resposta = p14.leiaResposta();
        System.out.println(resposta);
        p14.isCorreta(resposta);

        //questão quinze
        Questao p15 = new Questao();
        p15.pergunta=". Qual é o título que Sung Jin-Woo recebe ao atingir o topo do sistema ?";
        p15.opcaoA="A- Monarca das Sombras";
        p15.opcaoB="B- Deus das Dungeons";
        p15.opcaoC="C- Imperador das Trevas";
        p15.opcaoD="D- Guardião Supremo";
        p15.opcaoE="E- Rei dos Caçadores";
        p15.correta="A- Monarca das Sombras";

        p15.escrevaQuestao();
        resposta = p15.leiaResposta();
        System.out.println(resposta);
        p15.isCorreta(resposta);

        //questão dezesseis














    }

}
