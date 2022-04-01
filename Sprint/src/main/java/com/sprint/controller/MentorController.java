package com.sprint.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sprint.enums.Gender;
import com.sprint.model.Mentor;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Ozzi", "Ozburn", 35, Gender.MALE));
        mentorList.add(new Mentor("Izy", "Ontario", 35, Gender.FEMALE));
        model.addAttribute("mentors",mentorList);
        return "mentor/mentor-list";
    }

}
