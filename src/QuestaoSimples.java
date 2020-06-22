
import java.util.Scanner;
public class QuestaoSimples {
	
	Scanner teclado = new Scanner(System.in);
	
	protected String pergunta;
	protected String resposta;

	public QuestaoSimples(String pergunta, String resposta) {

		this.pergunta = pergunta;
		this.resposta = resposta;

	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String aplicarQuestao() {
		return pergunta;

	}

	public boolean corrigir(String respostaAluno) {
		
		System.out.println("Digite a resposta");
		respostaAluno = teclado.nextLine();
		

		if (respostaAluno == this.resposta) {
			System.out.println("Você acertou");
			return true;

		} else {
			System.out.println("Você errou");
			return false;

		}

	}

}
