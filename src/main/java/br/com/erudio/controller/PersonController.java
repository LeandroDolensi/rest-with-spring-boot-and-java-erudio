package br.com.erudio.controller;


import br.com.erudio.model.Person;
import br.com.erudio.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    @RequestMapping(value="/{id}",
                    method=RequestMethod.GET,
                    produces= MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value="id") String id){
        return service.findById(id);
    }

}