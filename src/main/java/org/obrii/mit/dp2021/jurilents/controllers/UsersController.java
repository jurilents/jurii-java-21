package org.obrii.mit.dp2021.jurilents.controllers;

import org.obrii.mit.dp2021.jurilents.entities.User;
import org.obrii.mit.dp2021.jurilents.repositories.UsersRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/Lab6")
public class UsersController {

    @Autowired
    UsersRepository repository;

    @GetMapping("/add")
    public String addPage(User user) {
        return "add-user";
    }

    @PostMapping("/add")
    public String add(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }
        this.repository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/edit")
    public String adeditPage(User user) {
        return "add-user";
    }

    @PostMapping("/edit")
    public String edit(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "edit-user";
        }
        this.repository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/")
    public String show(Model model) {
        model.addAttribute("users", this.repository.findAll());
        return "index";
    }
}
