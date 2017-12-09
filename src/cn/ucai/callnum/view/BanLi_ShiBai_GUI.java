package cn.ucai.callnum.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.ucai.util.Screen;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BanLi_ShiBai_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BanLi_ShiBai_GUI frame = new BanLi_ShiBai_GUI();
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
	public BanLi_ShiBai_GUI() {
		Screen s=new Screen();
		setResizable(false);
	
		setBounds((s.scareenwidth()-534)/2, (s.scareenhight()-451)/2, 534, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("办理失败的原因");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 0, 508, 32);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("提交");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String content=textField.getText();
				
				
			
				dispose();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton.setBounds(60, 352, 93, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("取消");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					dispose();
			}
		});
		btnNewButton_1.setFont(new Font("宋体", Font.BOLD, 18));
		btnNewButton_1.setBounds(239, 352, 93, 51);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(0, 42, 518, 264);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
