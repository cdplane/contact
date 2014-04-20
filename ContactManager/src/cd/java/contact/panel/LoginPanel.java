package cd.java.contact.panel;

import java.awt.event.ActionEvent;

import javax.swing.*;

import cd.java.contact.*;
import java.io.*;

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = -3986084754798192661L;
	// 定义组件变量
	private JButton btn_login;
	private JButton btn_register;
	private JButton btn_reget;
	private JLabel lab_username;
	private JLabel lab_passwd;
	private JLabel lab_validate;
	private JLabel lab_image;
	private JLabel lab_ask;
	private JLabel lab_welcome;
	private JLabel lab_logo;
	private JTextField edit_username;
	private JPasswordField edit_passwd;
	private JTextField edit_validate;

	// 自定义属性
	private UserCols ucs = null;
	private JFrame mainFrame = null;
	private PersonCols pcs = null;
	private String fileName = "./contact.xml";
	private UserInfo ui = null;
	private String validate = "X2fD";

	// 构造函数
	public LoginPanel(JFrame mainFrame, UserCols ucs) {
		super();
		this.mainFrame = mainFrame;
		this.ucs = ucs;
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		lab_username = new javax.swing.JLabel();
		btn_login = new javax.swing.JButton();
		btn_register = new javax.swing.JButton();
		edit_username = new javax.swing.JTextField();
		lab_passwd = new javax.swing.JLabel();
		lab_validate = new javax.swing.JLabel();
		lab_image = new javax.swing.JLabel();
		btn_reget = new javax.swing.JButton();
		lab_ask = new javax.swing.JLabel();
		lab_welcome = new javax.swing.JLabel();
		lab_logo = new javax.swing.JLabel();
		edit_passwd = new javax.swing.JPasswordField();
		edit_validate = new javax.swing.JTextField();

		setBackground(new java.awt.Color(0, 204, 204));
		setMaximumSize(new java.awt.Dimension(32000, 32000));

		lab_username.setFont(new java.awt.Font("楷体_GB2312", 0, 18));
		lab_username.setText("\u7528\u6237\u540d");

		btn_login.setFont(new java.awt.Font("宋体", 1, 12));
		btn_login.setText("\u767b\u5f55");
		btn_login.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_loginActionPerformed(evt);
			}
		});

		btn_register.setFont(new java.awt.Font("宋体", 1, 12));
		btn_register.setText("\u6ce8\u518c");
		btn_register.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_registerActionPerformed(evt);
			}
		});

		edit_username.setPreferredSize(new java.awt.Dimension(10, 20));

		lab_passwd.setFont(new java.awt.Font("楷体_GB2312", 0, 18));
		lab_passwd.setText("\u5bc6\u7801");

		lab_validate.setFont(new java.awt.Font("楷体_GB2312", 0, 18));
		lab_validate.setText("\u9a8c\u8bc1\u7801");

		lab_image.setFont(new java.awt.Font("宋体", 2, 24));
		lab_image.setText(this.validate);
		lab_image.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));

		btn_reget.setFont(new java.awt.Font("楷体_GB2312", 1, 12));
		btn_reget.setText("\u91cd\u65b0\u83b7\u53d6\u9a8c\u8bc1\u7801");
		btn_reget.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_regetActionPerformed(evt);
			}
		});

		lab_ask.setText("\u8fd8\u6ca1\u6709\u8d26\u53f7\uff1f");

		lab_welcome.setFont(new java.awt.Font("华文行楷", 2, 18));
		lab_welcome.setForeground(new java.awt.Color(204, 0, 204));
		lab_welcome
				.setText("\u6b22\u8fce\u6765\u5230cdplane\u7684\u901a\u8baf\u5f55~~");
		lab_welcome.setPreferredSize(new java.awt.Dimension(210, 210));

		lab_logo.setFont(new java.awt.Font("华文行楷", 0, 18));
		lab_logo.setForeground(new java.awt.Color(204, 0, 204));
		lab_logo.setText("\u9752\u6625\u65e0\u9650\uff0c\u53cb\u8c0a\u957f\u5b58\uff01\uff01\uff01");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(137, Short.MAX_VALUE)
								.addComponent(lab_logo).addContainerGap())
				.addGroup(
						layout.createSequentialGroup()
								.addGap(73, 73, 73)
								.addComponent(lab_welcome,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										220,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(70, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(83, 83, 83)
								.addComponent(btn_login,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										74,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btn_register,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										76,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(lab_ask,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										98,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(22, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(84, 84, 84)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(lab_validate)
												.addComponent(lab_username)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(10, 10,
																		10)
																.addComponent(
																		lab_passwd))
												.addComponent(
														lab_image,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														62,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(10, 10, 10)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(edit_passwd,
														0, 0, Short.MAX_VALUE)
												.addComponent(edit_validate)
												.addComponent(
														edit_username,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														btn_reget,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addGap(84, 84, 84)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(lab_welcome,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										28,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(lab_logo)
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.CENTER)
												.addComponent(lab_username)
												.addComponent(
														edit_username,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(12, 12, 12)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lab_passwd)
												.addComponent(
														edit_passwd,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(11, 11, 11)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														lab_validate,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														23,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														edit_validate,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.CENTER)
												.addComponent(btn_reget)
												.addComponent(
														lab_image,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														32,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(17, 17, 17)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.CENTER)
												.addComponent(btn_login)
												.addComponent(btn_register)
												.addComponent(lab_ask))
								.addGap(26, 26, 26)));
	}// </editor-fold>
	//GEN-END:initComponents

	protected void btn_loginActionPerformed(ActionEvent evt) {
		// 将窗体组件中的信息保存起来
		String username = edit_username.getText();
		String passwd = String.valueOf(edit_passwd.getPassword());
		String validate = edit_validate.getText();
		
		pcs = new PersonCols();
		
		// 若contact.xml文件存在，则读取contact.xml文件，将联系人保存到PersonCols链表中
		if(new File(this.fileName).exists()){
			ContactToXML cxml = new ContactToXML();
			ContactPerson [] cps = cxml.ReadContactFromXML(this.fileName);
			for(ContactPerson cp : cps){
				this.pcs.add(cp);
				this.pcs.sort();
			}
		}
		
		// 初始化一个检查信息的对象，对窗体组件中输入的用户名、密码、验证码进行验证
		CheckInfo check = new CheckInfo();
		if(check.checkUserName(username) && check.checkPasswd(passwd)){
			if(validate.compareToIgnoreCase(lab_image.getText()) == 0){
				if(ucs.get(username) != null){
					ui = ucs.get(username);
					if(ui.getPasswd().compareTo(passwd) == 0){
						this.mainFrame.getContentPane().removeAll();
						this.mainFrame.getContentPane().add(new MainContactPanel(this.mainFrame, this.ucs, this.pcs, this.ui));
						this.mainFrame.getContentPane().validate();
					}else{
						edit_passwd.setText("");
						edit_validate.setText("");
						System.out.println("密码不正确.");
					}
				}else{
					edit_username.setText("");
					edit_passwd.setText("");
					edit_validate.setText("");
					System.out.println("用户不存在.");
				}
			}else{
				System.out.println("验证码不正确.");
			}
		}else{
			System.out.println("用户信息格式不正确.");
		}
	}

	private void btn_regetActionPerformed(java.awt.event.ActionEvent evt) {
		edit_validate.setText("");
		CommonMethod cm = new CommonMethod();
		this.validate = cm.MakeValidate();
		
		lab_image.setText(this.validate);
	}

	private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {
		this.mainFrame.getContentPane().removeAll();
		this.mainFrame.getContentPane().add(new RegisterPanel(this.mainFrame, this.ucs));
		this.mainFrame.getContentPane().validate();
	}
}