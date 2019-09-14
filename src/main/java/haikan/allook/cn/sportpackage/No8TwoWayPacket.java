package haikan.allook.cn.sportpackage;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * 终端运动数据2号包
 * @author pengyu
 *
 */
@Data
public class No8TwoWayPacket extends PackageData {
	
	private List<String> stepcount2data=new ArrayList<>();
	
	private List<String> stepdate=new ArrayList<>();
	
	//根据1分钟数据计算出的有效步数包
	private List<String> stepEffective=new ArrayList<>();

	public No8TwoWayPacket() {
		this.name="sports";
		this.type="No8-2";
	}
	
	
}
