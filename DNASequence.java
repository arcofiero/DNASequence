package edu.iastate.cs228.proj1;

/*
 * @author Archit Raj
*/

public class DNASequence extends Sequence
{
  /**
   If the character array argument has a character on which the method {@link #isValidLetter(char)} returns {@code false}, then it throws an {@link java.lang.IllegalArgumentException} with the message {@code "Invalid sequence letter for class X"} where {@code X} denotes {@code "edu.iastate.cs228.proj1.DNASequence"} or the name of a subclass of which an object is created. Otherwise, the constructor saves a copy of the character array argument in the field of its superclass.
   
   @param dnaarr See {@link #DNASequence(char[])}.
   @throws IllegalArgumentException See {@link #DNASequence(char[])}.
  */
  public DNASequence(char[] dnaarr)
  {
	  super(dnaarr); //exception being thrown in the Sequence class
  }

  /**
   The method returns {@code true} if the character argument is equal to one of the eight characters {@code 'a', 'A', 'c', 'C', 'g', 'G', 't', and 'T'}. Otherwise, it returns {@code false}. This method overrides the one in its superclass.
   
   @param let See {@link #isValidLetter(char)}.
   @return {@link #isValidLetter(char)}.
  */
  @Override
  public boolean isValidLetter(char let)
  {
	  if((let == 'a') || (let == 'A') || (let == 'c') || (let == 'C')|| (let == 'g') || (let == 'G') || (let == 't') || (let == 'T')) 
		  return true; // true when the char let founds 'a', 'A', 'c', 'C', 'g', 'G', 't', or 'T in the char input
	  else
		  return false;
  }

}
