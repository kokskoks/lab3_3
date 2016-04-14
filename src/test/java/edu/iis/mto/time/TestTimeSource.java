package edu.iis.mto.time;

public class TestTimeSource implements TimeSource {

	public static final long HOURS_25_IN_MILIS = 25*60*60*1000; 
	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis() + HOURS_25_IN_MILIS;
	}

}
