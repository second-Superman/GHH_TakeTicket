package cn.ucai.util;

import java.awt.Container;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

/**
 * 时间
 * @author Administrator
 *
 */
public class ClockThread extends Thread{
	Container container;
	boolean flag = true;
	public ClockThread(Container container) {
		this.container = container;
	}

	@Override
	public void run() {
		while (flag) {
			// 获取显示时间的组件
			JLabel jLable = null;
			if (this.container instanceof JLabel) {
				jLable = (JLabel) this.container;
			}
			// 获取当前时间并显示时间到对应的组件

			Date date = new Date();
			DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 EE HH:mm:ss");

			if (null != jLable) {
				jLable.setText(df.format(date));
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
