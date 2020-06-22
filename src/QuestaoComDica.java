
public class QuestaoComDica extends QuestaoSimples {

	protected String dica;

	public QuestaoComDica(String pergunta, String resposta, String dica) {
		super(pergunta, resposta);
		this.dica = dica;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}

	public String aplicarQuestao() {
		return pergunta + "\n" + "Dica: " + dica;

	}

	public boolean corrigir(String respostaAluno) {

		if (respostaAluno == this.resposta) {
			System.out.println("Você acertou");
			return true;

		} else {
			System.out.println("Você errou");
			return false;

		}

	}

}
