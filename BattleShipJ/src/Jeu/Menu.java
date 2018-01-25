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

public class Menu  {

	private JFrame frame;
	
public static Intro music;	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
    music=new Intro("/medias/intro.wav");
    
    Thread musicPlay=new Thread(new MusicLoop());
    musicPlay.start();
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
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
		playBoutton.setBounds(124, 280, 172, 66);
		frame.getContentPane().add(playBoutton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			frame.dispose();
			
			//	Menu.music.stop();
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(124, 367, 172, 66);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1404, 781);
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/medias/background.jpg")));
		frame.getContentPane().add(lblNewLabel);
		
	
	
	
	}

	
	
}
