package com.tpvision.gpiitvproxy;


import android.content.Context;
import android.util.Log;
import android.content.Intent;

import org.meshpoint.anode.module.IModule;
import org.meshpoint.anode.module.IModuleContext;
import org.meshpoint.anode.AndroidContext;

public class TVSettingsImpl extends TVSettings implements IModule {

	private static final String TAG = "GPII js";
	private Context mContext;
	
	public Object startModule(IModuleContext ctx){
		try{
			mContext = ((AndroidContext)ctx).getAndroidContext();	
		}catch(Exception ex){
			Log.e(TAG, "startModule" + ex.getMessage());
		}
		return this;
	}
	
	@Override
	public String get(String settingType, String setting) {
		Log.i(TAG , "got a get request for " + setting + " with type " + settingType);
		String reply = "not implemented";
		return reply;
	}

	@Override
	public Boolean set(String settingType, String setting, String value) {
		Log.i(TAG , "got a set request for " + setting + " with type " + settingType + " and value " + value);
		Intent i = new Intent("com.tpvision.gpiitvproxy.CHANGE_SETTING");
		i.putExtra("setting", setting);
		i.putExtra("value", value);		
		mContext.sendBroadcast(i);
		return true;
	}

	@Override
	public void stopModule() {
		Log.e("GPII js", "stopModule");		
	}

}
