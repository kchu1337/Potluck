package com.example.potluck;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@Controller
public class PotluckController {

    @Autowired
    private PotluckRepository potluckRepository;

    @RequestMapping("/")
    public String loadAdd(Model model){
        model.addAttribute(new PersonFood());
        return "EnterData";
    }

    @PostMapping("/addFood")
    public @ResponseBody String addFood(@ModelAttribute PersonFood personFood, Model model){
        model.addAttribute("personFood", personFood);
        potluckRepository.save(personFood);
        return "Data Added";
    }

    @PostMapping("/seeList")
    public String seeList(Model model){
        Iterable<PersonFood> listOfFood =  potluckRepository.findAll();
        model.addAttribute("listOfFood", listOfFood);
        return "Output";
    }
}
