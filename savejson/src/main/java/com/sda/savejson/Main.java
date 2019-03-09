package com.sda.savejson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper= new ObjectMapper();
        Person person1= new Person("Dawid","Kamasz", 29);
        Person person2= new Person("Marcin","Rozwor", 32);
        Person person3= new Person("Daniel","Worek", 34);
        Person person4= new Person("Michal","Pilak", 19);
        Address address= new Address("Bydgszocz","Grunwaldzka");
        Student student1= new Student(person1.name,person1.lastName,address);
        Student student2= new Student(person2.name,person2.lastName,address);
        Student student3= new Student(person3.name,person3.lastName,address);
        List<Student> studentList= new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        try {
            String result =objectMapper.writeValueAsString(studentList);
            Files.write(Paths.get("person.savejson"),result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
