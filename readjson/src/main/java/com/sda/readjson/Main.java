package com.sda.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

        Student[] students = new Student[0];
        try {
            students = objectMapper.readValue(new File("person.readjson"), Student[].class);
            List<Student> studentList1= Arrays.asList(students);
            System.out.println(studentList1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
