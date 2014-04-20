package cd.java.contact;

public class CheckInfo {
	private String contactErr = "";
	private String userErr = "";
	public boolean checkName(String name){
		// �ж���ϵ�������Ƿ�Ϊ2-10�������ַ�
		if(((name.getBytes().length - name.length()) >= 2)
				&& ((name.getBytes().length - name.length()) <= 10)){
			return true;
		}else{
			contactErr = "��������������2-10�������ַ�.";
			System.out.println(contactErr);
			return false;
		}
	}
	
	public boolean checkPhoneNum(String phone){
		// �ж���ϵ�˵��ֻ������Ƿ���11λ���������
		if(phone.matches("^\\d{11}$")){
			return true;
		}else{
			contactErr = "�ֻ��������������11λ������.";
			System.out.println(contactErr);
			return false;
		}
	}
	
	public boolean checkBirth(String birth){
		if(birth.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")){
			return true;
		}else{
			contactErr = "���մ����밴����ʾ�ĸ�ʽ������ϵ������.";
			System.out.println(contactErr);
			return false;
		}
	}
	
	public boolean checkPiny(String piny){
		if(piny.matches("^[a-z]{4,20}$")){
			return true;
		}else{
			contactErr = "ƴ����������������4-20λ��Сд��ĸ.";
			System.out.println(contactErr);
			return false;
		}
	}
	
	
	public boolean checkUserName(String name){
		// �ж��û��������Ƿ���4-16֮��
		if((name.length() >= 4 && name.length() <= 16)){
			for(char c : name.toCharArray()){
				// �ж��û����Ƿ�ȫ�����ַ����������
				if((c < 'a' || c > 'z') 
						&& (c < 'A' || c > 'Z') 
						&& (c < '0' || c > '9')){
					userErr = "�û������󣺴�����������ĸ�����ֵ��ַ�.";
					System.out.println(userErr);
					return false;
				}
			}
			return true;
		}else{
			userErr = "�û������󣺳��Ȳ���4-16λ֮��.";
			System.out.println(userErr);
			return false;
		}
	}
	
	public boolean checkPasswd(String passwd){
		// �ж����볤���Ƿ���6-16֮��
		if((passwd.length() >= 6 && passwd.length() <= 16)){
			for(char c : passwd.toCharArray()){
				// �ж������Ƿ�ȫ�����ַ����������
				if((c < 'a' || c > 'z') 
						&& (c < 'A' || c > 'Z') 
						&& (c < '0' || c > '9')){
					userErr = "������󣺴�����������ĸ�����ֵ��ַ�.";
					System.out.println(userErr);
					return false;
				}
			}
			return true;
		}else{
			userErr = "������󣺳��Ȳ���6-16λ֮��.";
			System.out.println(userErr);
			return false;
			
		}
	}
	
	public boolean checkEmail(String email){
		if(email.matches("\\w+@\\w+\\.\\w+")){
			return true;
		}else{
			userErr = "����������󣺸�ʽ����ȷ.";
					System.out.println(userErr);
			return false;
		}
	}

	public String getContactErr() {
		return contactErr;
	}

	public String getUserErr() {
		return userErr;
	}
}
