package com.xalo.flowlayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlowLayout {
	public static void main(String[] args) {
		
		FLayout fLayout = new FLayout();
	}
}

class FLayout extends JFrame{
	
	private JButton jBtn1,jBtn2,jBtn3,jBtn4,jBtn5,jBtn6;
	
	public FLayout() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		//û�в��ֹ���������
		this.setLayout(null);
		JButton[] btns = {jBtn1,jBtn2,jBtn3,jBtn4,jBtn5,jBtn6};
		//ͨ��ѭ���������ʵ���������
		for(int i = 0; i < btns.length;i++) {
			//ȡ����ť����ʵ����
			JButton tempJBtn = btns[i];
			tempJBtn = new JButton("��ť" + i);
//			
			tempJBtn.setLocation(10*i, 0);
//			if(i == 0) {
				tempJBtn.setSize(150,150);
//			}
			this.add(tempJBtn);
			
		}
		
		//���ô���
		this.setSize(300,300);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}








