package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    public String insert() {
        return "/aluno/insert";
    }
}
