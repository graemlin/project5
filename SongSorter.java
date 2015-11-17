package project5;

import java.util.LinkedList;

public class SongSorter {

    public static LinkedList<Song> sortByTitle(LinkedList<Song> songs) {
        if (songs == null) {
            return null;
        }
        // TODO: Deal with other special cases
        LinkedList<Song> sortedSongs = new LinkedList<Song>();
        if (songs.size() != 0){
            sortedSongs.add(songs.get(0));
        }
        for (int i = 1; i < songs.size(); i++) {
            int counter = 0;
            while (counter <= sortedSongs.size()-1 && sortedSongs.get(counter)
                    .compareTitles(sortedSongs.get(counter + 1)) > 0) {
                counter++;
            }
            sortedSongs.add(counter, songs.get(i));
        }
        return sortedSongs;
    }
    
    public static LinkedList<Song> sortByArtist(LinkedList<Song> songs){
        if (songs == null) {
            return null;
        }
        // TODO: Deal with other special cases
        LinkedList<Song> sortedSongs = new LinkedList<Song>();
        if (songs.size() != 0){
            sortedSongs.add(songs.get(0));
        }
        for (int i = 1; i < songs.size(); i++) {
            int counter = 0;
            while (counter <= sortedSongs.size()-1 && sortedSongs.get(counter)
                    .compareArtists(sortedSongs.get(counter + 1)) > 0) {
                counter++;
            }
            sortedSongs.add(counter, songs.get(i));
        }
        return sortedSongs;
    }
    
    public static LinkedList<Song> sortByGenre(LinkedList<Song> songs){
        if (songs == null) {
            return null;
        }
        // TODO: Deal with other special cases
        LinkedList<Song> sortedSongs = new LinkedList<Song>();
        if (songs.size() != 0){
            sortedSongs.add(songs.get(0));
        }
        for (int i = 1; i < songs.size(); i++) {
            int counter = 0;
            while (counter <= sortedSongs.size()-1 && sortedSongs.get(counter)
                    .compareGenres(sortedSongs.get(counter + 1)) > 0) {
                counter++;
            }
            sortedSongs.add(counter, songs.get(i));
        }
        return sortedSongs;
    }
    
    public static LinkedList<Song> sortByYears(LinkedList<Song> songs){
        if (songs == null) {
            return null;
        }
        // TODO: Deal with other special cases
        LinkedList<Song> sortedSongs = new LinkedList<Song>();
        if (songs.size() != 0){
            sortedSongs.add(songs.get(0));
        }
        for (int i = 1; i < songs.size(); i++) {
            int counter = 0;
            while (counter <= sortedSongs.size()-1 && sortedSongs.get(counter)
                    .compareYears(sortedSongs.get(counter + 1)) > 0) {
                counter++;
            }
            sortedSongs.add(counter, songs.get(i));
        }
        return sortedSongs;
    }

}
