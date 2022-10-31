
public class Friend {

	String name;
	static int numberofFriends;
	
	//int numberofFriends;      shows # of friends in one object 
	
	Friend(String name){       //instantiate = creating a object!
		this.name = name;
		numberofFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+numberofFriends+" friends ");
	}
}
