package pl.coderslab.unittestskrajeew05.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getName() {
        User u = new User();
        u.setName("ala");

        assertEquals("ala", u.getName());
    }

    @Test
    public void setName() {
    }
}