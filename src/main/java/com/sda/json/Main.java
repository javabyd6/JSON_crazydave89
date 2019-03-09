package com.sda.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("Dawid","Kamasz", 29);
        Person person2= new Person("Marcin","Rozwor", 32);
        Person person3= new Person("Daniel","Worek", 34);
        Person person4= new Person("Michal","Pilak", 19);

        //ZADANIE 1
       /* ObjectMapper objectMapper= new ObjectMapper();
        String personStr = null;
        try {
            personStr = objectMapper.writeValueAsString(person1);
            System.out.println(personStr);
            // do pliku person.json zapisac wynikowego stringa
            Files.write(Paths.get("person.json"),personStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       //ZADANIE 2
        /*List<Person> personList= new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        ObjectMapper objectMapper= new ObjectMapper();
        try {
            String asd = objectMapper.writeValueAsString(personList);
            System.out.println(personList);
            Files.write(Paths.get("person.json"),asd.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }*/


        //ZADANIE 3
        Address address= new Address("Bydgszocz","Grunwaldzka");
        Student student1= new Student(person1.name,person1.lastName,address);
        Student student2= new Student(person2.name,person2.lastName,address);
        Student student3= new Student(person3.name,person3.lastName,address);
        ObjectMapper objectMapper= new ObjectMapper();
        List<Student> studentList= new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        try {
            String result =objectMapper.writeValueAsString(studentList);
            Files.write(Paths.get("person.json"),result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
