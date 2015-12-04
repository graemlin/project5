package prj5;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
    
    private JPanel contentPane;
    private Glyph glyph1;
    private Glyph glyph2;
    private Glyph glyph3;
    private Glyph glyph4;
    private Glyph glyph5;
    private Glyph glyph6;
    private JButton btnPrev;
    private JButton btnSortByArtist;
    private JButton btnSortBySong;
    private JButton btnSortByRelease;
    private JButton btnSortByGenre;
    private JButton btnNext;
    private JPanel legend;
    private JTextArea txarLegend;
    private JTextArea txarCat1;
    private JTextArea txarCat2;
    private JTextArea txarCat3;
    private JTextArea txarCat4;
    private JButton btnRepresentRegion;
    private JButton btnRepresentMajor;
    private JButton btnRepresentHobby;
    private JButton btnQuit;
    private JTextArea txarHeard;
    private JTextArea txarSongTitle;
    private JTextArea txarLiked;
    private JPanel legendSeparator;

    /**
     * Launches the application
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        if(args.length != 2){
            args = new String[]{"MusicSurveyData.csv", "SongList.csv"};
        }
        String surveyLoc = args[1];
        String songListLoc = args[0];
        ScanIn foo = new ScanIn(songListLoc, surveyLoc);
        DemographicsSorter bar = new DemographicsSorter(foo.getStudentList());
        
        //Temporary testing code
        ArrayList<ArrayList<Integer>> opinions = bar.sortByHobby();
        LinkedList<Song> songList = (LinkedList<Song>) foo.getSongList().clone();
        bar.updateSongList(songList, opinions);
        //TODO: find a way to run this
        //updateGlyphs(glyphArray(songList), 0);
        songList = SongSorter.sortByTitle(songList);
        output(songList);
        System.out.println();
        songList = SongSorter.sortByGenre(songList);
        output(songList);

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
            
            System.out.println("Likes");
            System.out.println("reading:" + song.getLiked1() + " art:"
                    + song.getLiked2() + " sports:" + song.getLiked3()
                    + " music:" + song.getLiked4());
        }
    }
    
    private static Song[][] glyphArray(LinkedList<Song> songList){
        Song[][] glyphArr = new Song[songList.size()/6][6];
        int innerCounter = 0;
        int outerCounter = 0;
        for(Song song: songList){
            glyphArr[outerCounter][innerCounter] = song;
            outerCounter = outerCounter + innerCounter / 6;
            innerCounter++;
            innerCounter%=6;
        }
        return glyphArr;
    }
    
    private void updateGlyphs(Song[][] glyphArray, int desiredSet){
        glyph1.setTitle(glyphArray[desiredSet][0].getTitle());
        glyph1.setBars(createValuesArray(glyphArray[desiredSet][0]));
        glyph2.setTitle(glyphArray[desiredSet][1].getTitle());
        glyph2.setBars(createValuesArray(glyphArray[desiredSet][1]));
        glyph3.setTitle(glyphArray[desiredSet][2].getTitle());
        glyph3.setBars(createValuesArray(glyphArray[desiredSet][2]));
        glyph4.setTitle(glyphArray[desiredSet][3].getTitle());
        glyph4.setBars(createValuesArray(glyphArray[desiredSet][3]));
        glyph5.setTitle(glyphArray[desiredSet][4].getTitle());
        glyph5.setBars(createValuesArray(glyphArray[desiredSet][4]));
        glyph6.setTitle(glyphArray[desiredSet][5].getTitle());
        glyph6.setBars(createValuesArray(glyphArray[desiredSet][5]));
    }
    
    //TODO: This needs to be rolled into glyphArray or DemographicsSorter
    private static double[] createValuesArray(Song song){
        double[] values = new double[8];
        values[0] = song.getLiked1();
        values[1] = song.getLiked2();
        values[2] = song.getLiked3();
        values[3] = song.getLiked4();
        values[4] = song.getHeard1();
        values[5] = song.getHeard2();
        values[6] = song.getHeard3();
        values[7] = song.getHeard4();
        return values;
    }
}
