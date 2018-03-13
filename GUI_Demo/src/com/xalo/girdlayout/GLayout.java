package com.xalo.girdlayout;

import java.awt.*;
import javax.swing.*;

public class GLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GLayoutFrame gLayoutFrame = new GLayoutFrame();
	}
}

class GLayoutFrame extends JFrame{
	
	private JButton jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9;
	
	public GLayoutFrame() {
		
		//设置布局方式
		/*
		 * 第一个参数：代表行数
		 * 第二个参数：代表列数
		 */
//		GridLayout girdLayout = new GridLayout(3,3);
		/*
		 * 第三个参数：列间距
		 * 第四个参数：行间距
		 */
		GridLayout girdLayout = new GridLayout(3,3,10,20);
		this.setLayout(girdLayout);
		
		JButton[] btns = {jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9};
		
		//通过循环对按钮组件进行实例化并添加
		for(int i = 0; i < btns.length; i++) {
			
			JButton tempBtn = btns[i];
			tempBtn = new JButton(String.valueOf(i));
			this.add(tempBtn);
		}
		
		//设置窗体
		this.setTitle("网格布局");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		//将当前窗体置于屏幕中央
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}







