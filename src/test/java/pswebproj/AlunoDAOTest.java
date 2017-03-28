package pswebproj;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AlunoDAOTest {
	
	@Autowired
	AlunoDAO dao;
	
	@Test
	public void verificarAluno(){
		Aluno aluno1 = new Aluno("Rafael", "Atividade1", "2", "demodoc.pdf", "1");
		System.out.println(aluno1.getNome());
		dao.save(aluno1);
		List<Aluno> alunos = dao.findAll();
		for (Iterator<Aluno> iterator = alunos.iterator(); iterator.hasNext();) {
			Aluno aluno = (Aluno) iterator.next();
			System.out.println(aluno.getId());
			System.out.println(aluno.getNome());
		}
		//System.out.println(aluno2.getNome());
		//assertEquals(aluno1, aluno2);
	}
	
}
