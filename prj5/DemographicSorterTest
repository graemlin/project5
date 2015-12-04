package prj5;

import java.util.LinkedList;

/**
 * Tests the SongSorter
 * 
 * @author Alexander Mundy, Joe Walker, Kalila Simpson <amundy14, jdub36, kiki>
 * @version <20NOV2015>
 *
 */
public class DemographicSorterTest extends student.TestCase {
    /**
     * The DemographicSorter that will be used for testing
     */
	private DemographicSorter sorter;
	/**
     * A list of Students
     */
    private LinkedList<Student> list;
    /**
     * An empty list
     */
    private LinkedList<Song> empty;
    /**
     * The first student used in testing
     */
    private Student s1;
    /**
     * The second student used in testing
     */
    private Student s2;
    /**
     * The third student used in testing
     */
    private Student s3;
    /**
     * The fourth student used in testing
     */
    private Student s4;
    /**
     * The fifth student used in testing
     */
    private Student s5;
    /**
     * The opinions LinkedList
     */
    private LinkedList<String> opins;

    /**
     * Sets up local data before each test
     */
    public void setUp() {
        list = new LinkedList<Student>();
        empty = null;
        s1 = new Student("reading", "Computer Science", "Northeast US", opins);
        s2 = new Student("sports", "Other Engineering", "Southeast US", opins);
        s3 = new Student("art", "Math or CMDA", "the rest of US", opins);
        s4 = new Student("music", "Other", "Other", opins);

        list.add(s2);
        list.add(s1);
        list.add(s4);
        list.add(s5);
        list.add(s3);
        
        sorter = new DemographicSorter(list);
    }

    /**
     * Tests the sortByHobby
     */
    public void testsortByTitle() {
        assertNull(SongSorter.sortByTitle(empty));
        empty = new LinkedList<Song>();
        assertEquals(SongSorter.sortByTitle(empty), new LinkedList<Song>());
        empty.add(null);
        assertEquals(SongSorter.sortByTitle(songs), sortedSongs);
    }

    /**
     * Tests the sortByMajor
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
     * Tests the sortByRegion
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
     * Tests the updateSongsList
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
