package dao;

import connectors.CriarConexao;
import dados.Candidatos;

public class VotacaoDAO extends CriarConexao {

	public int computaVoto(Candidatos c) {
		int voto = 0;
		int qtd = 0;

		try {
			this.stmt = this.getConnection().createStatement();
			this.rs = this.stmt
					.executeQuery("SELECT VOTOS as quantidade FROM CANDIDATOS WHERE NUMERO = '" + c.getNumero() + "'");

			if (rs.next()) {
				qtd = rs.getInt("quantidade");
				voto = qtd + 1;
			}

			int linhas = this.stmt.executeUpdate(
					"UPDATE CANDIDATOS SET VOTOS = '" + voto + "' WHERE NUMERO ='" + c.getNumero() + "'");
			if (linhas > 0)
				return 1;
			else
				return 0;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;

	}
}
