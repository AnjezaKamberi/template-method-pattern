package main.demo;

public class Iphone extends Phone {

	@Override
	public void installApp(App app, User user) {
		System.out.println("I am iPhone and I require you to enter any preauthentication in order to install an app");
		System.out.println("I am going to install on '" + user.getUsername() + "' iPhone the app " + app.getName());

	}

}