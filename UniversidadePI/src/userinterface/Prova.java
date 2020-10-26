package userinterface;

import java.util.ArrayList;
import java.util.Scanner;



import model.QuestaoComDica;
import model.QuestaoDeLacuna;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;

public class Prova {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<QuestaoSimples> questoes;
		questoes = new ArrayList<QuestaoSimples>();
		String resposta;
		int pontuacao =0;
		
		questoes.add(new QuestaoSimples("Quem descobriu o Brasil?","Pedro Alvares Cabral"));
		questoes.add(new QuestaoComDica("Qual a cor do cavalo Branco do Napoelao","Marrom","Cuidado não é Branco"));
		questoes.add(new QuestaoMultiplaEscolha("Qual a formula da água?","H2O","H20","CO2","H","O2"));
		questoes.add(new QuestaoDeLacuna("O vencedor do jogo foi *Lacuna*","Palmeiras"));
		
		
		for (QuestaoSimples q :questoes) {
			System.out.println(q.aplicarQuestao());
			resposta = teclado.nextLine();
			if(q.corrigir(resposta)) {
				pontuacao++;
			}
			else {
				System.out.println("Errou! a reposta correta é "+q.getResposta());
			}
			
		}
		
		double nota = (double)pontuacao*10/questoes.size();
		System.out.println("Nota: "+nota);
		//System.out.println("Voce acertou: "+pontuacao+"/"+questoes.size());
		
				
	}
}
