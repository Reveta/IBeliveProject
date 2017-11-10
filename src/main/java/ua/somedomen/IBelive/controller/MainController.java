package ua.somedomen.IBelive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.somedomen.IBelive.entity.ListURL;
import ua.somedomen.IBelive.service.ListURLService;


@Controller
public class MainController {

//    String qwe = "Roman the best";

    @Autowired
    private ListURLService listURLService;

    @GetMapping("/")
    public String index(Model model) {
//        model.addAttribute("URL", new ListURL());
//        model.addAttribute("ABC", qwe);
        model.addAttribute("URLInfo", listURLService.findALL());
        return "index";
    }

    @PostMapping("/saveURLforVideo")
    public String saveURLforVideo(@RequestParam("url") String url,
                                  @RequestParam("nameOfVideo") String nameOfVideo,
                                  @RequestParam("textForVideo") String textOfVideo) {
        System.out.println("Hello MainController");
        listURLService.saveURLforVideo(new ListURL(nameOfVideo, textOfVideo, url));
        return "redirect:/";
    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }
}