package Filme.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Filme.Connection.connection;
import net.proteanit.sql.DbUtils;

import java.awt.GridBagLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class mainWindow extends JFrame {

	private JPanel contentPane;
	JLabel WindowLabel = new JLabel("");
	private JButton CreateTable;
	private static JTable table;
	private JButton DeleteButton;
	private JButton DetailsButton;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
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
	public mainWindow() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 972, 621);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		WindowLabel.setBounds(322, 476, 90, 53);
		contentPane.add(WindowLabel);
		
		ImageIcon image6=new ImageIcon(getImage("/flowers.png"));
		JButton InsertButton = new JButton("Insert");
		InsertButton.setForeground(Color.PINK);
		InsertButton.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD | Font.ITALIC, 13));
		InsertButton.setBackground(Color.WHITE);
		InsertButton.setIcon(image6);
		InsertButton.setVerticalTextPosition(SwingConstants.CENTER);
		InsertButton.setHorizontalTextPosition(SwingConstants.CENTER);
		InsertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertActionListener(e);
			}
		});
		InsertButton.setBounds(186, 310, 99, 38);
		contentPane.add(InsertButton);
		
		ImageIcon image8=new ImageIcon(getImage("/flowers.png"));
		CreateTable = new JButton("Load");
		CreateTable.setForeground(Color.PINK);
		CreateTable.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD | Font.ITALIC, 13));
		CreateTable.setBackground(Color.WHITE);
		CreateTable.setIcon(image8);
		CreateTable.setVerticalTextPosition(SwingConstants.CENTER);
		CreateTable.setHorizontalTextPosition(SwingConstants.CENTER);
		CreateTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					createActionListener(e);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		CreateTable.setBounds(704, 41, 99, 43);
		contentPane.add(CreateTable);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(406, 99, 523, 366);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setGridColor(new Color(255, 175, 175));
		table.setSelectionForeground(Color.WHITE);
		table.setSelectionBackground(Color.PINK);
		table.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 13));
		table.setForeground(Color.WHITE);
		table.setBackground(new Color(255, 192, 203));
		scrollPane.setViewportView(table);
		
		ImageIcon image7=new ImageIcon(getImage("/flowers.png"));
		DeleteButton = new JButton("Delete");
		DeleteButton.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD | Font.ITALIC, 13));
		DeleteButton.setForeground(Color.PINK);
		DeleteButton.setBackground(Color.WHITE);
		DeleteButton.setIcon(image7);
		DeleteButton.setVerticalTextPosition(SwingConstants.CENTER);
		DeleteButton.setHorizontalTextPosition(SwingConstants.CENTER);
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteActionListener(e);
				try {
					createActionListener(e);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		DeleteButton.setBounds(196, 481, 89, 33);
		contentPane.add(DeleteButton);
		
		ImageIcon image9=new ImageIcon(getImage("/flowers.png"));
		DetailsButton = new JButton("Details");
		DetailsButton.setFont(new Font("Source Serif Pro ExtraLight", Font.BOLD | Font.ITALIC, 13));
		DetailsButton.setBackground(Color.WHITE);
		DetailsButton.setForeground(new Color(255, 204, 204));
		DetailsButton.setIcon(image9);
		DetailsButton.setVerticalTextPosition(SwingConstants.CENTER);
		DetailsButton.setHorizontalTextPosition(SwingConstants.CENTER);
		DetailsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsActionListener(e);
			}
		});
		DetailsButton.setBounds(751, 476, 106, 43);
		contentPane.add(DetailsButton);
		
		JLabel lblNewLabel = new JLabel("Generate   the table");
		lblNewLabel.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(505, 35, 153, 53);
		contentPane.add(lblNewLabel);
		
		ImageIcon image10=new ImageIcon(getImage("/arrow2.png"));
		JLabel arrowLabel_1 = new JLabel("");
		arrowLabel_1.setIcon(image10);
		arrowLabel_1.setBounds(656, 31, 71, 53);
		contentPane.add(arrowLabel_1);
		
		lblNewLabel_1 = new JLabel("More infomation about the movie here");
		lblNewLabel_1.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(474, 478, 267, 38);
		contentPane.add(lblNewLabel_1);
		
		ImageIcon image13=new ImageIcon(getImage("/hi.png"));
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(image13);
		lblNewLabel_3.setBounds(88, 41, 197, 194);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("Add a movie ");
		lblNewLabel_5.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(49, 310, 127, 38);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_2 = new JLabel("Delete a movie");
		lblNewLabel_2.setFont(new Font("Source Serif Pro Black", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(49, 476, 108, 48);
		contentPane.add(lblNewLabel_2);
		table.setDefaultEditor(Object.class, null); 
	}
	private void insertActionListener(ActionEvent e) {
		new insertWindow().setVisible(true);;
	}
	private void createActionListener(ActionEvent e) throws Exception {
		try {
			Statement stmt=connection.getconnection().createStatement();
			String Query="SELECT `Name`,`Genre`,`Year`,`IMDB Rating`,`Director` FROM filmetable";
			ResultSet rs=stmt.executeQuery(Query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
			rs=stmt.getResultSet();
			stmt.close();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	private void deleteActionListener(ActionEvent e) {
		String name=table.getValueAt(table.getSelectedRow(), 0).toString();
		String Query="DELETE from filmetable where Name=?";
		PreparedStatement ps;
		try {
			ps = connection.getconnection().prepareStatement(Query);
			ps.setString(1, name);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	private Image getImage(String filename) {
        try {
            return ImageIO.read(this.getClass().getResourceAsStream(filename));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } 
        } 
	public static String getname() {
		String name=table.getValueAt(table.getSelectedRow(), 0).toString();
		return name;
	}
	private void detailsActionListener(ActionEvent e) {
		new detailsWindow().setVisible(true);
	}
}
