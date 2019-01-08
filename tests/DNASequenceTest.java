package edu.iastate.cs228.proj1.tests;
/**
 * @author Archit Raj
 */


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.iastate.cs228.proj1.DNASequence;




public class DNASequenceTest {

	public String correct = "Input is correct"; //String that checks the correct input in the DNASequenceTest.
	public String wrong = "Input is wrong";//String that checks the wrong input in the DNASequenceTest.
	
	char [] testArr = {'a', 'c', 'g', 't'}; //Creating a testArr for valid letters
	DNASequence a = new DNASequence(testArr); //Constructs a new DNASequence using the test array.
	
	@Test
	public void IsValidLetter(){
		assertEquals(correct, true, a.isValidLetter(testArr[0])); //Tests if index is 0 then it is a valid letter, should be true when it is 'a'.
		testArr[0] = 'z';
		assertEquals(wrong, false, a.isValidLetter(testArr[0])); //Tests if index 0 if of an unchanged array is valid, should be false when it is a 'z'.
	}

	@SuppressWarnings("unused")
	@Test (expected = IllegalArgumentException.class)
	public void IllegalArgumentException()
	{
		char [] testArr2 = {'a', 'b', 'g', 'g', 'a', 'b', 'g', 'a'}; //test array with an invalid letter 'b' in it.
		DNASequence d = new DNASequence(testArr2); //Testing construction of a new DNASequence with the array that has an invalid letter. Should throw IllegalArgumentException.
	}
}

