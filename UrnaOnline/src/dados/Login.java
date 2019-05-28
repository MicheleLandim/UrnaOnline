package dados;

public class Login {

	String cod_titulo;
	String senha;
	String permiteVotar;
	int nivel;

	public String getPermiteVotar() {
		return permiteVotar;
	}

	public void setPermiteVotar(String permiteVotar) {
		this.permiteVotar = permiteVotar;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getCod_titulo() {
		return cod_titulo;
	}

	public void setCod_titulo(String cod_titulo) {
		this.cod_titulo = cod_titulo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
