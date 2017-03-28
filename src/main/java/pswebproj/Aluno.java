package pswebproj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String atividade;
	private String cargaHoraria;
	private String arquivo;
	private String status;
	
	public Aluno(){
		
	}

	public Aluno(String nome, String atividade, String carga_horaria, String arquivo, String status) {
		super();
		this.nome = nome;
		this.atividade = atividade;
		this.cargaHoraria = carga_horaria;
		this.arquivo = arquivo;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		
}
