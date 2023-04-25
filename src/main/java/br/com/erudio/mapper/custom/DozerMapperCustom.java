package br.com.erudio.mapper.custom;

import br.com.erudio.data.vo.v2.PersonVO2;
import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DozerMapperCustom {

    public PersonVO2 toVO2(Person person){
        PersonVO2 vo = new PersonVO2();
        vo.setId(person.getId());
        vo.setFirstName(person.getFirstName());
        vo.setLastName(person.getLastName());
        vo.setAddress(person.getAddress());
        vo.setGender(person.getGender());
        vo.setBirthday(new Date());

        return vo;
    }

    public Person toEntity(PersonVO2 vo){
        Person person = new Person();
        person.setId(vo.getId());
        person.setFirstName(vo.getFirstName());
        person.setLastName(vo.getLastName());
        person.setAddress(vo.getAddress());
        person.setGender(vo.getGender());
        // person.setBirthday(new Date());

        return person;
    }

}
