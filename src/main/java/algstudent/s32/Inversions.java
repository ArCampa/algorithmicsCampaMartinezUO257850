package algstudent.s32;

import java.util.ArrayList;
import java.util.List;

public class Inversions {

	List<Integer> list;

	public Inversions(List<Integer> ranking) {
		list = ranking;
	}

	public String start() {
		int counter = 0;
		counter += inv(list);
		return "" + counter;
	}

	private int inv(List<Integer> sublist) {
		if (sublist.size() == 1) {
			int j = list.indexOf(sublist.get(0));
			int counter = 0;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > list.get(j) && i < j) {
					counter++;
				}
			}
			return counter;
		} else {
			List<Integer> sub1 = new ArrayList<Integer>();
			for (int i = 0; i < sublist.size() / 2; i++) {
				sub1.add(sublist.get(i));
			}
			List<Integer> sub2 = new ArrayList<Integer>();
			for (int i = sublist.size() / 2; i < sublist.size(); i++) {
				sub2.add(sublist.get(i));
			}
			return inv(sub1) + inv(sub2);
		}
	}

}
