package main.demo;

public class Android extends Phone {

	@Override
	public void installApp(App app, User user) {
		System.out.println(
				"I am Android and I do not require you to enter any preauthentication in order to install an app");
		System.out.println("I am going to install on '" + user.getUsername() + "' Android the app " + app.getName());

	}

	@Override
	public void displayMemoryMessage() {
		super.displayMemoryMessage();
		System.out.println("In order to free your space go to Settings ...");
	}

}
