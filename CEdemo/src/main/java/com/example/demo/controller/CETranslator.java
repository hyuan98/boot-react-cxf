package com.example.demo.controller;

import com.example.demo.CEutils.ArrayOfString;
import com.example.demo.CEutils.TranslatorWebService;
import com.example.demo.CEutils.TranslatorWebServiceSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
public class CETranslator{
    //获取服务类
    @Autowired
    private TranslatorWebService translatorWebService;

//    @RequestMapping("/translation")
//    public String  valueoff(String valueoff, Model model) {
//     TranslatorWebServiceSoap translatorWebServiceSoap = translatorWebService.getTranslatorWebServiceSoap();
//     // 调用方法：中英文双向翻译
//     ArrayOfString translatorString = translatorWebServiceSoap.getEnCnTwoWayTranslator(valueoff);
//     System.out.println(translatorString.getString());
//     model.addAttribute("value",translatorString.getString()  );
//     return "CE.html";
// }


    @GetMapping("/translation")
    public List<String> valueOff(String valueOff){
        TranslatorWebServiceSoap translatorWebServiceSoap = translatorWebService.getTranslatorWebServiceSoap();
        // 调用方法：中英文双向翻译
        ArrayOfString translatorString = translatorWebServiceSoap.getEnCnTwoWayTranslator(valueOff);
        System.out.println(translatorString.getString());
        return translatorString.getString();
    }
}
