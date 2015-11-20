package prj5;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.SystemColor;

/**
 * A JPanel that represents a single song on the GUI
 * 
 * @author Alexander Mundy, Joe Walker, Kiki Simpson
 * @version <20NOV2015>
 *
 */

public class Glyph extends JPanel {

    private JTextPane txtrSongTitle;
    private JPanel separator;
    private JPanel liked1;
    private JPanel liked2;
    private JPanel liked3;
    private JPanel liked4;
    private JPanel heard1;
    private JPanel heard2;
    private JPanel heard3;
    private JPanel heard4;
    private static final double[] DEFAULT_LENGTHS = { 100, 100, 100, 100, 100,
            100, 100, 100 };

    /**
     * Create the panel.
     */
    public Glyph(int x, int y) {
        setBounds(x, y, 160, 100);
        setLayout(null);
        setBorder(null);

        txtrSongTitle = new JTextPane();
        txtrSongTitle.setBackground(SystemColor.menu);
        txtrSongTitle.setText("Song title");
        txtrSongTitle.setBounds(5, 0, 140, 50);
        add(txtrSongTitle);

        separator = new JPanel();
        separator.setBackground(Color.BLACK);
        separator.setBounds(75, 50, 5, 50);
        add(separator);

        liked1 = new JPanel();
        liked1.setBackground(Color.MAGENTA);

        liked2 = new JPanel();
        liked2.setBackground(Color.BLUE);

        liked3 = new JPanel();
        liked3.setBackground(Color.ORANGE);

        liked4 = new JPanel();
        liked4.setBackground(Color.GREEN);

        heard1 = new JPanel();
        heard1.setBackground(Color.MAGENTA);

        heard2 = new JPanel();
        heard2.setBackground(Color.BLUE);

        heard3 = new JPanel();
        heard3.setBackground(Color.ORANGE);

        heard4 = new JPanel();
        heard4.setBackground(Color.GREEN);

        setBars(DEFAULT_LENGTHS);

        add(liked1);
        add(liked2);
        add(liked3);
        add(liked4);
        add(heard1);
        add(heard2);
        add(heard3);
        add(heard4);
    }

    /**
     * Sets the title displayed in the Glyph
     * 
     * @param title
     *            The title to be displayed
     */
    public void setTitle(String title) {
        txtrSongTitle.setText(title);
    }

    /**
     * Takes in the values for the percentages displayed on the glyph
     * 
     * @param values
     *            liked1, liked2, liked3, liked4, heard1, heard2, heard3, heard4
     */
    public void setBars(double[] values) {
        liked1.setBounds(80, 50, (int) ((values[0] / 100.0) * 70.0), 10);
        liked2.setBounds(80, 63, (int) ((values[1] / 100.0) * 70.0), 10);
        liked3.setBounds(80, 76, (int) ((values[2] / 100.0) * 70.0), 10);
        liked4.setBounds(80, 89, (int) ((values[3] / 100.0) * 70.0), 10);
        heard1.setBounds(80 - (int) ((values[4] / 100.0) * 70.0), 50,
                (int) ((values[4] / 100.0) * 70.0), 10);
        heard2.setBounds(80 - (int) ((values[5] / 100.0) * 70.0), 63,
                (int) ((values[5] / 100.0) * 70.0), 10);
        heard3.setBounds(80 - (int) ((values[6] / 100.0) * 70.0), 76,
                (int) ((values[6] / 100.0) * 70.0), 10);
        heard4.setBounds(80 - (int) ((values[7] / 100.0) * 70.0), 89,
                (int) ((values[7] / 100.0) * 70.0), 10);
    }

}
