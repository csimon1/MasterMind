package __peg__.__code__;

//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//class Peg;

//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//class Code;
public class Code {
/**
Class representing a collection of pegs
*/
	public int __defaultCodeSize = 0;
	public java.util.LinkedList<__peg__.Peg > __pegList;

	public Code() {
	}
	
	public Code(java.util.LinkedList<__peg__.Peg > __pegList) {
		this.__class__ = GlobalMembersCode.cl_Code;
		__init__(__pegList);
	}
	
	public final Code compare(Code code) {
		java.util.LinkedList<__peg__.Peg > resultPegs;
		java.util.LinkedList<Boolean> guessUsed;
		java.util.LinkedList<Boolean> secretUsed;
		Boolean __12 = new boolean();
		Boolean __13 = new boolean();
		Boolean __14 = new boolean();
		Boolean __15 = new boolean();
		int __10 = new int();
		int __11 = new int();
		int __4 = new int();
		int __5 = new int();
		int __6 = new int();
		int __7 = new int();
		int __8 = new int();
		int __9 = new int();
		int codeLength = new int();
		int count = new int();
		int i = new int();
		int j = new int();

		resultPegs = (new java.util.LinkedList<__peg__.Peg *>());
		secretUsed = (new java.util.LinkedList<boolean>());
		guessUsed = (new java.util.LinkedList<boolean>());
		count = 0;
		codeLength = len(this.__pegList);

		if (1 == 0) {
			__throw_range_step_zero();
		}
		for (__4 = 0, __5 = codeLength; ; __4 += 1) {
			if (1 >= 0) {
				if (__4 >= __5)
					break;
			}
			else {
				if (__4 <= __5)
					break;
			}
			i = __4;
			secretUsed.append(False);
			guessUsed.append(False);
		}

		/**
		Black pegs first: correct colour in correct position
		
		*/

		if (1 == 0) {
			__throw_range_step_zero();
		}
		for (__6 = 0, __7 = codeLength; ; __6 += 1) {
			if (1 >= 0) {
				if (__6 >= __7)
					break;
			}
			else {
				if (__6 <= __7)
					break;
			}
			i = __6;
			if (((this.__pegList).__getfast__(i)).equals((code.getPegs()).__getfast__(i))) {
				secretUsed.__setitem__(i, True);
				guessUsed.__setitem__(i, True);
				resultPegs.append((new __peg__.Peg(__colour__.Colours.black)));
				count = (count + 1);
			}
		}

		/**
		White pegs: trickier
		
		White pegs are for pegs of the correct colour, but in the wrong
		place. Each peg should only be evaluated once, hence the "used"
		lists.
		
		Condition below is a shortcut- if there were 3 blacks pegs
		then the remaining peg can't be a correct colour (think about it)
		
		*/
		if ((count < (codeLength - 1))) {

			if (1 == 0) {
				__throw_range_step_zero();
			}
			for (__8 = 0, __9 = codeLength; ; __8 += 1) {
				if (1 >= 0) {
					if (__8 >= __9)
						break;
				}
				else {
					if (__8 <= __9)
						break;
				}
				i = __8;
				if (guessUsed.__getfast__(i)) {
					continue;
				}

				if (1 == 0) {
					__throw_range_step_zero();
				}
				for (__10 = 0, __11 = codeLength; ; __10 += 1) {
					if (1 >= 0) {
						if (__10 >= __11)
							break;
					}
					else {
						if (__10 <= __11)
							break;
					}
					j = __10;
					if (((i != j) && (__mbool(!(secretUsed.__getfast__(j)))) && (__mbool(!(guessUsed.__getfast__(i)))) && ((this.__pegList).__getfast__(j)).equals((code.getPegs()).__getfast__(i)))) {
						resultPegs.append((new __peg__.Peg(__colour__.Colours.white)));
						secretUsed.__setitem__(j, True);
						guessUsed.__setitem__(i, True);
					}
				}

			}

		}
		return (new Code(resultPegs));
	}
	public final java.util.LinkedList<__peg__.Peg > getPegs() {

		return this.__pegList;
	}
	public final boolean equals(Code code) {
		java.util.LinkedList<__peg__.Peg > c1;
		int __2 = new int();
		int __3 = new int();
		int i = new int();

		c1 = code.getPegs();

		if (1 == 0) {
			__throw_range_step_zero();
		}
		for (__2 = 0, __3 = 4; ; __2 += 1) {
			if (1 >= 0) {
				if (__2 >= __3)
					break;
			}
			else {
				if (__2 <= __3)
					break;
			}
			i = __2;
			if ((__mbool(!((c1.__getfast__(i)).equals((this.__pegList).__getfast__(i)))))) {
				return False;
			}
		}
		return true;
	}
	public final Object setRandomCode(int codeSize) {
		int __0 = new int();
		int __1 = new int();
		int i = new int();
		__peg__.Peg x;

		if ((codeSize == (-1))) {
			codeSize = this.__defaultCodeSize;
		}
		GlobalMembersCode.seed(((Object)(null)));
		this.__pegList = (new java.util.LinkedList<__peg__.Peg *>());

		if (1 == 0) {
			__throw_range_step_zero();
		}
		for (__0 = 0, __1 = codeSize; ; __0 += 1) {
			if (1 >= 0) {
				if (__0 >= __1)
					break;
			}
			else {
				if (__0 <= __1)
					break;
			}
			i = __0;
			x = (new __peg__.Peg(__random__.randint(0, (__colour__.Colours.numberOfColours - 1))));
			(this.__pegList).append(x);
		}

		return null;
	}
	public final Object __init__(java.util.LinkedList<__peg__.Peg > __pegList) {

		this.__defaultCodeSize = 4;
		this.__pegList = __pegList;
		return null;
	}
}
//C++ TO JAVA CONVERTER TODO TASK: Only the namespaces at the beginning of the file can be converted to the Java 'package' for this file:
//ORIGINAL LINE: namespace __code__


