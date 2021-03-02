package main.demo;

public class PhoneTester {

	static final String APP_TO_INSTALL = "OTPBankAlbania";
	static final String USERNAME = "aTester";
	static final String PASSWORD = "a@123+";

	public static void main(String[] args) {

		System.out.println("TESTING INSTALLATION PROCESS ON IPHONE AND SAMSUNG");

		System.out.println("\nRESULT 1\n");
		Phone phone = new Iphone();
		phone.installProduct(new User(USERNAME, PASSWORD), InstallationAppType.APP_STORE, APP_TO_INSTALL);

		System.out.println("\nRESULT 2\n");
		phone = new Android();
		phone.installProduct(new User(USERNAME, PASSWORD), InstallationAppType.PLAY_STORE, APP_TO_INSTALL);
	}

}