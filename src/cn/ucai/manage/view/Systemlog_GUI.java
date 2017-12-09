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

import cn.ucai.entity.Systemlog;
import cn.ucai.server.dao.SystemlogDao;
import cn.ucai.server.dao.Impl.SystemlogDaoImpl;
import cn.ucai.util.ClockThread;
import cn.ucai.util.Screen;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Systemlog_GUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Systemlog_GUI frame = new Systemlog_GUI();
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
	public Systemlog_GUI() {
		Screen s=new Screen();
		setResizable(false);
		setTitle("系统日志");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((s.scareenwidth()-1056)/2, (s.scareenhight()-623)/2, 1056, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img\\项目图片\\2eeec15a6af52c6ffd5c6821fd50d319.jpg"));
		lblNewLabel.setBounds(0, 0, 1041, 194);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 192, 1041, 252);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("", null, scrollPane, null);
		
		table = new JTable();
		SystemlogDao sl=new SystemlogDaoImpl();
		List<Systemlog> list=sl.selectList(new Systemlog());
		Object[][] systemlog=new Object[list.size()][5];
		for(int i=0;i<list.size();i++){
			systemlog[i][0]=list.get(i).getId();
			systemlog[i][1]=list.get(i).getUsername();
			systemlog[i][2]=list.get(i).getCreatetime();
			systemlog[i][3]=list.get(i).getContent();
			systemlog[i][4]=list.get(i).getIp();
		}
		table.setModel(new DefaultTableModel(
			
				systemlog,
			new String[] {
				"id", "\u64CD\u4F5C\u8005\u8D26\u6237\u540D", "\u64CD\u4F5C\u65F6\u95F4", "\u64CD\u4F5C\u5185\u5BB9", "ip"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("返回主菜单");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CaiDan_GUI c=new CaiDan_GUI();
				c.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 478, 155, 61);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 22));
		lblNewLabel_1.setBounds(652, 660, 389, 61);
		contentPane.add(lblNewLabel_1);
		ClockThread clockThread=new ClockThread(lblNewLabel_1);
		clockThread.setPriority(10);
		clockThread.start();
	}
}
