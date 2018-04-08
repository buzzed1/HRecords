package sgsolutions;

import sun.java2d.pipe.BufferedTextPipe;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class MainGui extends JFrame implements ActionListener{
    // components for Gui
    private JPanel topPanel;
    private JPanel leftPanel;
    private JPanel centerPanel;
    private JPanel buttPanel;
    private JButton sitesButton;
    private JButton theraButton;
    private JButton conButton;
    private JButton trackButton;
    private JButton reportButton;


    public MainGui(){

        // add main window Layout
        setLayout(new BorderLayout(10, 5));
        setTitle("Health Records");
        // set the preferred size for the window
        setPreferredSize(new Dimension(800, 600));
        getContentPane();

        // create top panel and items
        topPanel = new JPanel(new BorderLayout(10, 10));
        JLabel topLabel = new JLabel("Health Records");
        topLabel.setFont(new Font("Sans Serif", Font.BOLD, 35 ));
        topPanel.add(topLabel, BorderLayout.WEST);
        topPanel.setBorder(BorderFactory.createEtchedBorder());
        add(topPanel, BorderLayout.NORTH);

        //add left panel and add buttons to it
        leftPanel = new JPanel();


        sitesButton = new JButton("Sites");
        sitesButton.addActionListener(this);
        theraButton = new JButton("Therapists");
        theraButton.addActionListener(this);
        conButton = new JButton("Consumers");
        conButton.addActionListener(this);
        trackButton = new JButton("Tracking");
        trackButton.addActionListener(this);
        reportButton = new JButton("Reports");
        reportButton.addActionListener(this);

        buttPanel = new JPanel();
        buttPanel.setLayout(new BoxLayout(buttPanel, BoxLayout.Y_AXIS));

        buttPanel.setBorder(BorderFactory.createEtchedBorder());


        sitesButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        theraButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        conButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        trackButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        reportButton.setAlignmentX(Component.CENTER_ALIGNMENT);


        buttPanel.add(sitesButton);
        buttPanel.add(Box.createRigidArea(new Dimension(0,15)));
        buttPanel.add(theraButton);
        buttPanel.add(Box.createRigidArea(new Dimension(0,15)));
        buttPanel.add(conButton);
        buttPanel.add(Box.createRigidArea(new Dimension(0,15)));
        buttPanel.add(trackButton);
        buttPanel.add(Box.createRigidArea(new Dimension(0,15)));
        buttPanel.add(reportButton);

        // Add the button panel to the left panel
        leftPanel.add(buttPanel);

       /* leftPanel.add(sitesButton);
        leftPanel.add(theraButton);
        leftPanel.add(conButton);
        leftPanel.add(trackButton);
        leftPanel.add(reportButton);*/

        leftPanel.setBorder(BorderFactory.createEtchedBorder());
        add(leftPanel, BorderLayout.WEST);

        centerPanel = new JPanel();
        centerPanel.setBorder(BorderFactory.createEtchedBorder());
        add(centerPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sitesButton){
            Color red = new Color(255,0,0);
            centerPanel.setBackground(red);
        }
        else if(e.getSource() == theraButton){
            Color red = new Color(0,255,0);
            centerPanel.setBackground(red);
        }
        else if(e.getSource() == conButton){
            Color red = new Color(0,0,255);
            centerPanel.setBackground(red);
        }
        else if(e.getSource() == trackButton){
            Color red = new Color(255,0,255);
            centerPanel.setBackground(red);
        }
        else if(e.getSource() == reportButton){
            Color red = new Color(25,25,25);
            centerPanel.setBackground(red);
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainGui mainG = new MainGui();
            }
        });
       }


}
