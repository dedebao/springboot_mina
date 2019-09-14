package haikan.allook.cn.component.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.mina.core.buffer.IoBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import haikan.allook.cn.sportpackage.PackageData;

/**
 * 解码器的抽象分类
 * 实现接口定义方法，供子类直接调用，利用组合迭代设计模式完成iobuffer字节数据到数据包javaBean的转换
 * @author pengyu
 *
 */
public abstract class PacketFilterComponent implements Component {
	
	public static Logger logger=LoggerFactory.getLogger(PacketFilterComponent.class);
	
	public List<Component> list=new ArrayList<>();
	
	public void add(Component t) {
		this.list.add(t);
	}
	
	public void remove(Component t) {
		this.list.remove(t);
	}
	
	//解析iobuffer中的数据，看是否符合要求
	public abstract boolean check(IoBuffer buffer);
	
	//迭代模式:叠加递归算法进行编码
	public PackageData getDataFromBuffer(IoBuffer buffer) {
		return createTreeData(buffer);
	}
	
	private PackageData createTreeData(IoBuffer buffer) {
		
		//没有子节点，该节点为叶子节点，直接生成data
		if(list.size()==0) {
			return generateRealPackageData(buffer);
		}
		
		//非叶子节点，调用叶子节点的方法生成data
		Iterator<Component> iterator=list.iterator();
		while(iterator.hasNext()) {
			PacketFilterComponent filter=(PacketFilterComponent)iterator.next();
			if(filter.check(buffer)) {
				return filter.getDataFromBuffer(buffer);
			}
		}
		return null;
	}
	
	public List<Component> getList(){
		return list;
	}
	
	public void setList(List<Component> list) {
		this.list=list;
	}
	
	

}
