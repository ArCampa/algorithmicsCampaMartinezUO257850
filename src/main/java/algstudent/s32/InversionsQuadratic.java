package algstudent.s32;

import java.util.List;

public class InversionsQuadratic {
	List<Integer> list;

	public InversionsQuadratic(List<Integer> ranking) {
		list = ranking;
	}

	public String start() {
		int counter = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i) > list.get(j))
					if (i < j) {
						counter++;
					}
			}
		}
		return "" + counter;
	}

}
