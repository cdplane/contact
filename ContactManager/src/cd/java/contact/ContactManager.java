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
		// 设置默认的窗口关闭操作
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// 设置窗口标题
		setTitle("\u901a\u8baf\u5f55");
		// 设置光标样式
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
				
				// 增加一个panel到frame
				mainFrame.add(new LoginPanel(mainFrame, ucs));
				
				// 调整此窗口的大小，以适合其子组件的首选大小和布局
				mainFrame.pack();	
				
				// 获得缺省的工具包
				Toolkit kit = Toolkit.getDefaultToolkit();
				
				// 设置frame的小图标
				Image image;
				image = kit.getImage("./res/contact.png");
				mainFrame.setIconImage(image);
				
				// 设置窗体显示在桌面的正中央
				Dimension screenSize = kit.getScreenSize();
				mainFrame.setLocation((screenSize.width-mainFrame.getWidth())/2, 
						(screenSize.height-mainFrame.getHeight())/2);
				
				mainFrame.setVisible(true);
			}
		});
	}
}