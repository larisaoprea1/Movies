package Filme.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Filme.Connection.operations;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class loginWindow extends JFrame {

	private JPanel contentPane;
	private JTextField usernametextField;
	JLabel ErrorLabel = new JLabel("");
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginWindow frame = new loginWindow();
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
	public loginWindow() {
		setResizable(false);
		setBackground(new Color(255, 153, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 334);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		passwordField.setForeground(Color.PINK);
		passwordField.setBackground(new Color(255, 228, 225));
		passwordField.setBounds(133, 140, 142, 20);
		contentPane.add(passwordField);
		
		JLabel UsernameLabel = new JLabel("Username:");
		UsernameLabel.setForeground(Color.WHITE);
		UsernameLabel.setFont(new Font("Source Serif Pro Black", Font.ITALIC, 16));
		UsernameLabel.setBounds(30, 83, 104, 25);
		contentPane.add(UsernameLabel);
		
		ImageIcon image6=new ImageIcon(getImage("/flowers.png"));
		JButton LoginButton = new JButton("Log In");
		LoginButton.setIcon(image6);
		LoginButton.setVerticalTextPosition(SwingConstants.CENTER);
		LoginButton.setHorizontalTextPosition(SwingConstants.CENTER);
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAction(e);
			}
		});
		LoginButton.setBackground(Color.WHITE);
		LoginButton.setForeground(Color.PINK);
		LoginButton.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD | Font.ITALIC, 13));
		LoginButton.setBounds(114, 210, 104, 36);
		contentPane.add(LoginButton);
		
		
		JLabel PasswordLabel = new JLabel("Password:");
		PasswordLabel.setForeground(Color.WHITE);
		PasswordLabel.setFont(new Font("Source Serif Pro Black", Font.ITALIC, 16));
		PasswordLabel.setBounds(30, 136, 104, 25);
		contentPane.add(PasswordLabel);
		
		ImageIcon image=new ImageIcon(getImage("/frame1.png"));
		JLabel FrameLable1  = new JLabel("");
		FrameLable1.setIcon(image);
		FrameLable1.setBounds(10, 0, 114, 84);
		contentPane.add(FrameLable1);
		
		usernametextField = new JTextField();
		usernametextField.setFont(new Font("Source Code Pro Black", Font.BOLD | Font.ITALIC, 13));
		usernametextField.setForeground(Color.PINK);
		usernametextField.setBackground(new Color(255, 228, 225));
		usernametextField.setBounds(133, 86, 142, 20);
		contentPane.add(usernametextField);
		usernametextField.setColumns(10);
		ErrorLabel.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 12));
		ErrorLabel.setForeground(Color.WHITE);
		ErrorLabel.setBounds(30, 61, 195, 18);
		contentPane.add(ErrorLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Create account");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				createAccountAction(e);
			}
		});
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(114, 258, 104, 18);
		contentPane.add(lblNewLabel_1);
		
		ImageIcon image2=new ImageIcon(getImage("/frame2.png"));
		JLabel FrameLabel2 = new JLabel("");
		FrameLabel2.setIcon(image2);
		FrameLabel2.setBounds(258, 0, 114, 84);
		contentPane.add(FrameLabel2);
		
		ImageIcon image3=new ImageIcon(getImage("/frame3.png"));
		JLabel FrameLabel3 = new JLabel("");
		FrameLabel3.setIcon(image3);
		FrameLabel3.setBounds(258, 210, 114, 84);
		contentPane.add(FrameLabel3);
		
		ImageIcon image4=new ImageIcon(getImage("/frame4.png"));
		JLabel FrameLabel4 = new JLabel("");
		FrameLabel4.setIcon(image4);
		FrameLabel4.setBounds(10, 210, 114, 84);
		contentPane.add(FrameLabel4);
		
		ImageIcon image10=new ImageIcon(getImage("/bear2.png"));
		JLabel bunnyearsLabel = new JLabel("");
		bunnyearsLabel.setIcon(image10);
		bunnyearsLabel.setBounds(114, 172, 104, 40);
		contentPane.add(bunnyearsLabel);
		
		ImageIcon image11=new ImageIcon(getImage("/welcome.png"));
		JLabel welcomeLabel = new JLabel("");
		welcomeLabel.setIcon(image11);
		welcomeLabel.setBounds(88, 25, 160, 47);
		contentPane.add(welcomeLabel);
		
		ImageIcon image12=new ImageIcon(getImage("/arrow.png"));
		JLabel arrowLabel = new JLabel("");
		arrowLabel.setIcon(image12);
		arrowLabel.setBounds(220, 240, 61, 61);
		contentPane.add(arrowLabel);
		
		
		
	}
	
	 private Image getImage(String filename) {
	        try {
	            return ImageIO.read(this.getClass().getResourceAsStream(filename));
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        } 
	        }
	 @SuppressWarnings({ "deprecation", "static-access" })
	private void LoginAction(ActionEvent e) {
		 operations operations=new operations();
		 try {
			 String username= usernametextField.getText();
			
			String password= passwordField.getText();
			if(operations.islogin(username, password, this)){
				new mainWindow().setVisible(true);
				this.dispose();		
			}
			else {
				ErrorLabel.setText("Wrong username or password!");
			}
			
		 }catch(Exception e2) {
			 ErrorLabel.setText("Wrong username or password!");

		 }
	 }
	 private void createAccountAction(MouseEvent e1) {
		 new createAccount().setVisible(true);
		 this.dispose();
	 }
}
