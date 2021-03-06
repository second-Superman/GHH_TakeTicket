package cn.ucai.manage.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cn.ucai.entity.User;
import cn.ucai.server.dao.UserDao;
import cn.ucai.server.dao.Impl.UserDaoImpl;
import cn.ucai.util.ClockThread;
import cn.ucai.util.Screen;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class User_GUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JPasswordField passwordField_1;
	private JTable table_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_3;
	private JTextField textField_7;
	private JPasswordField passwordField_2;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JPasswordField passwordField_6;
	private JTextField textField_17;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JPasswordField passwordField_8;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JPasswordField passwordField;
	private JPasswordField passwordField_3;
	private JPasswordField passwordField_4;
	private JPasswordField passwordField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_GUI frame = new User_GUI();
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
	public User_GUI() {
		Screen s = new Screen();
		setResizable(false);
		setTitle("用户管理");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((s.scareenwidth() - 1051) / 2, (s.scareenhight() - 714) / 2, 1051, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1045, 192);
		lblNewLabel.setIcon(new ImageIcon("img\\项目图片\\2eeec15a6af52c6ffd5c6821fd50d319.jpg"));
		contentPane.add(lblNewLabel);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		tabbedPane.setBounds(0, 192, 1045, 423);
		contentPane.add(tabbedPane);
		int count = 0;
		UserDaoImpl u = new UserDaoImpl();
		List<User> list = u.selectList(new User());
		Object[][] Usersql = new Object[list.size()][7];

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRole() != 3) {
				Usersql[count][0] = list.get(i).getId();
				Usersql[count][1] = list.get(i).getUsername();
				Usersql[count][2] = list.get(i).getPassword();
				Usersql[count][3] = list.get(i).getTruename();
				Usersql[count][4] = list.get(i).getSex();
				Usersql[count][5] = list.get(i).getPhone();
				Usersql[count][6] = list.get(i).getRole();
				count++;
			}
		}

		UserDaoImpl u1 = new UserDaoImpl();
		List<User> list1 = u1.selectList(new User());
		Object[][] Usersql1 = new Object[list1.size()][7];
		int count1 = 0;
		for (int i = 0; i < list1.size(); i++) {
			if (list.get(i).getRole() != 3) {
				Usersql1[count1][0] = list1.get(i).getId();
				Usersql1[count1][1] = list1.get(i).getUsername();
				Usersql1[count1][2] = list1.get(i).getPassword();
				Usersql1[count1][3] = list1.get(i).getTruename();
				Usersql1[count1][4] = list1.get(i).getSex();
				Usersql1[count1][5] = list1.get(i).getPhone();
				Usersql1[count1][6] = list1.get(i).getRole();
				count1++;
			}
		}
		int count2 = 0;
		UserDaoImpl u2 = new UserDaoImpl();
		List<User> list2 = u2.selectList(new User());
		Object[][] Usersql2 = new Object[list2.size()][7];
		for (int i = 0; i < list2.size(); i++) {
			if (list.get(i).getRole() != 3) {
				Usersql2[count2][0] = list2.get(i).getId();
				Usersql2[count2][1] = list2.get(i).getUsername();
				Usersql2[count2][2] = list2.get(i).getPassword();
				Usersql2[count2][3] = list2.get(i).getTruename();
				Usersql2[count2][4] = list2.get(i).getSex();
				Usersql2[count2][5] = list2.get(i).getPhone();
				Usersql2[count2][6] = list2.get(i).getRole();
				count2++;
			}
		}
		int count3 = 0;
		UserDaoImpl u3 = new UserDaoImpl();
		List<User> list3 = u3.selectList(new User());
		Object[][] Usersql3 = new Object[list3.size()][7];
		for (int i = 0; i < list3.size(); i++) {
			if (list.get(i).getRole() != 3) {
				Usersql3[count3][0] = list3.get(i).getId();
				Usersql3[count3][1] = list3.get(i).getUsername();
				Usersql3[count3][2] = list3.get(i).getPassword();
				Usersql3[count3][3] = list3.get(i).getTruename();
				Usersql3[count3][4] = list3.get(i).getSex();
				Usersql3[count3][5] = list3.get(i).getPhone();
				Usersql3[count3][6] = list3.get(i).getRole();
				count3++;
			}
		}

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("柜员", null, panel_1, null);
		panel_1.setLayout(null);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane_2.setBounds(0, 0, 1040, 399);
		panel_1.add(tabbedPane_2);

		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("删除", null, panel_6, null);
		panel_6.setLayout(null);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 995, 116);
		panel_6.add(scrollPane_4);

		table_4 = new JTable();
		int count4 = 0;
		UserDaoImpl u4 = new UserDaoImpl();
		List<User> list4 = u4.selectList(new User());
		Object[][] Usersql4 = new Object[list4.size()][7];
		for (int i = 0; i < list4.size(); i++) {
			if (list.get(i).getRole() == 3) {
				Usersql4[count4][0] = list4.get(i).getId();
				Usersql4[count4][1] = list4.get(i).getUsername();
				Usersql4[count4][2] = list4.get(i).getPassword();
				Usersql4[count4][3] = list4.get(i).getTruename();
				Usersql4[count4][4] = list4.get(i).getSex();
				Usersql4[count4][5] = list4.get(i).getPhone();
				Usersql4[count4][6] = list4.get(i).getRole();
				count4++;
			}
		}
		table_4.setModel(new DefaultTableModel(

				Usersql4, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D", "\u6027\u522B",
						"\u7535\u8BDD", "\u89D2\u8272" }));
		scrollPane_4.setViewportView(table_4);

		JLabel label_3 = new JLabel("按帐号删除");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("宋体", Font.PLAIN, 18));
		label_3.setBounds(399, 126, 129, 45);
		panel_6.add(label_3);

		textField_14 = new JTextField();
		textField_14.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_14.setColumns(10);
		textField_14.setBounds(351, 181, 220, 45);
		panel_6.add(textField_14);

		JButton button_5 = new JButton("确定");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField_14.getText();
				UserDaoImpl ul = new UserDaoImpl();
				if (ul.selectByUsername(s) != null) {
					ul.deleteByUsername(s);
					JOptionPane.showMessageDialog(button_5, "删除成功");
				} else {
					JOptionPane.showMessageDialog(button_5, "查无此人");
				}
			}
		});
		button_5.setFont(new Font("宋体", Font.BOLD, 18));
		button_5.setBounds(351, 254, 90, 45);
		panel_6.add(button_5);

		JButton button_6 = new JButton("重置");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_14.setText("");
			}
		});
		button_6.setFont(new Font("宋体", Font.BOLD, 18));
		button_6.setBounds(481, 254, 90, 45);
		panel_6.add(button_6);

		JButton button_7 = new JButton("确定");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String truename = textField_15.getText();
				UserDaoImpl ul = new UserDaoImpl();
				if (ul.selectByTruename(truename) != null) {
					ul.deleteByTruename(truename);
					JOptionPane.showMessageDialog(button_7, "删除成功");
				} else {
					JOptionPane.showMessageDialog(button_7, "查无此人");
				}
			}
		});
		button_7.setFont(new Font("宋体", Font.BOLD, 18));
		button_7.setBounds(647, 254, 90, 45);
		panel_6.add(button_7);

		JButton button_8 = new JButton("重置");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_15.setText("");
			}
		});
		button_8.setFont(new Font("宋体", Font.BOLD, 18));
		button_8.setBounds(777, 254, 90, 45);
		panel_6.add(button_8);

		textField_15 = new JTextField();
		textField_15.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_15.setColumns(10);
		textField_15.setBounds(647, 181, 220, 45);
		panel_6.add(textField_15);

		JLabel label_4 = new JLabel("按姓名删除");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("宋体", Font.PLAIN, 18));
		label_4.setBounds(692, 126, 129, 45);
		panel_6.add(label_4);

		JLabel lblNewLabel_19 = new JLabel("按ID删除");
		lblNewLabel_19.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setBounds(119, 128, 116, 45);
		panel_6.add(lblNewLabel_19);

		textField_31 = new JTextField();
		textField_31.setBounds(63, 181, 220, 45);
		panel_6.add(textField_31);
		textField_31.setColumns(10);

		JButton btnNewButton_10 = new JButton("确定");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.valueOf(textField_31.getText());
				UserDaoImpl u = new UserDaoImpl();
				u.deleteById(id);
				JOptionPane.showMessageDialog(btnNewButton_10, "删除成功");
			}
		});
		btnNewButton_10.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_10.setBounds(63, 254, 93, 45);
		panel_6.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("重置");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_31.setText("");
			}
		});
		btnNewButton_11.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_11.setBounds(190, 254, 93, 45);
		panel_6.add(btnNewButton_11);

		JButton btnNewButton_23 = new JButton("刷新");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count4 = 0;
				UserDaoImpl u4 = new UserDaoImpl();
				List<User> list4 = u4.selectList(new User());
				Object[][] Usersql4 = new Object[list4.size()][7];
				for (int i = 0; i < list4.size(); i++) {
					if (list.get(i).getRole() == 3) {
						Usersql4[count4][0] = list4.get(i).getId();
						Usersql4[count4][1] = list4.get(i).getUsername();
						Usersql4[count4][2] = list4.get(i).getPassword();
						Usersql4[count4][3] = list4.get(i).getTruename();
						Usersql4[count4][4] = list4.get(i).getSex();
						Usersql4[count4][5] = list4.get(i).getPhone();
						Usersql4[count4][6] = list4.get(i).getRole();
						count4++;
					}
				}
				table_4.setModel(new DefaultTableModel(

						Usersql4, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D",
								"\u6027\u522B", "\u7535\u8BDD", "\u89D2\u8272" }));
				scrollPane_4.setViewportView(table_4);
			}
		});
		btnNewButton_23.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_23.setBounds(417, 335, 93, 45);
		panel_6.add(btnNewButton_23);

		JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("修改", null, panel_7, null);
		panel_7.setLayout(null);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(0, 0, 995, 111);
		panel_7.add(scrollPane_5);

		table_5 = new JTable();
		int count5 = 0;
		UserDaoImpl u5 = new UserDaoImpl();
		List<User> list5 = u5.selectList(new User());
		Object[][] Usersql5 = new Object[list5.size()][7];
		for (int i = 0; i < list5.size(); i++) {
			if (list5.get(i).getRole() == 3) {
				Usersql5[count5][0] = list5.get(i).getId();
				Usersql5[count5][1] = list5.get(i).getUsername();
				Usersql5[count5][2] = list5.get(i).getPassword();
				Usersql5[count5][3] = list5.get(i).getTruename();
				Usersql5[count5][4] = list5.get(i).getSex();
				Usersql5[count5][5] = list5.get(i).getPhone();
				Usersql5[count5][6] = list5.get(i).getRole();
				count5++;
			}
		}
		table_5.setModel(new DefaultTableModel(Usersql5, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801",
				"\u59D3\u540D", "\u6027\u522B", "\u7535\u8BDD\u53F7\u7801", "\u89D2\u8272" }));
		scrollPane_5.setViewportView(table_5);

		JLabel label_5 = new JLabel("修改信息");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("宋体", Font.PLAIN, 18));
		label_5.setBounds(99, 121, 157, 39);
		panel_7.add(label_5);

		JLabel label_6 = new JLabel("选择ID");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setFont(new Font("宋体", Font.PLAIN, 18));
		label_6.setBounds(87, 183, 88, 35);
		panel_7.add(label_6);

		textField_16 = new JTextField();
		textField_16.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_16.setColumns(10);
		textField_16.setBounds(62, 228, 168, 39);
		panel_7.add(textField_16);

		JLabel label_7 = new JLabel("密码：");
		label_7.setFont(new Font("宋体", Font.PLAIN, 18));
		label_7.setBounds(318, 183, 67, 35);
		panel_7.add(label_7);

		JLabel label_8 = new JLabel("姓名：");
		label_8.setFont(new Font("宋体", Font.PLAIN, 18));
		label_8.setBounds(318, 285, 67, 39);
		panel_7.add(label_8);

		passwordField_6 = new JPasswordField();
		passwordField_6.setFont(new Font("宋体", Font.PLAIN, 18));
		passwordField_6.setBounds(395, 179, 145, 39);
		panel_7.add(passwordField_6);

		textField_17 = new JTextField();
		textField_17.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_17.setColumns(10);
		textField_17.setBounds(395, 121, 145, 39);
		panel_7.add(textField_17);

		JLabel label_9 = new JLabel("账户名：");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("宋体", Font.PLAIN, 18));
		label_9.setBounds(292, 121, 93, 39);
		panel_7.add(label_9);

		JLabel label_10 = new JLabel("电话号码：");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("宋体", Font.PLAIN, 18));
		label_10.setBounds(660, 121, 99, 39);
		panel_7.add(label_10);

		JLabel label_12 = new JLabel("性别：");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("宋体", Font.PLAIN, 18));
		label_12.setBounds(670, 200, 93, 39);
		panel_7.add(label_12);

		textField_19 = new JTextField();
		textField_19.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_19.setColumns(10);
		textField_19.setBounds(758, 123, 138, 39);
		panel_7.add(textField_19);

		JButton button_9 = new JButton("重置");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField_17.setText("");
				passwordField_6.setText("");
				textField_27.setText("");
				textField_19.setText("");
				passwordField_5.setText("");
				textField_28.setText("");
			}
		});
		button_9.setFont(new Font("宋体", Font.BOLD, 18));
		button_9.setBounds(715, 306, 93, 55);
		panel_7.add(button_9);

		JButton button_10 = new JButton("确认");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String username = textField_17.getText();
				String password = String.valueOf(passwordField_6.getPassword());
				String truename = textField_27.getText();
				String phone = textField_19.getText();
				int sex = Integer.valueOf(textField_28.getText());
				if(!password.equals(String.valueOf(passwordField_5.getPassword()))){
					JOptionPane.showMessageDialog(button_10, "密码填写有误");
				}else{
				UserDaoImpl ul = new UserDaoImpl();
				User u = new User();
				u.setUsername(username);
				u.setPassword(password);
				u.setTruename(truename);
				u.setPhone(phone);
				u.setRole(3);
				u.setSex(sex);
				u.setId(Integer.valueOf(textField_16.getText()));
				ul.update(u);
				if (ul.update(u)) {
					JOptionPane.showMessageDialog(button_10, "修改成功");
				} else {
					JOptionPane.showMessageDialog(button_10, "修改失败");
				}
			}
			}
		});
		button_10.setFont(new Font("宋体", Font.BOLD, 18));
		button_10.setBounds(584, 306, 93, 55);
		panel_7.add(button_10);
		
		passwordField_5 = new JPasswordField();
		passwordField_5.setBounds(395, 230, 145, 39);
		
		panel_7.add(passwordField_5);
		textField_27 = new JTextField();
		textField_27.setBounds(395, 287, 145, 39);
		panel_7.add(textField_27);
		textField_27.setColumns(10);

		textField_28 = new JTextField();
		textField_28.setBounds(758, 200, 138, 39);
		panel_7.add(textField_28);
		
		
		textField_28.setColumns(10);
		textField_17.setEditable(false);
		passwordField_6.setEditable(false);
		textField_27.setEditable(false);
		textField_19.setEditable(false);
		textField_28.setEditable(false);
		passwordField_5.setEditable(false);
		JButton btnNewButton_18 = new JButton("确定");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.valueOf(textField_16.getText());
				UserDao ud=new UserDaoImpl();
				User u=ud.selectById(id);
				textField_17.setText(u.getUsername());
				passwordField_6.setText(u.getPassword());
				passwordField_5.setText(u.getPassword());
				textField_27.setText(u.getTruename());
				textField_19.setText(u.getPhone());
				textField_28.setText(String.valueOf(u.getSex()));
				if(null!=Integer.valueOf(textField_16.getText())){
					textField_17.setEditable(true);
					passwordField_6.setEditable(true);
					textField_27.setEditable(true);
					textField_19.setEditable(true);
					textField_28.setEditable(true);
					passwordField_5.setEditable(true);
				}
				textField_16.setEditable(false);
			}
		});
		btnNewButton_18.setFont(new Font("宋体", Font.BOLD, 16));
		btnNewButton_18.setBounds(62, 285, 83, 39);
		panel_7.add(btnNewButton_18);

		JButton btnNewButton_19 = new JButton("重置");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_16.setText("");
			}
		});
		btnNewButton_19.setFont(new Font("宋体", Font.BOLD, 16));
		btnNewButton_19.setBounds(156, 285, 74, 39);
		panel_7.add(btnNewButton_19);

		JButton btnNewButton_24 = new JButton("刷新");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count5 = 0;
				UserDaoImpl u5 = new UserDaoImpl();
				List<User> list5 = u5.selectList(new User());
				Object[][] Usersql5 = new Object[list5.size()][7];
				for (int i = 0; i < list5.size(); i++) {
					if (list5.get(i).getRole() == 3) {
						Usersql5[count5][0] = list5.get(i).getId();
						Usersql5[count5][1] = list5.get(i).getUsername();
						Usersql5[count5][2] = list5.get(i).getPassword();
						Usersql5[count5][3] = list5.get(i).getTruename();
						Usersql5[count5][4] = list5.get(i).getSex();
						Usersql5[count5][5] = list5.get(i).getPhone();
						Usersql5[count5][6] = list5.get(i).getRole();
						count5++;
					}
				}
				table_5.setModel(new DefaultTableModel(Usersql5, new String[] { "id", "\u8D26\u6237\u540D",
						"\u5BC6\u7801", "\u59D3\u540D", "\u6027\u522B", "\u7535\u8BDD\u53F7\u7801", "\u89D2\u8272" }));
				scrollPane_5.setViewportView(table_5);
			}
		});
		btnNewButton_24.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_24.setBounds(836, 306, 93, 55);
		panel_7.add(btnNewButton_24);
		
		JLabel lblNewLabel_25 = new JLabel("确认密码：");
		lblNewLabel_25.setFont(new Font("宋体", Font.PLAIN, 16));
		lblNewLabel_25.setBounds(292, 229, 83, 39);
		panel_7.add(lblNewLabel_25);
		
		

		JPanel panel_8 = new JPanel();
		tabbedPane_2.addTab("查询", null, panel_8, null);
		panel_8.setLayout(null);

		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(0, 0, 995, 110);
		panel_8.add(scrollPane_6);

		table_6 = new JTable();
		int count6 = 0;
		UserDaoImpl u6 = new UserDaoImpl();
		List<User> list6 = u6.selectList(new User());
		Object[][] Usersql6 = new Object[list6.size()][7];
		for (int i = 0; i < list6.size(); i++) {
			if (list6.get(i).getRole() == 3) {
				Usersql6[count6][0] = list6.get(i).getId();
				Usersql6[count6][1] = list6.get(i).getUsername();
				Usersql6[count6][2] = list6.get(i).getPassword();
				Usersql6[count6][3] = list6.get(i).getTruename();
				Usersql6[count6][4] = list6.get(i).getSex();
				Usersql6[count6][5] = list6.get(i).getPhone();
				Usersql6[count6][6] = list6.get(i).getRole();
				count6++;
			}
		}
		table_6.setModel(new DefaultTableModel(Usersql6, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801",
				"\u59D3\u540D", "\u6027\u522B", "\u7535\u8BDD\u53F7\u7801", "\u89D2\u8272" }));
		scrollPane_6.setViewportView(table_6);

		JLabel label_13 = new JLabel("按姓名查询");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("宋体", Font.PLAIN, 18));
		label_13.setBounds(389, 121, 166, 44);
		panel_8.add(label_13);

		textField_20 = new JTextField();
		textField_20.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_20.setColumns(10);
		textField_20.setBounds(399, 175, 166, 44);
		panel_8.add(textField_20);

		JButton button_11 = new JButton("确定");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String truename = textField_20.getText();
				UserDaoImpl ul = new UserDaoImpl();
				User list = ul.selectByTruename(truename);

				Object[][] user = new Object[1][7];
				user[0][0] = list.getId();
				user[0][1] = list.getUsername();
				user[0][2] = list.getPassword();
				user[0][3] = list.getTruename();
				user[0][4] = list.getSex();
				user[0][5] = list.getPhone();
				user[0][6] = list.getRole();
				table_6.setModel(new DefaultTableModel(

						user, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D", "\u6027\u522B",
								"\u7535\u8BDD\u53F7\u7801", "\u89D2\u8272" }));
			}
		});
		button_11.setFont(new Font("宋体", Font.BOLD, 18));
		button_11.setBounds(409, 238, 73, 38);
		panel_8.add(button_11);

		JButton button_12 = new JButton("重置");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_20.setText("");
			}
		});
		button_12.setFont(new Font("宋体", Font.BOLD, 18));
		button_12.setBounds(492, 238, 73, 38);
		panel_8.add(button_12);

		JButton button_13 = new JButton("确定");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField_21.getText();
				UserDaoImpl ul = new UserDaoImpl();
				User list = ul.selectByUsername(username);

				Object[][] user = new Object[1][7];
				user[0][0] = list.getId();
				user[0][1] = list.getUsername();
				user[0][2] = list.getPassword();
				user[0][3] = list.getTruename();
				user[0][4] = list.getSex();
				user[0][5] = list.getPhone();
				user[0][6] = list.getRole();
				table_6.setModel(new DefaultTableModel(

						user, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D", "\u6027\u522B",
								"\u7535\u8BDD\u53F7\u7801", "\u89D2\u8272" }));

			}
		});
		button_13.setFont(new Font("宋体", Font.BOLD, 18));
		button_13.setBounds(651, 238, 73, 38);
		panel_8.add(button_13);

		JButton button_14 = new JButton("重置");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_21.setText("");
			}
		});
		button_14.setFont(new Font("宋体", Font.BOLD, 18));
		button_14.setBounds(744, 238, 73, 38);
		panel_8.add(button_14);

		textField_21 = new JTextField();
		textField_21.setFont(new Font("宋体", Font.PLAIN, 20));
		textField_21.setColumns(10);
		textField_21.setBounds(651, 175, 166, 44);
		panel_8.add(textField_21);

		JLabel label_14 = new JLabel("按帐号查询");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("宋体", Font.PLAIN, 18));
		label_14.setBounds(651, 120, 166, 47);
		panel_8.add(label_14);

		JLabel lblNewLabel_20 = new JLabel("按ID查询");
		lblNewLabel_20.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_20.setBounds(194, 121, 132, 44);
		panel_8.add(lblNewLabel_20);

		textField_32 = new JTextField();
		textField_32.setBounds(138, 175, 188, 44);
		panel_8.add(textField_32);
		textField_32.setColumns(10);

		JButton btnNewButton_12 = new JButton("确定");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.valueOf(textField_32.getText());

				UserDaoImpl ul = new UserDaoImpl();
				User list = ul.selectById(id);

				Object[][] user = new Object[1][7];
				user[0][0] = list.getId();
				user[0][1] = list.getUsername();
				user[0][2] = list.getPassword();
				user[0][3] = list.getTruename();
				user[0][4] = list.getSex();
				user[0][5] = list.getPhone();
				user[0][6] = list.getRole();
				table_6.setModel(new DefaultTableModel(

						user, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D", "\u6027\u522B",
								"\u7535\u8BDD\u53F7\u7801", "\u89D2\u8272" }));

			}
		});
		btnNewButton_12.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_12.setBounds(139, 238, 73, 38);
		panel_8.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("重置");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_32.setText("");
			}
		});
		btnNewButton_13.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_13.setBounds(253, 238, 73, 38);
		panel_8.add(btnNewButton_13);

		JPanel panel_9 = new JPanel();
		tabbedPane_2.addTab("添加", null, panel_9, null);
		panel_9.setLayout(null);

		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(0, 0, 995, 109);
		panel_9.add(scrollPane_7);

		table_7 = new JTable();
		int count7 = 0;
		UserDaoImpl u7 = new UserDaoImpl();
		List<User> list7 = u7.selectList(new User());
		Object[][] Usersql7 = new Object[list7.size()][7];
		for (int i = 0; i < list7.size(); i++) {
			if (list7.get(i).getRole() == 3) {
				Usersql7[count7][0] = list7.get(i).getId();
				Usersql7[count7][1] = list7.get(i).getUsername();
				Usersql7[count7][2] = list7.get(i).getPassword();
				Usersql7[count7][3] = list7.get(i).getTruename();
				Usersql7[count7][4] = list7.get(i).getSex();
				Usersql7[count7][5] = list7.get(i).getPhone();
				Usersql7[count7][6] = list7.get(i).getRole();
				count7++;
			}
		}
		table_7.setModel(new DefaultTableModel(

				Usersql7, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D", "\u6027\u522B",
						"\u7535\u8BDD\u53F7\u7801", "\u89D2\u8272" }));
		scrollPane_7.setViewportView(table_7);

		JLabel label_15 = new JLabel("添加信息");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("宋体", Font.PLAIN, 18));
		label_15.setBounds(71, 119, 93, 50);
		panel_9.add(label_15);

		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.LEFT);
		textField_22.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_22.setColumns(10);
		textField_22.setBounds(159, 179, 100, 45);
		panel_9.add(textField_22);

		JLabel label_16 = new JLabel("账户名");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("宋体", Font.PLAIN, 18));
		label_16.setBounds(189, 119, 83, 50);
		panel_9.add(label_16);

		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.LEFT);
		textField_23.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_23.setColumns(10);
		textField_23.setBounds(572, 179, 93, 45);
		panel_9.add(textField_23);

		JLabel label_17 = new JLabel("密码");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("宋体", Font.PLAIN, 18));
		label_17.setBounds(319, 123, 83, 50);
		panel_9.add(label_17);

		JLabel label_18 = new JLabel("姓名");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("宋体", Font.PLAIN, 18));
		label_18.setBounds(423, 123, 83, 50);
		panel_9.add(label_18);

		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.LEFT);
		textField_24.setFont(new Font("宋体", Font.PLAIN, 18));
		textField_24.setColumns(10);
		textField_24.setBounds(423, 179, 100, 45);
		panel_9.add(textField_24);

		JLabel label_19 = new JLabel("性别");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("宋体", Font.PLAIN, 18));
		label_19.setBounds(572, 123, 83, 50);
		panel_9.add(label_19);

		passwordField_8 = new JPasswordField();
		passwordField_8.setFont(new Font("宋体", Font.PLAIN, 18));
		passwordField_8.setBounds(301, 179, 113, 45);
		panel_9.add(passwordField_8);

		JLabel label_20 = new JLabel("电话号码");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("宋体", Font.PLAIN, 18));
		label_20.setBounds(747, 123, 83, 50);
		panel_9.add(label_20);

		JButton button_15 = new JButton("重置");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_22.setText("");
				passwordField_8.setText("");
				textField_24.setText("");
				textField_23.setText("");
				textField_29.setText("");

			}
		});
		button_15.setFont(new Font("宋体", Font.BOLD, 20));
		button_15.setBounds(627, 263, 93, 69);
		panel_9.add(button_15);

		JButton button_16 = new JButton("确定");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qpasswor = String.valueOf(passwordField.getPassword());
				String username = textField_22.getText();
				String password = String.valueOf(passwordField_8.getPassword());
				String truename = textField_24.getText();
				int sex = Integer.valueOf(textField_23.getText());
				String phone = textField_29.getText();
				if(null==Qpasswor){
					JOptionPane.showMessageDialog(button_16, "请确认密码");
				}
				else if (Qpasswor.equals(password)) {
					UserDaoImpl ul = new UserDaoImpl();
					User user = new User();
					user.setUsername(username);
					user.setPassword(password);
					user.setTruename(truename);
					user.setSex(sex);
					user.setPhone(phone);
					user.setRole(3);
					ul.insert(user);
					JOptionPane.showMessageDialog(null, "添加数据成功");
				} else {
					JOptionPane.showMessageDialog(button_16, "密码填写有误");
				}

			}
		});
		button_16.setFont(new Font("宋体", Font.BOLD, 20));
		button_16.setBounds(482, 263, 93, 69);
		panel_9.add(button_16);

		textField_29 = new JTextField();
		textField_29.setBounds(730, 179, 100, 45);
		panel_9.add(textField_29);
		textField_29.setColumns(10);

		JButton btnNewButton_25 = new JButton("刷新");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int count7 = 0;
				UserDaoImpl u7 = new UserDaoImpl();
				List<User> list7 = u7.selectList(new User());
				Object[][] Usersql7 = new Object[list7.size()][7];
				for (int i = 0; i < list7.size(); i++) {
					if (list7.get(i).getRole() == 3) {
						Usersql7[count7][0] = list7.get(i).getId();
						Usersql7[count7][1] = list7.get(i).getUsername();
						Usersql7[count7][2] = list7.get(i).getPassword();
						Usersql7[count7][3] = list7.get(i).getTruename();
						Usersql7[count7][4] = list7.get(i).getSex();
						Usersql7[count7][5] = list7.get(i).getPhone();
						Usersql7[count7][6] = list7.get(i).getRole();
						count7++;
					}
				}
				table_7.setModel(new DefaultTableModel(

						Usersql7, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D",
								"\u6027\u522B", "\u7535\u8BDD\u53F7\u7801", "\u89D2\u8272" }));
				scrollPane_7.setViewportView(table_7);
			}
		});
		btnNewButton_25.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton_25.setBounds(768, 263, 93, 69);
		panel_9.add(btnNewButton_25);

		JLabel lblNewLabel_22 = new JLabel("确认密码");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_22.setBounds(301, 244, 113, 29);
		panel_9.add(lblNewLabel_22);

		passwordField = new JPasswordField();
		passwordField.setBounds(301, 283, 127, 39);
		panel_9.add(passwordField);
		
				JPanel panel = new JPanel();
				panel.setToolTipText("");
				tabbedPane.addTab("管理员账户管理", null, panel, null);
				panel.setLayout(null);
				
						JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.LEFT);
						tabbedPane_1.setBounds(0, 0, 1040, 709);
						panel.add(tabbedPane_1);
						
								JPanel panel_5 = new JPanel();
								tabbedPane_1.addTab("修改", null, panel_5, null);
								panel_5.setLayout(null);
								
										JScrollPane scrollPane_3 = new JScrollPane();
										scrollPane_3.setBounds(0, 0, 1005, 115);
										panel_5.add(scrollPane_3);
										
												table_3 = new JTable();
												
														table_3.setModel(new DefaultTableModel(
												
																Usersql1, new String[] { "G_id", "G_\u8D26\u6237\u540D", "G_\u5BC6\u7801", "G_\u59D3\u540D",
																		"G_\u6027\u522B", "G_\u7535\u8BDD\u53F7\u7801", "G_\u89D2\u8272" }));
														scrollPane_3.setViewportView(table_3);
														
																JLabel lblNewLabel_9 = new JLabel("修改信息");
																lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
																lblNewLabel_9.setFont(new Font("宋体", Font.PLAIN, 18));
																lblNewLabel_9.setBounds(72, 125, 157, 39);
																panel_5.add(lblNewLabel_9);
																
																		JLabel lblNewLabel_10 = new JLabel("账户名：");
																		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
																		lblNewLabel_10.setFont(new Font("宋体", Font.PLAIN, 18));
																		lblNewLabel_10.setBounds(265, 125, 93, 39);
																		panel_5.add(lblNewLabel_10);
																		
																				textField_7 = new JTextField();
																				textField_7.setFont(new Font("宋体", Font.PLAIN, 18));
																				textField_7.setBounds(368, 125, 145, 39);
																				panel_5.add(textField_7);
																				textField_7.setColumns(10);
																				
																						JLabel lblNewLabel_11 = new JLabel("密码：");
																						lblNewLabel_11.setFont(new Font("宋体", Font.PLAIN, 18));
																						lblNewLabel_11.setBounds(291, 187, 67, 35);
																						panel_5.add(lblNewLabel_11);
																						
																								passwordField_2 = new JPasswordField();
																								passwordField_2.setFont(new Font("宋体", Font.PLAIN, 18));
																								passwordField_2.setBounds(368, 183, 145, 39);
																								panel_5.add(passwordField_2);
																								
																										JLabel lblNewLabel_12 = new JLabel("姓名：");
																										lblNewLabel_12.setFont(new Font("宋体", Font.PLAIN, 18));
																										lblNewLabel_12.setBounds(291, 290, 67, 39);
																										panel_5.add(lblNewLabel_12);
																										
																												JLabel lblNewLabel_13 = new JLabel("性别：");
																												lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
																												lblNewLabel_13.setFont(new Font("宋体", Font.PLAIN, 18));
																												lblNewLabel_13.setBounds(643, 265, 93, 39);
																												panel_5.add(lblNewLabel_13);
																												
																														JButton btnNewButton_6 = new JButton("确认");
																														btnNewButton_6.addActionListener(new ActionListener() {
																															public void actionPerformed(ActionEvent e) {

																																String a = textField_7.getText();
																																String password = String.valueOf(passwordField_2.getPassword());
																																String b = textField_8.getText();
																																String phone = textField_10.getText();
																																int role = Integer.valueOf(textField_11.getText());
																																int sex = Integer.valueOf(textField_9.getText());
																																if (!password.equals(String.valueOf(passwordField_4.getPassword()))) {
																																	JOptionPane.showMessageDialog(btnNewButton_6, "密码填写有误");
																																} else {
																																	UserDaoImpl ul = new UserDaoImpl();
																																	User u = new User();
																																	u.setUsername(a);
																																	u.setPassword(password);
																																	u.setTruename(b);
																																	u.setPhone(phone);
																																	u.setRole(role);
																																	u.setSex(sex);
																																	u.setId(Integer.valueOf(textField_12.getText()));
																																	ul.update(u);

																																	if (ul.update(u)) {
																																		JOptionPane.showMessageDialog(btnNewButton_6, "修改成功");
																																	} else {
																																		JOptionPane.showMessageDialog(btnNewButton_6, "修改失败");
																																	}
																																}
																															}
																														});
																														btnNewButton_6.setFont(new Font("宋体", Font.BOLD, 18));
																														btnNewButton_6.setBounds(554, 327, 93, 55);
																														panel_5.add(btnNewButton_6);
																														
																																JButton btnNewButton_7 = new JButton("重置");
																																btnNewButton_7.addActionListener(new ActionListener() {
																																	public void actionPerformed(ActionEvent e) {

																																		textField_7.setText("");
																																		passwordField_2.setText("");
																																		textField_8.setText("");
																																		textField_10.setText("");
																																		textField_11.setText("");
																																		textField_9.setText("");
																																		passwordField_4.setText("");
																																	}
																																});
																																btnNewButton_7.setFont(new Font("宋体", Font.BOLD, 18));
																																btnNewButton_7.setBounds(681, 327, 93, 55);
																																panel_5.add(btnNewButton_7);
																																
																																		JLabel label_2 = new JLabel("电话号码：");
																																		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
																																		label_2.setFont(new Font("宋体", Font.PLAIN, 18));
																																		label_2.setBounds(633, 125, 99, 39);
																																		panel_5.add(label_2);
																																		
																																				textField_10 = new JTextField();
																																				textField_10.setFont(new Font("宋体", Font.PLAIN, 18));
																																				textField_10.setBounds(731, 127, 138, 39);
																																				panel_5.add(textField_10);
																																				textField_10.setColumns(10);
																																				
																																						JLabel lblNewLabel_16 = new JLabel("角色：");
																																						lblNewLabel_16.setHorizontalAlignment(SwingConstants.RIGHT);
																																						lblNewLabel_16.setFont(new Font("宋体", Font.PLAIN, 18));
																																						lblNewLabel_16.setBounds(633, 207, 88, 35);
																																						panel_5.add(lblNewLabel_16);
																																						
																																								textField_11 = new JTextField();
																																								textField_11.setFont(new Font("宋体", Font.PLAIN, 18));
																																								textField_11.setBounds(731, 207, 138, 35);
																																								panel_5.add(textField_11);
																																								textField_11.setColumns(10);
																																								
																																										JLabel lblNewLabel_17 = new JLabel("选择ID");
																																										lblNewLabel_17.setHorizontalAlignment(SwingConstants.RIGHT);
																																										lblNewLabel_17.setFont(new Font("宋体", Font.PLAIN, 18));
																																										lblNewLabel_17.setBounds(92, 187, 88, 35);
																																										panel_5.add(lblNewLabel_17);
																																										
																																												passwordField_4 = new JPasswordField();
																																												passwordField_4.setBounds(368, 232, 145, 39);
																																												panel_5.add(passwordField_4);
																																												
																																														textField_12 = new JTextField();
																																														textField_12.setFont(new Font("宋体", Font.PLAIN, 18));
																																														textField_12.setBounds(72, 232, 157, 39);
																																														panel_5.add(textField_12);
																																														textField_12.setColumns(10);
																																														
																																																textField_8 = new JTextField();
																																																textField_8.setBounds(368, 290, 145, 39);
																																																panel_5.add(textField_8);
																																																textField_8.setColumns(10);
																																																
																																																		textField_9 = new JTextField();
																																																		textField_9.setBounds(731, 265, 138, 39);
																																																		panel_5.add(textField_9);
																																																		textField_9.setColumns(10);
																																																		textField_7.setEditable(false);
																																																		passwordField_2.setEditable(false);
																																																		textField_8.setEditable(false);
																																																		textField_10.setEditable(false);
																																																		textField_11.setEditable(false);
																																																		textField_9.setEditable(false);
																																																		passwordField_4.setEditable(false);
																																																		JButton btnNewButton_16 = new JButton("确定");
																																																		btnNewButton_16.addActionListener(new ActionListener() {
																																																			public void actionPerformed(ActionEvent e) {
																																																				int ID = Integer.valueOf(textField_12.getText());
																																																				UserDao ud = new UserDaoImpl();
																																																				User u = ud.selectById(ID);
																																																				textField_7.setText(u.getUsername());
																																																				textField_8.setText(u.getTruename());
																																																				textField_10.setText(u.getPhone());
																																																				textField_11.setText(String.valueOf(u.getRole()));
																																																				textField_9.setText(String.valueOf(u.getSex()));
																																																				passwordField_2.setText(u.getPassword());
																																																				passwordField_4.setText(u.getPassword());
																																																				if (null != Integer.valueOf(textField_12.getText())) {
																																																					textField_7.setEditable(true);
																																																					passwordField_2.setEditable(true);
																																																					textField_8.setEditable(true);
																																																					textField_10.setEditable(true);
																																																					textField_11.setEditable(true);
																																																					textField_9.setEditable(true);
																																																					passwordField_4.setEditable(true);
																																																				}
																																																				textField_12.setEditable(false);
																																																			}
																																																		});
																																																		btnNewButton_16.setFont(new Font("宋体", Font.PLAIN, 14));
																																																		btnNewButton_16.setBounds(72, 290, 67, 35);
																																																		panel_5.add(btnNewButton_16);
																																																		
																																																				JButton btnNewButton_17 = new JButton("重置");
																																																				btnNewButton_17.addActionListener(new ActionListener() {
																																																					public void actionPerformed(ActionEvent e) {
																																																						textField_12.setText("");
																																																					}
																																																				});
																																																				btnNewButton_17.setFont(new Font("宋体", Font.PLAIN, 14));
																																																				btnNewButton_17.setBounds(157, 290, 72, 35);
																																																				panel_5.add(btnNewButton_17);
																																																				
																																																						JButton btnNewButton_21 = new JButton("刷新");
																																																						btnNewButton_21.addActionListener(new ActionListener() {
																																																							public void actionPerformed(ActionEvent e) {

																																																								UserDaoImpl u1 = new UserDaoImpl();
																																																								List<User> list1 = u1.selectList(new User());
																																																								Object[][] Usersql1 = new Object[list1.size()][7];
																																																								int count1 = 0;
																																																								for (int i = 0; i < list1.size(); i++) {
																																																									if (list.get(i).getRole() != 3) {
																																																										Usersql1[count1][0] = list1.get(i).getId();
																																																										Usersql1[count1][1] = list1.get(i).getUsername();
																																																										Usersql1[count1][2] = list1.get(i).getPassword();
																																																										Usersql1[count1][3] = list1.get(i).getTruename();
																																																										Usersql1[count1][4] = list1.get(i).getSex();
																																																										Usersql1[count1][5] = list1.get(i).getPhone();
																																																										Usersql1[count1][6] = list1.get(i).getRole();
																																																										count1++;
																																																									}
																																																								}

																																																								table_3.setModel(new DefaultTableModel(

																																																										Usersql1, new String[] { "G_id", "G_\u8D26\u6237\u540D", "G_\u5BC6\u7801", "G_\u59D3\u540D",
																																																												"G_\u6027\u522B", "G_\u7535\u8BDD\u53F7\u7801", "G_\u89D2\u8272" }));
																																																								scrollPane_3.setViewportView(table_3);
																																																							}
																																																						});
																																																						btnNewButton_21.setFont(new Font("宋体", Font.BOLD, 18));
																																																						btnNewButton_21.setBounds(801, 327, 93, 55);
																																																						panel_5.add(btnNewButton_21);
																																																						
																																																								JLabel lblNewLabel_24 = new JLabel("确认密码：");
																																																								lblNewLabel_24.setFont(new Font("宋体", Font.PLAIN, 14));
																																																								lblNewLabel_24.setBounds(265, 234, 72, 39);
																																																								panel_5.add(lblNewLabel_24);
																																																								
																																																										JPanel panel_2 = new JPanel();
																																																										tabbedPane_1.addTab("查询", null, panel_2, null);
																																																										panel_2.setLayout(null);
																																																										
																																																												JScrollPane scrollPane = new JScrollPane();
																																																												scrollPane.setBounds(0, 0, 995, 113);
																																																												panel_2.add(scrollPane);
																																																												
																																																														table = new JTable();
																																																														
																																																																table.setModel(new DefaultTableModel(
																																																														
																																																																		Usersql2, new String[] { "G_id", "G_\u8D26\u6237\u540D", "G_\u5BC6\u7801", "G_\u59D3\u540D",
																																																																				"G_\u6027\u522B", "G_\u624B\u673A\u53F7", "G_\u89D2\u8272" }));
																																																																table.getColumnModel().getColumn(3).setPreferredWidth(91);
																																																																table.getColumnModel().getColumn(3).setMinWidth(47);
																																																																scrollPane.setViewportView(table);
																																																																
																																																																		JButton button = new JButton("确定");
																																																																		button.addActionListener(new ActionListener() {
																																																																			public void actionPerformed(ActionEvent e) {
																																																																				String username = textField_3.getText();
																																																																				UserDaoImpl ul = new UserDaoImpl();
																																																																				User list = ul.selectByUsername(username);
																																																																				Object[][] user = new Object[1][7];
																																																																				user[0][0] = list.getId();
																																																																				user[0][1] = list.getUsername();
																																																																				user[0][2] = list.getPassword();
																																																																				user[0][3] = list.getTruename();
																																																																				user[0][4] = list.getSex();
																																																																				user[0][5] = list.getPhone();
																																																																				user[0][6] = list.getRole();
																																																																				table.setModel(new DefaultTableModel(

																																																																						user, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D", "\u6027\u522B",
																																																																								"\u624B\u673A\u53F7", "\u89D2\u8272" }));

																																																																			}
																																																																		});
																																																																		button.setFont(new Font("宋体", Font.BOLD, 18));
																																																																		button.setBounds(677, 241, 73, 38);
																																																																		panel_2.add(button);
																																																																		
																																																																				JButton button_1 = new JButton("重置");
																																																																				button_1.addActionListener(new ActionListener() {
																																																																					public void actionPerformed(ActionEvent e) {
																																																																						textField_3.setText("");
																																																																					}
																																																																				});
																																																																				button_1.setFont(new Font("宋体", Font.BOLD, 18));
																																																																				button_1.setBounds(770, 241, 73, 38);
																																																																				panel_2.add(button_1);
																																																																				
																																																																						JLabel label = new JLabel("按姓名查询");
																																																																						label.setHorizontalAlignment(SwingConstants.CENTER);
																																																																						label.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																						label.setBounds(415, 124, 166, 44);
																																																																						panel_2.add(label);
																																																																						
																																																																								textField_2 = new JTextField();
																																																																								textField_2.setFont(new Font("宋体", Font.PLAIN, 20));
																																																																								textField_2.setColumns(10);
																																																																								textField_2.setBounds(425, 178, 166, 44);
																																																																								panel_2.add(textField_2);
																																																																								
																																																																										JButton button_2 = new JButton("确定");
																																																																										button_2.addActionListener(new ActionListener() {
																																																																											public void actionPerformed(ActionEvent e) {
																																																																												String truename = textField_2.getText();
																																																																												UserDaoImpl ul = new UserDaoImpl();
																																																																												User list = ul.selectByTruename(truename);
																																																																												Object[][] user = new Object[1][7];
																																																																												user[0][0] = list.getId();
																																																																												user[0][1] = list.getUsername();
																																																																												user[0][2] = list.getPassword();
																																																																												user[0][3] = list.getTruename();
																																																																												user[0][4] = list.getSex();
																																																																												user[0][5] = list.getPhone();
																																																																												user[0][6] = list.getRole();
																																																																												table.setModel(new DefaultTableModel(

																																																																														user, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D", "\u6027\u522B",
																																																																																"\u624B\u673A\u53F7", "\u89D2\u8272" }));

																																																																											}
																																																																										});
																																																																										button_2.setFont(new Font("宋体", Font.BOLD, 18));
																																																																										button_2.setBounds(435, 241, 73, 38);
																																																																										panel_2.add(button_2);
																																																																										
																																																																												JButton button_3 = new JButton("重置");
																																																																												button_3.addActionListener(new ActionListener() {
																																																																													public void actionPerformed(ActionEvent e) {
																																																																														textField_2.setText("");

																																																																													}
																																																																												});
																																																																												button_3.setFont(new Font("宋体", Font.BOLD, 18));
																																																																												button_3.setBounds(518, 241, 73, 38);
																																																																												panel_2.add(button_3);
																																																																												
																																																																														JLabel label_1 = new JLabel("按帐号查询");
																																																																														label_1.setHorizontalAlignment(SwingConstants.CENTER);
																																																																														label_1.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																														label_1.setBounds(677, 123, 166, 47);
																																																																														panel_2.add(label_1);
																																																																														
																																																																																textField_3 = new JTextField();
																																																																																textField_3.setFont(new Font("宋体", Font.PLAIN, 20));
																																																																																textField_3.setColumns(10);
																																																																																textField_3.setBounds(677, 178, 166, 44);
																																																																																panel_2.add(textField_3);
																																																																																
																																																																																		JLabel lblNewLabel_21 = new JLabel("按ID查询");
																																																																																		lblNewLabel_21.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																		lblNewLabel_21.setBounds(145, 126, 132, 44);
																																																																																		panel_2.add(lblNewLabel_21);
																																																																																		
																																																																																				textField_33 = new JTextField();
																																																																																				textField_33.setBounds(101, 178, 160, 44);
																																																																																				panel_2.add(textField_33);
																																																																																				textField_33.setColumns(10);
																																																																																				
																																																																																						JButton btnNewButton_14 = new JButton("确定");
																																																																																						btnNewButton_14.addActionListener(new ActionListener() {
																																																																																							public void actionPerformed(ActionEvent e) {
																																																																																								int id = Integer.valueOf(textField_33.getText());
																																																																																								UserDaoImpl udl = new UserDaoImpl();
																																																																																								User list = udl.selectById(id);
																																																																																								Object[][] user = new Object[1][7];
																																																																																								user[0][0] = list.getId();
																																																																																								user[0][1] = list.getUsername();
																																																																																								user[0][2] = list.getPassword();
																																																																																								user[0][3] = list.getTruename();
																																																																																								user[0][4] = list.getSex();
																																																																																								user[0][5] = list.getPhone();
																																																																																								user[0][6] = list.getRole();
																																																																																								table.setModel(new DefaultTableModel(

																																																																																										user, new String[] { "id", "\u8D26\u6237\u540D", "\u5BC6\u7801", "\u59D3\u540D", "\u6027\u522B",
																																																																																												"\u624B\u673A\u53F7", "\u89D2\u8272" }));

																																																																																							}
																																																																																						});
																																																																																						btnNewButton_14.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																						btnNewButton_14.setBounds(101, 241, 73, 33);
																																																																																						panel_2.add(btnNewButton_14);
																																																																																						
																																																																																								JButton btnNewButton_15 = new JButton("重置");
																																																																																								btnNewButton_15.addActionListener(new ActionListener() {
																																																																																									public void actionPerformed(ActionEvent e) {
																																																																																										textField_33.setText("");
																																																																																									}
																																																																																								});
																																																																																								btnNewButton_15.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																								btnNewButton_15.setBounds(184, 241, 73, 33);
																																																																																								panel_2.add(btnNewButton_15);
																																																																																								
																																																																																										JPanel panel_3 = new JPanel();
																																																																																										tabbedPane_1.addTab("添加", null, panel_3, null);
																																																																																										panel_3.setLayout(null);
																																																																																										
																																																																																												JScrollPane scrollPane_1 = new JScrollPane();
																																																																																												scrollPane_1.setBounds(0, 0, 995, 109);
																																																																																												panel_3.add(scrollPane_1);
																																																																																												
																																																																																														table_1 = new JTable();
																																																																																														table_1.setModel(new DefaultTableModel(

																																																																																																Usersql3, new String[] { "G_id", "G_\u8D26\u6237\u540D", "G_\u5BC6\u7801", "G_\u59D3\u540D",
																																																																																																		"G_\u6027\u522B", "G_\u7535\u8BDD\u53F7\u7801", "G_\u89D2\u8272" }));
																																																																																														scrollPane_1.setViewportView(table_1);
																																																																																														
																																																																																																JLabel lblNewLabel_1 = new JLabel("添加信息");
																																																																																																lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																																lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																lblNewLabel_1.setBounds(23, 119, 93, 50);
																																																																																																panel_3.add(lblNewLabel_1);
																																																																																																
																																																																																																		JLabel lblNewLabel_2 = new JLabel("账户名");
																																																																																																		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																																		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																		lblNewLabel_2.setBounds(141, 119, 83, 50);
																																																																																																		panel_3.add(lblNewLabel_2);
																																																																																																		
																																																																																																				JLabel lblNewLabel_3 = new JLabel("密码");
																																																																																																				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																																				lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																				lblNewLabel_3.setBounds(251, 119, 83, 50);
																																																																																																				panel_3.add(lblNewLabel_3);
																																																																																																				
																																																																																																						JLabel lblNewLabel_4 = new JLabel("姓名");
																																																																																																						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																																						lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																						lblNewLabel_4.setBounds(375, 123, 83, 50);
																																																																																																						panel_3.add(lblNewLabel_4);
																																																																																																						
																																																																																																								JLabel lblNewLabel_5 = new JLabel("性别");
																																																																																																								lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																																								lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																								lblNewLabel_5.setBounds(524, 123, 83, 50);
																																																																																																								panel_3.add(lblNewLabel_5);
																																																																																																								
																																																																																																										JLabel lblNewLabel_6 = new JLabel("电话号码");
																																																																																																										lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																																										lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																										lblNewLabel_6.setBounds(699, 123, 83, 50);
																																																																																																										panel_3.add(lblNewLabel_6);
																																																																																																										
																																																																																																												JButton btnNewButton = new JButton("确定");
																																																																																																												btnNewButton.addActionListener(new ActionListener() {
																																																																																																													public void actionPerformed(ActionEvent e) {
																																																																																																														String Qpassword = String.valueOf(passwordField_3.getPassword());
																																																																																																														String username = textField.getText();
																																																																																																														String password = String.valueOf(passwordField_1.getPassword());
																																																																																																														String truename = textField_4.getText();
																																																																																																														int sex = Integer.valueOf(textField_26.getText());
																																																																																																														String phone = textField_1.getText();
																																																																																																														int role = Integer.valueOf(textField_13.getText());
																																																																																																														if(null==Qpassword){
																																																																																																															JOptionPane.showMessageDialog(btnNewButton, "请先确认密码");
																																																																																																														}
																																																																																																														else if (Qpassword.equals(password)) {
																																																																																																															UserDaoImpl ul = new UserDaoImpl();
																																																																																																															User user = new User();
																																																																																																															user.setUsername(username);
																																																																																																															user.setPassword(password);
																																																																																																															user.setTruename(truename);
																																																																																																															user.setSex(sex);
																																																																																																															user.setPhone(phone);
																																																																																																															user.setRole(role);
																																																																																																															ul.insert(user);
																																																																																																															JOptionPane.showMessageDialog(null, "添加数据成功");
																																																																																																														} else {
																																																																																																															JOptionPane.showMessageDialog(btnNewButton, "密码填写有误");
																																																																																																														}

																																																																																																													}
																																																																																																												});
																																																																																																												btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
																																																																																																												btnNewButton.setBounds(406, 262, 93, 69);
																																																																																																												panel_3.add(btnNewButton);
																																																																																																												
																																																																																																														JButton btnNewButton_1 = new JButton("重置");
																																																																																																														btnNewButton_1.addActionListener(new ActionListener() {
																																																																																																															public void actionPerformed(ActionEvent e) {
																																																																																																																textField.setText("");
																																																																																																																passwordField_1.setText("");
																																																																																																																textField_4.setText("");
																																																																																																																textField_26.setText("");
																																																																																																																textField_1.setText("");
																																																																																																																textField_13.setText("");
																																																																																																															}
																																																																																																														});
																																																																																																														btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 20));
																																																																																																														btnNewButton_1.setBounds(545, 262, 93, 69);
																																																																																																														panel_3.add(btnNewButton_1);
																																																																																																														
																																																																																																																textField = new JTextField();
																																																																																																																textField.setHorizontalAlignment(SwingConstants.LEFT);
																																																																																																																textField.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																textField.setBounds(111, 179, 100, 45);
																																																																																																																panel_3.add(textField);
																																																																																																																textField.setColumns(10);
																																																																																																																
																																																																																																																		textField_1 = new JTextField();
																																																																																																																		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
																																																																																																																		textField_1.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																		textField_1.setBounds(699, 179, 93, 45);
																																																																																																																		panel_3.add(textField_1);
																																																																																																																		textField_1.setColumns(10);
																																																																																																																		
																																																																																																																				textField_4 = new JTextField();
																																																																																																																				textField_4.setHorizontalAlignment(SwingConstants.LEFT);
																																																																																																																				textField_4.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																				textField_4.setBounds(375, 179, 100, 45);
																																																																																																																				panel_3.add(textField_4);
																																																																																																																				textField_4.setColumns(10);
																																																																																																																				
																																																																																																																						passwordField_1 = new JPasswordField();
																																																																																																																						passwordField_1.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																						passwordField_1.setBounds(235, 183, 119, 45);
																																																																																																																						panel_3.add(passwordField_1);
																																																																																																																						
																																																																																																																								JLabel lblNewLabel_18 = new JLabel("角色");
																																																																																																																								lblNewLabel_18.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																								lblNewLabel_18.setBounds(852, 123, 78, 46);
																																																																																																																								panel_3.add(lblNewLabel_18);
																																																																																																																								
																																																																																																																										textField_13 = new JTextField();
																																																																																																																										textField_13.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																										textField_13.setBounds(835, 179, 83, 45);
																																																																																																																										panel_3.add(textField_13);
																																																																																																																										textField_13.setColumns(10);
																																																																																																																										
																																																																																																																												textField_26 = new JTextField();
																																																																																																																												textField_26.setBounds(524, 183, 93, 41);
																																																																																																																												panel_3.add(textField_26);
																																																																																																																												textField_26.setColumns(10);
																																																																																																																												
																																																																																																																														JButton btnNewButton_22 = new JButton("刷新");
																																																																																																																														btnNewButton_22.addActionListener(new ActionListener() {
																																																																																																																															public void actionPerformed(ActionEvent e) {
																																																																																																																																int count3 = 0;
																																																																																																																																UserDaoImpl u3 = new UserDaoImpl();
																																																																																																																																List<User> list3 = u3.selectList(new User());
																																																																																																																																Object[][] Usersql3 = new Object[list3.size()][7];
																																																																																																																																for (int i = 0; i < list3.size(); i++) {
																																																																																																																																	if (list.get(i).getRole() != 3) {
																																																																																																																																		Usersql3[count3][0] = list3.get(i).getId();
																																																																																																																																		Usersql3[count3][1] = list3.get(i).getUsername();
																																																																																																																																		Usersql3[count3][2] = list3.get(i).getPassword();
																																																																																																																																		Usersql3[count3][3] = list3.get(i).getTruename();
																																																																																																																																		Usersql3[count3][4] = list3.get(i).getSex();
																																																																																																																																		Usersql3[count3][5] = list3.get(i).getPhone();
																																																																																																																																		Usersql3[count3][6] = list3.get(i).getRole();
																																																																																																																																		count3++;
																																																																																																																																	}
																																																																																																																																}
																																																																																																																																table_1.setModel(new DefaultTableModel(

																																																																																																																																		Usersql3, new String[] { "G_id", "G_\u8D26\u6237\u540D", "G_\u5BC6\u7801", "G_\u59D3\u540D",
																																																																																																																																				"G_\u6027\u522B", "G_\u7535\u8BDD\u53F7\u7801", "G_\u89D2\u8272" }));
																																																																																																																																scrollPane_1.setViewportView(table_1);
																																																																																																																															}
																																																																																																																														});
																																																																																																																														btnNewButton_22.setFont(new Font("宋体", Font.BOLD, 20));
																																																																																																																														btnNewButton_22.setBounds(689, 262, 93, 69);
																																																																																																																														panel_3.add(btnNewButton_22);
																																																																																																																														
																																																																																																																																JLabel lblNewLabel_23 = new JLabel("确认密码");
																																																																																																																																lblNewLabel_23.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																																lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																																																																lblNewLabel_23.setBounds(235, 238, 119, 41);
																																																																																																																																panel_3.add(lblNewLabel_23);
																																																																																																																																
																																																																																																																																		passwordField_3 = new JPasswordField();
																																																																																																																																		passwordField_3.setBounds(245, 289, 109, 42);
																																																																																																																																		panel_3.add(passwordField_3);
																																																																																																																																		
																																																																																																																																				JPanel panel_4 = new JPanel();
																																																																																																																																				tabbedPane_1.addTab("删除", null, panel_4, null);
																																																																																																																																				panel_4.setLayout(null);
																																																																																																																																				
																																																																																																																																						JScrollPane scrollPane_2 = new JScrollPane();
																																																																																																																																						scrollPane_2.setBounds(0, 0, 995, 112);
																																																																																																																																						panel_4.add(scrollPane_2);
																																																																																																																																						
																																																																																																																																								table_2 = new JTable();
																																																																																																																																								table_2.setModel(new DefaultTableModel(

																																																																																																																																										Usersql, new String[] { "G_id", "G_\u8D26\u6237\u540D", "G_\u5BC6\u7801", "G_\u59D3\u540D",
																																																																																																																																												"G_\u6027\u522B", "G_\u7535\u8BDD\u53F7\u7801", "G_\u89D2\u8272" }));
																																																																																																																																								scrollPane_2.setViewportView(table_2);
																																																																																																																																								
																																																																																																																																										JLabel lblNewLabel_7 = new JLabel("按帐户名删除");
																																																																																																																																										lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																																										lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																																																																										lblNewLabel_7.setBounds(463, 122, 129, 45);
																																																																																																																																										panel_4.add(lblNewLabel_7);
																																																																																																																																										
																																																																																																																																												textField_5 = new JTextField();
																																																																																																																																												textField_5.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																																												textField_5.setBounds(415, 189, 220, 45);
																																																																																																																																												panel_4.add(textField_5);
																																																																																																																																												textField_5.setColumns(10);
																																																																																																																																												
																																																																																																																																														JButton btnNewButton_2 = new JButton("确定");
																																																																																																																																														btnNewButton_2.addActionListener(new ActionListener() {
																																																																																																																																															public void actionPerformed(ActionEvent e) {
																																																																																																																																																String a = textField_5.getText();
																																																																																																																																																UserDaoImpl ul = new UserDaoImpl();
																																																																																																																																																if (ul.selectByUsername(a) != null) {
																																																																																																																																																	ul.deleteByUsername(a);
																																																																																																																																																	JOptionPane.showMessageDialog(btnNewButton_2, "删除成功");
																																																																																																																																																} else {
																																																																																																																																																	JOptionPane.showMessageDialog(btnNewButton_2, "查无此人");
																																																																																																																																																}
																																																																																																																																															}
																																																																																																																																														});
																																																																																																																																														btnNewButton_2.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																																																																														btnNewButton_2.setBounds(415, 250, 90, 45);
																																																																																																																																														panel_4.add(btnNewButton_2);
																																																																																																																																														
																																																																																																																																																JButton btnNewButton_3 = new JButton("重置");
																																																																																																																																																btnNewButton_3.addActionListener(new ActionListener() {
																																																																																																																																																	public void actionPerformed(ActionEvent e) {
																																																																																																																																																		textField_5.setText("");
																																																																																																																																																	}
																																																																																																																																																});
																																																																																																																																																btnNewButton_3.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																																																																																btnNewButton_3.setBounds(545, 250, 90, 45);
																																																																																																																																																panel_4.add(btnNewButton_3);
																																																																																																																																																
																																																																																																																																																		JLabel lblNewLabel_8 = new JLabel("按姓名删除");
																																																																																																																																																		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																																																		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
																																																																																																																																																		lblNewLabel_8.setBounds(756, 122, 129, 45);
																																																																																																																																																		panel_4.add(lblNewLabel_8);
																																																																																																																																																		
																																																																																																																																																				textField_6 = new JTextField();
																																																																																																																																																				textField_6.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																																																				textField_6.setBounds(711, 189, 220, 45);
																																																																																																																																																				panel_4.add(textField_6);
																																																																																																																																																				textField_6.setColumns(10);
																																																																																																																																																				
																																																																																																																																																						JButton btnNewButton_4 = new JButton("确定");
																																																																																																																																																						btnNewButton_4.addActionListener(new ActionListener() {
																																																																																																																																																							public void actionPerformed(ActionEvent e) {
																																																																																																																																																								String a = textField_6.getText();
																																																																																																																																																								UserDaoImpl u = new UserDaoImpl();
																																																																																																																																																								if (u.selectByTruename(a) != null) {
																																																																																																																																																									u.deleteByTruename(a);
																																																																																																																																																									JOptionPane.showMessageDialog(btnNewButton_4, "删除成功");
																																																																																																																																																								} else {
																																																																																																																																																									JOptionPane.showMessageDialog(btnNewButton_4, "查无此人");
																																																																																																																																																								}

																																																																																																																																																							}
																																																																																																																																																						});
																																																																																																																																																						btnNewButton_4.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																																																																																						btnNewButton_4.setBounds(711, 250, 90, 45);
																																																																																																																																																						panel_4.add(btnNewButton_4);
																																																																																																																																																						
																																																																																																																																																								JButton btnNewButton_5 = new JButton("重置");
																																																																																																																																																								btnNewButton_5.addActionListener(new ActionListener() {
																																																																																																																																																									public void actionPerformed(ActionEvent e) {
																																																																																																																																																										textField_6.setText("");
																																																																																																																																																									}
																																																																																																																																																								});
																																																																																																																																																								btnNewButton_5.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																																																																																								btnNewButton_5.setBounds(841, 250, 90, 45);
																																																																																																																																																								panel_4.add(btnNewButton_5);
																																																																																																																																																								
																																																																																																																																																										JLabel lblNewLabel_15 = new JLabel("按ID删除");
																																																																																																																																																										lblNewLabel_15.setFont(new Font("宋体", Font.PLAIN, 18));
																																																																																																																																																										lblNewLabel_15.setBounds(123, 122, 145, 45);
																																																																																																																																																										panel_4.add(lblNewLabel_15);
																																																																																																																																																										
																																																																																																																																																												textField_30 = new JTextField();
																																																																																																																																																												textField_30.addKeyListener(new KeyAdapter() {
																																																																																																																																																													public void KeyPressed(KeyEvent e) {
																																																																																																																																																														if (e.getKeyText(e.getKeyCode()).compareToIgnoreCase("Enter") == 0) {
																																																																																																																																																															int id = Integer.valueOf(textField_30.getText());
																																																																																																																																																															UserDaoImpl u = new UserDaoImpl();
																																																																																																																																																															u.deleteById(id);
																																																																																																																																																															JOptionPane.showMessageDialog(null, "删除成功");
																																																																																																																																																														}
																																																																																																																																																													}
																																																																																																																																																												});
																																																																																																																																																												textField_30.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																																																																																												textField_30.setBounds(68, 189, 220, 45);
																																																																																																																																																												panel_4.add(textField_30);
																																																																																																																																																												textField_30.setColumns(10);
																																																																																																																																																												
																																																																																																																																																														JButton btnNewButton_8 = new JButton("确定");
																																																																																																																																																														btnNewButton_8.addActionListener(new ActionListener() {
																																																																																																																																																															public void actionPerformed(ActionEvent e) {
																																																																																																																																																																int id = Integer.valueOf(textField_30.getText());
																																																																																																																																																																UserDaoImpl u = new UserDaoImpl();
																																																																																																																																																																u.deleteById(id);
																																																																																																																																																																JOptionPane.showMessageDialog(btnNewButton_8, "删除成功");
																																																																																																																																																															}
																																																																																																																																																														});
																																																																																																																																																														btnNewButton_8.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																																																																																														btnNewButton_8.setBounds(68, 250, 93, 45);
																																																																																																																																																														panel_4.add(btnNewButton_8);
																																																																																																																																																														
																																																																																																																																																																JButton btnNewButton_9 = new JButton("重置");
																																																																																																																																																																btnNewButton_9.addActionListener(new ActionListener() {
																																																																																																																																																																	public void actionPerformed(ActionEvent e) {
																																																																																																																																																																		textField_30.setText("");
																																																																																																																																																																	}
																																																																																																																																																																});
																																																																																																																																																																btnNewButton_9.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																																																																																																btnNewButton_9.setBounds(195, 250, 93, 45);
																																																																																																																																																																panel_4.add(btnNewButton_9);
																																																																																																																																																																
																																																																																																																																																																		JButton btnNewButton_20 = new JButton("刷新");
																																																																																																																																																																		btnNewButton_20.addActionListener(new ActionListener() {
																																																																																																																																																																			public void actionPerformed(ActionEvent e) {
																																																																																																																																																																				int count = 0;
																																																																																																																																																																				UserDaoImpl u = new UserDaoImpl();
																																																																																																																																																																				List<User> list = u.selectList(new User());
																																																																																																																																																																				Object[][] Usersql = new Object[list.size()][7];

																																																																																																																																																																				for (int i = 0; i < list.size(); i++) {
																																																																																																																																																																					if (list.get(i).getRole() != 3) {
																																																																																																																																																																						Usersql[count][0] = list.get(i).getId();
																																																																																																																																																																						Usersql[count][1] = list.get(i).getUsername();
																																																																																																																																																																						Usersql[count][2] = list.get(i).getPassword();
																																																																																																																																																																						Usersql[count][3] = list.get(i).getTruename();
																																																																																																																																																																						Usersql[count][4] = list.get(i).getSex();
																																																																																																																																																																						Usersql[count][5] = list.get(i).getPhone();
																																																																																																																																																																						Usersql[count][6] = list.get(i).getRole();
																																																																																																																																																																						count++;
																																																																																																																																																																					}
																																																																																																																																																																				}
																																																																																																																																																																				table_2.setModel(new DefaultTableModel(

																																																																																																																																																																						Usersql, new String[] { "G_id", "G_\u8D26\u6237\u540D", "G_\u5BC6\u7801", "G_\u59D3\u540D",
																																																																																																																																																																								"G_\u6027\u522B", "G_\u7535\u8BDD\u53F7\u7801", "G_\u89D2\u8272" }));
																																																																																																																																																																				scrollPane_2.setViewportView(table_2);

																																																																																																																																																																			}
																																																																																																																																																																		});
																																																																																																																																																																		btnNewButton_20.setFont(new Font("宋体", Font.BOLD, 18));
																																																																																																																																																																		btnNewButton_20.setBounds(477, 326, 93, 45);
																																																																																																																																																																		panel_4.add(btnNewButton_20);

		JButton button_4 = new JButton("返回菜单");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CaiDan_GUI c = new CaiDan_GUI();
				c.setVisible(true);
			}
		});
		button_4.setBounds(29, 617, 124, 59);
		contentPane.add(button_4);
		button_4.setFont(new Font("宋体", Font.BOLD, 18));

		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setFont(new Font("宋体", Font.BOLD, 22));
		lblNewLabel_14.setBounds(622, 954, 423, 59);
		contentPane.add(lblNewLabel_14);
		ClockThread clockThread = new ClockThread(lblNewLabel_14);
		clockThread.setPriority(10);
		clockThread.start();
	}
}
