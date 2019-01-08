package edu.iastate.cs228.proj1;

/*
 * @author Archit Raj
*/

public class Sequence
{
  protected char[] seqarr;
  protected boolean isValidLetter;
  protected String x = "";
  /**
   The constructor first uses the {@link #isValidLetter(char)} method to check
   if every character in the array {@code sarr} is valid. If so, it makes and
   keeps a copy of the array {@code sarr} in the field {@code seqarr} of type {@code char[]} with {@code protected} access. Otherwise, it throws an   {@link java.lang.IllegalArgumentException} with the message {@code "Invalid sequence letter for class X"} where {@code X} denotes {@code  'edu.iastate.cs228.proj1.Sequence'} or the name of a subclass of which an object is created. Examples are given in the project description page to 
   illustrate what exactly is denoted by {@code X} after the subclasses of class
   {@code Sequence} are defined. Note that the length of the field {@code seqarr} is equal to the length of the array {@code sarr}. This constructor should be implemented in such a way that it is unnecessary to have more than one line of code in the body of the constructor of any subclass of this class.
   
   @param sarr See {@link #Sequence(char[])}.
   @throws IllegalArgumentException See {@link #Sequence(char[])}.
  */  
  public Sequence(char[] sarr)
  {
	  x = this.getClass().getName(); //gets the class and it's name of the particular class

	seqarr = new char[sarr.length]; 
  	for(int i = 0; i < sarr.length; i++){	
  		if(isValidLetter(sarr[i])){	//when every character in the array is valid, then it initializes the position of sequence's array with that of the given constructor's array
  			seqarr[i] = sarr[i];
  			}
  		else{
  			throw new IllegalArgumentException("Invalid sequence letter for class " + x); //otherwise throws an IllegalArgumentException "Invalid sequence letter for class" for the particular class
  		} 
  	}
  }


/**
   The method returns the length of the character array {@code seqarr}.
   @return See {@link #seqLength()}.
  */
  public int seqLength()
  {
	  return seqarr.length; //return the sequence's length
  }
  
  /**
   The method creates and returns a copy of {@code char} array {@code seqarr}.
   @return See {@link #getSeq()}.
  */
  public char[] getSeq()
  {
	  char[] copy = new char[seqarr.length];
	  for(int i = 0; i <seqarr.length; i++) { //gets the sequence from the array
		  copy[i] = seqarr[i];
	  }
	  return copy;
  }

  /**
   The method returns the string representation of the {@code char} arrar {@code seqarr}.
   @return See {@link #toString()}.
  */
  public String toString()
  {
    String result ="";
    for(int i = 0; i<seqarr.length;i++){
    	result = result + seqarr[i];
    }
    	return result; //changes the array to a string data type
  }

  /**
   The method returns {@code true} if the arguments {@code obj} is not {@code null} and is of the same type as this object such that both objects represent the identical sequence of characters in a case insensitive mode ("ACgt" is identical to "AcGt"). The {@link #equals(Object)} method should be defined in such a way that there is no need to define it again in any subclass of class {@code Sequence}. In other words, when an object of the subclass calls the {@link #equals(Object)} method, it should return the right answer.
   
   @return See {@link #equals(Object)}
  */
  @SuppressWarnings("null")
public boolean equals(Object obj)	
  { 
	  boolean isEqual = false;
	  if (((this != null) && (obj == null)  // when object is not equal to 0
			  && 
			  (obj.getClass().getName() == this.getClass().getName())) //and when this class's object is equal to the class of the object we are getting 
			  && 
			  	(this.toString().equalsIgnoreCase(obj.toString()))){ // and when this class's string equals the object's string , regardless of the case
			  
		  			isEqual = true; //then both the inputs are equal
	  		}
	  else {
		  			isEqual = false;
	  		}
	  	return isEqual;
	  
  }

  
  /**
   The method returns {@code true} if the character {@code let} is an 
   uppercase (e.g., invoking {@link java.lang.Character#isUpperCase(char)} with {@code let} is {@code true}) or lowercase ((e.g., invoking {@link java.lang.Character#isLowerCase(char)} with {@code let} is {@code true})). Otherwise,
it returns {@code false}.
   @param let See {@link #isValidLetter(char)}.
   @return See {@link #isValidLetter(char)}.
  */
  public boolean isValidLetter(char let)
  {
    if(Character.isUpperCase(let)|| Character.isLowerCase(let)){ // when the character is upper or lower case, then it should return true
    	return true;
    	}
    return false;
  }

}
