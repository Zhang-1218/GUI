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
	
	//����һ�鰴ť
	private JButton jBtn1,jBtn2,jBtn3,jBtn4,jBtn5;
	
	public FirstLayout(){
		//�԰�ť����ʵ����
		this.jBtn1 = new JButton("����");
		this.jBtn2 = new JButton("�ϲ�");
		this.jBtn3 = new JButton("����");
		this.jBtn4 = new JButton("����");
		this.jBtn5 = new JButton("�в�");
		
		//��ʹ���˲��ֹ����������޷����ɵĵ�������Ĵ�С��λ�á�
		this.jBtn4.setSize(400,400);
		//������
		/*
		 * ��һ����������Ҫ��ӵ����
		 * �ڶ���������ǰ����ڱ߽粼���µ�λ��
		 */
//		this.add(this.jBtn1,BorderLayout.NORTH);
//		this.add(this.jBtn2,BorderLayout.SOUTH);
//		this.add(this.jBtn3,BorderLayout.EAST);
		this.add(this.jBtn4,BorderLayout.WEST);
		this.add(this.jBtn5,BorderLayout.CENTER);
		
		//���ô���
		this.setTitle("�߽粼��");
		this.setSize(400,500);
		this.setLocation(200, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ò��ַ�ʽ��Ĭ���Ǳ߽粼��
		this.setLayout(new BorderLayout());
	}
}




