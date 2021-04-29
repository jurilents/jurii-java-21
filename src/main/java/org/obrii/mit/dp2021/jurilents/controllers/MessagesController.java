package org.obrii.mit.dp2021.jurilents.controllers;

import java.util.List;

import org.obrii.mit.dp2021.jurilents.domain.Embedded;
import org.obrii.mit.dp2021.jurilents.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MessagesController {

    private static final String URL = "http://dp2021.mit.obrii.org/yurii-yermakov-project/Lab7-service/students";

    private final RestTemplate restTemplate;


    @Autowired
    public MessagesController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getMessage")
    public String getFormData(Model model) {
        Embedded messageEntity = restTemplate.getForObject(URL, Embedded.class);
        List<Student> list = messageEntity.getListOfStudents().getStudentList();
        model.addAttribute("students", list);
        return "index";
    }

    @PostMapping("/update")
    public String updateData(@RequestParam(name = "name") String name, @RequestParam(name = "age") String age, @RequestParam(name = "url") String url, Model model) {
        restTemplate.put(url, new Student(name, Integer.parseInt(age)));
        Embedded messageEntity = restTemplate.getForObject(URL, Embedded.class);
        List<Student> list = messageEntity.getListOfStudents().getStudentList();
        model.addAttribute("students", list);
        return "index";
    }

    @PostMapping("/delete")
    public String delData(@RequestParam(name = "url") String url, Model model) {
        restTemplate.delete(url);
        return getFormData(model);
    }

    @PostMapping("/post")
    public String postData(@RequestParam(name = "name") String name, @RequestParam(name = "age") String age, Model model) {
        restTemplate.postForObject(URL, new Student(name, Integer.parseInt(age)), Student.class);
        return getFormData(model);
    }

}
