package haikan.allook.cn.sportpackage;

import lombok.Data;

/**
 * 终端运动数据包3号包
 * @author pengyu
 *
 */
@Data
public class No8ThreeWayPacket extends PackageData {
	
	private Integer battery;
	
	private Integer height;
	
	private Integer stride;
	
	private Long kcal;
	
	private Long step;
	
	private Long distance;
	
	private Integer level1;
	
	private Integer level2;
	
	private Integer level3;
	
	private Integer level4;
	
	private Integer tran_type;
	
	private Long effective_step;
	
	private String stepdate;
	
	private String firmware_version;
	
	private String prefix;
	
	private String locationInfoStr;

	public No8ThreeWayPacket() {
		this.name="sports";
		this.type="No8-3";
	}
	
	

}
