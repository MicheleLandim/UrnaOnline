package funcoesGeral;

import java.util.UUID;

public class SenhaEleitor {

	public static String senhaGeradaMet;

	public static String gerarSenha() {
		UUID uuid = UUID.randomUUID();
		String myRandom = uuid.toString();
		senhaGeradaMet = myRandom.substring(0, 6);

		return senhaGeradaMet;

		
	}

}
