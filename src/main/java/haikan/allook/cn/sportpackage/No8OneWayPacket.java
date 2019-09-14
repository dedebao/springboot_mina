package haikan.allook.cn.sportpackage;

import lombok.Data;

/**
 * 运动数据包1号包
 * @author pengyu
 *
 */
@Data
public class No8OneWayPacket {
	
	//电量
	private Integer battery;
	
	//体重
	private Integer weight;
	
	//步幅
	private Integer stride;
	
	//卡路里
	private Long kcal;
	
	//总步数
	private Long step;
	
	//距离
	private Long distance;
	
	//终端运动等级level1
	private Integer level1;
	
	//终端运动等级level2
	private Integer level2;
	
	//终端运动等级level3
	private Integer level3;
	
	//终端运动等级level4
	private Integer level4;
	
	//自动发送0,手动发送1
	private Integer tran_type;
	
	//有效步数
	private Long effective_step;
	
	//数据真实时间
	private String stepdate;
	
	//固件版本
	private String firmware_version;
	
	//设备前缀
	private String prefix;
	

}
