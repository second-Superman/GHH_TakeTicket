package cn.ucai.manage.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import cn.ucai.entity.Window;
import cn.ucai.server.dao.WindowDao;
import cn.ucai.server.dao.Impl.WindowDaoImpl;
import cn.ucai.util.ClockThread;
import cn.ucai.util.Screen;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Window_GUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_GUI frame = new Window_GUI();
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
	public Window_GUI() {
		Screen s=new Screen();
		setResizable(false);
		setTitle("窗口管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((s.scareenwidth()-1060)/2, (s.scareenhight()-654)/2, 1060, 654);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img\\项目图片\\2eeec15a6af52c6ffd5c6821fd50d319.jpg"));
		lblNewLabel.setBounds(0, 0, 1046, 193);
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 192, 1046, 365);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("添加", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 1041, 94);
		panel_1.add(scrollPane_1);
		
		table_2 = new JTable();
		WindowDaoImpl wl=new WindowDaoImpl();
		List<Window> list=wl.selectList(new Window());
		Object[][] window=new Object[list.size()][4];
		for(int i=0;i<list.size();i++){
			window[i][0] = list.get(i).getId();
			window[i][1] = list.get(i).getNo();
			window[i][2]=list.get(i).getB_id();
			window[i][3] = list.get(i).getDisabled();
		}
		table_2.setModel(new DefaultTableModel(
			
			window,
			new String[] {
				"ID", "\u7A97\u53E3\u53F7", "b_id", "\u662F\u5426\u7981\u7528"
			}
		));
		scrollPane_1.setViewportView(table_2);
		
		JLabel lblNewLabel_2 = new JLabel("添加窗口号");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(184, 104, 98, 50);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_2.setBounds(126, 148, 200, 50);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("确定");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no =Integer.valueOf(textField_2.getText());
				int b_id=Integer.valueOf(textField_5.getText());
				int disabled=Integer.valueOf(textField_6.getText());
				WindowDao wd=new WindowDaoImpl();
				Window w=new Window();
				w.setNo(no);
				w.setB_id(b_id);
				w.setDisabled(disabled);
				boolean i=wd.insert(w);
				if(i){
					JOptionPane.showMessageDialog(btnNewButton_5, "添加成功！");
					textField_2.setText("");
					textField_5.setText("");
					textField_6.setText("");
				}else{
					JOptionPane.showMessageDialog(btnNewButton_5, "添加失败！");
				}
				
			}
		});
		btnNewButton_5.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_5.setBounds(276, 234, 93, 52);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("重置");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");
				textField_5.setText("");
				textField_6.setText("");
			}
		});
		btnNewButton_6.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_6.setBounds(506, 234, 93, 52);
		panel_1.add(btnNewButton_6);
		
		JLabel lblNewLabel_3 = new JLabel("是否禁用(1:未禁用 2：禁用)");
		lblNewLabel_3.setBounds(608, 108, 186, 46);
		panel_1.add(lblNewLabel_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(406, 148, 136, 50);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("b_id");
		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(413, 116, 129, 23);
		panel_1.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(608, 148, 154, 50);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		List<Window> list1=wl.selectList(new Window());
		Object[][] window1=new Object[list1.size()][4];
		for(int i=0;i<list1.size();i++){
			window1[i][0] = list1.get(i).getId();
			window1[i][1] = list1.get(i).getNo();
			window1[i][2]=list1.get(i).getB_id();
			window1[i][3] = list1.get(i).getDisabled();
		}
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("禁用", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1041, 95);
		panel_2.add(scrollPane_2);
		
		table_3 = new JTable();
		List<Window> list2=wl.selectList(new Window());
		Object[][] window2=new Object[list2.size()][4];
		for(int i=0;i<list2.size();i++){
			window2[i][0] = list2.get(i).getId();
			window2[i][1] = list2.get(i).getNo();
			window2[i][2]=list2.get(i).getB_id();
			window2[i][3] = list2.get(i).getDisabled();
		}
		table_3.setModel(new DefaultTableModel(
			
				window2,
			new String[] {
				"ID", "\u7A97\u53E3\u53F7", "b_id", "\u662F\u5426\u7981\u7528"
			}
		));
		scrollPane_2.setViewportView(table_3);
		
		JLabel lblNewLabel_6 = new JLabel("按窗口号禁用：");
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(293, 105, 126, 50);
		panel_2.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_4.setBounds(425, 105, 200, 50);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("确定");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no=Integer.valueOf(textField_4.getText());
				WindowDao wd=new WindowDaoImpl();
				Window w=new Window();
				wd.UpdateByNo(no, 2);
				if(wd.UpdateByNo(no, 2)){
					JOptionPane.showMessageDialog(btnNewButton_7, "禁用成功");
				}else{
					JOptionPane.showMessageDialog(btnNewButton_7, "禁用失败");
				}
			}
		});
		btnNewButton_7.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_7.setBounds(391, 180, 93, 50);
		panel_2.add(btnNewButton_7);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("查询", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1041, 93);
		panel.add(scrollPane);
		
		table_1 = new JTable();
		List<Window> list3=wl.selectList(new Window());
		Object[][] window3=new Object[list3.size()][4];
		for(int i=0;i<list3.size();i++){
			window3[i][0] = list3.get(i).getId();
			window3[i][1] = list3.get(i).getNo();
			window3[i][2]=list3.get(i).getB_id();
			window3[i][3] = list3.get(i).getDisabled();
		}
		table_1.setModel(new DefaultTableModel(
			
				window3,
			new String[] {
				"ID", "\u7A97\u53E3\u53F7", "b_id", "\u662F\u5426\u7981\u7528"
			}
		));
		scrollPane.setViewportView(table_1);
		
		JLabel lblid = new JLabel("按id查询");
		lblid.setFont(new Font("宋体", Font.PLAIN, 18));
		lblid.setBounds(253, 114, 98, 50);
		panel.add(lblid);
		
		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 18));
		textField.setBounds(198, 160, 200, 50);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.valueOf(textField.getText());
				WindowDaoImpl wl=new WindowDaoImpl();
				Window list=wl.selectById(id);
				Object[][] window=new Object[1][4];
				window[0][0]=list.getId();
				window[0][1]=list.getNo();
				window[0][2]=list.getB_id();
				window[0][3]=list.getDisabled();
				table_1.setModel(new DefaultTableModel(
						
						window,
					new String[] {
						"ID", "\u7A97\u53E3\u53F7", "\u662F\u5426\u7981\u7528"
					}
				));
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.setBounds(198, 220, 93, 46);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("重置");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_1.setBounds(301, 220, 93, 46);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("按窗口号查询");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(553, 103, 108, 50);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_1.setBounds(500, 160, 200, 50);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("确定");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no=Integer.valueOf(textField_1.getText());
				WindowDaoImpl wl=new WindowDaoImpl();
				Window list=wl.selectByNo(no);
				Object[][] window=new Object[1][4];
				window[0][0]=list.getId();
				window[0][1]=list.getNo();
				window[0][2]=list.getB_id();
				window[0][3]=list.getDisabled();
				table_1.setModel(new DefaultTableModel(
						
						window,
					new String[] {
						"ID", "\u7A97\u53E3\u53F7", "\u662F\u5426\u7981\u7528"
					}
				));
						
						
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_2.setBounds(500, 220, 93, 46);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("重置");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_3.setBounds(607, 220, 93, 46);
		panel.add(btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("修改", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 1041, 93);
		panel_3.add(scrollPane_3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			
				window1,
			new String[] {
				"ID", "\u7A97\u53E3\u53F7", "b_id", "\u662F\u5426\u7981\u7528"
			}
		));
		scrollPane_3.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("窗口号：");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(532, 103, 80, 50);
		panel_3.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_3.setBounds(648, 104, 200, 50);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("是否禁用:1:禁用，2:未禁用");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(409, 170, 216, 50);
		panel_3.add(lblNewLabel_5);
		
		JButton btnNewButton_8 = new JButton("确定");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no=Integer.valueOf(textField_3.getText());
				int disabled=Integer.valueOf(textField_7.getText());
				int b_id=Integer.valueOf(textField_8.getText());
				WindowDao wd=new WindowDaoImpl();
				Window   w=new Window();
				w.setNo(no);
				w.setB_id(b_id);
				w.setDisabled(disabled);
				w.setId(Integer.valueOf(textField_9.getText()));
				wd.update(w);
				if(wd.update(w)){
					JOptionPane.showMessageDialog(btnNewButton_8, "修改成功！");
				}else{
					JOptionPane.showMessageDialog(btnNewButton_8, "修改失败！");
				}
			}
		});
		btnNewButton_8.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_8.setBounds(519, 289, 93, 45);
		panel_3.add(btnNewButton_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(648, 172, 200, 50);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("b_id:");
		lblNewLabel_9.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(532, 230, 74, 49);
		panel_3.add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(648, 232, 200, 47);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("选择ID");
		lblNewLabel_10.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(159, 110, 111, 37);
		panel_3.add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(111, 154, 170, 37);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		textField_3.setEditable(false);//窗口号
		textField_7.setEditable(false);//是否禁用
		textField_8.setEditable(false);//b_id
		JButton btnNewButton_9 = new JButton("确定");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.valueOf(textField_9.getText());
				WindowDao wd=new WindowDaoImpl();
				Window w=wd.selectById(id);
				textField_3.setText(String.valueOf(w.getNo()));
				textField_7.setText(String.valueOf(w.getDisabled()));
				textField_8.setText(String.valueOf(w.getB_id()));
				if(null!=Integer.valueOf(textField_9.getText())){
					textField_3.setEditable(true);//窗口号
					textField_7.setEditable(true);//是否禁用
					textField_8.setEditable(true);//b_id
				}
				textField_9.setEditable(false);
			}
		});
		btnNewButton_9.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_9.setBounds(110, 219, 80, 37);
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("重置");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_9.setText("");
			}
		});
		btnNewButton_10.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_10.setBounds(200, 219, 73, 37);
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("重置");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText("");
				textField_7.setText("");
				textField_8.setText("");
			}
		});
		btnNewButton_11.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_11.setBounds(669, 289, 93, 45);
		panel_3.add(btnNewButton_11);
		
		JButton btnNewButton_4 = new JButton("返回主菜单");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CaiDan_GUI c=new CaiDan_GUI();
				c.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_4.setBounds(44, 567, 144, 55);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("宋体", Font.BOLD, 22));
		lblNewLabel_7.setBounds(615, 908, 431, 55);
		contentPane.add(lblNewLabel_7);
		ClockThread clockThread=new ClockThread(lblNewLabel_7);
		
		JButton btnNewButton_12 = new JButton("刷新");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Window> list3=wl.selectList(new Window());
				Object[][] window3=new Object[list3.size()][4];
				for(int i=0;i<list3.size();i++){
					window3[i][0] = list3.get(i).getId();
					window3[i][1] = list3.get(i).getNo();
					window3[i][2]=list3.get(i).getB_id();
					window3[i][3] = list3.get(i).getDisabled();
				}
				table_1.setModel(new DefaultTableModel(
						
						window3,
					new String[] {
						"ID", "\u7A97\u53E3\u53F7", "b_id", "\u662F\u5426\u7981\u7528"
					}
				));
				scrollPane.setViewportView(table_1);
				table_3.setModel(new DefaultTableModel(
						
						window3,
					new String[] {
						"ID", "\u7A97\u53E3\u53F7", "b_id", "\u662F\u5426\u7981\u7528"
					}
				));
				scrollPane_2.setViewportView(table_3);
				table.setModel(new DefaultTableModel(
						
						window3,
					new String[] {
						"ID", "\u7A97\u53E3\u53F7", "b_id", "\u662F\u5426\u7981\u7528"
					}
				));
				scrollPane_3.setViewportView(table);
				table_2.setModel(new DefaultTableModel(
						
						window3,
						new String[] {
							"ID", "\u7A97\u53E3\u53F7", "b_id", "\u662F\u5426\u7981\u7528"
						}
					));
					scrollPane_1.setViewportView(table_2);
				
				
			}
		});
		btnNewButton_12.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_12.setBounds(255, 567, 155, 55);
		contentPane.add(btnNewButton_12);
		clockThread.setPriority(10);
		clockThread.start();
	}
}
