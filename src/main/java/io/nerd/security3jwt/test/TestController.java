package io.nerd.security3jwt.test;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping
    public ResponseEntity<String>sayHi(){
        return ResponseEntity.ok("welcome you did it legally");
    }

}
