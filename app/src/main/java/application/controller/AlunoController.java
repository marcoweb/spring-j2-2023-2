package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Aluno;
import application.model.AlunoRepository;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepo;

    @RequestMapping("/list")
    public String list(Model ui) {
        ui.addAttribute("alunos", alunoRepo.findAll());
        return "/aluno/list";
    }

    @RequestMapping("/insert")
    public String insert() {
        return "/aluno/insert";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(
        @RequestParam("nome") String nome,
        @RequestParam("idade") int idade
    ) {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setIdade(idade);

        alunoRepo.save(aluno);
        return "redirect:/aluno/list";
    }
}
