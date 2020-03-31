package net.projecteuler.problem0;

import java.util.ArrayList;
import java.util.List;

public class CellCompetition {

	public List<Integer> cellCompete(int[] states, int days) {
		
		int[] statesAux = states;
		for(int day = 1; day <= days; day++) {
			List<Integer> statesDay = cellCompeteDay(statesAux);
			statesAux = convertToArray(statesDay);
		}
		return convertToList(statesAux);
	}

	private List<Integer> convertToList(int[] statesAux) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : statesAux) {
			list.add(i);
		}
		return list;
	}

	private int[] convertToArray(List<Integer> statesDay) {
		int[] arr = new int[statesDay.size()];
		for(int i = 0; i < statesDay.size(); i++) {
			arr[i] = statesDay.get(i);
		}
		return arr;
	}

	private List<Integer> cellCompeteDay(int[] states) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int lastIdx = states.length - 1;
		for(int i = 0; i < states.length; i++) {
			int state = 0;
			if(i == 0) {
				if(states[i + 1] == 1) {
					state = 1;
				}
				list.add(state);
			} else if(i == lastIdx) {
				if(states[i - 1] == 1) {
					state = 1;
				}
				list.add(state);
			} else {
				if(!(states[i - 1] == 0 && states[i + 1] == 0) && !(states[i - 1] == 1 && states[i + 1] == 1)) {
					state = 1;
				}
				list.add(state);
			}
		}
		return list;
	}
}
