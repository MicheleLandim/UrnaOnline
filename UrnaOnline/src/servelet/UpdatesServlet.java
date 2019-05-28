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

@WebServlet("/updateServelet")
public class UpdatesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdatesServlet() {
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
		RequestDispatcher view;

		int retorno = 0;

		String comando = request.getParameter("txtZONA");
		Controles cont = new Controles();

		LogController alu = new LogController();

		DetalhesLogs det = new DetalhesLogs();

		if (comando == null) {
			int numero = Integer.parseInt(request.getParameter("txtNUMERO_CANDIDATO"));
			retorno = cont.votacao(numero);

			if (retorno == 1) {
				alu.salvar(cont.cod_titulo_global, det.cod_detalhe_voto, det.detalhe_voto, cont.nivel_global);
				view = request.getRequestDispatcher("login.jsp");
			} else {
				alu.salvar(cont.cod_titulo_global, det.cod_detalhe_erro, det.detalhe_erro, cont.nivel_global);
				throw new InvalidUserException("Ocorreu um erro, informe-o ao mesário");
			}
		} else {

			alu.salvar(cont.cod_titulo_global, det.cod_detalhe_mesario, det.detalhe_mesario, cont.nivel_global);

			int titulo = Integer.parseInt(request.getParameter("txtCOD_TITULO"));
			String zona = request.getParameter("txtZONA");
			String secao = request.getParameter("txtSECAO_ELEITORAL");
			String permite = request.getParameter("PERMITE_VOTAR");
			cont.validarUsuario(titulo, zona, secao, permite);
			view = request.getRequestDispatcher("paginaMesario.jsp");
		}

		view.forward(request, response);

	}

}
