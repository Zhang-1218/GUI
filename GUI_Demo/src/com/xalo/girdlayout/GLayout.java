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
		
		//���ò��ַ�ʽ
		/*
		 * ��һ����������������
		 * �ڶ�����������������
		 */
//		GridLayout girdLayout = new GridLayout(3,3);
		/*
		 * �������������м��
		 * ���ĸ��������м��
		 */
		GridLayout girdLayout = new GridLayout(3,3,10,20);
		this.setLayout(girdLayout);
		
		JButton[] btns = {jButton1,jButton2,jButton3,jButton4,jButton5,jButton6,jButton7,jButton8,jButton9};
		
		//ͨ��ѭ���԰�ť�������ʵ���������
		for(int i = 0; i < btns.length; i++) {
			
			JButton tempBtn = btns[i];
			tempBtn = new JButton(String.valueOf(i));
			this.add(tempBtn);
		}
		
		//���ô���
		this.setTitle("���񲼾�");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		//����ǰ����������Ļ����
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}







