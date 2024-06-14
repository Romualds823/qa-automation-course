package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.HourlyUnits;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherStepDefs {
    private Double lat;
    private Double lon;
    private WeatherResponse response;


    @Given("coordinates:")
    public void set_coordinates(Map<String, Double> parms) {
        lat = parms.get("latitude");
        lon = parms.get("longitude");
    }

    @When("we are requesting historical data from {string} to {string}")
    public void request_historical_weather(String dateFrom, String dateTo) throws JsonProcessingException {
        WeatherRequester requester = new WeatherRequester();
        response = requester.requestHistoricalData(lat, lon, dateFrom, dateTo);
    }

    @Then("timezone is set as {string}")
    public void timezone_check(String timezone) {
        assertEquals(timezone, response.getTimezone(), "Wrong timezone!");
    }

    @Then("elevation is {int}")
    public void elevation_check(int elevation) {
        assertEquals(elevation, response.getElevation(), "Wrong elevation!");
    }

    @Then("hourly units are:")
    public void hourly_units_check(Map<String, String> params) {
        assertEquals(params.get("time"), response.getHourlyUnits().getTime());
        assertEquals(params.get("temperature_2m"), response.getHourlyUnits().getTemperature2m());
    }

    @Then("hourly list is:")
    public void hourly_list_check(List<String> hourly) {
        for (int i = 0; i < hourly.size(); i++) {
            assertEquals(hourly.get(i), response.getHourly().getTimes().get(i), "Incorrect hourly time for element Nr." + i);
        }

    }

    @Then("2m temperatures are:")
    public void temp_2m_check(List<Double> temps) {
        for (int i = 0; i < temps.size(); i++) {
            assertEquals(temps.get(i), response.getHourly().getTemperature2m().get(i), "Incorrect temp for Nr. " + i);
        }


    }

}




