package Filme.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Filme.Connection.connection;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Dimension;
import javax.swing.JTextArea;

public class insertWindow extends JFrame {

	private JPanel contentPane;
	private JTextField nametextField;
	private JTextField genretextField;
	private JTextField yeartextField;
	private JTextField IMDBRatingtextField;
	private JTextField directortextField;
	private JTextField mainactorstextField;
	private JLabel MsgLabel;
	JTextArea synopsistextArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertWindow frame = new insertWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public insertWindow() {
		setResizable(false);
		setBounds(100, 100, 737, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		nameLabel.setBounds(72, 96, 46, 14);
		contentPane.add(nameLabel);
		
		JLabel genreLabel_1 = new JLabel("Genre");
		genreLabel_1.setForeground(Color.WHITE);
		genreLabel_1.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		genreLabel_1.setBounds(72, 134, 46, 14);
		contentPane.add(genreLabel_1);
		
		JLabel yearLabel_2 = new JLabel("Year");
		yearLabel_2.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		yearLabel_2.setForeground(Color.WHITE);
		yearLabel_2.setBounds(72, 177, 46, 14);
		contentPane.add(yearLabel_2);
		
		JLabel IMDBRatingLabel_3 = new JLabel("IMDB Rating");
		IMDBRatingLabel_3.setForeground(Color.WHITE);
		IMDBRatingLabel_3.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		IMDBRatingLabel_3.setBounds(72, 218, 95, 14);
		contentPane.add(IMDBRatingLabel_3);
		
		JLabel directorLabel_4 = new JLabel("Director");
		directorLabel_4.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		directorLabel_4.setForeground(Color.WHITE);
		directorLabel_4.setBounds(72, 254, 95, 14);
		contentPane.add(directorLabel_4);
		
		JLabel mainactorsLabel_5 = new JLabel("Main Actors");
		mainactorsLabel_5.setForeground(Color.WHITE);
		mainactorsLabel_5.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		mainactorsLabel_5.setBounds(72, 294, 95, 14);
		contentPane.add(mainactorsLabel_5);
		
		JLabel synopsisLabel_6 = new JLabel("Synopsis");
		synopsisLabel_6.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		synopsisLabel_6.setForeground(Color.WHITE);
		synopsisLabel_6.setBounds(411, 67, 110, 18);
		contentPane.add(synopsisLabel_6);
		
		
		nametextField = new JTextField();
		nametextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		nametextField.setForeground(Color.PINK);
		nametextField.setBackground(new Color(255, 228, 225));
		nametextField.setBounds(192, 94, 86, 20);
		contentPane.add(nametextField);
		nametextField.setColumns(10);
		
		genretextField = new JTextField();
		genretextField.setForeground(Color.PINK);
		genretextField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		genretextField.setBackground(new Color(255, 228, 225));
		genretextField.setBounds(192, 132, 86, 20);
		contentPane.add(genretextField);
		genretextField.setColumns(10);
		
		yeartextField = new JTextField();
		yeartextField.setForeground(Color.PINK);
		yeartextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		yeartextField.setBackground(new Color(255, 228, 225));
		yeartextField.setBounds(192, 175, 86, 20);
		contentPane.add(yeartextField);
		yeartextField.setColumns(10);
		
		IMDBRatingtextField = new JTextField();
		IMDBRatingtextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		IMDBRatingtextField.setForeground(Color.PINK);
		IMDBRatingtextField.setBackground(new Color(255, 228, 225));
		IMDBRatingtextField.setBounds(192, 216, 86, 20);
		contentPane.add(IMDBRatingtextField);
		IMDBRatingtextField.setColumns(10);
		
		directortextField = new JTextField();
		directortextField.setForeground(Color.PINK);
		directortextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		directortextField.setBackground(new Color(255, 228, 225));
		directortextField.setBounds(192, 252, 86, 20);
		contentPane.add(directortextField);
		directortextField.setColumns(10);
		
		mainactorstextField = new JTextField();
		mainactorstextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		mainactorstextField.setForeground(Color.PINK);
		mainactorstextField.setBackground(new Color(255, 228, 225));
		mainactorstextField.setBounds(192, 292, 86, 20);
		contentPane.add(mainactorstextField);
		mainactorstextField.setColumns(10);
		
		ImageIcon image7=new ImageIcon(getImage("/flowers.png"));
		JButton inserttButton = new JButton("Insert");
		inserttButton.setBackground(Color.WHITE);
		inserttButton.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD | Font.ITALIC, 13));
		inserttButton.setForeground(Color.PINK);
		inserttButton.setIcon(image7);
		inserttButton.setVerticalTextPosition(SwingConstants.CENTER);
		inserttButton.setHorizontalTextPosition(SwingConstants.CENTER);
		inserttButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					insertActionListener(e);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		inserttButton.setBounds(484, 326, 118, 37);
		contentPane.add(inserttButton);
		
		MsgLabel = new JLabel("");
		MsgLabel.setForeground(Color.WHITE);
		MsgLabel.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		MsgLabel.setBounds(177, 390, 263, 14);
		contentPane.add(MsgLabel);
		
		ImageIcon image2=new ImageIcon(getImage("/hearts.png"));
		JLabel heartsLabel = new JLabel("");
		heartsLabel.setIcon(image2);
		heartsLabel.setBounds(36, 57, 280, 322);
		contentPane.add(heartsLabel);
		
		JLabel lblNewLabel = new JLabel("FILME");
		lblNewLabel.setFont(new Font("Freestyle Script", Font.BOLD, 33));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(143, 32, 118, 37);
		contentPane.add(lblNewLabel);
		synopsistextArea.setForeground(Color.PINK);
		synopsistextArea.setFont(new Font("Source Sans Pro Black", Font.BOLD | Font.ITALIC, 11));
		synopsistextArea.setBackground(new Color(255, 228, 225));
		
		
		synopsistextArea.setBounds(406, 105, 196, 163);
		contentPane.add(synopsistextArea);
		
	
		
	}
	private Image getImage(String filename) {
        try {
            return ImageIO.read(this.getClass().getResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } 
        }
	private void insertActionListener( ActionEvent e)  {
		String insertQuery="INSERT INTO filmetable(`Name`,`Genre`,`Year`,`IMDB Rating`,`Director`,`Main Actors`,`Synopsis`) VALUES (?,?,?,?,?,?,?)";
		String Name=nametextField.getText();
		String Genre=genretextField.getText();
		String Year=yeartextField.getText();
		String IMDBRating=IMDBRatingtextField.getText();
		String Director=directortextField.getText();
		String MainActors=mainactorstextField.getText();
		String Synopsis=synopsistextArea.getText();
		try {
			PreparedStatement ps=connection.getconnection().prepareStatement(insertQuery);
			ps.setString(1, Name);
			ps.setString(2, Genre);
			ps.setInt(3, Integer.parseInt(Year));
			ps.setString(4, IMDBRating);
			ps.setString(5, MainActors);
			ps.setString(6,Director);
			ps.setString(7, Synopsis);
			ps.executeUpdate();
			MsgLabel.setText("Insert succesfully");
		}catch(SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			MsgLabel.setText("Wrong data input");
			e1.printStackTrace();
		}
	}
}
