package com.xalo.gui.cg;

import java.awt.*;
import javax.swing.*;

public class Frame {

	public static void main(String[] args) {

		/*
		 * swing的顶级容器 JFrame
		 */
		// 实例化窗体对象
//		JFrame jFrame = new JFrame();
//		// 窗体属性的设置
//		// 标题
//		jFrame.setTitle("JFrame");
//		// 大小
//		jFrame.setSize(200, 200);
//		// 设置位置
//		jFrame.setLocation(100, 200);
//		// 设置窗体大小不可改变
//		jFrame.setResizable(false);
//		// 设置为可见
//		jFrame.setVisible(true);
//		// 设置关闭窗体时，关闭应用
//		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame myFrame = new MyFrame();
	}
}

class MyFrame extends JFrame {

	// 构造方法
	public MyFrame() {
		//创建按钮组件
		JButton jBtn = new JButton("点我");
		//添加组建
		this.add(jBtn);
		// 对当前窗体进行初始化设置
		this.setTitle("JFrame");
		// 大小
		this.setSize(200, 200);
		// 设置位置
		this.setLocation(100, 200);
		// 设置窗体大小不可改变
		this.setResizable(false);
		// 设置为可见
		this.setVisible(true);
		// 设置关闭窗体时，关闭应用
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
