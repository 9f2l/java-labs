package tut07;


import java.util.ArrayList;

public class tut07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sList = new ArrayList<String>( );
		System.out.println("Size of ArrayList at creation: " + sList.size());
		  //Lets add some elements to it
		  sList.add("fred");
		  sList.add("alice");
		  sList.add("bob");
		  System.out.println("Size of ArrayList after adding elements: " + sList.size() + sList);
		  
		  sList.add("sue");
		  System.out.println("Size of ArrayList after adding elements: " + sList.size()+ sList);
		  sList.remove("fred");
		  sList.remove("Alice");
		  System.out.println("Size of ArrayList after adding elements: " + sList.size()+ sList);
		  

	}

}
