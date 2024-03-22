package org.astro.begopa.controller;

import org.astro.begopa.dto.BegopaDto;
import org.astro.begopa.service.BegopaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("")
@Log4j2
public class BegopaController {

    @Autowired
    BegopaService begopaService;

    @GetMapping("/begopa/main")
    public void main(Model model){

        try {
            
            log.info("시작 합니다~~");
            
            BegopaDto begopaDto = begopaService.getFoodName();
            model.addAttribute("dto", begopaDto);

        } catch (Exception e) {
            log.info("error~~");
        }




    }

}
