package net.projecteuler.problem0;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class CellCompetitionTest {

	@Test
	public void testCellCompete() {
		CellCompetition cell = new CellCompetition();
		int[] states = {0, 1, 0, 1, 0, 1, 0, 1};
		int[] expect = {1,0,0,0,0,0,0,0};
		Assert.assertEquals(convertArray(expect), cell.cellCompete(states, 1));
		int[] expect2 = {0,1,0,0,0,0,0,0};
		Assert.assertEquals(convertArray(expect2), cell.cellCompete(states, 2));
		int[] expect3 = {1,0,1,0,0,0,0,0};
		Assert.assertEquals(convertArray(expect3), cell.cellCompete(states, 3));
		int[] expect4 = {0,0,0,1,0,0,0,0};
		Assert.assertEquals(convertArray(expect4), cell.cellCompete(states, 4));
		//int[] expect5 = {0,0,0,1,0,0,0,0};
		//Assert.assertEquals(convertArray(expect5), cell.cellCompete(states, 5));
	}
	
	private List<Integer> convertArray(int[] array){
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : array) {
			list.add(i);
		}
		return list;
	}
}
