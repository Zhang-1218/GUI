package com.xalo.hhLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManyLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MLayout mLayout = new MLayout();
	}

}

class MLayout extends JFrame{
	
	//声明6个按钮
	private JButton jBtn1,jBtn2,jBtn3,jBtn4,jBtn5,jBtn6;
	
	/*
	 * 由于当前的布局，一种布局管理器无法实现，
	 * 需要多个布局管理器结合使用，根据每个部分管理器的不同，
	 * 我们可以使用多个JPanel子容器来实现
	 */
	private JPanel panel1,panel2,panel3;
	
	
	public MLayout() {
		//对按钮进行初始化
		jBtn1 = new JButton("苹果");
		jBtn2 = new JButton("西瓜");
		jBtn3 = new JButton("荔枝");
		jBtn4 = new JButton("狐狸");
		jBtn5 = new JButton("葡萄");
		jBtn6 = new JButton("樱桃");
		//对panel对象进行实例化
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		//设置每个panel的布局方式
		//注意，设置布局方式需要写在添加组件之前
		//panel2选用边界布局，panel默认布局方式是流布局。
		panel1.setLayout(new FlowLayout());
		panel3.setLayout(new FlowLayout());
		panel2.setLayout(new BorderLayout());
		
		//为对应的panel添加组件
		panel1.add(jBtn1);
		panel1.add(jBtn2);
		panel2.add(jBtn3);
		panel3.add(jBtn4);
		panel3.add(jBtn5);
		panel3.add(jBtn6);
		
		//设置JFrame的布局方式，并添加组件
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.add(panel3,BorderLayout.SOUTH);
		
		//设置Jframe
		this.setTitle("混合布局");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}







