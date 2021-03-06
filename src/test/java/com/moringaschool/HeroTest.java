package com.moringaschool;

import org.junit.After;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    public void AllHeroesAreCorrectlyReturned_true() {
        Hero hero = new Hero("John", 22, "Very Strong", "cant run", new Squad(1, "Avengers", 1));
        Hero otherHero = new Hero("Kevin", 30, "Very Intelligent", "cries alot", new Squad(1, "Avengers", 1));
        assertEquals(2, Hero.getAll().size());
    }

    @Test
    public void AllHeroesContainsAllHeroes_true() {
        Hero hero = new Hero("John", 22, "Very Strong", "cant run", new Squad(1, "Avengers", 1));
        Hero otherHero = new Hero("Kevin", 30, "Very Intelligent", "cries alot", new Squad(1, "Avengers", 1));
        assertTrue(Hero.getAll().contains(hero));
        assertTrue(Hero.getAll().contains(otherHero));
    }

}