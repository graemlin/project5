package prj5;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

/**
 * The main GUI for project5
 * 
 * @author Alexander Mundy, Joe Walker, Kalila Simpson <amundy14, jdub36, kiki>
 * @version <20NOV2015>
 *
 */
@SuppressWarnings("serial")
public class Input extends JFrame {
    /**
     * The content pane
     */
    private JPanel contentPane;
    /**
     * The 1st glyph which
     */
    private Glyph glyph1;
    /**
     * The 2nd glyph which
     */
    private Glyph glyph2;
    /**
     * The 3rd glyph which
     */
    private Glyph glyph3;
    /**
     * The 4th glyph which
     */
    private Glyph glyph4;
    /**
     * The 5th glyph which
     */
    private Glyph glyph5;
    /**
     * The 6th glyph which
     */
    private Glyph glyph6;
    /**
     * The previous button
     */
    private JButton btnPrev;
    /**
     * The sort by artist button
     */
    private JButton btnSortByArtist;
    /**
     * The sort by song button
     */
    private JButton btnSortBySong;
    /**
     * The sort by release year button
     */
    private JButton btnSortByRelease;
    /**
     * The sort by genre button
     */
    private JButton btnSortByGenre;
    /**
     * The next button
     */
    private JButton btnNext;
    /**
     * The legend
     */
    private JPanel legend;
    private JTextArea txarLegend;
    private JTextArea txarCat1;
    private JTextArea txarCat2;
    private JTextArea txarCat3;
    private JTextArea txarCat4;
    /**
     * The represent by region button
     */
    private JButton btnRepresentRegion;
    /**
     * The represent by major button button
     */
    private JButton btnRepresentMajor;
    /**
     * The represent by hobby button
     */
    private JButton btnRepresentHobby;
    /**
     * The quit button
     */
    private JButton btnQuit;
    private JTextArea txarHeard;
    private JTextArea txarSongTitle;
    private JTextArea txarLiked;
    /**
     * The legend separator
     */
    private JPanel legendSeparator;

    /**
     * Launches the application.
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        if(args.length != 2){
            args = new String[]{"SongList.csv" , "MusicSurveyData.csv"};
        }
        String surveyLoc = args[0];
        String songListLoc = args[1];
        ScanIn foo = new ScanIn(songListLoc, surveyLoc);
        DemographicsSorter bar = new DemographicsSorter(foo.getStudentList());
        int[][] opinions = bar.sortByHobby();
        LinkedList<Song> sortedSongs = (LinkedList<Song>) foo.getSongList()
                .clone();
        int counter = 0;
        for (Song song : sortedSongs) {
            song.setHeard1(song.getHeard1() + opinions[0][counter]);
            song.setLiked1(song.getLiked1() + opinions[0][counter + 1]);
            song.setHeard2(song.getHeard2() + opinions[1][counter]);
            song.setLiked2(song.getLiked2() + opinions[1][counter + 1]);
            song.setHeard3(song.getHeard3() + opinions[2][counter]);
            song.setLiked3(song.getLiked3() + opinions[2][counter + 1]);
            song.setHeard4(song.getHeard4() + opinions[3][counter]);
            song.setLiked4(song.getLiked4() + opinions[3][counter + 1]);
            counter += 2;
        }
        for (Song song : sortedSongs) {
            song.setHeard1((song.getHeard1() * 10) / sortedSongs.size());
            song.setLiked1((song.getLiked1() * 10) / sortedSongs.size());
            song.setHeard2((song.getHeard2() * 10) / sortedSongs.size());
            song.setLiked2((song.getLiked2() * 10) / sortedSongs.size());
            song.setHeard3((song.getHeard3() * 10) / sortedSongs.size());
            song.setLiked3((song.getLiked3() * 10) / sortedSongs.size());
            song.setHeard4((song.getHeard4() * 10) / sortedSongs.size());
            song.setLiked4((song.getLiked4() * 10) / sortedSongs.size());
            counter += 2;
        }
        sortedSongs = SongSorter.sortByTitle(sortedSongs);
        output(sortedSongs);
        System.out.println();
        sortedSongs = SongSorter.sortByGenre(sortedSongs);
        output(sortedSongs);

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Input frame = new Input();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Creates the frame
     */
    public Input() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 330);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnPrev = new JButton("<- Prev");
        btnPrev.setBounds(10, 11, 89, 23);
        contentPane.add(btnPrev);

        btnSortByArtist = new JButton("Sort by Artist Name");
        btnSortByArtist.setBounds(109, 11, 134, 23);
        contentPane.add(btnSortByArtist);

        btnSortBySong = new JButton("Sort by Song Title");
        btnSortBySong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnSortBySong.setBounds(253, 11, 123, 23);
        contentPane.add(btnSortBySong);

        btnSortByRelease = new JButton("Sort by Release Year");
        btnSortByRelease.setBounds(386, 11, 139, 23);
        contentPane.add(btnSortByRelease);

        btnSortByGenre = new JButton("Sort by Genre");
        btnSortByGenre.setBounds(535, 11, 106, 23);
        contentPane.add(btnSortByGenre);

        btnNext = new JButton("Next ->");
        btnNext.setBounds(651, 11, 89, 23);
        contentPane.add(btnNext);

        glyph1 = new Glyph(50, 45);
        contentPane.add(glyph1);

        glyph2 = new Glyph(50, 150);
        contentPane.add(glyph2);

        glyph3 = new Glyph(225, 45);
        contentPane.add(glyph3);

        glyph4 = new Glyph(225, 150);
        contentPane.add(glyph4);

        glyph5 = new Glyph(400, 45);
        contentPane.add(glyph5);

        glyph6 = new Glyph(400, 150);
        contentPane.add(glyph6);

        legend = new JPanel();
        legend.setBounds(600, 45, 140, 200);
        contentPane.add(legend);
        legend.setLayout(null);

        txarLegend = new JTextArea();
        txarLegend.setBackground(SystemColor.menu);
        txarLegend.setText("Hobby Legend");
        txarLegend.setBounds(5, 5, 130, 20);
        legend.add(txarLegend);

        txarCat1 = new JTextArea();
        txarCat1.setBackground(SystemColor.menu);
        txarCat1.setForeground(Color.MAGENTA);
        txarCat1.setText("Category 1");
        txarCat1.setBounds(5, 35, 130, 20);
        legend.add(txarCat1);

        txarCat2 = new JTextArea();
        txarCat2.setBackground(SystemColor.menu);
        txarCat2.setForeground(Color.BLUE);
        txarCat2.setText("Category 2");
        txarCat2.setBounds(5, 55, 130, 20);
        legend.add(txarCat2);

        txarCat3 = new JTextArea();
        txarCat3.setBackground(SystemColor.menu);
        txarCat3.setForeground(Color.ORANGE);
        txarCat3.setText("Category 3");
        txarCat3.setBounds(5, 75, 130, 20);
        legend.add(txarCat3);

        txarCat4 = new JTextArea();
        txarCat4.setBackground(SystemColor.menu);
        txarCat4.setForeground(Color.GREEN);
        txarCat4.setText("Category 4");
        txarCat4.setBounds(5, 95, 130, 20);
        legend.add(txarCat4);

        txarSongTitle = new JTextArea();
        txarSongTitle.setBackground(SystemColor.menu);
        txarSongTitle.setText("Song Title");
        txarSongTitle.setBounds(25, 130, 85, 20);
        legend.add(txarSongTitle);

        txarHeard = new JTextArea();
        txarHeard.setBackground(SystemColor.menu);
        txarHeard.setText("Heard");
        txarHeard.setBounds(10, 160, 54, 20);
        legend.add(txarHeard);

        txarLiked = new JTextArea();
        txarLiked.setBackground(SystemColor.menu);
        txarLiked.setText("Liked");
        txarLiked.setBounds(75, 160, 57, 20);
        legend.add(txarLiked);

        legendSeparator = new JPanel();
        legendSeparator.setBackground(Color.BLACK);
        legendSeparator.setBounds(65, 150, 5, 50);
        legend.add(legendSeparator);

        btnRepresentHobby = new JButton("Represent Hobby");
        btnRepresentHobby.setBounds(109, 261, 123, 23);
        contentPane.add(btnRepresentHobby);

        btnRepresentMajor = new JButton("Represent Major");
        btnRepresentMajor.setBounds(253, 261, 123, 23);
        contentPane.add(btnRepresentMajor);

        btnRepresentRegion = new JButton("Represent Region");
        btnRepresentRegion.setBounds(386, 261, 123, 23);
        contentPane.add(btnRepresentRegion);

        btnQuit = new JButton("Quit");
        btnQuit.setBounds(527, 261, 72, 23);
        contentPane.add(btnQuit);
    }

    private static void output(LinkedList<Song> songs) {
        for (Song song : songs) {
            System.out.println("Song Title: " + song.getTitle());
            System.out.println("Song Artist: " + song.getArtist());
            System.out.println("Song Genre: " + song.getGenre());
            System.out.println("Song Year: " + song.getYear());
            System.out.println("Heard");

            System.out.println("reading:" + song.getHeard1() + " art:"
                    + song.getHeard2() + " sports:" + song.getHeard3()
                    + " music:" + song.getHeard4());

            System.out.println("reading:" + 0 + " art:" + 0 + " sports:" + 50
                    + " music:" + 0);
            System.out.println("Likes");
            System.out.println("reading:" + song.getLiked1() + " art:"
                    + song.getLiked2() + " sports:" + song.getLiked3()
                    + " music:" + song.getLiked4());
        }
    }
}
