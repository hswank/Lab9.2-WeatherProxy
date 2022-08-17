package grandcircus.weatherProxy.Model;

public class Properties {
	private String forecast;

	public Properties(String forecast) {
		this.forecast = forecast;
	}

	public Properties() {
	}

	public String getForecast() {
		return forecast;
	}

	public void setForecast(String forecast) {
		this.forecast = forecast;
	}
	
}
