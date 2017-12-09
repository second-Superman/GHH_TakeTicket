package cn.ucai.taketicket.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.ucai.dto.RequestAction;
import cn.ucai.dto.RequestMsg;
import cn.ucai.dto.ResponseMsg;
import cn.ucai.entity.Business;
import cn.ucai.entity.Ticket;
import cn.ucai.taketicket.net.TakeTicketNet;
import cn.ucai.util.ClockThread;
import cn.ucai.util.CloseWindowAdapter;

import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class QuHao extends JFrame {

	private String b_code;

	public String getB_code() {
		return b_code;
	}

	public void setB_code(String b_code) {
		this.b_code = b_code;
	}

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuHao frame = new QuHao();
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
	public QuHao() {
		setTitle("中国工商银行叫号系统");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle bounds = new Rectangle(screenSize);
		this.setBounds(bounds);
		this.setUndecorated(true);

		Container container = getContentPane();
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(149, 348, 405, 70);
		contentPane.add(lblNewLabel_1);
		ClockThread clockThread = new ClockThread(lblNewLabel_1);
		clockThread.setPriority(10);
		clockThread.start();

		// 向服务端发起请求
		RequestMsg requestMsg = new RequestMsg();
		requestMsg.setAction(RequestAction.TAKE_GETBUSINESS);
		TakeTicketNet.getInstanse().sendMsg(requestMsg);
		// 接收返回的数据
		ResponseMsg responseMsg = TakeTicketNet.getInstanse().reciverMsg();

		// 使用返回数据
		List<Business> bList = (List<Business>) responseMsg.getData();
		int y = 20;
		for (Business b : bList) {
			y = y + 100;
			JButton btnNewButton = new JButton(b.getName());
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// 向服务端发起请求
					RequestMsg requestMsg = new RequestMsg();
					requestMsg.setAction(RequestAction.TAKE_TAKENUM);
					Map<String, Object> data = new HashMap<String, Object>();
					data.put("business_id", b.getId());
					requestMsg.setData(data);

					TakeTicketNet.getInstanse().sendMsg(requestMsg);
					// 接收返回的数据
					ResponseMsg responseMsg = TakeTicketNet.getInstanse().reciverMsg();

					// 显示小票的窗口
					Ticket t = (Ticket) responseMsg.getData();

					Ticket_GUI tg = new Ticket_GUI();
					tg.lblNewLabel_2.setText(t.getB_code());
					tg.lblNewLabel_4.setText(t.getNumber());
					tg.lblNewLabel_6.setText(String.valueOf(t.getCount()));
					tg.setVisible(true);
				}
			});

			btnNewButton.setFont(new Font("宋体", Font.BOLD, 14));
			btnNewButton.setBounds(1000, y, 100, 50);
			contentPane.add(btnNewButton);

		}
	}
}