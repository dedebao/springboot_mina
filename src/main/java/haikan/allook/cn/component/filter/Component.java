package haikan.allook.cn.component.filter;

import org.apache.mina.core.buffer.IoBuffer;

import haikan.allook.cn.sportpackage.PackageData;

/**
 * 解码器接口，主要完成解码器的定义，包括添加子解码器、移除子解码器和解析数据包
 * @author pengyu
 *
 */
public interface Component {
	
	//添加子解码器
	public void add(Component t);
	
	//移除子解码器
	public void remove(Component t);
	
	//解析数据包
	public PackageData getDataFromBuffer(IoBuffer buffer);
	
	//从IOBuffer中解析数据包
	public PackageData generateRealPackageData(IoBuffer buffer);

}
