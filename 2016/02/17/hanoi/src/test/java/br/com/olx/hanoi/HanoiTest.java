package br.com.olx.hanoi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bernardo.carneiro on 2/17/16.
 */
public class HanoiTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testMoveFromAtoB() throws Exception {

        Hanoi h = new Hanoi(7);
        h.moveFromTo(h.getPinA(),h.getPinB());
        Assert.assertEquals(h.getPinA().size(),6);
        Assert.assertEquals(h.getPinB().size(),1);

    }

    /*@Test
    public void testMoveFromUsingTo() throws Exception {
        Hanoi hanoi = new Hanoi(7);
    }*/

    @Test
    public void testCreate() throws Exception {
        Hanoi hanoi = new Hanoi(7);
        assertEquals(hanoi.getPinA().size(), 7);
        assertEquals(hanoi.getPinB().size(), 0);
        assertEquals(hanoi.getPinC().size(), 0);

        Disc d1 = hanoi.getPinA().pop();

        Assert.assertEquals(d1.getSize(), 1);
    }



}
