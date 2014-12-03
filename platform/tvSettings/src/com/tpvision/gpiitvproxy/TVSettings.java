package com.tpvision.gpiitvproxy;

import org.meshpoint.anode.bridge.Env;
import org.meshpoint.anode.java.Base;


public abstract class TVSettings extends Base{
	

	private static short classId = Env.getInterfaceId(TVSettings.class);
	public TVSettings() { super(classId); }

	public abstract String get(String settingType, String setting);
	public abstract Boolean set(String settingType, String setting, String value);

	
}
