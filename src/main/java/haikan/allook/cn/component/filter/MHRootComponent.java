package haikan.allook.cn.component.filter;

import org.apache.mina.core.buffer.IoBuffer;

import haikan.allook.cn.sportpackage.PackageData;
/**
 * 业务树解码器的根类
 * 无实际功能，主要作为解码器的根，具体功能由其子类去实现
 * @author pengyu
 *
 */
public class MHRootComponent extends PacketFilterComponent {

	@Override
	public PackageData generateRealPackageData(IoBuffer buffer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean check(IoBuffer buffer) {
		// TODO Auto-generated method stub
		return false;
	}

}
