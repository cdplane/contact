/*
 * PersonPanel.java
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
public class PersonPanel extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1006498562584551369L;
	/** Creates new form PersonPanel */
	private JFrame mainFrame = null;
	private PersonCols pcs = null;
	private UserCols ucs = null;
	private UserInfo ui = null;
	private ContactPerson cp = null;
	private String fileName = "./contact.xml";

	public PersonPanel(JFrame mainFrame, PersonCols pcs, UserCols ucs,
			UserInfo ui, ContactPerson cp) {
		super();
		this.mainFrame = mainFrame;
		this.pcs = pcs;
		this.ucs = ucs;
		this.ui = ui;
		this.cp = cp;
		initComponents();
	}

	/*lab_showname.setText(cp.getName());
	lab_showpiny.setText(cp.getName_piny());
	edit_address.setText(cp.getAddress());
	edit_birth.setText(cp.getBirthday());
	edit_phone.setText(cp.getPhonenum());*/
	
	/** This method is called from within the constructor to
	 * initialize the form.
	 * 	
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		btn_update = new javax.swing.JButton();
		btn_cancel = new javax.swing.JButton();
		lab_name = new javax.swing.JLabel();
		lab_pingy = new javax.swing.JLabel();
		lab_address = new javax.swing.JLabel();
		lab_birth = new javax.swing.JLabel();
		lab_age = new javax.swing.JLabel();
		edit_address = new javax.swing.JTextField();
		edit_birth = new javax.swing.JTextField();
		edit_phone = new javax.swing.JTextField();
		lab_welcome = new javax.swing.JLabel();
		lab_showbirth = new javax.swing.JLabel();
		lab_showphone = new javax.swing.JLabel();
		lab_showname = new javax.swing.JLabel();
		lab_showpiny = new javax.swing.JLabel();

		setBackground(new java.awt.Color(0, 204, 204));
		lab_showname.setText(cp.getName());
		lab_showpiny.setText(cp.getName_piny());
		edit_address.setText(cp.getAddress());
		edit_birth.setText(cp.getBirthday());
		edit_phone.setText(cp.getPhonenum());

		btn_update.setText("\u66f4\u65b0");
		btn_update.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_updateActionPerformed(evt);
			}
		});

		btn_cancel.setText("\u53d6\u6d88");
		btn_cancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_cancelActionPerformed(evt);
			}
		});

		lab_name.setText("\u59d3\u540d\uff1a");

		lab_pingy.setText("\u62fc\u97f3\u59d3\u540d\uff1a");

		lab_address.setText("\u5730\u5740\uff1a");

		lab_birth.setText("\u751f\u65e5\uff1a");

		lab_age.setText("\u624b\u673a\u53f7\u7801\uff1a");

		lab_welcome.setFont(new java.awt.Font("华文行楷", 0, 24));
		lab_welcome
				.setText("\u6b22\u8fce\u53ca\u65f6\u66f4\u65b0\u901a\u8baf\u5f55\u4e2a\u4eba\u4fe1\u606f\uff01");

		lab_showbirth.setText("(\u4f8b:1988-03-21)");

		lab_showphone.setText("(11\u4f4d\u6570\u5b57)");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(35, 35,
																		35)
																.addComponent(
																		lab_welcome))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(50, 50,
																		50)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(33,
																										33,
																										33)
																								.addComponent(
																										btn_update)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										btn_cancel))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														lab_age)
																												.addComponent(
																														lab_birth)
																												.addComponent(
																														lab_address)
																												.addComponent(
																														lab_pingy)
																												.addComponent(
																														lab_name))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																												.addComponent(
																														lab_showpiny,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE)
																												.addComponent(
																														lab_showname,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														Short.MAX_VALUE)
																												.addComponent(
																														edit_phone)
																												.addComponent(
																														edit_address)
																												.addComponent(
																														edit_birth,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														113,
																														Short.MAX_VALUE))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														lab_showphone)
																												.addComponent(
																														lab_showbirth))))))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lab_welcome)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(24, 24,
																		24)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						lab_name)
																				.addComponent(
																						lab_showname,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						15,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						lab_pingy)
																				.addComponent(
																						lab_showpiny))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						lab_address)
																				.addComponent(
																						edit_address,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						lab_birth)
																				.addComponent(
																						edit_birth,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						lab_age)
																				.addComponent(
																						edit_phone,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(26, 26,
																		26)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						btn_update)
																				.addComponent(
																						btn_cancel))
																.addContainerGap(
																		36,
																		Short.MAX_VALUE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		lab_showbirth,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		20,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		lab_showphone,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		20,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(86, 86,
																		86)))));
	}// </editor-fold>
	//GEN-END:initComponents

	private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {
		this.mainFrame.getContentPane().removeAll();
		this.mainFrame.getContentPane().add(
				new MainContactPanel(this.mainFrame, this.ucs, this.pcs,
						this.ui));
		this.mainFrame.getContentPane().validate();
	}

	private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {
		// 将窗体组件的内容保存起来
		String name = lab_showname.getText();
		String piny = lab_showpiny.getText();
		String address = edit_address.getText();
		String birth = edit_birth.getText();
		String phone = edit_phone.getText();

		CheckInfo check = new CheckInfo();
		if (check.checkBirth(birth) && check.checkPhoneNum(phone)) {
			ContactPerson tmpcp = new ContactPerson();
			tmpcp.setName(name);
			tmpcp.setName_piny(piny);
			tmpcp.setAddress(address);
			tmpcp.setBirthday(birth);
			tmpcp.setPhonenum(phone);
			tmpcp.setNumId(pcs.get(name).getNumId());
			pcs.update(pcs.get(name), tmpcp);
			pcs.sort();
			pcs.reSetNumId(pcs);

			ContactToXML cxml = new ContactToXML();
			cxml.WriteContactToXML(pcs, fileName);

			this.mainFrame.getContentPane().removeAll();
			this.mainFrame.getContentPane().add(
					new MainContactPanel(this.mainFrame, this.ucs, this.pcs,
							this.ui));
			this.mainFrame.getContentPane().validate();
		} else {
			System.out.println("联系人信息格式不正确.");
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton btn_cancel;
	private javax.swing.JButton btn_update;
	private javax.swing.JTextField edit_address;
	private javax.swing.JTextField edit_birth;
	private javax.swing.JTextField edit_phone;
	private javax.swing.JLabel lab_address;
	private javax.swing.JLabel lab_age;
	private javax.swing.JLabel lab_birth;
	private javax.swing.JLabel lab_name;
	private javax.swing.JLabel lab_pingy;
	private javax.swing.JLabel lab_showbirth;
	private javax.swing.JLabel lab_showname;
	private javax.swing.JLabel lab_showphone;
	private javax.swing.JLabel lab_showpiny;
	private javax.swing.JLabel lab_welcome;
	// End of variables declaration//GEN-END:variables

}