package test;

import org.sikuli.android.ADBClient;
import org.sikuli.android.ADBDevice;
import org.sikuli.android.ADBScreen;
import org.sikuli.script.ScreenImage;

public class main {

	public static void main(String[] args) {
		System.out.println("==================");

		String capturepath = "/Users/zhangyuehua/Desktop";

		ADBScreen screen1 = ADBScreen.start("ZY2247Z7Q2");
		screen1.capture().getFile(capturepath, "ZY2247Z7Q2");
		screen1.aKey(ADBDevice.KEY_HOME);

		ADBScreen screen2 = ADBScreen.start("ZY22477WL2");
		screen2.capture().getFile(capturepath, "ZY22477WL2");
		screen2.aKey(ADBDevice.KEY_HOME);
		
		screen1.stop();
		screen2.stop();
	}

}
