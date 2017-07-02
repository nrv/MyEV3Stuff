package name.herve.ev3.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.hardware.BrickInfo;

public class RemoteLED {
	private static Logger log = LoggerFactory.getLogger(RemoteLED.class);

	public static void main(String[] args) {
		try {
			log.info("Starting the application");
			
//			RemoteEV3 ev3 = new RemoteEV3("10.42.0.55");
			
			Brick b = BrickFinder.getLocal();
			if (b != null) {
				log.info(b.getName() + " - " + b.getType());
			}
			
			for (BrickInfo bi : BrickFinder.discover()) {
				log.info(bi.getName() + " - " + bi.getType() + " - " + bi.getIPAddress());
			}
			
			log.info("Ending the application");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}


}
