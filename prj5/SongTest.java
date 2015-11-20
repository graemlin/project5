package prj5;

/**
 * Tests all the methods in the song class.
 * 
 * @author Kalila Simpson, Joe Walker, Alexander Mundy <kiki, jdub36, amundy14>
 * @version 11.15.2015
 */
public class SongTest extends student.TestCase {

    /**
     * The songs that will be used in testing
     */
    private Song song, s2, s3, s4, s5, s6;

    /**
     * Sets everything up for each test
     */
    public void setUp() {
        song = new Song("Dance Song", "Kiki", "Rock", 1996);
        // exact same as song
        s2 = new Song("Dance Song", "Kiki", "Rock", 1996);
        // same title as song
        s3 = new Song("Dance Song", "Artist", "Genre", 2010);
        // same artist as song
        s4 = new Song("New New", "Kiki", "Genre", 1800);
        // same year as song
        s5 = new Song("New Song", "Not Kiki", "Cool", 1996);
        // completely different than song
        s6 = new Song("Pasta", "Cool Kid", "Cool", 2803);
    }

    /**
     * Tests the getTitle method
     */
    public void testGetTitle() {
        assertEquals("Dance Song", song.getTitle());
        assertEquals("New New", s4.getTitle());
        assertEquals("New Song", s5.getTitle());
        assertEquals("Pasta", s6.getTitle());
    }

    /**
     * Tests the getArtist method
     */
    public void testGetArtist() {
        assertEquals("Kiki", song.getArtist());
        assertEquals("Artist", s3.getArtist());
        assertEquals("Not Kiki", s5.getArtist());
        assertEquals("Cool Kid", s6.getArtist());
    }

    /**
     * Tests the getGenre method
     */
    public void testGetGenre() {
        assertEquals("Rock", song.getGenre());
        assertEquals("Genre", s4.getGenre());
        assertEquals("Cool", s6.getGenre());
    }

    /**
     * Tests the getYear method
     */
    public void testGetYear() {
        assertEquals(1996, song.getYear());
        assertEquals(1800, s4.getYear());
        assertEquals(2803, s6.getYear());
    }

    /**
     * Tests the getters and setters for all the heard and liked variables
     */
    public void testHeardLiked() {
        assertEquals(0, song.getHeard1());
        assertEquals(0, song.getHeard2());
        assertEquals(0, song.getHeard3());
        assertEquals(0, song.getHeard4());
        assertEquals(0, song.getLiked1());
        assertEquals(0, song.getLiked2());
        assertEquals(0, song.getLiked3());
        assertEquals(0, song.getLiked4());
        song.setHeard1(4);
        song.setHeard2(4);
        song.setHeard3(4);
        song.setHeard4(4);
        song.setLiked1(2);
        song.setLiked2(2);
        song.setLiked3(2);
        song.setLiked4(2);
        assertEquals(4, song.getHeard1());
        assertEquals(4, song.getHeard2());
        assertEquals(4, song.getHeard3());
        assertEquals(4, song.getHeard4());
        assertEquals(2, song.getLiked1());
        assertEquals(2, song.getLiked2());
        assertEquals(2, song.getLiked3());
        assertEquals(2, song.getLiked4());
    }

    /**
     * Tests the compareTitles method
     */
    public void testCompareTitles() {
        assertEquals(0, song.compareTitles(song));
        assertEquals(0, song.compareTitles(s2));
        assertEquals(0, song.compareTitles(s3));
        assertEquals(-10, song.compareTitles(s4));
        assertEquals(-10, song.compareTitles(s5));
        assertEquals(-12, song.compareTitles(s6));
    }

    /**
     * Tests the compareArtists method
     */
    public void testCompareArtists() {
        assertEquals(0, song.compareArtists(song));
        assertEquals(0, song.compareArtists(s2));
        assertEquals(10, song.compareArtists(s3));
        assertEquals(0, song.compareArtists(s4));
        assertEquals(-3, song.compareArtists(s5));
        assertEquals(8, song.compareArtists(s6));
    }

    /**
     * Tests the compareGenres method
     */
    public void testCompareGenres() {
        assertEquals(0, song.compareGenres(song));
        assertEquals(0, song.compareGenres(s2));
        assertEquals(11, song.compareGenres(s3));
        assertEquals(11, song.compareGenres(s4));
        assertEquals(15, song.compareGenres(s5));
        assertEquals(15, song.compareGenres(s6));
    }

    /**
     * Tests the compareYears method
     */
    public void testCompareYears() {
        assertEquals(0, song.compareYears(song));
        assertEquals(0, song.compareYears(s2));
        assertEquals(-14, song.compareYears(s3));
        assertEquals(196, song.compareYears(s4));
        assertEquals(0, song.compareYears(s5));
        assertEquals(-807, song.compareYears(s6));
    }

}
