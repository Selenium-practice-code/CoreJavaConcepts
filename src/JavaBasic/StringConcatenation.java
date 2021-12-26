package JavaBasic;

public class StringConcatenation {

	public static void main(String[] args) {
		 
		int a= 100;
		int b=200;
		
		String x = "Hello";
		String y = "World";

		// left to right execution
		System.out.println(a+b); //300
		System.out.println(x+y); //Hello world
		System.out.println(a+b+x+y); //300HelloWorld
		System.out.println(x+y+a+b); //HelloWorld100200
		
		System.out.println(x+y+(a+b)); //HelloWorld300
		
		System.out.println("value of b " + b); //200


	}

}
