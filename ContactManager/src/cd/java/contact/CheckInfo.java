package cd.java.contact;

public class CheckInfo {
	private String contactErr = "";
	private String userErr = "";
	public boolean checkName(String name){
		// 判断联系人姓名是否为2-10个中文字符
		if(((name.getBytes().length - name.length()) >= 2)
				&& ((name.getBytes().length - name.length()) <= 10)){
			return true;
		}else{
			contactErr = "姓名错误：请输入2-10个中文字符.";
			System.out.println(contactErr);
			return false;
		}
	}
	
	public boolean checkPhoneNum(String phone){
		// 判断联系人的手机号码是否由11位的数字组成
		if(phone.matches("^\\d{11}$")){
			return true;
		}else{
			contactErr = "手机号码错误：请输入11位的数字.";
			System.out.println(contactErr);
			return false;
		}
	}
	
	public boolean checkBirth(String birth){
		if(birth.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")){
			return true;
		}else{
			contactErr = "生日错误：请按照提示的格式输入联系人生日.";
			System.out.println(contactErr);
			return false;
		}
	}
	
	public boolean checkPiny(String piny){
		if(piny.matches("^[a-z]{4,20}$")){
			return true;
		}else{
			contactErr = "拼音姓名错误：请输入4-20位的小写字母.";
			System.out.println(contactErr);
			return false;
		}
	}
	
	
	public boolean checkUserName(String name){
		// 判断用户名长度是否在4-16之间
		if((name.length() >= 4 && name.length() <= 16)){
			for(char c : name.toCharArray()){
				// 判断用户名是否全部由字符和数字组成
				if((c < 'a' || c > 'z') 
						&& (c < 'A' || c > 'Z') 
						&& (c < '0' || c > '9')){
					userErr = "用户名错误：存在其他非字母或数字的字符.";
					System.out.println(userErr);
					return false;
				}
			}
			return true;
		}else{
			userErr = "用户名错误：长度不在4-16位之间.";
			System.out.println(userErr);
			return false;
		}
	}
	
	public boolean checkPasswd(String passwd){
		// 判断密码长度是否在6-16之间
		if((passwd.length() >= 6 && passwd.length() <= 16)){
			for(char c : passwd.toCharArray()){
				// 判断密码是否全部由字符和数字组成
				if((c < 'a' || c > 'z') 
						&& (c < 'A' || c > 'Z') 
						&& (c < '0' || c > '9')){
					userErr = "密码错误：存在其他非字母或数字的字符.";
					System.out.println(userErr);
					return false;
				}
			}
			return true;
		}else{
			userErr = "密码错误：长度不在6-16位之间.";
			System.out.println(userErr);
			return false;
			
		}
	}
	
	public boolean checkEmail(String email){
		if(email.matches("\\w+@\\w+\\.\\w+")){
			return true;
		}else{
			userErr = "电子邮箱错误：格式不正确.";
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
