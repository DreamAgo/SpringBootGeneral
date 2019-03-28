package cn.loverot.demo.controller;

import cn.loverot.demo.bean.User;
import cn.loverot.demo.custom.SortMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class VauleController {

    @RequestMapping("/vaule")
    public Object hello(Model mv){
        //取值
        mv.addAttribute("intVar",100);
        mv.addAttribute("longVar",100000000L);
        mv.addAttribute("stringVar","我是一个字符串");
        mv.addAttribute("doubleVar",1.57d);
        mv.addAttribute("booleanVar",true);
        mv.addAttribute("dateVar",new Date(new java.util.Date().getTime()));
       //逻辑
        mv.addAttribute("a",100);
        //对象
        User user=new User();
        user.setAge(21);
        user.setName("小明");
        mv.addAttribute("user",user);
        //集合
        List list=new ArrayList();
        list.add("Java");
        list.add("C++");
        list.add("C#");
        mv.addAttribute("listVar",list);
        //map
        Map map=new HashMap();
        map.put("Java","Hello Java!");
        map.put("C++","Hello C++!");
        map.put("C#","Hello C#!");
        mv.addAttribute("mapVar",map);
        return mv;
    }
    @RequestMapping("/hight")
    public Object hight(Model mv)
    {
        mv.addAttribute("sort",new SortMethod());
        return mv;
    }
}
