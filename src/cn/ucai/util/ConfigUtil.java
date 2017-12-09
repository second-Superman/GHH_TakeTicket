package cn.ucai.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取properties配置文件信息
 * 
 * @author Administrator
 *
 */
public class ConfigUtil {
	private Properties properties;

	public ConfigUtil(String filename) {
		InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream(filename);
		properties = new Properties();

		try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 获取具体属性的值
	 */
	public String getValue(String key) {
		return properties.getProperty(key);
	}
}
