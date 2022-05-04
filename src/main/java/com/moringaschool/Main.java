package com.moringaschool;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Hero hero1 = new Hero("Superman", 99, "Flying", "Not invincible", new Squad(1, "Avengers", 1));
            Hero hero2 = new Hero("Batman", 80, "Can't see", "Allergic to light", new Squad(1, "Avengers", 1));

            Map<String, Object> model = new HashMap<String, Object>();

            ArrayList<Hero> heroes = Hero.getAll();

            request.session().attribute("heros", heroes);
            System.out.println(heroes);

            model.put("heroes", request.session().attribute("heroes"));

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "addHero.hbs");
        }, new HandlebarsTemplateEngine());

        post("/add", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            Squad squad = new Squad(Squad.getAll().size(), request.queryParams("squad"), 1);
            Hero newHero = new Hero(name, age, power, weakness, squad);
            request.session().attribute("hero", newHero);
            model.put("hero", newHero);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}