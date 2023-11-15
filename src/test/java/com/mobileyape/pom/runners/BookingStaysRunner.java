package com.mobileyape.pom.runners;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/booking/booking_stays.feature",
        glue = {"com.mobileyape.pom.definitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class BookingStaysRunner {
}
