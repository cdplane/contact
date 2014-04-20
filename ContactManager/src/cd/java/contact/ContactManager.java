package cd.java.contact;

import java.awt.*;
import java.io.File;

import javax.swing.*;

import cd.java.contact.panel.LoginPanel;

public class ContactManager extends JFrame {

	private static final long serialVersionUID = -1948942292299428256L;
	
	private static JFrame mainFrame = null;
	private static String fileName = "./user.xml";
	private static UserCols ucs = null;
	public ContactManager() {
		initComponents();
	}

	private void initComponents() {
		// ����Ĭ�ϵĴ��ڹرղ���
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// ���ô��ڱ���
		setTitle("\u901a\u8baf\u5f55");
		// ���ù����ʽ
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				mainFrame = new ContactManager();
				ucs = new UserCols();
				if(new File(fileName).exists()){
					UserToXML uxml = new UserToXML();
					UserInfo uis [] = uxml.ReadUserFromXML(fileName);
					for(UserInfo ui : uis){
						ucs.add(ui);
					}
					ucs.sort();
				}
				
				// ����һ��panel��frame
				mainFrame.add(new LoginPanel(mainFrame, ucs));
				
				// �����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ���
				mainFrame.pack();	
				
				// ���ȱʡ�Ĺ��߰�
				Toolkit kit = Toolkit.getDefaultToolkit();
				
				// ����frame��Сͼ��
				Image image;
				image = kit.getImage("./res/contact.png");
				mainFrame.setIconImage(image);
				
				// ���ô�����ʾ�������������
				Dimension screenSize = kit.getScreenSize();
				mainFrame.setLocation((screenSize.width-mainFrame.getWidth())/2, 
						(screenSize.height-mainFrame.getHeight())/2);
				
				mainFrame.setVisible(true);
			}
		});
	}
}