package prj5;

import java.util.LinkedList;

/**
 * Sorts the song list according to the user's choice
 * 
 * @author Alexander Mundy, Joe Walker, Kalila Simpson <amundy14, jdub36, kiki>
 * @version <20NOV2015>
 *
 */

public class SongSorter {

    /**
     * Sorts the songs in alphabetic order by title. Does NOT modify the
     * original LinkedList
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
        @SuppressWarnings("unchecked")
        LinkedList<Song> temp = (LinkedList<Song>) songs.clone();
        for (Song song : temp) {
            if (song == null) {
                temp.remove(song);
            }
        }
        while (temp.size() != 0) {
            Song foo = temp.get(0);
            for (Song song : temp) {
                if (song.compareTitles(foo) < 0) {
                    foo = song;
                }

            }
            temp.remove(foo);
            sortedSongs.add(foo);
        }

        return sortedSongs;
    }

    /**
     * Sorts the songs in alphabetic order by artist. Does NOT modify the
     * original LinkedList
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
        @SuppressWarnings("unchecked")
        LinkedList<Song> temp = (LinkedList<Song>) songs.clone();
        for (Song song : temp) {
            if (song == null) {
                temp.remove(song);
            }
        }
        while (temp.size() != 0) {
            Song foo = temp.get(0);
            for (Song song : temp) {
                if (song.compareArtists(foo) < 0) {
                    foo = song;
                }

            }
            temp.remove(foo);
            sortedSongs.add(foo);
        }

        return sortedSongs;
    }

    /**
     * Sorts the songs in alphabetic order by genre. Does NOT modify the
     * original LinkedList
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
        @SuppressWarnings("unchecked")
        LinkedList<Song> temp = (LinkedList<Song>) songs.clone();
        for (Song song : temp) {
            if (song == null) {
                temp.remove(song);
            }
        }
        while (temp.size() != 0) {
            Song foo = temp.get(0);
            for (Song song : temp) {
                if (song.compareGenres(foo) < 0) {
                    foo = song;
                }

            }
            temp.remove(foo);
            sortedSongs.add(foo);
        }

        return sortedSongs;
    }

    /**
     * Sorts the songs in increasing chronological order by release date. Does
     * NOT modify the original LinkedList
     * 
     * @param songs
     *            The song list to be sorted
     * @return The sorted song list
     */
    public static LinkedList<Song> sortByYear(LinkedList<Song> songs) {
        if (songs == null) {
            return null;
        }
        if (songs.size() == 0) {
            return new LinkedList<Song>();
        }

        LinkedList<Song> sortedSongs = new LinkedList<Song>();
        @SuppressWarnings("unchecked")
        LinkedList<Song> temp = (LinkedList<Song>) songs.clone();
        for (Song song : temp) {
            if (song == null) {
                temp.remove(song);
            }
        }
        while (temp.size() != 0) {
            Song foo = temp.get(0);
            for (Song song : temp) {
                if (song.compareYears(foo) < 0) {
                    foo = song;
                }

            }
            temp.remove(foo);
            sortedSongs.add(foo);
        }

        return sortedSongs;
    }

}
