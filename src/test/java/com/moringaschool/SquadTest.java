package com.moringaschool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    public void AllSquadsAreCorrectlyReturned_true() {
        Squad squad = new Squad("John", 22, "Very Strong", "cant run");
        Squad otherSquad = new Squad("Kevin", 30, "Very Intelligent", "cries alot");
        assertEquals(2, Squad.getAll().size());
    }

    @Test
    public void AllHSquadsContainsAllSquads_true() {
        Squad squad = new Squad("John", 22, "Very Strong", "cant run");
        Squad otherSquad = new Squad("Kevin", 30, "Very Intelligent", "cries alot");
        assertTrue(Squad.getAll().contains(squad));
        assertTrue(Squad.getAll().contains(otherSquad));
    }
}