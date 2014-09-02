package controllers;

import play.*;
import play.mvc.*;

import views.html.*;
import models.*;

public class Application extends Controller {

    public  static Result index() {
        return ok(views.html.index.render());
    }

     public static Result sayHello(){  
        return ok(views.html.sayHello.render());
    }  
}
