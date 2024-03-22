package org.astro.begopa.restcontroller;

import org.astro.begopa.dto.BegopaDto;
import org.astro.begopa.service.BegopaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api")
@Log4j2
@CrossOrigin
public class BegopaRestController {

    @Autowired
    BegopaService begopaService;

    @GetMapping("/begopa/main")
    public BegopaDto main(BegopaDto begopaDto){

        try {
            
            log.info("레스트 시작 합니다~~");
            begopaDto = begopaService.getFoodName();

        } catch (Exception e) {
            log.info("error~~");
        } finally {
            
        }


        return begopaDto;

    }

}
