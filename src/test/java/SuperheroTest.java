import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SuperheroTest {

    Superhero s1;
    Superhero s2;
    Database sdb;
    UserInterface ui;

    @BeforeEach
    void setUp() {
        sdb = new Database();
        UserInterface ui = new UserInterface();

        s1 = new Superhero("paul", "superpaul", 2000, true, "spise", 50);
        s2 = new Superhero("line", "superline", 2005, false, "danse", 70);

        /* sdb.getSuperheroArrayList().add(s1);
        sdb.getSuperheroArrayList().add(s2); */

        sdb.getSuperheroArrayList().addAll(List.of(s1, s2));
    }

    @Test
    void testTilfoej() {
        int expectedSize = 3;
        sdb.tilfoejSuperhelt("jesper", "superjesper", 2005, true, "spise", 50);
        assertEquals(expectedSize, sdb.getSuperheroArrayList().size());
    }

    @Test
    void testFindSuperhelt() {
        String expectedAliasNavn = "paul";
        String expectedSuperheroNavn = "superpaul";
        assertEquals(expectedAliasNavn, s1.getAliasNavn());
        assertEquals(expectedSuperheroNavn, s1.getSuperhelteNavn());

    }

    @Test // Test med fejl
    void testFindSuperheltFejl() {
        String expectedSuperheroNavn = "mango";
        assertEquals(expectedSuperheroNavn, s1.getSuperhelteNavn());

    }

    @Test
    void testRedigerSuperhelt() {
        Superhero editingSuperhelt = s1;

    // Vi tester dette selv om vi ikke har det sat op som en individuel metode (den ligger inde i userinterface)
        int expectedOprindelsesÅr = 1950;
        String oprindelsesÅrNy = "1950";
        if (!oprindelsesÅrNy.isEmpty()) {
            editingSuperhelt.setOprindelsesÅr(Integer.parseInt(oprindelsesÅrNy));
        }

        assertEquals(expectedOprindelsesÅr, s1.getOprindelsesÅr());
    }

}

    /*
    @Test
    void testNavn() {
        String expectedAliasName = "paul";

        String acualAliasName = s1.getAliasNavn();

        assertEquals(expectedAliasName, acualAliasName);


}*/
