package dao;

import connectors.CriarConexao;
import dados.Login;

public class LoginDAO extends CriarConexao {

	public int verificaLogin(Login l) {
		int nivelSelect = 0;
		int nivelbotao = 0;
		String permiteVotar = null;

		try {
			this.stmt = this.getConnection().createStatement();
			this.rs = this.stmt
					.executeQuery("SELECT *, NIVEL as nivel, PERMITE_VOTAR as permite FROM LOGIN_USUARIO WHERE"
							+ " COD_TITULO = '" + l.getCod_titulo() + "' AND SENHA = '" + l.getSenha() + "'");

			if (rs.next()) {
				nivelSelect = rs.getInt("nivel");
				nivelbotao = l.getNivel();
				permiteVotar = rs.getString("permite");
				System.out.println("permite? " + permiteVotar);
				if (nivelbotao <= nivelSelect && permiteVotar.equals("S"))
					return 1;
				else
					return 0;
			} else {
				return 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
