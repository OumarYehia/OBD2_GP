package com.obdgp.Services;


import java.util.List;

import com.obdgp.Daos.DeviceDao;
import com.obdgp.Models.Device;

public class DeviceService {
DeviceDao deviceDB = new DeviceDao();
public List<Device> getDevices(){
	return deviceDB.getDevices();
}
}
