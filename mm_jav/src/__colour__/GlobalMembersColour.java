package __colour__;

public class GlobalMembersColour {

//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern str *const_0, *const_1, *const_2, *const_3, *const_4, *const_5;

//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
	//class Colours;


//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern str *__name__;


//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//extern class_ *cl_Colours;

	public static void __init() {
		const_0 = new String("red");
		const_1 = new String("green");
		const_2 = new String("purple");
		const_3 = new String("yellow");
		const_4 = new String("white");
		const_5 = new String("black");

		__name__ = new String("colour");

		cl_Colours = new class_("Colours");
		Colours.__static__();
	}
	public static str getColourName(int i) {

		if ((i == 0)) {
			return const_0;
		}
		else if ((i == 1)) {
			return const_1;
		}
		else if ((i == 2)) {
			return const_2;
		}
		else if ((i == 3)) {
			return const_3;
		}
		else if ((i == 4)) {
			return const_4;
		}
		else if ((i == 5)) {
			return const_5;
		}
		return 0;
	}



	/**
	 copyright Sean McCarthy, license GPL v2 or later 
	*/


	public static String const_0;
	public static String const_1;
	public static String const_2;
	public static String const_3;
	public static String const_4;
	public static String const_5;


	public static String __name__;

	/**
	class Colours
	*/

	public static class_ cl_Colours;
}
