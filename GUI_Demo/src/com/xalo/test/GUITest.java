package com.xalo.test;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUITest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterView view = new RegisterView();
	}

}


class RegisterView extends JFrame{
	
	private JLabel sportsLabel,genderLabel;
	private JCheckBox footballBox,baskballBox,wangqiuBox;
	private JRadioButton manRadioButton,womanRadioButton;
	private JButton registerBtn,cancelBtn;
	
	//���ڵ�ѡ��ť��ÿ��ֻ��ѡ��һ����������Ҫ����ѡ��ť���뵽group�С�
	private ButtonGroup btnGroup;
	
	private JPanel panel1,panel2,panel3;
	
	
	public RegisterView() {
		//ʵ�������
		this.sportsLabel = new JLabel("����ϲ�����˶�");
		this.footballBox = new JCheckBox("����");
		this.baskballBox = new JCheckBox("����");
		this.wangqiuBox = new JCheckBox("����");
		
		this.genderLabel = new JLabel("����Ա�");
		this.manRadioButton = new JRadioButton("��");
		this.womanRadioButton = new JRadioButton("Ů");
		this.btnGroup = new ButtonGroup();
		this.btnGroup.add(manRadioButton);
		this.btnGroup.add(womanRadioButton);
		
		
		this.registerBtn = new JButton("ע���û�");
		this.cancelBtn = new JButton("ȡ��ע��");
		
		//ʵ����panel��Ϊpanel������
		this.panel1 = new JPanel();
		this.panel2 = new JPanel();
		this.panel3 = new JPanel();
		
		this.panel1.add(this.sportsLabel);
		this.panel1.add(this.footballBox);
		this.panel1.add(this.baskballBox);
		this.panel1.add(this.wangqiuBox);
		
		this.panel2.add(this.genderLabel);
		this.panel2.add(this.manRadioButton);
		this.panel2.add(this.womanRadioButton);
		
		this.panel3.add(registerBtn);
		this.panel3.add(cancelBtn);
		
		//ΪJFrame���ò��ַ�ʽ
		this.setLayout(new GridLayout(3,1));
		//������
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
//		JTextField tf = new JTextField(10);
//		tf.setColumns(10);
		
		
	}
	
}







