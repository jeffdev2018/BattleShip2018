package medias;

import javax.sound.sampled.Clip;

import Jeu.Menu;

public class MusicLoop implements Runnable{

	@Override
	public void run() {
		
		
		while (true) {
		Menu.music.getClip().loop(Clip.LOOP_CONTINUOUSLY);
		
			try {
				Thread.sleep(1000);
			} 
			catch(Exception e ){
				
				e.printStackTrace();
			
			}
			
		}
		
		
	}

	
}
