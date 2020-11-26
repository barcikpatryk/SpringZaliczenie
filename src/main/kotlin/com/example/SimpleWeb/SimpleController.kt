package com.example.SimpleWeb

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class SimpleController {


    @RequestMapping("")
    fun getHome(model: Model):String{
        model.addAttribute("uczen",Student("Patryk","Barcik"))
        return "home"
    }
    @RequestMapping("index")
    fun getInfo(model: Model):String{
        model.addAttribute("student",Student("Patryk","Barcik"))
        model.addAttribute("name","Patryk")
        model.addAttribute("surname","Barcik")
        return "index"
    }


}
