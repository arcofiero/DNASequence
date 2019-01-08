package edu.iastate.cs228.proj1.tests;
/**
 * @author Archit Raj
 */



import org.junit.Test;

import edu.iastate.cs228.proj1.GenomicDNASequence;

import static org.junit.Assert.*;



public class GenomicDNASequenceTest {

	public String correct = "Input is correct";//String that checks the correct input in the GenomicDNASequenceTest.
	public String wrong = "Input is wrong";//String that checks the wrong input in the GenomicDNASequenceTest.
	
	char [] testArr = {'a', 'c', 'g', 't', 'a', 'c', 'g', 't', 'a', 'c', 'g', 't'}; //char array testArr used for testing the methods.
	int [] exonPosArr = {0, 1, 3, 5, 6, 8}; //int array used for extracting exons,
	
	GenomicDNASequence a = new GenomicDNASequence(testArr); //Constructing a new GenomicDNASequence from testArr.
	
	
	
	
	@Test
	public void ExtractingExons(){
		char[] testExtractedExons = {'a','c','t', 'a','c', 'g', 't','a'}; //Char array of what happens when extractExons is called.
		a.markCoding(0, 8);
		assertArrayEquals(a.extractExons(exonPosArr), testExtractedExons); //Tests extractExons against what it should be. 
	
		testExtractedExons[0] = 'c';
		assertEquals(wrong, false , a.extractExons(exonPosArr).equals(testExtractedExons)); //Tests again with an unchanged test array.
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void IllegalArgumentException()
	{
		char [] testArr2 = {'a', 'b', 'c', 'd', 'e', 'f', 'h', 'i'};
		@SuppressWarnings("unused")
		GenomicDNASequence c = new GenomicDNASequence(testArr2); //Tests construction of a GenomicDNASequence with some invalid characters, should throw an exception.
	}
	
	
	
	@Test(expected=IllegalArgumentException.class)
	public void IllegalArgumentException2()
	{
		char [] testArr = {'a', 't', 'g', 'a', 't', 'g'};
		int [] exonPosArr = {};
		GenomicDNASequence c = new GenomicDNASequence(testArr); //Creates a valid GenomicDNASequence, should not throw anything.
		c.extractExons(exonPosArr); //Extracts exons with an empty exon array, should throw IllegalArgumentException.
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void IllegalArgumentException3()
	{
		char [] testArr = {'a', 't', 'g', 'a', 't', 'g'};
		int [] exonPosArr2 = {0, 1, 2, 75};
		GenomicDNASequence c = new GenomicDNASequence(testArr); //Creates a valid GenomicDNASequence, should not throw anything.
		c.extractExons(exonPosArr2); //Extracts exons with an array that has an invalid position integer, should throw IllegalArgumentException.
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testIAException4()
	{
		char [] testArr = {'a', 't', 'g', 'a', 't', 'g'};
		int [] exonPosArr = {4,3,2,1};
		GenomicDNASequence a = new GenomicDNASequence(testArr); //Creates a valid GenomicDNASequence, should not throw anything.
		a.extractExons(exonPosArr); //Extracts exons with an out of order array. Should throw IllegalArgumentException.
	}
	

}
