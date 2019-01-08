package edu.iastate.cs228.proj1.tests;
/**
 * @author Archit Raj
 */


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.iastate.cs228.proj1.CodingDNASequence;


@SuppressWarnings("unused")
public class CodingDNASequenceTest {

	public String correct = "Input is correct"; //String that checks the correct input in the CodingDNASequenceTest.
	public String wrong = "Input is wrong"; //String that checks the wrong input in the CodingDNASequenceTest.
	
	char[] testArr = {'a', 't', 'g', 't', 'a', 'c', 'g', 't', 'a', 'c', 'g', 't'}; //testing array for invoking the methods
	
	CodingDNASequence a = new CodingDNASequence(testArr); //Constructing a new CodingDNASequence object to test the testArr.
	
	@Test
	public void checkStartCodon(){
		assertEquals(correct, true, a.checkStartCodon()); //Checks the starting codon of the CodingDNASequence a, returns true when starts with "atg".
		char[] testArr2 = {'a'};
		CodingDNASequence b = new CodingDNASequence(testArr2); 
		assertEquals(wrong, false, b.checkStartCodon()); //Checks the starting codon of CodingDNASequence b, returns false since it is only 1 char long.
		testArr[0] = 't';
		CodingDNASequence c = new CodingDNASequence(testArr);
		assertEquals(wrong, false, c.checkStartCodon()); //Checks the starting codon of CodingDNASequence c, returns false since it starts with t, even though it could be long.
		testArr[0] = 'a';
	}
	
	@Test
	public void Translate(){
		char [] testArr3 = {'a', 't', 'g', 'a', 'a', 'a', 'a', 'a', 'c', 'a', 'g', 't'};
		CodingDNASequence d = new CodingDNASequence(testArr3); 
		assertEquals(correct, true, "MKNS".equals(String.valueOf(d.translate()))); //Tests the translate method on CodingDNASequence d, should be "MKNS" and true. 
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void IllegalArgumentException()
	{
		char [] testArr2 = {'a', 'b', 'g', 'g', 'a', 'b', 'g', 'a'};
		CodingDNASequence c = new CodingDNASequence(testArr2); //Constructs a new CodingDNASequence c, with invalid character b to throw IllegalArgumentException.
	}
	
	@Test(expected=RuntimeException.class)
	public void RuntimeException(){
		char [] testArr2 = {'a', 'a', 'g', 'g', 'a', 'a', 'g', 'a'};
		CodingDNASequence c = new CodingDNASequence(testArr2);	
		c.translate(); //Tests translate on a valid CodingDNASequence, but doesn't have a starting codon, so should throw RuntimeException.
	}
}
