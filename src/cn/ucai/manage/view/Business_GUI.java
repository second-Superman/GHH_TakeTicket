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

import cn.ucai.entity.Business;
import cn.ucai.manage.view.CaiDan_GUI;
import cn.ucai.server.dao.BusinessDao;
import cn.ucai.server.dao.Impl.BusinessDaoImpl;
import cn.ucai.util.ClockThread;
import cn.ucai.util.Screen;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JEditorPane;
import java.awt.Dialog.ModalExclusionType;

public class Business_GUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_17;
	private JTextField textField_18;
	private JEditorPane editorPane_1;
	private JEditorPane editorPane;
	private JTextField textField_12;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Business_GUI frame = new Business_GUI();
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
	public Business_GUI() {
		Screen screen = new Screen();
		setResizable(false);
		setTitle("业务管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((screen.scareenwidth() - 1053) / 2, (screen.scareenhight() - 679) / 2, 1053, 679);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img\\项目图片\\2eeec15a6af52c6ffd5c6821fd50d319.jpg"));
		lblNewLabel.setBounds(0, 0, 1037, 178);
		contentPane.add(lblNewLabel);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 177, 1037, 397);
		contentPane.add(tabbedPane);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("禁用", null, panel_2, null);
		panel_2.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1032, 130);
		panel_2.add(scrollPane_2);

		table_2 = new JTable();
		BusinessDao bd = new BusinessDaoImpl();
		List<Business> list = bd.selectList(new Business());
		Object[][] business = new Object[list.size()][8];
		for (int i = 0; i < list.size(); i++) {
			business[i][0] = list.get(i).getId();
			business[i][1] = list.get(i).getCode();
			business[i][2] = list.get(i).getName();
			business[i][3] = list.get(i).getDescription();
			business[i][4] = list.get(i).getMaxcount();
			business[i][5] = list.get(i).getStart_time();
			business[i][6] = list.get(i).getEnd_time();
			business[i][7] = list.get(i).getDisabled();
		}

		table_2.setModel(new DefaultTableModel(

				business,
				new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
						"\u6BCF\u65E5\u6700\u5927\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
						"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
		scrollPane_2.setViewportView(table_2);

		JLabel lblNewLabel_8 = new JLabel("按业务代码禁用");
		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(410, 136, 128, 37);
		panel_2.add(lblNewLabel_8);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_5.setBounds(394, 183, 159, 40);
		panel_2.add(textField_5);
		textField_5.setColumns(10);

		JButton btnNewButton_7 = new JButton("确定");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = textField_5.getText().trim();
				BusinessDao bd = new BusinessDaoImpl();
				bd.DisByCode(2, code);
				if (bd.DisByCode(2, code)) {
					JOptionPane.showMessageDialog(btnNewButton_7, "禁用成功！");
				} else {
					JOptionPane.showMessageDialog(btnNewButton_7, "禁用失败！");
				}
			}
		});
		btnNewButton_7.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_7.setBounds(394, 248, 73, 40);
		panel_2.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("重置");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText("");
			}
		});
		btnNewButton_8.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_8.setBounds(477, 248, 76, 40);
		panel_2.add(btnNewButton_8);

		JLabel lblNewLabel_9 = new JLabel("按业务名称禁用");
		lblNewLabel_9.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(688, 136, 128, 37);
		panel_2.add(lblNewLabel_9);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_6.setBounds(670, 183, 159, 40);
		panel_2.add(textField_6);
		textField_6.setColumns(10);

		JButton btnNewButton_9 = new JButton("确定");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_6.getText().trim();
				BusinessDao bd = new BusinessDaoImpl();
				bd.DisByName(2, name);
				if (bd.DisByName(2, name)) {
					JOptionPane.showMessageDialog(btnNewButton_9, "禁用成功");
				} else {
					JOptionPane.showMessageDialog(btnNewButton_9, "禁用失败");
				}
			}
		});
		btnNewButton_9.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_9.setBounds(670, 248, 73, 40);
		panel_2.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("重置");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_6.setText("");
			}
		});
		btnNewButton_10.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_10.setBounds(757, 248, 72, 40);
		panel_2.add(btnNewButton_10);

		JLabel lblNewLabel_16 = new JLabel("按ID禁用");
		lblNewLabel_16.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_16.setBounds(147, 136, 128, 37);
		panel_2.add(lblNewLabel_16);

		textField_11 = new JTextField();
		textField_11.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_11.setBounds(110, 185, 165, 40);
		panel_2.add(textField_11);
		textField_11.setColumns(10);

		JButton btnNewButton_12 = new JButton("确定");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.valueOf(textField_11.getText().trim());
				BusinessDao bd = new BusinessDaoImpl();
				boolean i=bd.DisabledById(2, id);
				if (i) {
					JOptionPane.showMessageDialog(btnNewButton_12, "禁用成功！");
				} else {
					JOptionPane.showMessageDialog(btnNewButton_12, "禁用失败！");
				}
			}
		});
		btnNewButton_12.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_12.setBounds(110, 248, 72, 40);
		panel_2.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("重置");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_11.setText("");
			}
		});
		btnNewButton_13.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_13.setBounds(212, 248, 73, 40);
		panel_2.add(btnNewButton_13);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("修改", null, panel_3, null);
		panel_3.setLayout(null);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 1032, 124);
		panel_3.add(scrollPane_3);

		table_3 = new JTable();
		List<Business> list1 = bd.selectList(new Business());
		Object[][] business1 = new Object[list1.size()][8];
		for (int i = 0; i < list1.size(); i++) {
			business1[i][0] = list1.get(i).getId();
			business1[i][1] = list1.get(i).getCode();
			business1[i][2] = list1.get(i).getName();
			business1[i][3] = list1.get(i).getDescription();
			business1[i][4] = list1.get(i).getMaxcount();
			business1[i][5] = list1.get(i).getStart_time();
			business1[i][6] = list1.get(i).getEnd_time();
			business1[i][7] = list1.get(i).getDisabled();
		}
		table_3.setModel(new DefaultTableModel(

				business1,
				new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
						"\u6BCF\u65E5\u6700\u5927\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
						"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
		scrollPane_3.setViewportView(table_3);

		JLabel lblNewLabel_10 = new JLabel("修改业务：");
		lblNewLabel_10.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(31, 134, 91, 41);
		panel_3.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("ID：");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(10, 218, 59, 33);
		panel_3.add(lblNewLabel_11);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_7.setBounds(69, 216, 76, 33);
		panel_3.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("业务代码：");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(312, 173, 101, 41);
		panel_3.add(lblNewLabel_12);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_8.setBounds(426, 177, 200, 33);
		panel_3.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("业务名称：");
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_13.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(322, 216, 91, 41);
		panel_3.add(lblNewLabel_13);

		textField_9 = new JTextField();
		textField_9.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_9.setBounds(426, 220, 200, 33);
		panel_3.add(textField_9);
		textField_9.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("每天最大办理量：");
		lblNewLabel_14.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_14.setBounds(271, 267, 144, 33);
		panel_3.add(lblNewLabel_14);

		textField_10 = new JTextField();
		textField_10.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_10.setBounds(426, 263, 200, 41);
		panel_3.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("是否禁用：");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_15.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(340, 322, 84, 33);
		panel_3.add(lblNewLabel_15);

		JButton btnNewButton_11 = new JButton("确定");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String code = textField_8.getText().trim();
				String name = textField_9.getText().trim();
				int maxcount = Integer.valueOf(textField_10.getText());
				String descr = textField_15.getText();
				String start_time = textField_13.getText();
				String end_time = textField_14.getText();
				int disabled=Integer.valueOf(textField_12.getText());
				BusinessDao bd=new BusinessDaoImpl();
				Business b=new Business();
				b.setCode(code); 
				b.setName(name);
				b.setDescription(descr);
				b.setMaxcount(maxcount); 
				b.setStart_time(start_time); 
				b.setEnd_time(end_time);
				b.setDisabled(disabled); 
				b.setId(Integer.valueOf(textField_7.getText()));
				bd.update(b);
				if(bd.update(b)){
					JOptionPane.showMessageDialog(btnNewButton_11, "修改成功");
				}else{
					JOptionPane.showMessageDialog(btnNewButton_11, "修改失败");
				}
			}
		});
		btnNewButton_11.setFont(new Font("宋体", Font.BOLD, 16));
		btnNewButton_11.setBounds(623, 317, 91, 41);
		panel_3.add(btnNewButton_11);

		JLabel lblNewLabel_17 = new JLabel("业务说明：");
		lblNewLabel_17.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_17.setBounds(720, 164, 91, 33);
		panel_3.add(lblNewLabel_17);

		JLabel lblNewLabel_18 = new JLabel("开始受理时间：");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_18.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_18.setBounds(672, 216, 137, 28);
		panel_3.add(lblNewLabel_18);
		
		textField_12 = new JTextField();
		textField_12.setBounds(426, 321, 91, 35);
		panel_3.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_13.setBounds(803, 211, 144, 33);
		panel_3.add(textField_13);
		textField_13.setColumns(10);

		textField_15 = new JTextField();
		textField_15.setBounds(803, 164, 144, 30);
		panel_3.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("结束受理时间:");
		lblNewLabel_19.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_19.setBounds(683, 267, 119, 33);
		panel_3.add(lblNewLabel_19);

		textField_14 = new JTextField();
		textField_14.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_14.setBounds(803, 267, 144, 33);
		panel_3.add(textField_14);
		textField_14.setColumns(10);
		
		textField_8.setEditable(false);
		textField_9.setEditable(false);
		textField_10.setEditable(false);
		textField_15.setEditable(false);
		textField_13.setEditable(false);
		textField_14.setEditable(false);
		textField_12.setEditable(false);
		
		JButton btnNewButton_14 = new JButton("确定");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.valueOf(textField_7.getText());
				BusinessDao bd=new BusinessDaoImpl();
				Business b=bd.selectById(id);
				textField_8.setText(b.getCode());
				textField_9.setText(b.getName());
				textField_10.setText(String.valueOf(b.getMaxcount()));
				textField_12.setText(String.valueOf(b.getDisabled()));
				textField_15.setText(b.getDescription());
				textField_13.setText(b.getStart_time());
				textField_14.setText(b.getEnd_time());
				if(null!=Integer.valueOf(textField_7.getText())){
					
					textField_9.setEditable(true);
					textField_10.setEditable(true);
					textField_15.setEditable(true);
					textField_13.setEditable(true);
					textField_14.setEditable(true);
					textField_12.setEditable(true);
					
				}
				textField_7.setEditable(false);
			}
		});
		btnNewButton_14.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_14.setBounds(31, 261, 93, 44);
		panel_3.add(btnNewButton_14);

		

		JButton btnNewButton_16 = new JButton("重置");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_15.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_12.setText("");
			}
		});
		btnNewButton_16.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_16.setBounds(773, 317, 93, 41);
		panel_3.add(btnNewButton_16);
		

		JPanel panel = new JPanel();
		tabbedPane.addTab("查看", null, panel, null);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1032, 129);
		panel.add(scrollPane);

		table = new JTable();
		
		List<Business> list2 = bd.selectList(new Business());
		Object[][] business2 = new Object[list2.size()][8];
		for (int i = 0; i < list2.size(); i++) {
			business2[i][0] = list2.get(i).getId();
			business2[i][1] = list2.get(i).getCode();
			business2[i][2] = list2.get(i).getName();
			business2[i][3] = list2.get(i).getDescription();
			business2[i][4] = list2.get(i).getMaxcount();
			business2[i][5] = list2.get(i).getStart_time();
			business2[i][6] = list2.get(i).getEnd_time();
			business2[i][7] = list2.get(i).getDisabled();
		}
		table.setModel(new DefaultTableModel(

				business2,
				new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
						"\u4E1A\u52A1\u6BCF\u65E5\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
						"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
		scrollPane.setViewportView(table);
		

		JLabel lblNewLabel_1 = new JLabel("按业务代码查询");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(235, 139, 174, 50);
		panel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 20));
		textField.setBounds(189, 199, 202, 50);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = textField.getText();
				BusinessDao bd=new BusinessDaoImpl();
				Business b=bd.selectByCode(code);
				Object[][] busine=new Object[1][8];
				busine[0][0]=b.getId();
				busine[0][1]=b.getCode();
				busine[0][2]=b.getName();
				busine[0][3]=b.getDescription();
				busine[0][4]=b.getMaxcount();
				busine[0][5]=b.getStart_time();
				busine[0][6]=b.getEnd_time();
				busine[0][7]=b.getDisabled();
				table.setModel(new DefaultTableModel(

						busine,
						new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
								"\u4E1A\u52A1\u6BCF\u65E5\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
								"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
			}
		});
		
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.setBounds(189, 266, 90, 50);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("重置");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_1.setBounds(302, 266, 90, 50);
		panel.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("按业务名称查询");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(558, 139, 157, 50);
		panel.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_1.setBounds(538, 199, 202, 50);
		panel.add(textField_1);
		textField_1.setColumns(10);

		JButton btnNewButton_2 = new JButton("确定");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_1.getText();
				BusinessDao bd=new BusinessDaoImpl();
				Business b=bd.selectByName(name);
				Object[][] busine=new Object[1][8];
				busine[0][0]=b.getId();
				busine[0][1]=b.getCode();
				busine[0][2]=b.getName();
				busine[0][3]=b.getDescription();
				busine[0][4]=b.getMaxcount();
				busine[0][5]=b.getStart_time();
				busine[0][6]=b.getEnd_time();
				busine[0][7]=b.getDisabled();
				table.setModel(new DefaultTableModel(

						busine,
						new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
								"\u4E1A\u52A1\u6BCF\u65E5\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
								"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
			}
		});
		btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_2.setBounds(538, 266, 90, 50);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("重置");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_3.setBounds(650, 266, 90, 50);
		panel.add(btnNewButton_3);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("添加", null, panel_1, null);
		panel_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 1032, 130);
		panel_1.add(scrollPane_1);

		table_1 = new JTable();
		List<Business> list3 = bd.selectList(new Business());
		Object[][] business3 = new Object[list3.size()][8];
		for (int i = 0; i < list3.size(); i++) {
			business3[i][0] = list3.get(i).getId();
			business3[i][1] = list3.get(i).getCode();
			business3[i][2] = list3.get(i).getName();
			business3[i][3] = list3.get(i).getDescription();
			business3[i][4] = list3.get(i).getMaxcount();
			business3[i][5] = list3.get(i).getStart_time();
			business3[i][6] = list3.get(i).getEnd_time();
			business3[i][7] = list3.get(i).getDisabled();
		}
		table_1.setModel(new DefaultTableModel(

				business3,
				new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
						"\u6BCF\u65E5\u6700\u5927\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
						"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
		scrollPane_1.setViewportView(table_1);

		JLabel lblNewLabel_3 = new JLabel("添加业务：");
		lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_3.setBounds(144, 140, 100, 38);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("业务代码：");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(258, 140, 90, 38);
		panel_1.add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_2.setBounds(358, 140, 124, 38);
		panel_1.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("业务名称：");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(248, 203, 100, 38);
		panel_1.add(lblNewLabel_5);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_3.setBounds(358, 203, 124, 38);
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("每天最大办理量：");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(201, 256, 147, 38);
		panel_1.add(lblNewLabel_6);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_4.setBounds(358, 259, 124, 37);
		panel_1.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("是否禁用：");
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(277, 304, 89, 37);
		panel_1.add(lblNewLabel_7);

		JButton btnNewButton_5 = new JButton("确定");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String code = textField_2.getText();
				String name = textField_3.getText();
				int maxcount = Integer.valueOf(textField_4.getText());
				int disabled=Integer.valueOf(textField_19.getText());
				String descr=textField_16.getText();
				String start_time = textField_17.getText();
				String end_time = textField_18.getText();
				List<Business> list = bd.selectList(new Business());
				for (int i = 0; i < list.size(); i++)
				if(code.equals(list.get(i).getCode())){
				
					JOptionPane.showMessageDialog(btnNewButton_5, "该业务已存在");
					break;
				}else{
					
				BusinessDao bd=new BusinessDaoImpl();
				Business b=new Business();
				b.setCode(code);
				b.setName(name);
				b.setDescription(descr);
				b.setMaxcount(maxcount);
				b.setStart_time(start_time);
				b.setEnd_time(end_time);
				b.setDisabled(disabled);
				boolean p =bd.insert(b);
				if(p){
					JOptionPane.showMessageDialog(btnNewButton_5, "添加成功");
				}else{
					JOptionPane.showMessageDialog(btnNewButton_5, "添加失败");
				}
			}
			}
		});

		btnNewButton_5.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_5.setBounds(546, 302, 93, 38);
		panel_1.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("重置");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_19.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
			}
		});
		btnNewButton_6.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_6.setBounds(711, 302, 93, 38);
		panel_1.add(btnNewButton_6);

		JLabel lblNewLabel_21 = new JLabel("业务说明：");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_21.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_21.setBounds(546, 140, 100, 38);
		panel_1.add(lblNewLabel_21);

		JLabel lblNewLabel_22 = new JLabel("开始受理时间：");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_22.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_22.setBounds(518, 201, 128, 38);
		panel_1.add(lblNewLabel_22);

		textField_17 = new JTextField();
		textField_17.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_17.setBounds(656, 193, 147, 38);
		panel_1.add(textField_17);
		textField_17.setColumns(10);

		JLabel lblNewLabel_23 = new JLabel("结束受理时间：");
		lblNewLabel_23.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_23.setBounds(518, 253, 140, 32);
		panel_1.add(lblNewLabel_23);

		textField_18 = new JTextField();
		textField_18.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_18.setBounds(656, 253, 147, 41);
		panel_1.add(textField_18);
		textField_18.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(656, 140, 147, 38);
		panel_1.add(textField_16);
		textField_16.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(358, 306, 66, 35);
		panel_1.add(textField_19);
		textField_19.setColumns(10);

		JButton btnNewButton_4 = new JButton("返回主菜单");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CaiDan_GUI c = new CaiDan_GUI();
				c.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_4.setBounds(46, 584, 145, 61);
		contentPane.add(btnNewButton_4);

		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setFont(new Font("宋体", Font.BOLD, 22));
		lblNewLabel_20.setBounds(630, 910, 407, 61);
		contentPane.add(lblNewLabel_20);
		ClockThread clockThread = new ClockThread(lblNewLabel_20);
		
		JButton btnNewButton_15 = new JButton("刷新");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BusinessDao bd = new BusinessDaoImpl();
				List<Business> list = bd.selectList(new Business());
				Object[][] business = new Object[list.size()][8];
				for (int i = 0; i < list.size(); i++) {
					business[i][0] = list.get(i).getId();
					business[i][1] = list.get(i).getCode();
					business[i][2] = list.get(i).getName();
					business[i][3] = list.get(i).getDescription();
					business[i][4] = list.get(i).getMaxcount();
					business[i][5] = list.get(i).getStart_time();
					business[i][6] = list.get(i).getEnd_time();
					business[i][7] = list.get(i).getDisabled();
				}

				table.setModel(new DefaultTableModel(

						business,
						new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
								"\u6BCF\u65E5\u6700\u5927\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
								"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
				scrollPane_2.setViewportView(table);
				table_1.setModel(new DefaultTableModel(

						business,
						new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
								"\u6BCF\u65E5\u6700\u5927\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
								"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
				scrollPane_2.setViewportView(table_1);
				table_2.setModel(new DefaultTableModel(

						business,
						new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
								"\u6BCF\u65E5\u6700\u5927\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
								"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
				scrollPane_2.setViewportView(table_2);
				table_3.setModel(new DefaultTableModel(

						business,
						new String[] { "id", "\u4E1A\u52A1\u4EE3\u7801", "\u4E1A\u52A1\u540D\u79F0", "\u4E1A\u52A1\u8BF4\u660E",
								"\u6BCF\u65E5\u6700\u5927\u529E\u7406\u4E0A\u9650", "\u5F00\u59CB\u53D7\u7406\u65F6\u95F4",
								"\u7ED3\u675F\u53D7\u7406\u65F6\u95F4", "\u662F\u5426\u7981\u7528" }));
				scrollPane_2.setViewportView(table_3);
				
			}
		});
		btnNewButton_15.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_15.setBounds(258, 584, 93, 57);
		contentPane.add(btnNewButton_15);
		clockThread.setPriority(10);
		clockThread.start();
	}
}
