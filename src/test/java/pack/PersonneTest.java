package pack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

    @Test
    void vieillir() {
        Personne p = new Personne("luc",0);
        p.vieillir();
        assertEquals(1,p.getAge());
    }
}
