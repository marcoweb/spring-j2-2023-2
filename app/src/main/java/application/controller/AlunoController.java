package application.controller;

import java.util.Optional;

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

    @RequestMapping("/update")
    public String update(
        @RequestParam("id") int id,
        Model ui
    ) {
        Optional<Aluno> resultado = alunoRepo.findById(id);

        if(resultado.isPresent()) {
            ui.addAttribute("aluno", resultado.get());
            return "/aluno/update";
        }

        return "redirect:/aluno/list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(
        @RequestParam("id") int id,
        @RequestParam("nome") String nome,
        @RequestParam("idade") int idade
    ) {
        Optional<Aluno> resultado = alunoRepo.findById(id);

        if(resultado.isPresent()) {
            resultado.get().setNome(nome);
            resultado.get().setIdade(idade);

            alunoRepo.save(resultado.get());
        }
        
        return "redirect:/aluno/list";
    }
}
