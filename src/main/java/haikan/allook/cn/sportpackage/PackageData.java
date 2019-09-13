package haikan.allook.cn.sportpackage;

import com.alibaba.fastjson.JSON;

import lombok.Data;

@Data
public abstract class PackageData {
	
	protected String name;
	protected String type;
	protected String deviceID;
	protected String patientID;
	protected String company;
	protected String password;
	protected String appType;
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
	

}
