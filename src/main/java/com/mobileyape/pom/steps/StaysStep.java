package com.mobileyape.pom.steps;

import com.mobileyape.pom.pages.StaysPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;

import static com.mobileyape.pom.utils.AssertionMessages.*;
import static com.mobileyape.pom.utils.Constants.*;
import static com.mobileyape.pom.utils.SessionVariables.*;
import static net.serenitybdd.core.Serenity.sessionVariableCalled;
import static org.hamcrest.MatcherAssert.assertThat;

public class StaysStep extends ScenarioSteps {

    @Page
    StaysPage staysPage;

    @Step
    public void selectLogout() {
        staysPage.closeLogin();
    }
    @Step
    public void selectTheStaysOption() {
        staysPage.selectStays();
    }

    @Step
    public void selectDestination(String destination) {
        staysPage.selectDestination();
        staysPage.writeDestination(destination);
        staysPage.selectPlaceOption();
    }

    @Step
    public void selectDates() {
        if( !staysPage.validateDateForm()){
            staysPage.selectDates();
        }
    }

    @Step
    public void selectOccupancy() {
        staysPage.selectOccupancy();
    }

    public void selectInitialDates(String day, String month, String year) {
        String dateInitial = (day + BLANK_SPACE.getValue() + month + BLANK_SPACE.getValue() + year);
        staysPage.selectDateStay(dateInitial);
        staysPage.selectApplyDates();
    }

    public void selectEndDates(String day, String month, String year) {
        String dateEnd = (day + BLANK_SPACE.getValue() + month + BLANK_SPACE.getValue() + year);
        staysPage.selectDateStay(dateEnd);
        staysPage.selectApplyDates();
    }

    public void selectBookingConfiguration(String numRooms, String numAdults, String numChild, String numAgeChild) {
        staysPage.addRoomsAdults(numRooms,ROOMS.getValue());
        staysPage.addRoomsAdults(numAdults,ADULTS.getValue());
        staysPage.addRoomsChildren(numChild,CHILDREN.getValue(),numAgeChild);
        staysPage.selectApplyConfigurations();
    }

    @Step
    public void searchOptions() {
        staysPage.searchStays();
    }

    public void validateDestination() {
        assertThat(
                ERROR_MAIN_PAGE_NOT_FOUND.getValue(), staysPage.validateResultList());
    }

    @Step
    public void selectSecondHousingOption() {
        staysPage.discardAdditionalInformation();
        staysPage.selectSecondOptionResult();
        staysPage.selectRooms();
    }

    @Step
    public void makeReserve() {
        staysPage.makeReserve();
    }

    public void enterTheMainUserInformation(String firstName, String lastName, String email, String phoneNumber) {
       staysPage.writeFirstName(firstName);
       staysPage.writeLastName(lastName);
       staysPage.writeEmail(email);
       staysPage.scrollTextElement(MOBILE_PHONE.getValue());
       staysPage.writeMobilePhone(phoneNumber);
        Serenity.setSessionVariable(USER_NAME.getValue()).to(firstName);
        Serenity.setSessionVariable(LAST_NAME.getValue()).to(lastName);
        Serenity.setSessionVariable(EMAIL.getValue()).to(email);
        Serenity.setSessionVariable(PHONE.getValue()).to(phoneNumber);
    }

    public void enterTheUsersLocationInformation(String address, String zipCode, String city, String country) {
        staysPage.writeAddress(address);
        staysPage.writeZipCode(zipCode);
        staysPage.writeCity(city);
        staysPage.writeCountry(country);
        Serenity.setSessionVariable(TEMPORAL_TOTAL.getValue()).to(staysPage.getTheTotalOfTheReserve());
        Serenity.setSessionVariable(TEMPORAL_TAXES_AND_CHARGES_TOTAL.getValue()).to(staysPage.getTaxesAndCharges());
    }

    public void selectTypeOfTrip(String reason) {
        staysPage.selectTypeTrip(reason);
        staysPage.nextStep();
    }

    public void selectFinalStep() {
        staysPage.selectFinalStep();
    }

    @Step
    public void validationOfReservationData() {
        staysPage.scrollTextElement(TOTAL.getValue());
        String completeName = sessionVariableCalled(USER_NAME.getValue()) + BLANK_SPACE.getValue() + sessionVariableCalled(LAST_NAME.getValue());
        MatcherAssert.assertThat(
                ERROR_DATA_RESERVATION_NOT_FOUND.getValue()
                        + EXPECTED_MESSAGE.getValue()
                        + completeName
                        + MESSAGE_SHOWN.getValue()
                        + staysPage.getFinalName(),
                (completeName).equals(staysPage.getFinalName()));
        String email = sessionVariableCalled(EMAIL.getValue());
        MatcherAssert.assertThat(
                ERROR_DATA_RESERVATION_NOT_FOUND.getValue()
                        + EXPECTED_MESSAGE.getValue()
                        + email
                        + MESSAGE_SHOWN.getValue()
                        + staysPage.getFinalEmail(),
                (email).equals(staysPage.getFinalEmail()));
        String phone = sessionVariableCalled(PHONE.getValue());
        MatcherAssert.assertThat(
                ERROR_DATA_RESERVATION_NOT_FOUND.getValue()
                        + EXPECTED_MESSAGE.getValue()
                        + phone
                        + MESSAGE_SHOWN.getValue()
                        + staysPage.getFinalPhone(),
                (phone).equals(staysPage.getFinalPhone()));
    }

    @Step
    public void validateTotalBookingInformation() {
        String temporalTotal = sessionVariableCalled(TEMPORAL_TOTAL.getValue());
        String finalTotal = staysPage.getTheTotalOfTheReserve();
           MatcherAssert.assertThat(
                ERROR_TOTAL_RESERVE_DOES_NOT_MATCH.getValue()
                   + EXPECTED_MESSAGE.getValue()
                           + temporalTotal
                           + MESSAGE_SHOWN.getValue()
                           + finalTotal,
                (temporalTotal).equals(finalTotal));
    }

    @Step
    public void validateTaxesAndChargesInformation() {
        String temporalTaxesTotal = sessionVariableCalled(TEMPORAL_TAXES_AND_CHARGES_TOTAL.getValue());
        String finalTaxesTotal = staysPage.getTaxesAndCharges();
        MatcherAssert.assertThat(
                ERROR_TOTAL_RESERVE_DOES_NOT_MATCH.getValue()
                        + EXPECTED_MESSAGE.getValue()
                        + temporalTaxesTotal
                        + MESSAGE_SHOWN.getValue()
                        + finalTaxesTotal,
                (temporalTaxesTotal).equals(finalTaxesTotal));
    }

    public void enterPaymentInformation(String cardNUmber,String expiryDate) {
        staysPage.writeCardNumberCredit(cardNUmber);
        staysPage.writeExpiryDate(expiryDate);
    }
}
