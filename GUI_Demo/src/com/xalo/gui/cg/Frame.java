package com.xalo.gui.cg;

import java.awt.*;
import javax.swing.*;

public class Frame {

	public static void main(String[] args) {

		/*
		 * swing�Ķ������� JFrame
		 */
		// ʵ�����������
//		JFrame jFrame = new JFrame();
//		// �������Ե�����
//		// ����
//		jFrame.setTitle("JFrame");
//		// ��С
//		jFrame.setSize(200, 200);
//		// ����λ��
//		jFrame.setLocation(100, 200);
//		// ���ô����С���ɸı�
//		jFrame.setResizable(false);
//		// ����Ϊ�ɼ�
//		jFrame.setVisible(true);
//		// ���ùرմ���ʱ���ر�Ӧ��
//		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyFrame myFrame = new MyFrame();
	}
}

class MyFrame extends JFrame {

	// ���췽��
	public MyFrame() {
		//������ť���
		JButton jBtn = new JButton("����");
		//����齨
		this.add(jBtn);
		// �Ե�ǰ������г�ʼ������
		this.setTitle("JFrame");
		// ��С
		this.setSize(200, 200);
		// ����λ��
		this.setLocation(100, 200);
		// ���ô����С���ɸı�
		this.setResizable(false);
		// ����Ϊ�ɼ�
		this.setVisible(true);
		// ���ùرմ���ʱ���ر�Ӧ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
