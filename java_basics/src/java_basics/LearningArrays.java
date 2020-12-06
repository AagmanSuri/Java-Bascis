package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		int [] values = new int[100]; //declaring the array of size 100 
				
		values[0]=1000;
		values[99]=93;// n-1 will be the last as it is starting from 0 index
		
		System.out.println(values[99]);
		
		
		String[] words = new String[] {"My","Name","is"};
		System.out.println(words[2] +" " +words[1]);
		
		int [] ararynew = new int[] {100000,1};
		
		//ararynew[0]=1000;
		System.out.println(ararynew[0]);
				String [] name = new String[100];
				name[0]="ram";
				System.out.println(name[0]);
		
 
	}

}
