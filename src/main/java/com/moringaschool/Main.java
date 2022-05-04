package com.moringaschool;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Hero hero1 = new Hero("Superman", 99, "Flying", "Not invincible");
            Hero hero2 = new Hero("Batman", 80, "Can't see", "Allergic to light");

            Map<String, Object> model = new HashMap<>();

            request.session().attribute("heroes", Hero.getAll());

            model.put("heroes", request.session().attribute("heroes"));

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "addHero.hbs");
        }, new HandlebarsTemplateEngine());
    }
}