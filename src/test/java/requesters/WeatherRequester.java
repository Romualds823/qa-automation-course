package requesters;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import model.WeatherResponse;
import org.springframework.web.client.RestTemplate;

public class WeatherRequester {
    //https://archive-api.open-meteo.com/v1/archive?latitude=52.52&longitude=13.41&start_date=2024-04-01&end_date=2024-04-01&hourly=temperature_2m


    public WeatherResponse requestHistoricalData(double lat, double lon, String dateFrom, String dateTo) throws JsonProcessingException {
        String url = "https://archive-api.open-meteo.com/v1/archive?latitude=" + lat
                + "&longitude=" + lon + "&start_date=" + dateFrom + "&end_date=" + dateTo + "&hourly=temperature_2m";

        RestTemplate restTemplate = new RestTemplate();
        String json = restTemplate.getForEntity(url,String.class).getBody();

        ObjectMapper mapper = new ObjectMapper();
        return  mapper.readValue(json, WeatherResponse.class);

    }

}
