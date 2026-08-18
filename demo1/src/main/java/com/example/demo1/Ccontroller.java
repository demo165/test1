package com.example.demo1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Ccontroller {

    @RequestMapping("/demo")
    public String demo1() {
        return "Welcome to the Demo1 application! 🎉";
    }
    
    @GetMapping("/get")
    public String getMethodName() {
        return "👀 Hey there! You just used GET! Here's your data (or maybe just this message 😄).";
    }

    @PostMapping("/post")
    public String postMethodName() {
        return "📝 POST detected! You just created something awesome. High five! 🙌";
    }
    
    @PutMapping("/put")
    public String putMethodName() {
        return "🔄 PUT in action! Updating like a pro. Your data just got a makeover! 💅";
    }

    @DeleteMapping("/del")
    public String deleteMethodName(){
        return "🗑️ DELETE alert! Poof, it's gone! (But not your sense of humor 😜)";
    }

    // @RequestMapping("/dem")
    // public String dems(@RequestParam int num1, @RequestParam int num2) {
    //     return "ans = " + (num1+num2);
    // }
    
}
