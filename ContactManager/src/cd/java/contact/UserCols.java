package cd.java.contact;

import java.util.Collections;

public class UserCols extends ObjectCols{
	
	@SuppressWarnings("unchecked")
	public void sort(){
		Collections.sort(cols, new UserComparator());
	}
	
	public UserInfo get(String name){
		UserInfo ui = new UserInfo();
		for(Object tmp : cols.toArray()){
			UserInfo tmpui = (UserInfo)tmp;
			if(tmpui.getUserName().compareTo(name) == 0){
				ui = tmpui;
				return ui;
			}
		}
		return null;
	}
	
	public UserInfo [] getAll(){
		Object [] objs = cols.toArray();
		UserInfo [] uis = new UserInfo[objs.length];
		
		for(int i=0; i<objs.length; i++){
			uis[i] = (UserInfo)objs[i];
		}
		
		return uis;
	}
}
