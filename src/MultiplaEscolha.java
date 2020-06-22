
public class MultiplaEscolha extends QuestaoSimples {

	protected String alt1;
	protected String alt2;
	protected String alt3;
	protected String alt4;

	public MultiplaEscolha(String pergunta, String resposta, String alt1, String alt2, String alt3, String alt4) {
		super(pergunta, resposta);
		this.alt1 = alt1;
		this.alt2 = alt2;
		this.alt3 = alt3;
		this.alt4 = alt4;
	}

	public String getAlt1() {
		return alt1;
	}

	public void setAlt1(String alt1) {
		this.alt1 = alt1;
	}

	public String getAlt2() {
		return alt2;
	}

	public void setAlt2(String alt2) {
		this.alt2 = alt2;
	}

	public String getAlt3() {
		return alt3;
	}

	public void setAlt3(String alt3) {
		this.alt3 = alt3;
	}

	public String getAlt4() {
		return alt4;
	}

	public void setAlt4(String alt4) {
		this.alt4 = alt4;
	}

	public String aplicarQuestao() {
		return pergunta + "\n" + "A)" + alt1 + "\n" + "B)" + alt2 + "\n" + "C)"+alt3 + "\n" +"D)"+alt4; 

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

	