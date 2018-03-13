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
	
	//由于单选按钮，每次只能选中一个，所以需要将单选按钮加入到group中。
	private ButtonGroup btnGroup;
	
	private JPanel panel1,panel2,panel3;
	
	
	public RegisterView() {
		//实例化组件
		this.sportsLabel = new JLabel("你最喜欢的运动");
		this.footballBox = new JCheckBox("足球");
		this.baskballBox = new JCheckBox("篮球");
		this.wangqiuBox = new JCheckBox("网球");
		
		this.genderLabel = new JLabel("你的性别");
		this.manRadioButton = new JRadioButton("男");
		this.womanRadioButton = new JRadioButton("女");
		this.btnGroup = new ButtonGroup();
		this.btnGroup.add(manRadioButton);
		this.btnGroup.add(womanRadioButton);
		
		
		this.registerBtn = new JButton("注册用户");
		this.cancelBtn = new JButton("取消注册");
		
		//实例化panel，为panel添加组件
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
		
		//为JFrame设置布局方式
		this.setLayout(new GridLayout(3,1));
		//添加组件
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







