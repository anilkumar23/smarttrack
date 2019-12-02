package com.power.smarttrack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.power.smarttrack.model.TTDPowerSupply;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartTrackRepository extends JpaRepository<TTDPowerSupply, String>{
	public List<TTDPowerSupply> findBytStampContainsAndDeviceNameContaining(String tStamp, String deviceName);
    public TTDPowerSupply findByDeviceNameContaining(String subStation);
}
