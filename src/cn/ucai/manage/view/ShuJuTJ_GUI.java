package cn.ucai.manage.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cn.ucai.util.ClockThread;
import cn.ucai.util.Screen;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ShuJuTJ_GUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShuJuTJ_GUI frame = new ShuJuTJ_GUI();
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
	public ShuJuTJ_GUI() {
		Screen s=new Screen();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((s.scareenwidth()-1024)/2, (s.scareenhight()-668)/2, 1042, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img\\项目图片\\2eeec15a6af52c6ffd5c6821fd50d319.jpg"));
		lblNewLabel.setBounds(0, 0, 1026, 201);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 194, 1016, 352);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("按人物查询", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1024, 323);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\u59D3\u540D", "\u5DE5\u53F7", "\u6240\u5728\u7A97\u53E3", "\u4E3B\u529E\u4E1A\u52A1", "\u529E\u7406\u6210\u529F\u4EBA\u6570", "\u529E\u7406\u5931\u8D25\u4EBA\u6570"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("按业务查询", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 1011, 415);
		panel_1.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u4E1A\u52A1\u540D\u79F0", "\u529E\u7406\u7A97\u53E3", "\u529E\u7406\u6210\u529F\u4EBA\u6570", "\u529E\u7406\u5931\u8D25\u4EBA\u6570"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("按时间查询", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1022, 415);
		panel_2.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\u65F6\u95F4\u6BB5", "\u4E1A\u52A1\u540D\u79F0", "\u529E\u7406\u6210\u529F\u4EBA\u6570", "\u529E\u7406\u5931\u8D25\u4EBA\u6570"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JButton btnNewButton = new JButton("返回主菜单");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CaiDan_GUI c=new CaiDan_GUI();
				c.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton.setBounds(24, 567, 174, 60);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 22));
		lblNewLabel_1.setBounds(592, 733, 424, 60);
		contentPane.add(lblNewLabel_1);
		ClockThread clockThread=new ClockThread(lblNewLabel_1);
		clockThread.setPriority(10);
		clockThread.start();
	}
}
