package cd.java.contact;

import java.io.*;

public class ContactToXML {
	// 将联系人信息写到名为fileName的文件中去
	public void WriteContactToXML(PersonCols pscol, String fileName) {
		try {
			// 　创建输出流通道，支持中文字符的写入
			OutputStreamWriter out = new OutputStreamWriter(
					new BufferedOutputStream(new FileOutputStream(fileName)),
					"utf-8");
			// 写xml文件的头
			out.write("<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n");
			out.write("<Persons>\n");
			// 按照xml文件的格式将联系人信息写入文件
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
			// 关闭流通道
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 从xml文件中读取联系人信息，返回联系人信息的数组
	public ContactPerson[] ReadContactFromXML(String fileName) {
		ContactPerson[] cps = new ContactPerson[0];
		try {
			// 建立读通道，通过InputStreamReader的构造函数实现对中文字符的无乱码读取
			BufferedReader in = new BufferedReader(new InputStreamReader(
					new FileInputStream(fileName), "utf-8"));
			// 读取联系人信息保存到String字符串中
			String persons = "";
			String line = null;
			while ((line = in.readLine()) != null) {
				persons = persons + line + "\n";
			}
			// 分割字符串，获得每个联系人信息的字符串，联系人数目为ps数组大小减1
			String ps[] = splitStr(persons);
			cps = new ContactPerson[ps.length - 1];
			// 解析字符串，将相应信息保存到ContactPerson数组中
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
			// 关闭流通道
			in.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cps;
	}

	// 分割字符串，得到每个联系人信息的字符串
	private String[] splitStr(String str) {
		return str.split("<Person numId=\"");
	}

	// 解析字符串，获得联系人的numId属性
	private int getNumId(String str) {
		String strId = str.substring(0, str.indexOf("\""));
		System.out.println("numId=" + strId);
		return Integer.parseInt(strId);
	}

	// 解析字符串，获得联系人的name属性
	private String getName(String str) {
		String name = str.substring(str.indexOf("<name>") + 6,
				str.indexOf("</name>"));
		System.out.println("name=" + name);
		return name;
	}

	// 解析字符串，获得联系人的address属性
	private String getAddress(String str) {
		String address = str.substring(str.indexOf("<address>") + 9,
				str.indexOf("</address>"));
		System.out.println("address=" + address);
		return address;
	}

	// 解析字符串，获得联系人的birthday属性
	private String getBirthday(String str) {
		String birthday = str.substring(str.indexOf("<birthday>") + 10,
				str.indexOf("</birthday>") - 1);
		System.out.println("birthday=" + birthday);
		return birthday;
	}

	// 解析字符串，获得联系人的phoneNum属性
	private String getPhonenum(String str) {
		String phoneNum = str.substring(str.indexOf("<phoneNum>") + 10,
				str.indexOf("</phoneNum>") - 1);
		System.out.println("phoneNum=" + phoneNum);
		return phoneNum;
	}

	// 解析字符串，获得联系人的name_uk属性
	private String getName_UK(String str) {
		String name_piny = str.substring(str.indexOf("<name_piny>") + 11,
				str.indexOf("</name_piny>") - 1);
		System.out.println("name_piny=" + name_piny);
		return name_piny;
	}
}
