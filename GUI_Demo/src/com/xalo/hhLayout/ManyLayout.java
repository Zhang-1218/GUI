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
	
	//����6����ť
	private JButton jBtn1,jBtn2,jBtn3,jBtn4,jBtn5,jBtn6;
	
	/*
	 * ���ڵ�ǰ�Ĳ��֣�һ�ֲ��ֹ������޷�ʵ�֣�
	 * ��Ҫ������ֹ��������ʹ�ã�����ÿ�����ֹ������Ĳ�ͬ��
	 * ���ǿ���ʹ�ö��JPanel��������ʵ��
	 */
	private JPanel panel1,panel2,panel3;
	
	
	public MLayout() {
		//�԰�ť���г�ʼ��
		jBtn1 = new JButton("ƻ��");
		jBtn2 = new JButton("����");
		jBtn3 = new JButton("��֦");
		jBtn4 = new JButton("����");
		jBtn5 = new JButton("����");
		jBtn6 = new JButton("ӣ��");
		//��panel�������ʵ����
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		//����ÿ��panel�Ĳ��ַ�ʽ
		//ע�⣬���ò��ַ�ʽ��Ҫд��������֮ǰ
		//panel2ѡ�ñ߽粼�֣�panelĬ�ϲ��ַ�ʽ�������֡�
		panel1.setLayout(new FlowLayout());
		panel3.setLayout(new FlowLayout());
		panel2.setLayout(new BorderLayout());
		
		//Ϊ��Ӧ��panel������
		panel1.add(jBtn1);
		panel1.add(jBtn2);
		panel2.add(jBtn3);
		panel3.add(jBtn4);
		panel3.add(jBtn5);
		panel3.add(jBtn6);
		
		//����JFrame�Ĳ��ַ�ʽ����������
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.add(panel3,BorderLayout.SOUTH);
		
		//����Jframe
		this.setTitle("��ϲ���");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}







