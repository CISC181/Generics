package pkgGeneric;

public class GenericStackTest {

	public static void main(String[] args) {
		/*
		String str1 = new String("a");
		String str2 = new String("b");
		String str3 = new String("c");
		
		GenericStack<String> myStack = new GenericStack<String>();
		myStack.push(str1);
		myStack.push(str2);
		myStack.push(str3);
		
		System.out.println(myStack.getSize());
		
		System.out.println(myStack.pop());
		System.out.println(myStack.getSize());
		*/
		
		Integer i1 = 1;
		Integer i2 = 2;
		Integer i3 = 3;
		
		GenericStack<Integer> myIntegerStack = new GenericStack<Integer>();
		
		
		myIntegerStack.push(i1);
		myIntegerStack.push(i2);
		myIntegerStack.push(i3);
		
		System.out.println(myIntegerStack.getSize());
		
		System.out.println(myIntegerStack.pop());
		System.out.println(myIntegerStack.getSize());		
		
	}

}
