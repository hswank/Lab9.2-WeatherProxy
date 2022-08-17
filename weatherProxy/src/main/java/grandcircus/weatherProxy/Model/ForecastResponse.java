package grandcircus.weatherProxy.Model;

import java.util.List;

public class ForecastResponse {
	private List<Period> periods;

	public List<Period> getPeriods() {
		return periods;
	}

	public void setPeriods(List<Period> periods) {
		this.periods = periods;
	}

	public ForecastResponse(List<Period> periods) {
		this.periods = periods;
	}

	public ForecastResponse() {
	}
}
