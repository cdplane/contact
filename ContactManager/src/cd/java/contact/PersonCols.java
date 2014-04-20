package cd.java.contact;

import java.util.*;

public class PersonCols extends ObjectCols {

	@SuppressWarnings("unchecked")
	public void sort() {
		Collections.sort(cols, new PersonComparator());
	}

	public ContactPerson get(String name) {
		ContactPerson cp = new ContactPerson();
		for (Object tmp : cols.toArray()) {
			ContactPerson tmpcp = (ContactPerson) tmp;
			if (tmpcp.getName().compareTo(name) == 0) {
				cp = tmpcp;
				return cp;
			}
		}
		return null;
	}

	public ContactPerson[] getAll() {
		Object[] objs = cols.toArray();
		ContactPerson[] cps = new ContactPerson[objs.length];

		for (int i = 0; i < objs.length; i++) {
			cps[i] = (ContactPerson) objs[i];
		}

		return cps;
	}

	@SuppressWarnings("unchecked")
	public void reSetNumId(PersonCols pscol) {
		ContactPerson[] cps = pscol.getAll();
		pscol.cols.clear();
		for (int i = 0; i < cps.length; i++) {
			cps[i].setNumId(i + 1);
			pscol.cols.add(cps[i]);
		}
	}
}
