//package ua.somedomen.IBelive.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import ua.somedomen.IBelive.service.ListURLService;
//
//@Controller
//public class PagesController {
//
//    @Autowired
//    private ListURLService listURLService;
//
//    Model model;
//
//    @GetMapping("/")
//    public String index(Model qwe) {
//        qwe.addAttribute("URLInfo", listURLService.findALL());
////        model.addAttribute("URL", new ListURL());
////        model.addAttribute("ABC", qwe);
////        model.addAttribute("URLInfo", listURLService.findALL());
//        return "index";
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    @GetMapping("/admin")
//    public String admin() {
//        model.addAttribute("URLInfo", listURLService.findALL());
//        return index(model);
//    }
//}
