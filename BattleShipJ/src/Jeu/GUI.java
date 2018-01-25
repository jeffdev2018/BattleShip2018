package Jeu;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class GUI extends JFrame{

	private static final String CENTER = null;
	private JFrame frame;
	private JTextField textFieldChat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(new Rectangle(0, 0, 1250, 850));
		frame.setBounds(100, 100, 1420, 820);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldChat = new JTextField();
		textFieldChat.setBounds(1066, 40, 308, 140);
		frame.getContentPane().add(textFieldChat);
		textFieldChat.setColumns(10);
		
		JButton sendMessageChat = new JButton("Send");
		sendMessageChat.setBounds(1289, 190, 85, 51);
		frame.getContentPane().add(sendMessageChat);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(1078, 696, 125, 43);
		frame.getContentPane().add(btnReset);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBounds(1235, 697, 125, 41);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panelGrilleGauche = new JPanel();
		panelGrilleGauche.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGrilleGauche.setBounds(10, 38, 509, 499);
		frame.getContentPane().add(panelGrilleGauche);
		JPanel panelGrilleDroite = new JPanel();
		panelGrilleGauche.setLayout(new GridLayout(10, 12));
		for (int i=0;i<60;i++) {
			
			JButton btn=new JButton(""+i);
			btn.setActionCommand(""+i);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			btn.setBackground(Color.ORANGE);
			((JButton)panelGrilleDroite.getComponent(Integer.parseInt(btn.getActionCommand()))).setBackground(Color.GREEN);
			
			}
		} );
		
		panelGrilleGauche.add(btn);
		
		}
		
		
		
		panelGrilleDroite.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGrilleDroite.setBounds(529, 38, 509, 499);
		frame.getContentPane().add(panelGrilleDroite);
		//((JButton)panelGrilleDroite.getComponent(Integer.parseInt(btn.getActionCommand()))).setBackground(Color.GREEN);
		
		panelGrilleDroite.setLayout(new GridLayout(10,12));
		for (int i = 0; i < 60; i++) {
			JButton btn=new JButton(""+i);
			btn.setEnabled(false);
			btn.setActionCommand(""+i);
			
			panelGrilleDroite.add(btn);
		
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(GUI.class.getResource("/medias/Sousmarin1Case.png")));
		lblNewLabel.setBounds(609, 564, 270, 77);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(GUI.class.getResource("/medias/Bateau1Case.png")));
		label.setBounds(597, 644, 270, 99);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(GUI.class.getResource("/medias/Bateau5Cases.png")));
		lblNewLabel_1.setBounds(18, 541, 299, 100);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(GUI.class.getResource("/medias/Bateau4Cases.png")));
		label_1.setBounds(9, 643, 299, 100);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(GUI.class.getResource("/medias/Bateau3Cases.png")));
		label_2.setBounds(300, 541, 299, 100);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(GUI.class.getResource("/medias/Bateau2Cases.png")));
		label_3.setBounds(288, 643, 299, 100);
		frame.getContentPane().add(label_3);
	}
	}
}
