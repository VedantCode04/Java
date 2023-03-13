import java.util.*;

class main2 {
	public static void main(String[] args) {
		String name;

		Scanner s = new Scanner(System.in);
		
		System.out.println("enter string: ");

		name = s.nextLine();

		int arr[] = new int[name.length()];

		for(int i = 0; i < name.length(); ++i){
			int count = 0;

			for(int j = 0; j < name.length(); ++j){
				if (name.charAt(i) == name.charAt(j)) {
					count++;
				}
			}

			System.out.println(name.charAt(i) + " occured for " + count + " times.");

		}

	}
}
