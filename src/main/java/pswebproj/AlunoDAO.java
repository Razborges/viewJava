package pswebproj;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDAO extends JpaRepository<Aluno, Serializable>{
	
	Aluno findOneAlunoByStatus(String status);

}
