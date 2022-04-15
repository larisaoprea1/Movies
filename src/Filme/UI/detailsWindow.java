package Filme.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Filme.Connection.connection;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class detailsWindow extends JFrame {

	private JPanel contentPane;
	private JTextField nametextField;
	private JTextField genretextField;
	private JTextField yeartextField;
	private JTextField IMDBRatingtextField;
	private JTextField mainactorstextField;
	private JTextField directortextField;
	JTextArea synopsistextArea = new JTextArea();
	JLabel MsgLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					detailsWindow frame = new detailsWindow();
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
	public detailsWindow() {
		setForeground(Color.PINK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 694, 421);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setForeground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(56, 77, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setForeground(Color.WHITE);
		lblGenre.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblGenre.setBounds(56, 124, 46, 14);
		contentPane.add(lblGenre);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setForeground(Color.WHITE);
		lblYear.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblYear.setBounds(56, 166, 46, 14);
		contentPane.add(lblYear);
		
		JLabel lblImbdRating = new JLabel("IMBD Rating");
		lblImbdRating.setForeground(Color.WHITE);
		lblImbdRating.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblImbdRating.setBounds(226, 77, 90, 14);
		contentPane.add(lblImbdRating);
		
		JLabel lblMainActors = new JLabel("Main Actors");
		lblMainActors.setForeground(Color.WHITE);
		lblMainActors.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblMainActors.setBounds(226, 124, 90, 14);
		contentPane.add(lblMainActors);
		
		JLabel lblDirector = new JLabel("Director");
		lblDirector.setForeground(Color.WHITE);
		lblDirector.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblDirector.setBounds(226, 166, 90, 14);
		contentPane.add(lblDirector);
		
		JLabel lblSynopsisi = new JLabel("Synopsis");
		lblSynopsisi.setForeground(Color.WHITE);
		lblSynopsisi.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblSynopsisi.setBounds(43, 191, 76, 14);
		contentPane.add(lblSynopsisi);
		
		nametextField = new JTextField();
		nametextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		nametextField.setForeground(Color.PINK);
		nametextField.setBackground(new Color(255, 228, 225));
		nametextField.setEditable(false);
		nametextField.setBounds(112, 75, 86, 20);
		contentPane.add(nametextField);
		nametextField.setColumns(10);
		
		genretextField = new JTextField();
		genretextField.setForeground(Color.PINK);
		genretextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		genretextField.setBackground(new Color(255, 228, 225));
		genretextField.setBounds(112, 122, 86, 20);
		contentPane.add(genretextField);
		genretextField.setColumns(10);
		
		yeartextField = new JTextField();
		yeartextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		yeartextField.setForeground(Color.PINK);
		yeartextField.setBackground(new Color(255, 228, 225));
		yeartextField.setBounds(112, 164, 86, 20);
		contentPane.add(yeartextField);
		yeartextField.setColumns(10);
		
		IMDBRatingtextField = new JTextField();
		IMDBRatingtextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		IMDBRatingtextField.setForeground(Color.PINK);
		IMDBRatingtextField.setBackground(new Color(255, 228, 225));
		IMDBRatingtextField.setBounds(326, 75, 83, 20);
		contentPane.add(IMDBRatingtextField);
		IMDBRatingtextField.setColumns(10);
		
		mainactorstextField = new JTextField();
		mainactorstextField.setForeground(Color.PINK);
		mainactorstextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		mainactorstextField.setBackground(new Color(255, 228, 225));
		mainactorstextField.setBounds(326, 122, 83, 20);
		contentPane.add(mainactorstextField);
		mainactorstextField.setColumns(10);
		
		directortextField = new JTextField();
		directortextField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		directortextField.setForeground(Color.PINK);
		directortextField.setBackground(new Color(255, 228, 225));
		directortextField.setBounds(326, 164, 280, 20);
		contentPane.add(directortextField);
		directortextField.setColumns(10);
		
		ImageIcon image7=new ImageIcon(getImage("/flowers.png"));
		JButton editButton = new JButton("Edit");
		editButton.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD | Font.ITALIC, 13));
		editButton.setBackground(Color.WHITE);
		editButton.setIcon(image7);
		editButton.setVerticalTextPosition(SwingConstants.CENTER);
		editButton.setHorizontalTextPosition(SwingConstants.CENTER);
		editButton.setForeground(new Color(255, 204, 204));
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editActionListener(e);
			}
		});
		
		
		synopsistextArea.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		synopsistextArea.setBackground(new Color(255, 228, 225));
		synopsistextArea.setForeground(Color.PINK);
		synopsistextArea.setBounds(43, 216, 571, 106);
		contentPane.add(synopsistextArea);
		editButton.setBounds(507, 112, 99, 39);
		contentPane.add(editButton);
		
		JLabel lblNewLabel_1 = new JLabel("Edit here");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(520, 97, 127, 14);
		contentPane.add(lblNewLabel_1);
		
		
		MsgLabel.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		MsgLabel.setForeground(Color.WHITE);
		MsgLabel.setBounds(43, 340, 259, 31);
		contentPane.add(MsgLabel);
		details();
	}
	private Image getImage(String filename) {
        try {
            return ImageIO.read(this.getClass().getResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } 
        } 
	private void details() {
		String Query="SELECT `Name`,`Genre`,`Year`,`IMDB Rating`,`Main Actors`,`Director`,`Synopsis` FROM filmetable WHERE Name=?";
		String name=mainWindow.getname();
		try {
			PreparedStatement ps=connection.getconnection().prepareStatement(Query);
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			rs.next();
			String name1=rs.getString("Name");
			String genre=rs.getString("Genre");
			int year=rs.getInt("Year");
			String IMDBRating=rs.getString("IMDB Rating");
			String mainactors=rs.getString("Main Actors");
			String director=rs.getString("Director");
			String synopsis=rs.getString("Synopsis");
			nametextField.setText(name1);
			genretextField.setText(genre);
			yeartextField.setText(Integer.toString(year));
			IMDBRatingtextField.setText(IMDBRating);
			mainactorstextField.setText(mainactors);
			directortextField.setText(director);
			synopsistextArea.setText(synopsis);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void editActionListener(ActionEvent e) {
		String Query="UPDATE filmetable set `Genre`=?,`Year`=?,`IMDB Rating`=?,`Main Actors`=?,`Director`=?,`Synopsis`=? WHERE Name=?";
		try {
			PreparedStatement ps=connection.getconnection().prepareStatement(Query);
			ps.setString(1, genretextField.getText());
			ps.setInt(2, Integer.parseInt(yeartextField.getText()));
			ps.setString(3, IMDBRatingtextField.getText());
			ps.setString(4, mainactorstextField.getText());
			ps.setString(5, directortextField.getText());
			ps.setString(6, synopsistextArea.getText());
			ps.setString(7, nametextField.getText());
			ps.executeUpdate();
			MsgLabel.setText("Edit succesfully done!");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
