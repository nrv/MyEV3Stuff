package name.herve.ev3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lejos.hardware.BrickFinder;
import lejos.hardware.Button;
import lejos.utility.Delay;

public class StartLED {
	private static Logger log = LoggerFactory.getLogger(StartLED.class);

	public static void main(String[] args) {
		log.info("Starting the application");
		
		BrickFinder.setDefault(BrickFinder.getLocal());
		
		Button.LEDPattern(1);
		Delay.msDelay(1000);
		Button.LEDPattern(2);
		Delay.msDelay(1000);
		Button.LEDPattern(3);
		Delay.msDelay(1000);
		Button.LEDPattern(4);
		Delay.msDelay(1000);
		Button.LEDPattern(0);
		
		log.info("Ending the application");
	}

}
