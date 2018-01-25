package Jeu;

import java.awt.EventQueue;
import java.nio.channels.SelectableChannel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import medias.Intro;
import medias.MusicLoop;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MenuJeu {
	
	

	

		private JFrame frame;
		
	
	private JTextField txtFiledPort;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			
	 
	    
	    Thread musicPlay=new Thread(new MusicLoop());
	    musicPlay.start();
			
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MenuJeu window = new MenuJeu();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public MenuJeu() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			//frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/medias/background.jpg")));
			frame.setBounds(100, 100, 1420, 820);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/medias/background.jpg")));
			frame.getContentPane().setLayout(null);
			
			
			JButton playBoutton = new JButton("Jouer");
			playBoutton.setFont(new Font("Tahoma", Font.BOLD, 18));
			playBoutton.setBounds(124, 576, 172, 66);
			frame.getContentPane().add(playBoutton);
			
			JButton btnExit = new JButton("Exit");
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				frame.dispose();
				
				//	Menu.music.stop();
					
				}
			});
			btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnExit.setBounds(124, 668, 172, 66);
			frame.getContentPane().add(btnExit);
			
			JButton btnAi = new JButton("Contre AI");
			btnAi.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnAi.setBounds(124, 294, 172, 66);
			frame.getContentPane().add(btnAi);
			
			JButton btnReseau = new JButton("Reseau");
			btnReseau.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnReseau.setBounds(124, 370, 172, 66);
			frame.getContentPane().add(btnReseau);
			
			txtFiledPort = new JTextField();
			txtFiledPort.setHorizontalAlignment(SwingConstants.CENTER);
			txtFiledPort.setBounds(419, 389, 185, 47);
			frame.getContentPane().add(txtFiledPort);
			txtFiledPort.setColumns(10);
			
			JLabel lblPort = new JLabel("PORT");
			lblPort.setHorizontalAlignment(SwingConstants.CENTER);
			lblPort.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblPort.setBounds(306, 389, 145, 47);
			frame.getContentPane().add(lblPort);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(0, 0, 1404, 781);
			lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/medias/background.jpg")));
			frame.getContentPane().add(lblNewLabel);
			
		
		
		
		}
	}



