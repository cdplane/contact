package cd.java.contact;

import java.io.*;

public class ContactToXML {
	// ����ϵ����Ϣд����ΪfileName���ļ���ȥ
	public void WriteContactToXML(PersonCols pscol, String fileName) {
		try {
			// �����������ͨ����֧�������ַ���д��
			OutputStreamWriter out = new OutputStreamWriter(
					new BufferedOutputStream(new FileOutputStream(fileName)),
					"utf-8");
			// дxml�ļ���ͷ
			out.write("<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n");
			out.write("<Persons>\n");
			// ����xml�ļ��ĸ�ʽ����ϵ����Ϣд���ļ�
			ContactPerson[] cps = pscol.getAll();
			for (int i = 0; i < cps.length; i++) {
				String str = "\t<Person numId=\"" + cps[i].getNumId()
						+ "\">\n\t\t" + "<name>" + cps[i].getName()
						+ " </name>\n\t\t" + "<name_piny>"
						+ cps[i].getName_piny() + " </name_piny>\n\t\t"
						+ "<phoneNum>" + cps[i].getPhonenum()
						+ " </phoneNum>\n\t\t" + "<address>"
						+ cps[i].getAddress() + " </address>\n\t\t"
						+ "<birthday>" + cps[i].getBirthday()
						+ " </birthday>\n\t" + "</Person>\n";
				if (i < (cps.length - 1)) {
					str += "\t";
				}
				out.write(str);
			}

			out.write("</Persons>\n");
			// �ر���ͨ��
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ��xml�ļ��ж�ȡ��ϵ����Ϣ��������ϵ����Ϣ������
	public ContactPerson[] ReadContactFromXML(String fileName) {
		ContactPerson[] cps = new ContactPerson[0];
		try {
			// ������ͨ����ͨ��InputStreamReader�Ĺ��캯��ʵ�ֶ������ַ����������ȡ
			BufferedReader in = new BufferedReader(new InputStreamReader(
					new FileInputStream(fileName), "utf-8"));
			// ��ȡ��ϵ����Ϣ���浽String�ַ�����
			String persons = "";
			String line = null;
			while ((line = in.readLine()) != null) {
				persons = persons + line + "\n";
			}
			// �ָ��ַ��������ÿ����ϵ����Ϣ���ַ�������ϵ����ĿΪps�����С��1
			String ps[] = splitStr(persons);
			cps = new ContactPerson[ps.length - 1];
			// �����ַ���������Ӧ��Ϣ���浽ContactPerson������
			for (int i = 0; i < ps.length - 1; i++) {
				ContactPerson tmp = new ContactPerson();
				tmp.setNumId(getNumId(ps[i + 1]));
				tmp.setName(getName(ps[i + 1]));
				tmp.setName_piny(getName_UK(ps[i + 1]));
				tmp.setAddress(getAddress(ps[i + 1]));
				tmp.setPhonenum(getPhonenum(ps[i + 1]));
				tmp.setBirthday(getBirthday(ps[i + 1]));
				cps[i] = tmp;
			}
			// �ر���ͨ��
			in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cps;
	}

	// �ָ��ַ������õ�ÿ����ϵ����Ϣ���ַ���
	private String[] splitStr(String str) {
		return str.split("<Person numId=\"");
	}

	// �����ַ����������ϵ�˵�numId����
	private int getNumId(String str) {
		String strId = str.substring(0, str.indexOf("\""));
		System.out.println("numId=" + strId);
		return Integer.parseInt(strId);
	}

	// �����ַ����������ϵ�˵�name����
	private String getName(String str) {
		String name = str.substring(str.indexOf("<name>") + 6,
				str.indexOf("</name>"));
		System.out.println("name=" + name);
		return name;
	}

	// �����ַ����������ϵ�˵�address����
	private String getAddress(String str) {
		String address = str.substring(str.indexOf("<address>") + 9,
				str.indexOf("</address>"));
		System.out.println("address=" + address);
		return address;
	}

	// �����ַ����������ϵ�˵�birthday����
	private String getBirthday(String str) {
		String birthday = str.substring(str.indexOf("<birthday>") + 10,
				str.indexOf("</birthday>") - 1);
		System.out.println("birthday=" + birthday);
		return birthday;
	}

	// �����ַ����������ϵ�˵�phoneNum����
	private String getPhonenum(String str) {
		String phoneNum = str.substring(str.indexOf("<phoneNum>") + 10,
				str.indexOf("</phoneNum>") - 1);
		System.out.println("phoneNum=" + phoneNum);
		return phoneNum;
	}

	// �����ַ����������ϵ�˵�name_uk����
	private String getName_UK(String str) {
		String name_piny = str.substring(str.indexOf("<name_piny>") + 11,
				str.indexOf("</name_piny>") - 1);
		System.out.println("name_piny=" + name_piny);
		return name_piny;
	}
}
