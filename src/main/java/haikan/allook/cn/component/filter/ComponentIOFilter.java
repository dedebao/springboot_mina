package haikan.allook.cn.component.filter;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.session.IoSession;

import haikan.allook.cn.sportpackage.PackageData;
/**
 * 自定义过滤器，重写mina的ioFilter核心方法messageReceived,将我们组装的解码器注入，
 * 调用自定义解码器完成数据的解析以及将数据包传递到下一个ioFilter
 * @author pengyu
 *
 */
public class ComponentIOFilter extends IoFilterAdapter {
	public Component component;

	public ComponentIOFilter(Component component) {
		super();
		this.component = component;
	}

	public ComponentIOFilter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 数据接收转换核心
	 * 1.调用接口component实现字节流转为java对象
	 * 2.递归调用messageReceived,处理下一个设备
	 */
	public void messageReceived(NextFilter nextFilter, IoSession session,
	            Object message) throws Exception {
		 
		packageHandle(nextFilter,session,message);
	}
	
	private void packageHandle(NextFilter nextFilter,IoSession session,
			Object message) {
		PackageData data=null;
		/**
		 * 判断message是字节流还是java对象PackageData
		 * 如登录包被解析后，message换为LoginPacket,这个时候进入if(data==null)
		 * 此时的nextFilter是unitABPComponent,但是没有内容结束程序
		 */
		if(message instanceof IoBuffer) {
			IoBuffer ioBuffer=(IoBuffer)message;
			ioBuffer.setAutoExpand(true);
			data=component.getDataFromBuffer(ioBuffer);
		}
		String appType=(String)session.getAttribute("appType");
		if(data==null) {
			/**
			 * Filter就是unitASportsComponent和unitABPComponent,因为
			 * unitABPComponent的nextfilter=null,结束程序
			 * 登录包过来后，IoFilterAdapter的messageReceived方法，执行
			 * nextFilter.messageReceived(session,data)之后，递归进入
			 * packageHandle
			 */
			nextFilter.messageReceived(session, message);
		}else {
			nextFilter.messageReceived(session, data);
		}
	}
}
