package haikan.allook.cn.mina.util;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 设备id处理工具类
 * @author haikan
 *
 */
public class DeviceIDResolver {
	
	private static Logger logger=LoggerFactory.getLogger(DeviceIDResolver.class);
	
	/**
	 * 通过用户的设备号获取用户的手机号
	 * @param device_id
	 * @return
	 */
	public static String searchPatientidByDeviceId(String device_id) {
		//省略查询数据库的流程，用模拟数据走通
		
		logger.info("{}.searchPatientidByDeviceId得到结果:13553151462",
				DeviceIDResolver.class.getSimpleName());
		return "13553151462";
	}
	/**
	 * 通过用户的设备号和设备类型获取用户的手机号(目前不区分设备类型)
	 * @param deviceId
	 * @param deviceType
	 * @return
	 */
	public static String searchPatientIDByDeviceidAndDeviceType(String deviceId,
			String deviceType) {
		//省略查询数据库的流程，用模拟数据走通
		
		logger.info("{}.searchPatientIDByDeviceidAndDeviceType得到结果:13553151462",
				DeviceIDResolver.class.getSimpleName());
		return "123";
	}
	/**
	 * 通过用户设备号获取用户信息
	 * @param deviceId
	 * @return
	 */
	public static HashMap<String,String> searchPatientInfoByDeviceid(String deviceId){
		//省略查询数据库的流程，用模拟数据走通
		return new HashMap<String,String>();
	}
	
	/**
	 * 通过用户的设备好和设备类型获取用户的单位代号
	 * @param deviceID
	 * @param deviceType
	 * @return
	 */
	public static String searchCompanyByDeviceidAndDeviceType(String deviceID,String deviceType) {
		//省略查询数据库的流程，用模拟数据走通
		return "18567";
	}
	
	/**
	 * 根据设备号判断用户所在单位
	 * @param device_id
	 * @return
	 */
	public static String searchCompanyByDevicdid(String device_id) {
		//省略查询数据库的流程，用模拟数据走通
		return "haikan";
		
	}
	
	/**
	 * 从字节数组中解析出设备号，忽略null、空格、回车、换行、null
	 * null的ASCII码为0，
	 * 换行的为10
	 * 回车为13
	 * 空格为32
	 * @param b
	 * @param deviceIDBeginIndex
	 * @return
	 */
	public static String getDeviceIDFromBytes(byte[] b,int deviceIDBeginIndex) {
		StringBuffer sbid=new StringBuffer();
		for(int j=deviceIDBeginIndex;j<deviceIDBeginIndex+16;j++) {
			
			if(b[j]!=0 && b[j]!=13 && b[j]!=10 && b[j]!=32) {
				sbid.append((char)b[j]);
			}
		}
		logger.info("the deviceID is:{}",sbid.toString());
		return sbid.toString();
	}

}
