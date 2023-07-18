package com.effectivejava.item3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {
    @Test
    public void 리허설() {
        IElvis mockElvis = new MockElvis();
        Concert concert = new Concert(mockElvis);
        concert.perform();
    }
}