package cn.ucai.callnum.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.ucai.callnum.net.CallNumNet;
import cn.ucai.callnum.view.AJiaoHao_GUI;
import cn.ucai.dto.RequestAction;
import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.entity.Business;
import cn.ucai.entity.User;
import cn.ucai.entity.Window;
import cn.ucai.server.dao.Impl.UserDaoImpl;
import cn.ucai.taketicket.net.TakeTicketNet;
import cn.ucai.util.Screen;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.awt.event.ActionEvent;

public class GuiYuanLog_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiYuanLog_GUI frame = new GuiYuanLog_GUI();
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
	public GuiYuanLog_GUI() {
		Screen s = new Screen();
		setResizable(false);
		setTitle("叫号系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((s.scareenwidth() - 929) / 2, (s.scareenhight() - 441) / 2, 929, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("窗口：");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(275, 157, 71, 50);
		contentPane.add(lblNewLabel_1);
		// 向服务端发起请求
		RequestMsg requestMsg = new RequestMsg();
		requestMsg.setAction(RequestAction.CALL_GET_NO);
		CallNumNet.getInstanse().SendMsg(requestMsg);

		// 接收返回的数据
		ResponseMsg responseMsg = CallNumNet.getInstanse().reciverMsg();
		// 使用返回数据
		List<Window> wList = (List<Window>) responseMsg.getData();
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("宋体", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {  }));
		comboBox.setBounds(329, 165, 168, 38);
		for (Window w : wList) {
			comboBox.addItem(w.getNo()+"号窗口");
		}

		contentPane.add(comboBox);

		JLabel lblNewLabel_2 = new JLabel("用户：");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(275, 227, 71, 38);
		contentPane.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(329, 227, 168, 38);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("密码：");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(275, 280, 78, 50);
		contentPane.add(lblNewLabel_3);

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyText(e.getKeyCode()).compareToIgnoreCase("Enter") == 0) {
					String a = textField.getText();
					String b = String.valueOf(passwordField.getPassword());
					UserDaoImpl ul = new UserDaoImpl();
					List<User> list = ul.selectList(new User());
					boolean flag = true;
					for (int i = 0; i < list.size(); i++) {
						if (a.equals(list.get(i).getUsername())) {
							if (b.equals(list.get(i).getPassword())) {
								if (list.get(i).getRole() == 3) {

									dispose();
									AJiaoHao_GUI aj = new AJiaoHao_GUI();
									String str = comboBox.getSelectedItem().toString();
									int no = Integer.valueOf(str.substring(0, 1));
									aj.setUser(a);
									aj.setWindowNum(no);
									aj.setVisible(true);
								} else {
									JOptionPane.showMessageDialog(null, "用户没有权限！", "警告信息", JOptionPane.WARNING_MESSAGE);

								}
								flag = false;
								break;
							}

						}

					}
					if (flag) {
						JOptionPane.showMessageDialog(null, "用户名或者密码错误！", "警告信息", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		passwordField.setFont(new Font("宋体", Font.PLAIN, 18));
		passwordField.setBounds(329, 289, 168, 38);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				String b = String.valueOf(passwordField.getPassword());
				UserDaoImpl ul = new UserDaoImpl();
				List<User> list = ul.selectList(new User());
				boolean flag = true;
				for (int i = 0; i < list.size(); i++) {
					if (a.equals(list.get(i).getUsername())) {
						if (b.equals(list.get(i).getPassword())) {
							if (list.get(i).getRole() == 3) {

								dispose();
								AJiaoHao_GUI aj = new AJiaoHao_GUI();
								String str = comboBox.getSelectedItem().toString();
								int no = Integer.valueOf(str.substring(0, 1));
								aj.setUser(a);
								aj.setWindowNum(no);
								aj.setVisible(true);
							} else {
								JOptionPane.showMessageDialog(null, "用户没有权限！", "警告信息", JOptionPane.WARNING_MESSAGE);

							}
							flag = false;
							break;
						}

					}

				}
				if (flag) {
					JOptionPane.showMessageDialog(null, "用户名或者密码错误！", "警告信息", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.setBounds(275, 340, 113, 42);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("CANCEL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_1.setBounds(415, 340, 113, 42);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("img\\项目图片\\3b2d8f02af9d0919a4373e0e8f57b5f4.jpg"));
		lblNewLabel.setBounds(5, 5, 903, 410);
		contentPane.add(lblNewLabel);
	}
}
