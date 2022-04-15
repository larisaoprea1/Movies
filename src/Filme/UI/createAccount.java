package Filme.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Filme.Connection.connection;

import javax.swing.JLabel;
import java.awt.Color;
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
import java.awt.Image;

public class createAccount extends JFrame {

	private JPanel contentPane;
	private JTextField usernametxtField;
	private JTextField passwordtxtField;
	JLabel succesLabel = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createAccount frame = new createAccount();
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
	public createAccount() {
		setBackground(new Color(255, 153, 153));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 308);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create Account");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Source Sans Pro Black", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(130, 25, 121, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Add Username");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(34, 74, 108, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Add Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(34, 128, 111, 17);
		contentPane.add(lblNewLabel_2);
		
		usernametxtField = new JTextField();
		usernametxtField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		usernametxtField.setForeground(Color.PINK);
		usernametxtField.setBackground(new Color(255, 228, 225));
		usernametxtField.setBounds(174, 77, 108, 20);
		contentPane.add(usernametxtField);
		usernametxtField.setColumns(10);
		
		passwordtxtField = new JTextField();
		passwordtxtField.setForeground(Color.PINK);
		passwordtxtField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 11));
		passwordtxtField.setBackground(new Color(255, 228, 225));
		passwordtxtField.setBounds(174, 127, 108, 20);
		contentPane.add(passwordtxtField);
		passwordtxtField.setColumns(10);
		
		ImageIcon image5=new ImageIcon(getImage("/flowers.png"));
		JButton backButton = new JButton("Back");
		backButton.setIcon(image5);
		backButton.setVerticalTextPosition(SwingConstants.CENTER);
		backButton.setHorizontalTextPosition(SwingConstants.CENTER);
		backButton.setBackground(Color.WHITE);
		backButton.setForeground(Color.PINK);
		backButton.setFont(new Font("Source Sans Pro ExtraLight", Font.BOLD | Font.ITALIC, 13));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backButtonAction(e);
			}
		});
		backButton.setBounds(222, 197, 89, 23);
		contentPane.add(backButton);
		
		ImageIcon image6=new ImageIcon(getImage("/flowers.png"));
		JButton createAccountButton = new JButton("Create Account");
		createAccountButton.setIcon(image6);
		createAccountButton.setVerticalTextPosition(SwingConstants.CENTER);
		createAccountButton.setHorizontalTextPosition(SwingConstants.CENTER);
		createAccountButton.setBackground(Color.WHITE);
		createAccountButton.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD | Font.ITALIC, 13));
		createAccountButton.setForeground(Color.PINK);
		createAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					createButtonAction(e);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		createAccountButton.setBounds(60, 186, 129, 44);
		contentPane.add(createAccountButton);
		succesLabel.setForeground(Color.WHITE);
		succesLabel.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 12));
		succesLabel.setBackground(new Color(255, 255, 255));
		
		
		succesLabel.setBounds(101, 228, 193, 19);
		contentPane.add(succesLabel);
		
		ImageIcon image=new ImageIcon(getImage("/frame1.png"));
		JLabel FrameLableAc1 = new JLabel("");
		FrameLableAc1.setIcon(image);
		FrameLableAc1.setBounds(5, 0, 114, 84);
		contentPane.add(FrameLableAc1);
		
		ImageIcon image2=new ImageIcon(getImage("/frame2.png"));
		JLabel FrameLableAc2 = new JLabel("");
		FrameLableAc2.setIcon(image2);
		FrameLableAc2.setBounds(286, 0, 114, 84);
		contentPane.add(FrameLableAc2);
		
		ImageIcon image3=new ImageIcon(getImage("/frame3.png"));
		JLabel FrameLableAc3 = new JLabel("");
		FrameLableAc3.setIcon(image3);
		FrameLableAc3.setBounds(286, 186, 114, 84);
		contentPane.add(FrameLableAc3);
		
		ImageIcon image4=new ImageIcon(getImage("/frame4.png"));
		JLabel FrameLableAc4 = new JLabel("");
		FrameLableAc4.setIcon(image4);
		FrameLableAc4.setBounds(5, 186, 114, 84);
		contentPane.add(FrameLableAc4);
		
		ImageIcon image7=new ImageIcon(getImage("/bear.png"));
		JLabel bearLabel = new JLabel("");
		bearLabel.setIcon(image7);
		bearLabel.setBounds(60, 151, 129, 38);
		contentPane.add(bearLabel);
		
		ImageIcon image8=new ImageIcon(getImage("/bunny.png"));
		JLabel bunnyLabel = new JLabel("");
		bunnyLabel.setIcon(image8);
		bunnyLabel.setBounds(286, 170, 50, 50);
		contentPane.add(bunnyLabel);
	}

	
	 private Image getImage(String filename) {
	        try {
	            return ImageIO.read(this.getClass().getResourceAsStream(filename));
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        } 
	        }
	private void createButtonAction(ActionEvent e) throws Exception {
		String query="INSERT INTO users (`nume`,`parola`) VALUES (?,?)";
		String username= usernametxtField.getText();
		String password= passwordtxtField.getText();
		try {
			 PreparedStatement ps= connection.getconnection().prepareStatement(query);
			 ps.setString(1,username);
			 ps.setString(2,password);
			 succesLabel.setText("You created the account!"); 
			 ps.executeUpdate();
		 }catch(SQLException e3) {
			 e3.printStackTrace();
		 }
	}
	private void backButtonAction(ActionEvent e) {
		new loginWindow().setVisible(true);
		this.dispose();
		
	}
}
