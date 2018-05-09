package springbootdemo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SpringBootDemo {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Moja pierwsza aplikacja w spring boot";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootDemo.class, args);
    }
}
