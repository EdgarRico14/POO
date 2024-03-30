class OuterClass {

	
  class NestedClass { // Outer class
    public void my_method() { // Inner class
      System.out.println("This is a nested inner class.");
    }
  }
}

public class PruebaAnidada{
	public static void main(String args[]) { // Main function
		// object of nested class

		OuterClass OuterObj = new OuterClass();
		OuterClass.NestedClass obj = OuterObj.new NestedClass();
		obj.my_method();
	  }
}