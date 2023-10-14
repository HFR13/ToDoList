package br.com.rocketseat.todolist.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRoute")
public class firstController {

        @GetMapping("/firstMethod")
        public String firstMensage(){

            return "Teste";
        }
    
}
