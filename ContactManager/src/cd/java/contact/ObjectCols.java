package cd.java.contact;

import java.util.*;

public class ObjectCols {
	@SuppressWarnings("rawtypes")
	protected List cols = new ArrayList();
	
	public boolean contains(Object obj){
		for(Object tmp : cols.toArray()){
			if(obj.equals(tmp)){
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void add(Object obj){
		if(!contains(obj)){
			cols.add(obj);
		}else{
			System.out.println("add Object failed: Object exists.");
		}
	}
	
	public void delete(Object obj){
		if(contains(obj)){
			cols.remove(obj);
		}else{
			System.out.println("delete Object failed: Object does not exists.");
		}
	}
	
	@SuppressWarnings("unchecked")
	public void update(Object oldobj, Object newobj){
		if(contains(oldobj)){
			Object [] objs = cols.toArray();
			cols.clear();
			for(Object tmp : objs){
				if(tmp.equals(oldobj)){
					cols.add(newobj);
				}else{
					cols.add(tmp);
				}
			}
		}else{
			System.out.println("update Object failed: Object does not exist.");
		}
	}
	
	public int getLength(){
		return cols.toArray().length;
	}
}
