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
    /**
     * The songSorter
     */
    private SongSorter sorter;
    /**
     * The list of songs
     */
    private LinkedList<Song> songs;
    /**
     * The list of sorted songs
     */
    private LinkedList<Song> sortedSongs;
    /**
     * An empty list
     */
    private LinkedList<Song> empty;
    /**
     * The first song used in testing
     */
    private Song s1;
    /**
     * The second song used in testing
     */
    private Song s2;
    /**
     * The third song used in testing
     */
    private Song s3;
    /**
     * The fourth song used in testing
     */
    private Song s4;
    /**
     * The fifth song used in testing
     */
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

        sorter = new SongSorter();
    }

    /**
     * Tests the sortByTitle
     */
    public void testsortByTitle() {
        assertNull(sorter.sortByTitle(empty));
        empty = new LinkedList<Song>();
        assertEquals(sorter.sortByTitle(empty), new LinkedList<Song>());
        empty.add(null);
        assertEquals(sorter.sortByTitle(songs), sortedSongs);
    }

    /**
     * Tests the sortByArtist
     */
    public void testsortByArtist() {
        assertNull(sorter.sortByArtist(empty));
        empty = new LinkedList<Song>();
        assertEquals(sorter.sortByArtist(empty), new LinkedList<Song>());
        empty.add(null);
        assertEquals(sorter.sortByArtist(empty), new LinkedList<Song>());
        assertEquals(sorter.sortByArtist(songs), sortedSongs);
    }

    /**
     * Tests the sortByGenre
     */
    public void testsortByGenre() {
        assertNull(sorter.sortByGenre(empty));
        empty = new LinkedList<Song>();
        assertEquals(sorter.sortByGenre(empty), new LinkedList<Song>());
        empty.add(null);
        assertEquals(sorter.sortByGenre(empty), new LinkedList<Song>());
        assertEquals(sorter.sortByGenre(songs), sortedSongs);
    }

    /**
     * Tests the sortByYear
     */
    public void testsortByYear() {
        assertNull(sorter.sortByYear(empty));
        empty = new LinkedList<Song>();
        assertEquals(sorter.sortByYear(empty), new LinkedList<Song>());
        empty.add(null);
        assertEquals(sorter.sortByYear(empty), new LinkedList<Song>());
        assertEquals(sorter.sortByYear(songs), sortedSongs);
    }
}
