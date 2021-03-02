package main.demo;

public abstract class Phone {

	public final void installProduct(User authenticatedUser, InstallationAppType installationAppType,
			String appToInstall) {
		startPhone(authenticatedUser);
		openDownloadApp(installationAppType);
		try {
			App app = findApp(appToInstall);
			if (hasFreeMemory(authenticatedUser, app)) {
				installApp(app, authenticatedUser);
				openApp(app);
			} else {
				displayMemoryMessage();
			}
		} catch (NullPointerException e) {
			displayErrorMessage();
		} finally {
			closeDownaloadApp(installationAppType);
		}

	}

	public void startPhone(User authenticatedUser) {

		System.out.println("Hello " + authenticatedUser.getUsername());

	}

	public void openDownloadApp(InstallationAppType installationAppType) {
		System.out.println("Search and install your favorite apps only at '" + installationAppType.getType() + "'");
	};

	public App findApp(String appToInstall) {
		System.out.println("Query in database for app with name '" + appToInstall + "'");
		System.out.println("App exists with size of 500 MB");
		return new App(appToInstall, 500);
	}

	public abstract void installApp(App app, User user);

	public void openApp(App app) {
		System.out.println("Thank you for installing '" + app.getName() + "' app!");
	}

	public void closeDownaloadApp(InstallationAppType installationAppType) {
		System.out.println(
				"Thank you for choosing '" + installationAppType.getType() + "' app! We hope to see you again!");
	}

	public boolean hasFreeMemory(User authenticatedUser, App app) {
		System.out.println(
				"I will query in database for '" + authenticatedUser.getUsername() + "' and take free memory!");
		int assumedSizeOfFreeSpace = 1000;
		if (assumedSizeOfFreeSpace > app.getSize()) {
			return true;
		} else {
			return false;
		}
	}

	public void displayMemoryMessage() {
		System.out.println("You do not have free memory on your device! ");
	}

	public void displayErrorMessage() {
		System.out.println("App does not exist!");
	}

}
