package medias;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Intro{
	
	private Clip c;
	
	public Intro(String son) {
		
		try {
			AudioInputStream ai=AudioSystem.getAudioInputStream(getClass().getResource(son));
			c=AudioSystem.getClip();
			c.open(ai);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void play() {
		
		c.start();
		
	}
	public void stop() {
		c.stop();
	}
	public Clip getClip() {
		
return c;
	}
	
	
	public static void playtempSound(String son) {
		Intro s =new Intro(son);
		s.play();
		
	}
	public static void StoptempSound(String son) {
		Intro s =new Intro(son);
		s.stop();
		
	}
	
}
	
	 
	
