package main.demo;

public enum InstallationAppType {

	PLAY_STORE("Play Store"), APP_STORE("App Store");

	private InstallationAppType(String type) {
		this.type = type;
	}

	String type;

	public String getType() {
		return type;
	}

}
