package com.power.smarttrack.service;

import com.power.smarttrack.model.DeviceName;
import com.power.smarttrack.model.DeviceVariables;
import com.power.smarttrack.model.SmartTrackRequest;
import com.power.smarttrack.model.TTDPowerSupply;

import java.util.List;

public interface Service {
    public boolean insertData(TTDPowerSupply ttdPowerSupplies);
    public DeviceVariables getVoltageData(SmartTrackRequest smartTrackRequest);
    public List<TTDPowerSupply> getDeviceDataWithName(String deviceName);
    public DeviceName getDeviceNames(String deviceName);
}
