package prj5;

import java.util.LinkedList;

/**
 * Sorts the song list according to the user's choice
 * 
 * @author Alexander Mundy, Joe Walker, Kiki Simpson
 * @version <20NOV2015>
 *
 */

public class SongSorter {

    /**
     * Sorts the songs in alphabetic order by title
     * 
     * @param songs
     *            The song list to be sorted
     * @return The sorted song list
     */
    public static LinkedList<Song> sortByTitle(LinkedList<Song> songs) {
        if (songs == null) {
            return null;
        }
        if (songs.size() == 0) {
            return new LinkedList<Song>();
        }

        LinkedList<Song> sortedSongs = new LinkedList<Song>();
        if (songs.size() != 0) {
            sortedSongs.add(songs.get(0));
        }
        for (int i = 1; i < songs.size(); i++) {
            int counter = 0;
            while (counter <= sortedSongs.size() - 1 && sortedSongs.get(counter)
                    .compareTitles(sortedSongs.get(counter + 1)) > 0) {
                counter++;
            }
            sortedSongs.add(counter, songs.get(i));
        }
        return sortedSongs;
    }

    /**
     * Sorts the songs in alphabetic order by artist
     * 
     * @param songs
     *            The song list to be sorted
     * @return The sorted song list
     */
    public static LinkedList<Song> sortByArtist(LinkedList<Song> songs) {
        if (songs == null) {
            return null;
        }
        if (songs.size() == 0) {
            return new LinkedList<Song>();
        }
        LinkedList<Song> sortedSongs = new LinkedList<Song>();
        if (songs.size() != 0) {
            sortedSongs.add(songs.get(0));
        }
        for (int i = 1; i < songs.size(); i++) {
            int counter = 0;
            while (counter <= sortedSongs.size() - 1 && sortedSongs.get(counter)
                    .compareArtists(sortedSongs.get(counter + 1)) > 0) {
                counter++;
            }
            sortedSongs.add(counter, songs.get(i));
        }
        return sortedSongs;
    }

    /**
     * Sorts the songs in alphabetic order by genre
     * 
     * @param songs
     *            The song list to be sorted
     * @return The sorted song list
     */
    public static LinkedList<Song> sortByGenre(LinkedList<Song> songs) {
        if (songs == null) {
            return null;
        }
        if (songs.size() == 0) {
            return new LinkedList<Song>();
        }
        LinkedList<Song> sortedSongs = new LinkedList<Song>();
        if (songs.size() != 0) {
            sortedSongs.add(songs.get(0));
        }
        for (int i = 1; i < songs.size(); i++) {
            int counter = 0;
            while (counter <= sortedSongs.size() - 1 && sortedSongs.get(counter)
                    .compareGenres(sortedSongs.get(counter + 1)) > 0) {
                counter++;
            }
            sortedSongs.add(counter, songs.get(i));
        }
        return sortedSongs;
    }

    /**
     * Sorts the songs in increasing chronological order by release date
     * 
     * @param songs
     *            The song list to be sorted
     * @return The sorted song list
     */
    public static LinkedList<Song> sortByYears(LinkedList<Song> songs) {
        if (songs == null) {
            return null;
        }
        if (songs.size() == 0) {
            return new LinkedList<Song>();
        }
        LinkedList<Song> sortedSongs = new LinkedList<Song>();
        if (songs.size() != 0) {
            sortedSongs.add(songs.get(0));
        }
        for (int i = 1; i < songs.size(); i++) {
            int counter = 0;
            while (counter <= sortedSongs.size() - 1 && sortedSongs.get(counter)
                    .compareYears(sortedSongs.get(counter + 1)) > 0) {
                counter++;
            }
            sortedSongs.add(counter, songs.get(i));
        }
        return sortedSongs;
    }

}
