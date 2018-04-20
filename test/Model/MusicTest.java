/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;
import java.time.Month;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dharm
 */
public class MusicTest {
    Music artist;
    
    public MusicTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        artist = new Music("Rockstar","Rock","Savage",LocalDate.of(2018, Month.FEBRUARY, 10));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGenre method, of class Music.
     */
    @Test
    public void testGetGenre() {
        String expResult = "Rock";
        String result = artist.getGenre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGenre method, of class Movie.
     */
    @Test
    public void testSetGenre() {
        artist.setGenre("Jazz");
        String result = artist.getGenre();
        assertEquals("Jazz", result);
    }
    /**
     * 
     */
     @Test
    public void testGenreInvalid() {
        String genre = "hello";
        try {
            artist.setGenre(genre);
            fail("The Genre method with an empty argument should have triggered an exception.");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    /**
     * Test of getAlbum method, of class Music.
     */
    @Test
    public void testGetAlbum() {
        String expResult = "Savage";
        String result = artist.getAlbum();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAlbum method, of class Music.
     */
    @Test
    public void testSetAlbum() {
     artist.setAlbum("Jazz");
        String result = artist.getAlbum();
        assertEquals("Jazz", result);
    }
     @Test
    public void testAlbumInvalid() {
        String album = "";
        try {
            artist.setAlbum(album);
            fail("The Album method with an empty argument should have triggered an exception.");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    /**
     * Test of getReleaseDate method, of class Music.
     */
   @Test
    public void testGetReleaseDate() {
        LocalDate expResult = LocalDate.of(2018, Month.FEBRUARY, 10);
        LocalDate result = artist.getReleaseDate();
        assertEquals(expResult, result);

    }

    /**
     * Test of setReleaseDate method, of class Movie.
     */
    @Test
    public void testSetReleaseDate() {
        LocalDate releaseDate = LocalDate.of(2012, Month.APRIL, 15);
        artist.setReleaseDate(releaseDate);
        assertEquals(releaseDate, artist.getReleaseDate());
    }
    /**
     * 
     */
    @Test
    public void testSetReleaseDateInvalid()
    {
        LocalDate releaseDate = LocalDate.of(2020, Month.FEBRUARY, 1);       
        try{
            artist.setReleaseDate(releaseDate);
            fail("A hire date years in the future should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
        }
    }

    /**
     * Test of getMusicName method, of class Music.
     */
    @Test
    public void testGetMusicName() {
       String expResult = "Rockstar";
       String result = artist.getMusicName();
       assertEquals(expResult, result);
       
    }

    /**
     * Test of setMusicName method, of class Music.
     */
    @Test
    public void testSetMusicName() {
      artist.setMusicName("Let me");
        String result = artist.getMusicName();
        assertEquals("Let me", result);
    }

      @Test
    public void testMusicNameInvalid() {
        String musicName = "";
        try {
            artist.setMusicName(musicName);
            fail("The Genre method with an empty argument should have triggered an exception.");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
    /**
     * Test of toString method, of class Music.
     */
    @Test
    public void testToString() {
          String expResult = "Rockstar";
        String result = artist.toString();
        assertEquals(expResult, result);
    }
}
