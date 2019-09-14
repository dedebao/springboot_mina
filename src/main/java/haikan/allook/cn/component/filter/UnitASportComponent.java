package haikan.allook.cn.component.filter;

import org.apache.mina.core.buffer.IoBuffer;

import haikan.allook.cn.sportpackage.PackageData;

/**
 * 解码器，主要功能是实现字节流的数据头检查，具体解析数据功能由其各个子类去实现。
 * @author pengyu
 *
 */
public class UnitASportComponent extends MHRootComponent {
	
	public boolean check(IoBuffer buffer) {
		logger.info("UnitASportComponent开始解析数据包");
		logger.info("byte[0]={},byte[1]={},byte[2]={},byte[3]={}",buffer.get(0),
				buffer.get(1),buffer.get(2),buffer.get(3));
		logger.info("byte[4]={},byte[5]={},byte[6]={},byte[7]={}",buffer.get(4),
				buffer.get(5),buffer.get(6),buffer.get(7));
		logger.info("byte[8]={},byte[9]={}",buffer.get(8),buffer.get(9));
		if((buffer.get(0)==-89) && (buffer.get(1)==-72) && (buffer.get(2)==0)
				&& (buffer.get(3)==1)) {
			logger.info("buffer.length={}",buffer.array().length);
			logger.info("{}.check() return true",this.getClass().getSimpleName());
		}
		logger.info("{}.check() return false",this.getClass().getSimpleName());
		return false;
	}
	
	public PackageData generateRealPackageData(IoBuffer buffer) {
		return null;
	}

}
