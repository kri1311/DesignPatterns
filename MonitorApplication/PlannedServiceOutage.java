package com.monitor.service;

import java.time.LocalTime;

public class PlannedServiceOutage {

	private final LocalTime startTime;
	private final LocalTime endTime;

	public PlannedServiceOutage(LocalTime startTime, LocalTime endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

}
