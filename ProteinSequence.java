package edu.iastate.cs228.proj1;

/*
 * @author Archit Raj
*/

public class ProteinSequence extends Sequence
{
  /**
   If the character array argument {@code psarr} contains a character on which the method {@link #isValidLetter(char)} returns {@code false}, then it throws an {@link java.lang.IllegalArgumentException} exception with the message {@code "Invalid sequence letter for class edu.iastate.cs228.proj1.ProteinSequence"}. Otherwise, the constructor saves a copy of the character array argument in the field of its superclass {@link Sequence}.
  
   @param psarr See {@link #ProteinSequence(char[])}.
   @throws IllegalArgumentException See {@link #ProteinSequence(char[])}.
  */  
  public ProteinSequence(char[] psarr)
  {
    super(psarr); 
  }

  
  /**
   The method returns {@code true} if the character argument is equal to one of the 20 English letters that are not in the set {@code {B, b, J, j, O, o, U, u, X, x, Z, z}}. Otherwise, it returns {@code false}. This method overrides the one in its superclass.
  
   @param aa See {@link #isValidLetter(char)}.
  */
  @Override
  public boolean isValidLetter(char aa)
  {
	boolean isValid = true;	
	if((aa>='a'&&aa<='z')||(aa>='A'&&aa<='Z')){ //checks when array aa > a or < z, >A, or <Z
	  		if((aa == 'B') || (aa == 'b')  //then it checks whether the given array should not the equal to {B, b, J, j, O, o, U, u, X, x, Z, z}
	  		|| (aa == 'J') || (aa == 'j') 
			|| (aa == 'O')|| (aa == 'o') 
			||(aa == 'U') ||(aa == 'u') 
			||(aa == 'X') ||(aa == 'x') 
			|| (aa == 'Z') || (aa == 'z')){
		  return !isValid; //if it is equal then it is inValid
	  	}
		
		else{
			return isValid; // or else it's valid
		}}else { 
			return !isValid;
		}
	   
  }
}
