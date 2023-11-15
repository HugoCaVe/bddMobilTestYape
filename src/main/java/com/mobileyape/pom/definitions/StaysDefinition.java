package com.mobileyape.pom.definitions;

import com.mobileyape.pom.steps.StaysStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class StaysDefinition {

    @Steps
    StaysStep staysStep;

    @Dado("que el usuario ingresa sin autenticarse en la aplicación")
    public void loginWithoutAuthentication() {
        staysStep.selectLogout();
    }
    @Dado("que el usuario ingresa la información del destino: (.*)$")
    public void enterDestination(String destination) {
        staysStep.selectTheStaysOption();
        staysStep.selectDestination(destination);
    }

    @Dado("que ingresa la fecha de llegada: Dia (.*) Mes (.*) Año (.*)$")
    public void enterStartDateInformation(String dayStart, String monthStart, String ageStart) {
        staysStep.selectDates();
        staysStep.selectInitialDates(dayStart, monthStart, ageStart);
    }

    @Dado("que ingresa la fecha de retorno: Dia (.*) Mes (.*) Año (.*)$")
    public void enterEndDateInformation(String dayEnd, String monthEnd, String ageEnd) {
        staysStep.selectEndDates(dayEnd, monthEnd, ageEnd);
    }

    @Dado("que ingresa ingresa el número de habitaciones (.*), el número de adultos (.*) y el número de niños (.*), con una edad de (.*) años$")
    public void enterAdditionalInformation(String rooms, String numberAdults, String numberChildren, String ageChild) {
        staysStep.selectOccupancy();
        staysStep.selectBookingConfiguration(rooms, numberAdults, numberChildren, ageChild);
    }

    @Cuando("el usuario realiza la búsqueda con los parametros ingresos")
    public void searchDestinationInformation() {
        staysStep.searchOptions();
    }

    @Cuando("selecciona la segunda opción de alojamiento")
    public void selectTheSecondOption() {
        staysStep.selectSecondHousingOption();
    }

    @Cuando("se realiza la reserva de la primera opción de acomodación sugerida")
    public void selectMakeReserve() {
        staysStep.makeReserve();
    }

    @Cuando("se ingresa la información del cliente: Nombres (.*), Apellidos (.*), Email (.*) y Número telefónico (.*)$")
    public void enterUserInformation(String name, String lastName,String email, String phoneNumber) {
        staysStep.enterTheMainUserInformation(name,lastName,email,phoneNumber);
    }

    @Cuando("se ingresa la información de la ubicación: Dirección (.*), Código postal (.*), Ciudad de residencia (.*) y país (.*)$")
    public void enterLocationUserInformation(String address, String zipCode,String city, String country) {
        staysStep.enterTheUsersLocationInformation(address,zipCode,city,country);
    }

    @Cuando("se ingresa el motivo principal del viaje: (.*)$")
    public void enterReasonForTheTrip(String reason) {
        staysStep.selectTypeOfTrip(reason);
        staysStep.selectFinalStep();
    }

    @Cuando("se ingresa los datos para el pago de la reserva: Número de la tarjeta (.*) y la fecha de expiración: (.*)$")
    public void enterReasonForTheTrip(String cardNumber, String expirationDate ) {
        staysStep.enterPaymentInformation(cardNumber,expirationDate);
    }

    @Entonces("se muestra la información y la disponibilidad del destino")
    public void destinationValidationAvailable() {
        staysStep.validateDestination();
    }

    @Entonces("se completa la información de la reserva")
    public void reservationCompleted() {
        staysStep.validationOfReservationData();
        staysStep.validateTotalBookingInformation();
        staysStep.validateTaxesAndChargesInformation();
    }
}