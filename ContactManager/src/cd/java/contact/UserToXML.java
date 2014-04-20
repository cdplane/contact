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
	// ���û���Ϣд����ΪfileName���ļ���ȥ
		public void WriteUserToXML(UserCols pscol, String fileName){
			try {
				//�����������ͨ����֧�������ַ���д��
				OutputStreamWriter out = new OutputStreamWriter(
						new BufferedOutputStream(
								new FileOutputStream(fileName)), "utf-8");
				// дxml�ļ���ͷ
				out.write("<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n");
				out.write("<Users>\n\t");
				// ����xml�ļ��ĸ�ʽ���û���Ϣд���ļ�
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
				// �ر���ͨ��
				out.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// ��xml�ļ��ж�ȡͨѶ¼�û���Ϣ�������û���Ϣ������
		public UserInfo [] ReadUserFromXML(String fileName){		
			UserInfo [] uis = new UserInfo[0];
			try {
				// ������ͨ����ͨ��InputStreamReader�Ĺ��캯��ʵ�ֶ������ַ����������ȡ
				BufferedReader in = new BufferedReader(
						new InputStreamReader(
								new FileInputStream(fileName),"utf-8")); 
				// ��ȡͨѶ¼�û���Ϣ���浽String�ַ�����
				String users = "";
				String line = null;
				while((line = in.readLine()) != null){
					users = users + line +"\n";
				}
				// �ָ��ַ��������ÿ���û���ϵ����Ϣ���ַ������û���ĿΪui�����С��1
				String ui[] = splitStr(users);			
				uis = new UserInfo[ui.length-1];
				// �����ַ���������Ӧ��Ϣ���浽ContactPerson������
				for(int i=0; i<ui.length-1; i++){
					UserInfo tmp = new UserInfo();
					tmp.setUserName(getUserName(ui[i+1]));
					tmp.setPasswd(getPasswd(ui[i+1]));
					tmp.setEmail(getEmail(ui[i+1]));
					uis[i] = tmp;
				}
				// �ر���ͨ��
				in.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
					e.printStackTrace();
			}
			return uis;
		}
		// �ָ��ַ������õ�ÿ���û���Ϣ���ַ���
		private String [] splitStr(String str){
			return str.split("<User name=\"");
		}
		// �����ַ����������ϵ�˵�name����
		private String getUserName(String str){
			String name = str.substring(0, str.indexOf("\""));
			System.out.println("username="+name);
			return name;
		}
		// �����ַ����������ϵ�˵�password����
		private String getPasswd(String str){
			String passwd = str.substring(str.indexOf("<passwd>")+8, str.indexOf("</passwd>")-1);
			System.out.println("passwd="+passwd);
			return passwd;
		}
		// �����ַ����������ϵ�˵�email����
		private String getEmail(String str){
			String email = str.substring(str.indexOf("<email>")+7, str.indexOf("</email>")-1);
			System.out.println("email="+email);
			return email;
		}
}
