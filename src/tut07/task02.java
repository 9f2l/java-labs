package tut07;
import java.util.ArrayList;
import java.util.List;

public class task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fixedArray[]= {10,20,30};
		ArrayList<Integer> variableArray = new ArrayList<Integer>();
		for(int i=0;i<fixedArray.length;i++) {
			variableArray.add(fixedArray[i]);

	
}
		System.out.println(variableArray);
		System.out.println(variableArray.size());
	}

}
