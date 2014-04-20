/*
 * AddContactPanel.java
 *
 * Created on __DATE__, __TIME__
 */

package cd.java.contact.panel;

import javax.swing.JFrame;

import cd.java.contact.*;

/**
 *
 * @author  __USER__
 */
public class AddContactPanel extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5548937342189619743L;

	private JFrame mainFrame = null;
	private PersonCols pcs = null;
	private UserCols ucs = null;
	private String fileName = "./contact.xml";
	private UserInfo ui = null;

	/** Creates new form AddContactPanel */
	public AddContactPanel(JFrame mainFrame, UserCols ucs, PersonCols pcs, UserInfo ui) {
		super();
		this.mainFrame = mainFrame;
		this.ucs = ucs;
		this.pcs = pcs;
		this.ui = ui;
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		lab_name = new javax.swing.JLabel();
		lab_piny = new javax.swing.JLabel();
		lab_address = new javax.swing.JLabel();
		lab_birth = new javax.swing.JLabel();
		lab_phone = new javax.swing.JLabel();
		edit_name = new javax.swing.JTextField();
		edit_piny = new javax.swing.JTextField();
		edit_address = new javax.swing.JTextField();
		edit_birth = new javax.swing.JTextField();
		edit_phone = new javax.swing.JTextField();
		btn_add = new javax.swing.JButton();
		btn_cancel = new javax.swing.JButton();
		lab_welcome = new javax.swing.JLabel();
		lab_showname = new javax.swing.JLabel();
		lab_showpiny = new javax.swing.JLabel();
		lab_showbirth = new javax.swing.JLabel();
		lab_showphone = new javax.swing.JLabel();

		setBackground(new java.awt.Color(0, 204, 204));

		lab_name.setText("\u59d3\u540d");

		lab_piny.setText("\u62fc\u97f3\u59d3\u540d");

		lab_address.setText("\u5730\u5740");

		lab_birth.setText("\u751f\u65e5");

		lab_phone.setText("\u624b\u673a\u53f7\u7801");

		edit_name.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				edit_nameActionPerformed(evt);
			}
		});

		btn_add.setText("\u6dfb\u52a0");
		btn_add.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_addActionPerformed(evt);
			}
		});

		btn_cancel.setText("\u53d6\u6d88");
		btn_cancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_cancelActionPerformed(evt);
			}
		});

		lab_welcome.setFont(new java.awt.Font("宋体", 0, 18));
		lab_welcome.setText("\u6dfb\u52a0\u65b0\u7684\u8054\u7cfb\u4eba");

		lab_showname.setText("(2-10\u4e2a\u4e2d\u6587\u5b57\u7b26)");

		lab_showpiny.setText("(4-20\u4e2a\u5c0f\u5199\u5b57\u6bcd)");

		lab_showbirth.setText("(\u4f8b:1988-03-21)");

		lab_showphone.setText("(11\u4f4d\u6570\u5b57)");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(111, 111, 111)
								.addComponent(lab_welcome,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										130, Short.MAX_VALUE)
								.addGap(140, 140, 140))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGap(25, 25, 25)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		btn_add)
																.addGap(28, 28,
																		28)
																.addComponent(
																		btn_cancel))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						lab_phone)
																				.addComponent(
																						lab_birth)
																				.addComponent(
																						lab_piny)
																				.addComponent(
																						lab_address)
																				.addComponent(
																						lab_name))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						edit_phone)
																				.addComponent(
																						edit_birth)
																				.addComponent(
																						edit_address)
																				.addComponent(
																						edit_piny,
																						javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						edit_name,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						132,
																						Short.MAX_VALUE))))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lab_showname)
												.addComponent(lab_showpiny)
												.addComponent(lab_showbirth)
												.addComponent(lab_showphone))
								.addGap(60, 60, 60)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lab_welcome)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														edit_name,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lab_name)
												.addComponent(
														lab_showname,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														edit_piny,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lab_piny)
												.addComponent(
														lab_showpiny,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														edit_address,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(lab_address))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lab_birth)
												.addComponent(
														edit_birth,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														lab_showbirth,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lab_phone)
												.addComponent(
														edit_phone,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														lab_showphone,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btn_cancel)
												.addComponent(btn_add))
								.addContainerGap(19, Short.MAX_VALUE)));
	}// </editor-fold>
	//GEN-END:initComponents

	private void edit_nameActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {
		this.mainFrame.getContentPane().removeAll();
		this.mainFrame.getContentPane().add(
				new MainContactPanel(this.mainFrame, this.ucs, this.pcs, this.ui));
		this.mainFrame.getContentPane().validate();
	}

	private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {
		// 将窗体组件的内容保存起来
		String name = edit_name.getText();
		String piny = edit_piny.getText();
		String address = edit_address.getText();
		String birth = edit_birth.getText();
		String phone = edit_phone.getText();
		
		CheckInfo check = new CheckInfo();
		if(check.checkName(name) && check.checkPiny(piny) 
				&& check.checkBirth(birth) && check.checkPhoneNum(phone)){
			if(pcs == null || this.pcs.get(name) == null){
				ContactPerson cp = new ContactPerson();
				cp.setName(name);
				cp.setName_piny(piny);
				cp.setAddress(address);
				cp.setBirthday(birth);
				cp.setPhonenum(phone);
				cp.setNumId(pcs.getLength()+1);
				pcs.add(cp);
				pcs.sort();
				pcs.reSetNumId(pcs);
				
				ContactToXML cxml = new ContactToXML();
				cxml.WriteContactToXML(pcs, fileName);
				
				this.mainFrame.getContentPane().removeAll();
				this.mainFrame.getContentPane().add(
						new MainContactPanel(this.mainFrame, this.ucs, this.pcs, this.ui));
				this.mainFrame.getContentPane().validate();
			}else{
				edit_name.setText("");
				System.out.println("该用户已存在.");
			}
		}else{
			System.out.println("联系人信息格式不正确.");
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btn_add;
	private javax.swing.JButton btn_cancel;
	private javax.swing.JTextField edit_address;
	private javax.swing.JTextField edit_birth;
	private javax.swing.JTextField edit_name;
	private javax.swing.JTextField edit_phone;
	private javax.swing.JTextField edit_piny;
	private javax.swing.JLabel lab_address;
	private javax.swing.JLabel lab_birth;
	private javax.swing.JLabel lab_name;
	private javax.swing.JLabel lab_phone;
	private javax.swing.JLabel lab_piny;
	private javax.swing.JLabel lab_showbirth;
	private javax.swing.JLabel lab_showname;
	private javax.swing.JLabel lab_showphone;
	private javax.swing.JLabel lab_showpiny;
	private javax.swing.JLabel lab_welcome;
	// End of variables declaration//GEN-END:variables

}