package com.example.usingjava;

import org.junit.Assert;
import org.junit.Test;

public class WorkingWithArraysTest {

	@Test
	public void areTheSameTestTrue() {
		int [] a = {121, 144, 19, 161, 19, 144, 19, 11};
		int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
		Assert.assertTrue(WorkingWithArrays.areTheSame(a,b));
	}
	@Test
	public void areTheSameTestFalse(){
		int [] a = {121, 144, 19, 161, 19, 144, 19, 11};
		int [] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
		Assert.assertFalse(WorkingWithArrays.areTheSame(a,b));
	}

}
