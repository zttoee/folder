package com.salesforce;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	public TV() {
		this(7,20,false);
	}
	
	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean on) {
		this.power = on;
	}
	
	public void channel(int channel) {
		if(channel > 0 && channel < 256 ) {
			this.channel = channel;
		}
	}
	
	public void channel(boolean up) {
		if(up) {
			if(this.channel < 255) {
				this.channel++;
			}
		}else {
			if(this.channel > 1) {
				this.channel--;
			}
		}
	}
	
	public void volume(int volume) {
		if(volume >= 0 && volume <= 100 ) {
			this.volume = volume;
		}
	}
	
	public void volume(boolean up) {
		if(up) {
			if(this.volume < 100) {
				this.volume++;
			}
		}else {
			if(this.volume > 0) {
				this.volume--;
			}
		}
	}
	
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
	public void status() {
		System.out.println(this);
		
	}
	
	
	
	
	
	
}
