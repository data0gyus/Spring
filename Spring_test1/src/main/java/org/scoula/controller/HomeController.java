package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HomeController {

    /*
     * 컨트롤러 메서드에 필요한 객체를 매개변수로 작성해두면
     * Spring Container가 Argument Resolver를 이용해서
     * 1) 해당 Bean 존재하면 주입
     * 2) 없으면 새로운 Bean을 생성해서 주입
    */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title","Spring 2일차");
        log.info("================> HomController /");
        return "index"; // View의 이름
    }
}
