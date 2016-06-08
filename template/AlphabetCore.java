package template;

public abstract class AlphabetCore {

	public final void consctructLetter(String[][] input){
		Symmetry symmetry = getSymmetry(input);
		String[][] fullLetter = reconstruct(input,symmetry);
		printLetter(fullLetter);
		
	}
	
	public abstract Symmetry getSymmetry(String[][] input);

	public abstract String[][] reconstruct(String[][] input , Symmetry symmetry);
	
	public abstract void printLetter(String[][] source);
	
	
}
