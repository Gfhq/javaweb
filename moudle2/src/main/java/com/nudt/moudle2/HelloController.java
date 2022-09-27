package com.nudt.moudle2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//http://localhost:8080/hello?名=值&名=值

@Controller //注解 由springboot提供 由这个标注的类是控制器类
public class HelloController { //控制器类 控制web的输入与输出

    @RequestMapping("/hello")  //控制ui路径跟方法的对应
    @ResponseBody
    String hi(String name) {
        return "hello"+name;
    }

    @RequestMapping("/bye")  //控制ui路径跟方法的对应
    @ResponseBody
    String bye() {
        return "bye,bye";
    }
}
