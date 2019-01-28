package Problem.ArrayProblems;

import static org.junit.Assert.*;


import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayProblemsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testmultiplyingfirst2Max() {
		ArrayProblems obj = new ArrayProblems();
		int max = obj.multiplyingfirst2Max();
		assertEquals(240, max);
	}
	@Test
	public void testmostAndLessFrequency() {
		ArrayProblems obj = new ArrayProblems();
		int arr[] = obj.mostAndLessFrequency();
		int[] array = {6,5,1,2};
		assertArrayEquals(array, arr);
	}

}
