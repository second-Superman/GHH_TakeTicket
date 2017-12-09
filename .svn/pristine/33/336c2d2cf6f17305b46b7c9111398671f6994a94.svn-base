package cn.ucai.manage.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import cn.ucai.entity.User;
import cn.ucai.server.dao.Impl.UserDaoImpl;
import cn.ucai.util.Screen;

import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class GuanLilogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuanLilogin frame = new GuanLilogin();
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
	public GuanLilogin() {
		Screen s = new Screen();
		setTitle("工商银行叫号系统");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds((s.scareenwidth() - 1001) / 2, (s.scareenhight() - 541) / 2, 1001, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 20));
		textField.setBounds(377, 224, 204, 62);
		contentPane.add(textField);
		textField.setColumns(10);

		lblNewLabel_1 = new JLabel("帐号（A）：");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(272, 224, 118, 62);
		contentPane.add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				if (e.getKeyText(e.getKeyCode()).compareToIgnoreCase("Enter")==0){
					String a = textField.getText().trim();
					String b = String.valueOf(passwordField.getPassword());
					UserDaoImpl u = new UserDaoImpl();

					List<User> list = u.selectList(new User());
					boolean que=true;
					for(int i=0;i<list.size();i++){
						if(a.equals(list.get(i).getUsername())){
							if(b.equals(list.get(i).getPassword())){
								if(list.get(i).getRole()!=3){
									dispose();
									CaiDan_GUI c = new CaiDan_GUI();
									c.setVisible(true);
								}else{
									JOptionPane.showMessageDialog(null, "用户没有权限！", "警告信息", JOptionPane.WARNING_MESSAGE);
									
								}
								que=false;
								break;
							}

						}
						
					}
					if(que){
						JOptionPane.showMessageDialog(null, "账户名或密码错误错误！", "警告信息", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
			
		});
			
		passwordField.setFont(new Font("宋体", Font.PLAIN, 20));
		passwordField.setBounds(377, 335, 204, 62);
		contentPane.add(passwordField);
		

		JLabel lblNewLabel_2 = new JLabel("密码（P）：");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(272, 332, 110, 62);
		contentPane.add(lblNewLabel_2);

		btnNewButton = new JButton("安全登录");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText().trim();
				String b = String.valueOf(passwordField.getPassword());
				UserDaoImpl u = new UserDaoImpl();

				List<User> list = u.selectList(new User());
				boolean que=true;
				for(int i=0;i<list.size();i++){
					if(a.equals(list.get(i).getUsername())){
						if(b.equals(list.get(i).getPassword())){
							if(list.get(i).getRole()==1 || list.get(i).getRole()==2){
								dispose();
								CaiDan_GUI c = new CaiDan_GUI();
								c.setVisible(true);
							}else{
								JOptionPane.showMessageDialog(null, "用户没有权限！", "警告信息", JOptionPane.WARNING_MESSAGE);
								
							}
							que=false;
							break;
						}

					}
					
				}
				if(que){
					JOptionPane.showMessageDialog(null, "账户名或密码错误！", "警告信息", JOptionPane.WARNING_MESSAGE);
				}
			
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.setBounds(381, 436, 200, 50);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(
				"img\\项目图片\\3b2d8f02af9d0919a4373e0e8f57b5f4.jpg"));
		lblNewLabel.setBounds(0, 0, 995, 517);
		contentPane.add(lblNewLabel);
	}
}
