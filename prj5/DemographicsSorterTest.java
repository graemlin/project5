package prj5;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Tests the DemographicSorter
 * 
 * @author Alexander Mundy, Joe Walker, Kalila Simpson <amundy14, jdub36, kiki>
 * @version <20NOV2015>
 *
 */
public class DemographicsSorterTest extends student.TestCase {

    private DemographicsSorter sorter;
    private LinkedList<Student> list;
    private LinkedList<Student> otherList;
    private LinkedList<Student> empty;
    private Student s1;
    private Student s2;
    private Student s3;
    private Student s4;
    private LinkedList<String> opins;
    private ArrayList<ArrayList<Integer>> opinionPercs;

    /**
     * Sets up local data before each test
     */
    public void setUp() {
        list = new LinkedList<Student>();
        otherList = new LinkedList<Student>();
        empty = null;

        opins = new LinkedList<String>();
        opins.add(0, "Yes");
        opins.add(1, "Yes");
        opins.add(2, "No");
        opins.add(3, "No");

        s1 = new Student("reading", "Computer Science", "Northeast US", opins);
        s2 = new Student("sports", "Other Engineering", "Southeast US", opins);
        s3 = new Student("art", "Math or CMDA", "the rest of US", opins);
        s4 = new Student("music", "Other", "Other", opins);

        list.add(s2);
        list.add(s1);
        list.add(s4);
        list.add(s3);

        sorter = new DemographicsSorter(list);
    }

    /**
     * Tests the sortByHobby
     */
    public void testSortByHobby() {
        assertNull(new DemographicsSorter(empty).sortByHobby());
        assertEquals(new DemographicsSorter(otherList).sortByHobby(),
                new ArrayList<ArrayList<Integer>>());
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(0, 1);
        temp.add(1, 1);
        temp.add(2, 1);
        temp.add(3, 0);
        temp.add(4, 1);
        temp.add(5, 0);
        opinionPercs = new ArrayList<ArrayList<Integer>>();
        opinionPercs.add(temp);
        opinionPercs.add(temp);
        opinionPercs.add(temp);
        opinionPercs.add(temp);

        assertEquals(sorter.sortByHobby(), opinionPercs);
    }

    /**
     * Tests the sortByMajor
     */
    public void testSortByMajor() {
        assertNull(new DemographicsSorter(empty).sortByMajor());
        assertEquals(new DemographicsSorter(otherList).sortByMajor(),
                new ArrayList<ArrayList<Integer>>());
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(0, 1);
        temp.add(1, 1);
        temp.add(2, 1);
        temp.add(3, 0);
        temp.add(4, 1);
        temp.add(5, 0);
        opinionPercs = new ArrayList<ArrayList<Integer>>();
        opinionPercs.add(temp);
        opinionPercs.add(temp);
        opinionPercs.add(temp);
        opinionPercs.add(temp);

        assertEquals(sorter.sortByMajor(), opinionPercs);
    }

    /**
     * Tests the sortByRegion
     */
    public void testsortByRegion() {
        assertNull(new DemographicsSorter(empty).sortByRegion());
        assertEquals(new DemographicsSorter(otherList).sortByRegion(),
                new ArrayList<ArrayList<Integer>>());
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(0, 1);
        temp.add(1, 1);
        temp.add(2, 1);
        temp.add(3, 0);
        temp.add(4, 1);
        temp.add(5, 0);
        opinionPercs = new ArrayList<ArrayList<Integer>>();
        opinionPercs.add(temp);
        opinionPercs.add(temp);
        opinionPercs.add(temp);
        opinionPercs.add(temp);

        assertEquals(sorter.sortByRegion(), opinionPercs);
    }

    /**
     * Tests the updateSongList
     */
    public void testupdateSongList() {

    }
}
