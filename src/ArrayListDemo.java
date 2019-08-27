import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] allCodes = {"001","002","003","004","005","006","007","008","009"};
		String[] assignedCodes = {"003", "004"};
		
		String[] unAssignedCodes = getUnassignedCodes(allCodes, assignedCodes);
		
		System.out.println(Arrays.deepToString(unAssignedCodes));
	}
	
	static String[] getUnassignedCodes(String[] allCodes, String[] assignedCodes) {
		List<String> list1 = new ArrayList<String>(Arrays.asList(allCodes));
		List<String> list2 = new ArrayList<String>(Arrays.asList(assignedCodes));

		list1.removeAll(list2);
		
		return list1.toArray(new String[list1.size()]);
	}

}
