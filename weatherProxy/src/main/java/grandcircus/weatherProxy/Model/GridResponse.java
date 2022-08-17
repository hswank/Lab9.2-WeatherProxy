package grandcircus.weatherProxy.Model;

public class GridResponse {
	private Properties properties;

	public GridResponse(Properties properties) {
		super();
		this.properties = properties;
	}
	
	public GridResponse() {
		
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
}
