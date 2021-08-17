package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private static SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date data_aniversario;

	public Cliente() {
	}

	public Cliente(String nome, String email, Date data_aniversario) {
		this.nome = nome;
		this.email = email;
		this.data_aniversario = data_aniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_aniversario() {
		return data_aniversario;
	}

	@Override
	public String toString() {
		return  nome +","+ email+","+ sdf.format(data_aniversario) ;
	}

	
}
