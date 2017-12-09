package cn.ucai.util;
/**
 * 获取屏幕的宽和高
 */
import java.awt.Toolkit;

public class Screen {
	public int scareenwidth(){
		int scareenwidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		return scareenwidth;
	}
	public int scareenhight(){
		int scareenhight = Toolkit.getDefaultToolkit().getScreenSize().height;
		return scareenhight;
	}
	

}