package grandcircus.weatherProxy.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import grandcircus.weatherProxy.Model.ForecastResponse;
import grandcircus.weatherProxy.Model.GridResponse;
import grandcircus.weatherProxy.Model.Period;

@Service
public class ForecastService {
	private RestTemplate restTemplate = new RestTemplate();
	
	public List<Period> getPeriodForecasts(double lat, double lon) {
		String url = "https://api.weather.gov/points/" + lat + "," + lon;
		
		GridResponse gridResponse = restTemplate.getForObject(url, GridResponse.class);
		
		String forecastURL = gridResponse.getProperties().getForecast();
		ForecastResponse forecastResponse = restTemplate.getForObject(forecastURL, ForecastResponse.class);
		return forecastResponse.getPeriods();
	}
}
