package com.moringaschool;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    public void AllSquadsAreCorrectlyReturned_true() {
        Squad squad = new Squad(1, "Marvel", 1);
        Squad otherSquad = new Squad(1, "Marvel", 2);
        assertEquals(2, Squad.getAll().size());
    }

    @Test
    public void AllHSquadsContainsAllSquads_true() {
        Squad squad = new Squad(1, "Marvel", 1);
        Squad otherSquad = new Squad(1, "Marvel", 2);
        assertTrue(Squad.getAll().contains(squad));
        assertTrue(Squad.getAll().contains(otherSquad));
    }
}