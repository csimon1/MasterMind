package __peg__;

//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//class Peg;
public class Peg  {
/**
Class representing a (coloured) peg on the mastermind board
*/
	public int __colour = 0;

	public Peg() {
	}
	public Peg(int colour) {
		this.__class__ = GlobalMembersPeg.cl_Peg;
		__init__(colour);
	}
	public final int getColour() {
		return this.__colour;
	}
	
	public final boolean equals(Peg peg) {
		return ((peg.getColour() == this.__colour));
	}
	
	public final void __init__(int colour) {
		this.__colour = colour;
	}
}
//C++ TO JAVA CONVERTER TODO TASK: Only the namespaces at the beginning of the file can be converted to the Java 'package' for this file:
//ORIGINAL LINE: namespace __peg__


