package Jeu;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	
	public Fenetre () {
		setSize(1200, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(0, 2,0,0));;
		JPanel panelGrilleGauche=new JPanel();
		JPanel panelGrilleDroite=new JPanel();
		panelGrilleGauche.setLayout(new GridLayout(5, 5));
		for (int i=0;i<25;i++) {
			
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
		getContentPane().add(panelGrilleGauche);
		
		
		panelGrilleDroite.setLayout(new GridLayout(5,5));
		for (int i = 0; i < 25; i++) {
			JButton btn=new JButton(""+i);
			btn.setEnabled(false);
			panelGrilleDroite.add(btn);
			
		}
		getContentPane().add(panelGrilleDroite);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
	new Fenetre();

	}

}
