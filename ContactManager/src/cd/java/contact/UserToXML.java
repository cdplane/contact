package cd.java.contact;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class UserToXML {
	// 将用户信息写到名为fileName的文件中去
		public void WriteUserToXML(UserCols pscol, String fileName){
			try {
				//　创建输出流通道，支持中文字符的写入
				OutputStreamWriter out = new OutputStreamWriter(
						new BufferedOutputStream(
								new FileOutputStream(fileName)), "utf-8");
				// 写xml文件的头
				out.write("<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n");
				out.write("<Users>\n\t");
				// 按照xml文件的格式将用户信息写入文件
				UserInfo [] uis = pscol.getAll();
				for(int i=0; i<uis.length; i++){
					String str = "<User name=\""+uis[i].getUserName()+"\">\n\t\t"
							+"<passwd>"+uis[i].getPasswd()+" </passwd>\n\t\t"
							+"<email>"+uis[i].getEmail()+" </email>\n\t\t"
							+"</User>\n";
					if(i<(uis.length-1)){
						str += "\t";
					}
					out.write(str);
				}
				
				out.write("</Users>\n");
				// 关闭流通道
				out.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 从xml文件中读取通讯录用户信息，返回用户信息的数组
		public UserInfo [] ReadUserFromXML(String fileName){		
			UserInfo [] uis = new UserInfo[0];
			try {
				// 建立读通道，通过InputStreamReader的构造函数实现对中文字符的无乱码读取
				BufferedReader in = new BufferedReader(
						new InputStreamReader(
								new FileInputStream(fileName),"utf-8")); 
				// 读取通讯录用户信息保存到String字符串中
				String users = "";
				String line = null;
				while((line = in.readLine()) != null){
					users = users + line +"\n";
				}
				// 分割字符串，获得每个用户联系人信息的字符串，用户数目为ui数组大小减1
				String ui[] = splitStr(users);			
				uis = new UserInfo[ui.length-1];
				// 解析字符串，将相应信息保存到ContactPerson数组中
				for(int i=0; i<ui.length-1; i++){
					UserInfo tmp = new UserInfo();
					tmp.setUserName(getUserName(ui[i+1]));
					tmp.setPasswd(getPasswd(ui[i+1]));
					tmp.setEmail(getEmail(ui[i+1]));
					uis[i] = tmp;
				}
				// 关闭流通道
				in.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
					e.printStackTrace();
			}
			return uis;
		}
		// 分割字符串，得到每个用户信息的字符串
		private String [] splitStr(String str){
			return str.split("<User name=\"");
		}
		// 解析字符串，获得联系人的name属性
		private String getUserName(String str){
			String name = str.substring(0, str.indexOf("\""));
			System.out.println("username="+name);
			return name;
		}
		// 解析字符串，获得联系人的password属性
		private String getPasswd(String str){
			String passwd = str.substring(str.indexOf("<passwd>")+8, str.indexOf("</passwd>")-1);
			System.out.println("passwd="+passwd);
			return passwd;
		}
		// 解析字符串，获得联系人的email属性
		private String getEmail(String str){
			String email = str.substring(str.indexOf("<email>")+7, str.indexOf("</email>")-1);
			System.out.println("email="+email);
			return email;
		}
}
