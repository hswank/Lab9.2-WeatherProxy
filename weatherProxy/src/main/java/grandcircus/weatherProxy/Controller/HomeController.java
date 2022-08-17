package grandcircus.weatherProxy.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import grandcircus.weatherProxy.Model.Period;
import grandcircus.weatherProxy.Service.ForecastService;

@RestController
public class HomeController {
	@Autowired
	private ForecastService service;
	
	@GetMapping("/forecast")
	public List<Period> getPeriodForecast(@RequestParam double lat, @RequestParam double lon) {
		return service.getPeriodForecasts(lat, lon);	
	}
}
