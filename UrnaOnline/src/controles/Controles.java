package controles;

import dados.Candidatos;
import dados.Login;
import dados.Validacao;
import dao.LoginDAO;
import dao.ValidacaoDAO;
import dao.VotacaoDAO;

public class Controles {
	public static String cod_titulo_global;
	public static int nivel_global;

	public int votacao(int numero) {
		Candidatos can = new Candidatos();
		can.setNumero(numero);

		VotacaoDAO voDAO = new VotacaoDAO();
		int retorno = voDAO.computaVoto(can);
		return retorno;
	}

	public int ValidarLogin(String cod_titulo, String senha, String permiteVotar, int nivel) {
		Login lo = new Login();
		lo.setCod_titulo(cod_titulo);
		cod_titulo_global = cod_titulo;
		lo.setSenha(senha);
		lo.setNivel(nivel);
		nivel_global = nivel;
		lo.setPermiteVotar(permiteVotar);

		LoginDAO loDao = new LoginDAO();
		int retorno = loDao.verificaLogin(lo);
		return retorno;
	}

	public int validarUsuario(int titulo, String zona, String secao, String permite_votar) {
		Validacao va = new Validacao();
		va.setTitulo(titulo);
		va.setZona(zona);
		va.setSecao(secao);
		va.setPermite_votar(permite_votar);

		ValidacaoDAO vaDao = new ValidacaoDAO();
		int retorno = vaDao.validaUsuario(va);
		return retorno;

	}

}
