package cn.ucai.manage.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.ucai.util.ClockThread;
import cn.ucai.util.Screen;


import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

public class CaiDan_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CaiDan_GUI frame = new CaiDan_GUI();
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
	public CaiDan_GUI() {
		Screen screen=new Screen();
		setResizable(false);
		setTitle("工商银行后台管理系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((screen.scareenwidth()-1055)/2, (screen.scareenhight()-750)/2, 1055, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img\\项目图片\\2eeec15a6af52c6ffd5c6821fd50d319.jpg"));
		lblNewLabel.setBounds(0, 0, 1050, 195);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("职工管理");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				User_GUI u=new User_GUI();
				u.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton.setIcon(new ImageIcon("img\\项目图片\\2f57ccebfe7f42aefd4f2e151ebf4a02.png"));
		btnNewButton.setBounds(126, 219, 291, 95);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("业务管理");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Business_GUI b=new Business_GUI();
				b.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setIcon(new ImageIcon("img\\项目图片\\15ff2a7b21573a39530d3ae191e97b79.jpg"));
		btnNewButton_1.setBounds(600, 219, 291, 95);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("窗口管理");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Window_GUI w=new Window_GUI();
				w.setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("img\\项目图片\\window.png"));
		btnNewButton_2.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_2.setBounds(126, 403, 291, 95);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("系统日志");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Systemlog_GUI s=new Systemlog_GUI();
				s.setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("img\\项目图片\\log.png"));
		btnNewButton_3.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_3.setBounds(600, 403, 291, 95);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("退出系统");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("img\\项目图片\\exit.png"));
		btnNewButton_4.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_4.setBounds(126, 553, 188, 73);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("数据统计");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ShuJuTJ_GUI s=new ShuJuTJ_GUI();
				s.setVisible(true);
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("img\\项目图片\\database.png"));
		btnNewButton_5.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_5.setBounds(600, 553, 291, 73);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_1.setBounds(600, 662, 374, 50);
		contentPane.add(lblNewLabel_1);
		
		ClockThread clockThread=new ClockThread(lblNewLabel_1);
		clockThread.setPriority(10);
		clockThread.start();
	}
}
