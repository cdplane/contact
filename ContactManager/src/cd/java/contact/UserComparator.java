package cd.java.contact;

import java.util.Comparator;

// 用户信息比较器 
public class UserComparator implements Comparator<UserInfo>{

	@Override
	public int compare(UserInfo ui1, UserInfo ui2) {
		if(ui1.getUserName().compareTo(ui2.getUserName()) > 0){
			return 1;
		}else if(ui1.getUserName().compareTo(ui2.getUserName()) == 0){
			return 0;
		}else{
			return 0;
		}
	}
}
