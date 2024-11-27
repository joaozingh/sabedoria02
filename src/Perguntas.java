public class Perguntas {
    public static void main(String[] args) {
        int cont = 0;

        // Primeira pergunta
        Questao p1 = new Questao();
        p1.pergunta = "1-Qual foi a primeira sombra de Sung Ji-Woo?";
        p1.opcaoA = "A - Igris";
        p1.opcaoB = "B - Tank";
        p1.opcaoC = "C - Iron";
        p1.opcaoD = "D - Tuks";
        p1.opcaoE = "E - Kaisel";
        p1.correta = "A";
        p1.escrevaQuestao();
        String resposta = p1.leiaResposta();
        if (p1.isCorreta(resposta)) {
            cont++;
        }

        // Segunda pergunta
        Questao p2 = new Questao();
        p2.pergunta = "2-Qual é a sombra mais forte de Sung Ji-Woo?";
        p2.opcaoA = "A - Igris";
        p2.opcaoB = "B - Beru";
        p2.opcaoC = "C - Bellion";
        p2.opcaoD = "D - Tuks";
        p2.opcaoE = "E - Kaisel";
        p2.correta = "C";
        p2.escrevaQuestao();
        resposta = p2.leiaResposta();
        if (p2.isCorreta(resposta)) {
            cont++;
        }

        // Terceira pergunta
        Questao p3 = new Questao();
        p3.pergunta = "3- Qual é a segunda sombra mais forte de Sung Ji-Woo?";
        p3.opcaoA = "A - Igris";
        p3.opcaoB = "B - Beru";
        p3.opcaoC = "C - Iron";
        p3.opcaoD = "D - Tuks";
        p3.opcaoE = "E - Kaisel";
        p3.correta = "B";
        p3.escrevaQuestao();
        resposta = p3.leiaResposta();
        if (p3.isCorreta(resposta)) {
            cont++;
        }

        // Quarta pergunta
        Questao p4 = new Questao();
        p4.pergunta = "4- Qual o personagem mais forte de Solo Leveling?";
        p4.opcaoA = "A - Cha Hae-in";
        p4.opcaoB = "B - Sung Jin-Woo";
        p4.opcaoC = "C - Gon Gun-Hee";
        p4.opcaoD = "D - Sung Il-Hwan";
        p4.opcaoE = "E - Hanwg Dong-su";
        p4.correta = "B";
        p4.escrevaQuestao();
        resposta = p4.leiaResposta();
        if (p4.isCorreta(resposta)) {
            cont++;
        }

        // Quinta pergunta
        Questao p5 = new Questao();
        p5.pergunta = "5- Quais desses caçadores é nível nacional?";
        p5.opcaoA = "A - Cha Hae-in";
        p5.opcaoB = "B - Sung Jin-Woo";
        p5.opcaoC = "C - Gon Gun-Hee";
        p5.opcaoD = "D - Sung Il-Hwan";
        p5.opcaoE = "E - Hanwg Dong-su";
        p5.correta = "B";
        p5.escrevaQuestao();
        resposta = p5.leiaResposta();
        if (p5.isCorreta(resposta)) {
            cont++;
        }

        // Sexta pergunta
        Questao p6 = new Questao();
        p6.pergunta = "6- Quantos monarcas existem?";
        p6.opcaoA = "A - Seis";
        p6.opcaoB = "B - Nove";
        p6.opcaoC = "C - Sete";
        p6.opcaoD = "D - Oito";
        p6.opcaoE = "E - Dez";
        p6.correta = "B";
        p6.escrevaQuestao();
        resposta = p6.leiaResposta();
        if (p6.isCorreta(resposta)) {
            cont++;
        }

        // Sétima pergunta
        Questao p7 = new Questao();
        p7.pergunta = "7- Qual dos monarcas é o mais forte?";
        p7.opcaoA = "A - Antares";
        p7.opcaoB = "B - Ashborn";
        p7.opcaoC = "C - Baran";
        p7.opcaoD = "D - Hochwan";
        p7.opcaoE = "E - Sung Jin-Woo";
        p7.correta = "E";
        p7.escrevaQuestao();
        resposta = p7.leiaResposta();
        if (p7.isCorreta(resposta)) {
            cont++;
        }

        // Oitava pergunta
        Questao p8 = new Questao();
        p8.pergunta = "8- Como Sung Jin-Woo se refere ao sistema que aparece para ele?";
        p8.opcaoA = "A - Deus do Rank";
        p8.opcaoB = "B - O Sistema";
        p8.opcaoC = "C - Mestre das Dungeons";
        p8.opcaoD = "D - Protetor";
        p8.opcaoE = "E - Sombra";
        p8.correta = "B";
        p8.escrevaQuestao();
        resposta = p8.leiaResposta();
        if (p8.isCorreta(resposta)) {
            cont++;
        }

        // Nona pergunta
        Questao p9 = new Questao();
        p9.pergunta = "9- O que faz Sung Jin-Woo ganhar suas habilidades especiais?";
        p9.opcaoA = "A - Um treinamento secreto com um mestre lendário";
        p9.opcaoB = "B - Uma poção mágica encontrada em uma dungeon";
        p9.opcaoC = "C - Uma missão misteriosa após sobreviver a uma dungeon dupla";
        p9.opcaoD = "D - Um artefato lendário que ele descobre";
        p9.opcaoE = "E - Um desejo concedido por um deus";
        p9.correta = "C";
        p9.escrevaQuestao();
        resposta = p9.leiaResposta();
        if (p9.isCorreta(resposta)) {
            cont++;
        }

        // Décima pergunta
        Questao p10 = new Questao();
        p10.pergunta = "10- Qual é a habilidade principal de Sung Jin-Woo após se tornar mais forte?";
        p10.opcaoA = "A - Controle de sombras";
        p10.opcaoB = "B - Manipulação de fogo";
        p10.opcaoC = "C - Invocação de dragões";
        p10.opcaoD = "D - Velocidade sobre-humana";
        p10.opcaoE = "E - Controle de tempestades";
        p10.correta = "A";
        p10.escrevaQuestao();
        resposta = p10.leiaResposta();
        if (p10.isCorreta(resposta)) {
            cont++;
        }

        // Décima primeira pergunta
        Questao p11 = new Questao();
        p11.pergunta = "11- Qual é o objetivo principal do Sistema que guia Sung Jin-Woo?";
        p11.opcaoA = "A - Torná-lo o caçador mais rico do mundo";
        p11.opcaoB = "B - Prepará-lo para lutar contra os Monarcas";
        p11.opcaoC = "C - Impedir que os Portais sejam abertos";
        p11.opcaoD = "D - Fazer dele o rei das guildas";
        p11.opcaoE = "E - Ajudá-lo a proteger sua irmã";
        p11.correta = "B";
        p11.escrevaQuestao();
        resposta = p11.leiaResposta();
        if (p11.isCorreta(resposta)) {
            cont++;
        }

        // Décima segunda pergunta
        Questao p12 = new Questao();
        p12.pergunta = "12- Qual é o nome da guilda mais poderosa da Coreia do Sul?";
        p12.opcaoA = "A - Hunters";
        p12.opcaoB = "B - Ah-jin";
        p12.opcaoC = "C - Scavenger";
        p12.opcaoD = "D - White Tiger";
        p12.opcaoE = "E - Knights";
        p12.correta = "B";
        p12.escrevaQuestao();
        resposta = p12.leiaResposta();
        if (p12.isCorreta(resposta)) {
            cont++;
        }

        // Décima terceira pergunta
        Questao p13 = new Questao();
        p13.pergunta = "13- Quem é Cha Hae-In?";
        p13.opcaoA = "A - Uma invocadora de dragões";
        p13.opcaoB = "B - Uma caçadora S-rank";
        p13.opcaoC = "C - Uma caçadora C-rank";
        p13.opcaoD = "D - A líder da guilda de caçadores";
        p13.opcaoE = "E - Uma das sombras de Jin-Woo";
        p13.correta = "B";
        p13.escrevaQuestao();
        resposta = p13.leiaResposta();
        if (p13.isCorreta(resposta)) {
            cont++;
        }

        // Décima quarta pergunta
        Questao p14 = new Questao();
        p14.pergunta = "14- Quem é o primeiro monarca que Sung Jin-Woo enfrenta?";
        p14.opcaoA = "A - Antares";
        p14.opcaoB = "B - Baran";
        p14.opcaoC = "C - Ashborn";
        p14.opcaoD = "D - Hochwan";
        p14.opcaoE = "E - Bellion";
        p14.correta = "A";
        p14.escrevaQuestao();
        resposta = p14.leiaResposta();
        if (p14.isCorreta(resposta)) {
            cont++;
        }

        // Décima quinta pergunta
        Questao p15 = new Questao();
        p15.pergunta = "15- Como termina a história de Solo Leveling?";
        p15.opcaoA = "A - Jin-Woo destrói todos os monarcas";
        p15.opcaoB = "B - Jin-Woo se torna o monarca supremo";
        p15.opcaoC = "C - O sistema é destruído";
        p15.opcaoD = "D - Jin-Woo retorna à sua vida normal";
        p15.opcaoE = "E - Jin-Woo se sacrifica para salvar o mundo";
        p15.correta = "B";
        p15.escrevaQuestao();
        resposta = p15.leiaResposta();
        if (p15.isCorreta(resposta)) {
            cont++;
        }

        // Cálculo da porcentagem
        double porcentagem = ((double) cont / 15.0) * 100;
        System.out.println("Você acertou " + porcentagem + "%");
        System.out.println("De 15 questões, você acertou " + cont + ".");
    }
}

