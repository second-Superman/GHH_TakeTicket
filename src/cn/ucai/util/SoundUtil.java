package cn.ucai.util;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 声音播放的工具类
 * @author haibo
 *
 */
public class SoundUtil {
	
	public static void callNum(String businessCode, int number,int windowNo) {
		
		try {
			// 调用声音“请”
			SoundUtil.playSound("sound/chinese/plese.wav");
			Thread.sleep(500);
			// 调用声音 叫号业务类型，如 A,B,C等
			System.out.println(getBusinessTypeUrl(businessCode));
			SoundUtil.playSound(getBusinessTypeUrl(businessCode));
			Thread.sleep(500);
			// 调用声音 排队号数， 比如 14 相应的声音
			playSoundOfNumber(number);//1003
			
			// 调用声音 “号"
			SoundUtil.playSound("sound/chinese/num.wav");
			Thread.sleep(500);
			
			//调用声音“到”
			SoundUtil.playSound("sound/chinese/to.wav");
			Thread.sleep(500);
			// 调用声音 窗口号数 如 1，2 等
			SoundUtil.playSound(getNoUrl(windowNo));
			Thread.sleep(500);
			// 调用声音“号窗口办理”
			SoundUtil.playSound("sound/chinese/handle.wav");
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
	}

	/**
	 * 拼装业务代码对应的文件路径
	 * @param businessCode
	 * @return
	 */
	public static String getBusinessTypeUrl(String businessCode) {
	
		String url = "sound/letter/"+businessCode.toLowerCase()+".wav";
		return url;
	}
	
	/**
	 * 播放排队号
	 * @param number
	 */
	public static void playSoundOfNumber(int number){
		
		int thousandsDigit = number / 1000;
		int hundredsDigit = number % 1000 / 100;
		int tensDigit = number % 100 / 10;
		int unitsDigit = number % 10 / 1;
		
		/*SoundUtil.playSound(getNoUrl(thousandsDigit));
		SoundUtil.playSound(getNoUrl(hundredsDigit));
		SoundUtil.playSound(getNoUrl(tensDigit));
		SoundUtil.playSound(getNoUrl(unitsDigit));*/
		
		
		try {
			if(thousandsDigit == 0){
				
			}else{
				SoundUtil.playSound(getNoUrl(thousandsDigit));
				Thread.sleep(500);
			}
			
			if(thousandsDigit == 0 && hundredsDigit == 0){
			}else{
				SoundUtil.playSound(getNoUrl(hundredsDigit));
				Thread.sleep(500);
			}
			
			if(thousandsDigit == 0 && hundredsDigit == 0 && tensDigit == 0){
			}else{
				SoundUtil.playSound(getNoUrl(tensDigit));
				Thread.sleep(500);	
			}
			
			SoundUtil.playSound(getNoUrl(unitsDigit));
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取数字对应的文件路径
	 * @param No
	 * @return
	 */
	public static String getNoUrl(int No) {
	
		String url = null;
		if (0 == No) {
			url = "sound/number/0.wav";
		}
		if (1 == No) {
			url = "sound/number/1.wav";
		}
		if (2 == No) {
			url = "sound/number/2.wav";
		}
		if (3 == No) {
			url = "sound/number/3.wav";
		}
		if (4 == No) {
			url = "sound/number/4.wav";
		}
		if (5 == No) {
			url = "sound/number/5.wav";
		}
		if (6 == No) {
			url = "sound/number/6.wav";
		}
		if (7 == No) {
			url = "sound/number/7.wav";
		}
		if (8 == No) {
			url = "sound/number/8.wav";
		}
		if (9 == No) {
			url = "sound/number/9.wav";
		}
	
		return url;
	}
	
	/**
	 * 根据完整文件名播放音频
	 * @param Filename
	 */
	public static void playSound(String Filename) {

		URL url;
		try {
			url = new URL("file:" + Filename);
			AudioClip ac = Applet.newAudioClip(url);
			ac.play();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	
//	public static void main(String[] args) {
//		callNum("A", 1003, 4);
//	}
}
