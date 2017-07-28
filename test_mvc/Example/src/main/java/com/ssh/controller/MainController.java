package com.ssh.controller;

import com.ssh.repository.PersonRepository;
import com.ssh.service.PersonService;
import com.ssh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ykue on 2017/6/28.
 */
@Controller
public class MainController {

    @Autowired
    private TestService testService;
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){

        return "test";
    }

    @RequestMapping(value = "springTest", method = RequestMethod.GET)
    public String springTest(){
        return "test";
    }

    @RequestMapping(value = "saveperson", method = RequestMethod.GET)
    @ResponseBody
    public String savePerson(){
        personService.savePerson();
        return "success";
    }

}
