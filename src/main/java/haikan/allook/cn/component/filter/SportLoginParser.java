package haikan.allook.cn.component.filter;

import org.apache.mina.core.buffer.IoBuffer;
import org.springframework.stereotype.Component;

import haikan.allook.cn.sportpackage.LoginPacket;
import haikan.allook.cn.sportpackage.PackageData;

/**
 * 检查登陆数据包头信息，将登录字节解析为登陆数据包对象
 * @author haikan
 *
 */
@Component
public class SportLoginParser extends UnitASportComponent {
	
	public boolean check(IoBuffer buffer) {
		if(buffer.get(8)==1 && buffer.get(9)==-128) {
			return true;
		}
		return false;
	} 
	
	public PackageData generateRealPackageData(IoBuffer buffer) {
		logger.info("{}.generateRealPackageData() begin...",this.getClass().getSimpleName());
		LoginPacket data=new LoginPacket();
		
	}
}
