package com.xalo.borderlayout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FirstLayout firstLayout = new FirstLayout();
	}
	
}

class FirstLayout extends JFrame{
	
	//定义一组按钮
	private JButton jBtn1,jBtn2,jBtn3,jBtn4,jBtn5;
	
	public FirstLayout(){
		//对按钮进行实例化
		this.jBtn1 = new JButton("北部");
		this.jBtn2 = new JButton("南部");
		this.jBtn3 = new JButton("东部");
		this.jBtn4 = new JButton("西部");
		this.jBtn5 = new JButton("中部");
		
		//当使用了布局管理器，就无法自由的调整组件的大小和位置。
		this.jBtn4.setSize(400,400);
		//添加组件
		/*
		 * 第一个参数：需要添加的组件
		 * 第二参数：当前组件在边界布局下的位置
		 */
//		this.add(this.jBtn1,BorderLayout.NORTH);
//		this.add(this.jBtn2,BorderLayout.SOUTH);
//		this.add(this.jBtn3,BorderLayout.EAST);
		this.add(this.jBtn4,BorderLayout.WEST);
		this.add(this.jBtn5,BorderLayout.CENTER);
		
		//设置窗体
		this.setTitle("边界布局");
		this.setSize(400,500);
		this.setLocation(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置布局方式，默认是边界布局
		this.setLayout(new BorderLayout());
	}
}




