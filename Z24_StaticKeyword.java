
public class Z24_StaticKeyword {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//          the class "owns" the static member

		Friend friend1 = new Friend("Whiskey");
		Friend friend2 = new Friend("Dumb");
		Friend friend3 = new Friend("Devil");
		
		System.out.println(Friend.numberofFriends);
		
		Friend.displayFriends();
	}

}
