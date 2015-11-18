/**
 * The Song class.
 * 
 * It holds all the information of the songs, (title, artist, year, and genre).
 * 
 * @author Kalila Simpson, Joe Walker, and Alex Mundy
 * @version 11.15.2015
 */
public class Song {

	/**
	 * The Strings that will hold the title, artist, and genre
	 * of a specific song
	 */
	private String title, artist, genre;
	/**
	 * The integer that will hold the year the song came out
	 */
	private int year;
	/**
	 * The integers that will represent whether or not each of the four
	 * demographics have heard a song
	 */
	private int heard1, heard2, heard3, heard4;
	/**
	 * The integers that will represent whether or not each of the four
	 * demographics liked a song
	 */
	private int liked1, liked2, liked3, liked4;
	
	/**
	 * The constructor for all Songs
	 * 
	 * @param title The title of the song
	 * @param artist The artist of the song
	 * @param genre The genre of the song
	 * @param year The year the song came out
	 */
	public Song(String title, String artist, String genre, int year) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.year = year;
		heard1 = 0;
		heard2 = 0;
		heard3 = 0;
		heard4 = 0;
		liked1 = 0;
		liked2 = 0;
		liked3 = 0;
		liked4 = 0;
	}
	
	/**
	 * Getter class for the Title variable 
	 * 
	 * @return title The title of the song
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Getter class for the Artist variable 
	 * 
	 * @return artist The artist of the song
	 */
	public String getArtist() {
		return artist;
	}
	
	/**
	 * Getter class for the Gene variable 
	 * 
	 * @return genre The genre of the song
	 */
	public String getGenre() {
		return genre;
	}
	
	/**
	 * Getter class for the Year variable 
	 * 
	 * @return year The year of the song
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Compares Song titles
	 * 
	 * @param Song the other song you're comparing
	 * @return int the difference between the two
	 */
	public int compareTitles(Song other) {
		return this.getTitle().compareTo(other.getTitle());
	}
	
	/**
	 * Compares Song genres
	 * 
	 * @param Song the other song you're comparing
	 * @return int the difference between the two
	 */
	public int compareGenres(Song other) {
		return this.getGenre().compareTo(other.getGenre());
	}
	
	/**
	 * Compares Song artist
	 * 
	 * @param Song the other song you're comparing
	 * @return int the difference between the two
	 */
	public int compareArtists(Song other) {
		return this.getArtist().compareTo(other.getArtist());
	}
	
	/**
	 * Compares Song year
	 * 
	 * @param Song the other song you're comparing
	 * @return int the difference between the two
	 */
	public int compareYears(Song other) {
		return this.getYear() - other.getYear();
	}

	/**
	 * Getter for the heard1 variable
	 * 
	 * @return int for heard1
	 */
	public int getHeard1() {
		return heard1;
	}
	
	/**
	 * Setter for the heard1 variable
	 * 
	 * @param n new value for heard1
	 * @return int for heard1
	 */
	public void setHeard1(int n) {
		heard1 = n;
	}
	
	/**
	 * Getter for the heard2 variable
	 * 
	 * @return int for heard2
	 */
	public int getHeard2() {
		return heard2;
	}
	
	/**
	 * Setter for the heard2 variable
	 * 
	 * @param n new value for heard2
	 * @return int for heard2
	 */
	public void setHeard2(int n) {
		heard2 = n;
	}
	
	/**
	 * Getter for the heard3 variable
	 * 
	 * @return int for heard3
	 */
	public int getHeard3() {
		return heard3;
	}
	
	/**
	 * Setter for the heard3 variable
	 * 
	 * @param n new value for heard3
	 * @return int for heard3
	 */
	public void setHeard3(int n) {
		heard3 = n;
	}
	
	/**
	 * Getter for the heard4 variable
	 * 
	 * @return int for heard4
	 */
	public int getHeard4() {
		return heard4;
	}
	
	/**
	 * Setter for the heard4 variable
	 * 
	 * @param n new value for heard4
	 * @return int for heard4
	 */
	public void setHeard4(int n) {
		heard4 = n;
	}
	
	/**
	 * Getter for the liked1 variable
	 * 
	 * @return int for liked1
	 */
	public int getLiked1() {
		return liked1;
	}
	
	/**
	 * Setter for the liked1 variable
	 * 
	 * @param n new value for liked1
	 * @return int for liked1
	 */
	public void setLiked1(int n) {
		liked1 = n;
	}
	
	/**
	 * Getter for the liked2 variable
	 * 
	 * @return int for liked2
	 */
	public int getLiked2() {
		return liked2;
	}
	
	/**
	 * Setter for the liked2 variable
	 * 
	 * @param n new value for liked2
	 * @return int for liked2
	 */
	public void setLiked2(int n) {
		liked2 = n;
	}
	
	/**
	 * Getter for the liked3 variable
	 * 
	 * @return int for liked3
	 */
	public int getLiked3() {
		return liked3;
	}
	
	/**
	 * Setter for the liked3 variable
	 * 
	 * @param n new value for liked3
	 * @return int for liked3
	 */
	public void setLiked3(int n) {
		liked3 = n;
	}
	
	/**
	 * Getter for the liked4 variable
	 * 
	 * @return int for liked4
	 */
	public int getLiked4() {
		return liked4;
	}
	
	/**
	 * Setter for the liked4 variable
	 * 
	 * @param n new value for liked4
	 * @return int for liked4
	 */
	public void setLiked4(int n) {
		liked4 = n;
	}
}
