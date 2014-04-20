package cd.java.contact;

import java.util.Comparator;

// ����һ���Լ�����ϵ�˱Ƚ�����������ϵ��ƴ����������ĸ˳���������
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
