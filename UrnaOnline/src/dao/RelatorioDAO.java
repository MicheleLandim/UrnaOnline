package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connectors.CriarConexao;
import dados.Candidatos;

public class RelatorioDAO extends CriarConexao {

	public List<Candidatos> getLista() {
		try {
			List<Candidatos> candidatos = new ArrayList<Candidatos>();
			this.stmt = this.getConnection().createStatement();
			this.rs = this.stmt.executeQuery("SELECT * FROM CANDIDATOS");

			while (rs.next()) {
				Candidatos candidato = new Candidatos();
				candidato.setNumero(rs.getInt("NUMERO"));
				candidato.setNome(rs.getString("NOME"));
				candidato.setVotos(rs.getInt("VOTOS"));

				candidatos.add(candidato);
			}
			rs.close();
			stmt.close();
			return candidatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
