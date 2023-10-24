package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.AlunoRepository;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepo;

    @RequestMapping("/list")
    public String list() {
        return "/aluno/list";
    }
}
