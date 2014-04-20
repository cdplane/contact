package cd.java.contact;

import java.util.Comparator;

// 创建一个自己的联系人比较器，按照联系人拼音姓名的字母顺序进行排序
public class PersonComparator implements Comparator<ContactPerson>{

	@Override
	public int compare(ContactPerson cp1, ContactPerson cp2) {
		if(cp1.getName_piny().compareTo(cp2.getName_piny()) > 0){
			return 1;
		}else if(cp1.getName().compareTo(cp2.getName()) == 0){
			return 0;
		}else{
			return -1;
		}	
	}
}
