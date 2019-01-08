package edu.iastate.cs228.proj1.tests;
/**
 * @author Archit Raj
 */

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.iastate.cs228.proj1.ProteinSequence;


public class ProtienSequenceTest {

	public String correct = "Input is correct"; //String that checks the correct input in the ProteinSequenceTest.
	public String wrong = "Input is wrong"; //String that checks the wrong input in the ProteinSequenceTest.
	
	char [] testArr = {'a', 'c', 'g', 't', 'a', 'c', 'g', 't', 'a', 'c', 'g', 't'}; //char array testArr used for testing methods in this class.
	
	ProteinSequence a = new ProteinSequence(testArr); //New ProteinSequence made from testArr.
	
	@Test
	public void IsValidLetter(){
		assertEquals(correct, true, a.isValidLetter('a')); //Tests if a is a valid letter, should be true.
		assertEquals(wrong, false, a.isValidLetter('b')); //Tests if b is a valid letter, should be false.
	}
	
	@SuppressWarnings("unused")
	@Test(expected = IllegalArgumentException.class)
	public void IllegalArgumentException()
	{
		char [] testArr2 = {'a', 't', 'g', 'g', 'a', 'b', 'g', 'a'}; //a new testArr2 with an invalid letter b, should throw exception when constructed.
		ProteinSequence c = new ProteinSequence(testArr2);	
	}

}
