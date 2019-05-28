package controles;

import org.hibernate.Session;

import connectors.ConexaoHibernate;
import dados.Logs;
import funcoesGeral.DataAtual;

public class LogController extends ConexaoHibernate {

	private Session session;

	public LogController() {
		this.session = new ConexaoHibernate().getConnection();
	}

	public void salvar(String cod_titulo, int cod_detalhe, String detalhe, int nivel) {
		DataAtual da = new DataAtual();
		Logs al = new Logs();
		al.setCod_titulo(cod_titulo);
		al.setCod_detalhe(cod_detalhe);
		al.setDetalhe(detalhe);
		al.setNivel(nivel);
		al.setData(da.getPegaDataAtual());
		session.save(al);
		session.getTransaction().commit();

		System.out.println(da.getPegaDataAtual());

	}

}