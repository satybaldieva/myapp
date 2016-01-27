package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

//    public static void index() {
//        String name = "Timur";
//
//        List<String> students = new ArrayList<String>();
//        students.add("Student1");
//        students.add("Student2");
//        students.add("Student3");
////        for (String student : students) {
////        }
//
//        render(name, students);
//    }
//
//    public static void save(String name, String surname) {
//        System.out.println(name+" "+surname);
//    }

    public static void savePerson(Person person) {
        System.out.println(person.name+" "+person.surname + " "+person.middleName);
        person.name = "Git User Name";
        render(person);
    }
}