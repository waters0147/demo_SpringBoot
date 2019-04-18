package com.example.demo.controller;

import com.example.demo.model.activityModel;
import com.example.demo.repository.activityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ActivityController {

    @Autowired
    private activityRepository repository;


    @RequestMapping(value = "/activity", method = {RequestMethod.GET})
    public String curActivity(Model model) {
        model.addAttribute("bgPath", "image/bg.jpeg");
        model.addAttribute("activities",repository.findAll());
        return "curActivity";
    }

    @GetMapping("/activity/add")
    public String addActivityForm(Model model) {
        model.addAttribute("bgPath", "image/bg.jpeg");
        model.addAttribute("activityModelJPA", new activityModel());
        return "addActivityForm";
    }

    @PostMapping("/activity/add")
    public String addActivity(@ModelAttribute activityModel activity) {
        activityModel newActivity = new activityModel();
        newActivity.setName(activity.getName());
        newActivity.setLocation(activity.getLocation());
        newActivity.setStart_time(activity.getStart_time());
        newActivity.setEnd_time(activity.getEnd_time());
        //newActivity.setOwner(activity.getOwner());
        newActivity.setOwner("Amy");
        newActivity.setStart_sign_time(activity.getStart_sign_time());
        newActivity.setEnd_sign_time(activity.getEnd_sign_time());
        newActivity.setContent(activity.getContent());
        newActivity.setLimit_num(activity.getLimit_num());
        repository.save(newActivity);
        return "redirect:/activity/ilaunch";
    }

    @RequestMapping("/activity/ilaunch")
    public String ilaunch(Model model) {
        model.addAttribute("bgPath", "image/bg.jpeg");
        model.addAttribute("activities",repository.findByOwner("Amy"));
        return "ilaunch";
    }

    @RequestMapping("/activity/ijoin")
    public ModelAndView ijoin() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("ijoin");
        return modelAndView;
    }
}
