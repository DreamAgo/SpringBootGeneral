package cn.loverot.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HelloController {
    @RequestMapping("/hello")
    public Object hello(Model mv){
       // m.addAttribute()
       // ModelAndView mv=new ModelAndView();
        mv.addAttribute("hello","hello world!!");
        return mv;
    }
}
