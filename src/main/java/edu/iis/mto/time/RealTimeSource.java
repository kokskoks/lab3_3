package edu.iis.mto.time;

public class RealTimeSource implements TimeSource{

	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis();
	}
	
}
