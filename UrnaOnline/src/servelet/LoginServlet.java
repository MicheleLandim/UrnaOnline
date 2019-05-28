package servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controles.Controles;
import controles.LogController;
import exception.InvalidUserException;
import funcoesGeral.DetalhesLogs;
import funcoesGeral.SenhaEleitor;

@WebServlet("/LoginServelet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	@SuppressWarnings("static-access")
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = null;

		String cod_titulo = request.getParameter("txtCOD_TITULO");
		String senha = request.getParameter("txtSENHA");
		String permiteVotar = "S";

		LogController alu = new LogController();
		DetalhesLogs det = new DetalhesLogs();

		int nivel = Integer.parseInt(request.getParameter("opcao"));
		Controles lc = new Controles();
		int retorno = lc.ValidarLogin(cod_titulo, senha, permiteVotar, nivel);

		SenhaEleitor senhaParaGerar = new SenhaEleitor();

		if (retorno == 1) {
			if (nivel == 1) {
				view = request.getRequestDispatcher("paginaEleitor.jsp");
				alu.salvar(cod_titulo, det.cod_detalhe_login, det.detalhe_login, nivel);
			} else if (nivel == 2) {
				senhaParaGerar.gerarSenha();
				view = request.getRequestDispatcher("paginaMesario.jsp");
				alu.salvar(cod_titulo, det.cod_detalhe_login, det.detalhe_login, nivel);

			} else if (nivel == 3) {
				view = request.getRequestDispatcher("paginaChefe.jsp");
				alu.salvar(cod_titulo, det.cod_detalhe_login, det.detalhe_login, nivel);
			} else
				throw new InvalidUserException("Por gentileza informe seu nível.");
		} else {
			alu.salvar(cod_titulo, det.cod_detalhe_erro, det.detalhe_erro, nivel);
			throw new InvalidUserException("Eleitor não cadastrado na base de dados, ou sem permissão para votar");
		}
		view.forward(request, response);
	}

}
