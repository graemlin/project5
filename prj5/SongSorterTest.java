package prj5;

import java.util.LinkedList;

/**
 * Tests the SongSorter
 * 
 * @author Alexander Mundy, Joe Walker, Kalila Simpson <amundy14, jdub36, kiki>
 * @version <20NOV2015>
 *
 */

public class SongSorterTest extends student.TestCase {

    private LinkedList<Song> songs;
    private LinkedList<Song> sortedSongs;
    private LinkedList<Song> empty;
    private Song s1;
    private Song s2;
    private Song s3;
    private Song s4;
    private Song s5;

    /**
     * Sets up local data before each test
     */
    public void setUp() {
        songs = new LinkedList<Song>();
        sortedSongs = new LinkedList<Song>();
        empty = null;
        s1 = new Song("aaaa", "aaaa", "aaaa", 1000);
        s2 = new Song("bbbb", "bbbb", "bbbb", 2000);
        s3 = new Song("cccc", "cccc", "cccc", 3000);
        s4 = new Song("dddd", "dddd", "dddd", 4000);

        songs.add(s2);
        songs.add(s1);
        songs.add(s4);
        songs.add(s5);
        songs.add(s3);
        sortedSongs.add(s1);
        sortedSongs.add(s2);
        sortedSongs.add(s3);
        sortedSongs.add(s4);
    }

    /**
     * Tests the sortByTitle
     */
    public void testsortByTitle() {
        assertNull(SongSorter.sortByTitle(empty));
        empty = new LinkedList<Song>();
        assertEquals(SongSorter.sortByTitle(empty), new LinkedList<Song>());
        empty.add(null);
        assertEquals(SongSorter.sortByTitle(songs), sortedSongs);
    }

    /**
     * Tests the sortByArtist
     */
    public void testsortByArtist() {
        assertNull(SongSorter.sortByTitle(empty));
        empty = new LinkedList<Song>();
        assertEquals(SongSorter.sortByTitle(empty), new LinkedList<Song>());
        empty.add(null);
        assertEquals(SongSorter.sortByTitle(empty), new LinkedList<Song>());
        assertEquals(SongSorter.sortByTitle(songs), sortedSongs);
    }

    /**
     * Tests the sortByGenre
     */
    public void testsortByGenre() {
        assertNull(SongSorter.sortByTitle(empty));
        empty = new LinkedList<Song>();
        assertEquals(SongSorter.sortByTitle(empty), new LinkedList<Song>());
        empty.add(null);
        assertEquals(SongSorter.sortByTitle(empty), new LinkedList<Song>());
        assertEquals(SongSorter.sortByTitle(songs), sortedSongs);
    }

    /**
     * Tests the sortByYear
     */
    public void testsortByYear() {
        assertNull(SongSorter.sortByTitle(empty));
        empty = new LinkedList<Song>();
        assertEquals(SongSorter.sortByTitle(empty), new LinkedList<Song>());
        empty.add(null);
        assertEquals(SongSorter.sortByTitle(empty), new LinkedList<Song>());
        assertEquals(SongSorter.sortByTitle(songs), sortedSongs);
    }
}