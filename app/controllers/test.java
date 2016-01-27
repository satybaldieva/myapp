package controllers;

import play.mvc.Controller;

/**
 * Created by user on 26.01.2016.
 */
public class test extends Controller {

    public static void FirstApp(String name){
        System.out.println(name);
        name = "<strong>Hello2</strong>, " + name;
        render(name);
    }
    }





