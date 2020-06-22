
//import java.util.Scanner;

public class AppUniJava {

	public static void main(String[] args) {

		// Scanner teclado = new Scanner(System.in);

		String respostaAluno = null;
		QuestaoSimples q1;
		MultiplaEscolha q2;
		QuestaoComDica q3;

		q1 = new QuestaoSimples("1+1", "2");
		q2 = new MultiplaEscolha("1+1", "2", "2", "4", "5", "1");
		q3 = new QuestaoComDica("1+1", "2", "Eh um numero par");

		System.out.println(q1.aplicarQuestao());
		System.out.println(q2.aplicarQuestao());
		System.out.println(q3.aplicarQuestao());

		System.out.println(q1.corrigir("2"));
		System.out.println(q2.corrigir("3"));
		System.out.println(q3.corrigir("2"));

	}

}
