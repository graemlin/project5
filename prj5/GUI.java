package prj5;

import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
public class GUI extends JFrame {

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
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public GUI() {
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
}
