package java_basics;

import someotherpackage.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {
		
		
		String r=MyUtils.printsomejunk("This is the second check");
		
		System.out.println(r);
		
	    MyUtils.sumoftwo(10, 20);
		
		//int one = MyUtils.add10(10);
		
		//System.out.println(one);
		
		ExampleClass.dosomething();
		
		MyUtils.trail("today is");
		
		
		//if static is removed: we are using an instance not using the class myutils directly as changed from my static
		
		MyUtils myvar;
		myvar = new MyUtils();
		int one =myvar.add10(3);
		System.out.println(one);
	
	
	}
	
	
}


