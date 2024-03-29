package telran.games.dto;
//IlyaL

import java.time.LocalTime;
import java.util.ArrayList;

import telran.games.Runner;

public class Race {
 
	private int distance;
	private int minSleep;
	private int maxSleep;
	private int winner = -1;
	private LocalTime startTime;
	private static ArrayList<Runner> runners = new ArrayList<>();
	 
	public Race() {
	}
	
	public void setParams(int distance, int minSleep, int maxSleep) {
		this.distance = distance;
		this.minSleep = minSleep;
		this.maxSleep = maxSleep;
	}
	public int getWinner() {
		return winner;
	}
	public void setWinner(int winner) {
		if (this.winner == -1) {
			this.winner = winner;
		}
	}
	public int getDistance() {
		return distance;
	}
	public int getMinSleep() {
		return minSleep;
	}
	public int getMaxSleep() {
		return maxSleep;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime() {
		if(startTime==null) {
			startTime = LocalTime.now();
		}
	}
	public static ArrayList<Runner> getRunners() {
		return runners;
	}
}
