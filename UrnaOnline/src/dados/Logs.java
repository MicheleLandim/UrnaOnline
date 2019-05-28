package dados;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "log")
public class Logs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String cod_titulo;
	@Column
	private int cod_detalhe;
	@Column
	private String detalhe;
	@Column
	private int nivel;
	@Column
	private Date data;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCod_titulo() {
		return cod_titulo;
	}

	public void setCod_titulo(String cod_titulo) {
		this.cod_titulo = cod_titulo;
	}

	public int getCod_detalhe() {
		return cod_detalhe;
	}

	public void setCod_detalhe(int cod_detalhe) {
		this.cod_detalhe = cod_detalhe;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}