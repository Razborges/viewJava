package pswebproj.control;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pswebproj.Aluno;

@Controller
@RequestMapping("/")
public class ViewController {

	@RequestMapping("/view")
	public ModelAndView renderView(){
		String data = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Aluno aluno = new Aluno("Rafael", "Atividade1", "2", "demodoc.pdf", "1");
		String extensao = aluno.getArquivo().substring(aluno.getArquivo().lastIndexOf("."), aluno.getArquivo().length());
		
		int typeFile;
		
		if (extensao.equals(".jpg") || extensao.equals(".png")) {
			typeFile = 0;
		}
		else if (extensao.equals(".pdf")) {
			typeFile = 1;
		}
		else {
			typeFile = -1;
		}
		
		ModelAndView mv = new ModelAndView("/index.jsp");
		mv.addObject("typeFile", typeFile);
		mv.addObject("data", data);
		mv.addObject("aluno", aluno);
		return mv;
	}
}
