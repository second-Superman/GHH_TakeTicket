package cn.ucai.taketicket.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.ucai.util.ClockThread;
import cn.ucai.util.Screen;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket_GUI extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel_2=null;
	public JLabel lblNewLabel_4=null;
	public JLabel lblNewLabel_6=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_GUI frame = new Ticket_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ticket_GUI() {
		Screen s=new Screen();
		setResizable(false);
		setBounds((s.scareenwidth()-450)/2, (s.scareenhight()-300)/2, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("欢迎来到工商银行");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 27, 183, 26);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("业务代码：");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(95, 63, 106, 26);
		contentPane.add(lblNewLabel_1);
		
		
	
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(211, 63, 22, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("排队号码：");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(105, 99, 106, 35);
		contentPane.add(lblNewLabel_3);
		
		 lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(193, 105, 54, 26);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("等待人数：");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(106, 150, 95, 26);
		contentPane.add(lblNewLabel_5);
		
		 lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(203, 146, 40, 35);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("取号时间：");
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(105, 186, 96, 35);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setFont(new Font("宋体", Font.BOLD, 14));
		lblNewLabel_8.setBounds(193, 186, 241, 35);
		contentPane.add(lblNewLabel_8);
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 EE HH:mm:ss");
		
		lblNewLabel_8.setText(df.format(date));
		
	}

}
