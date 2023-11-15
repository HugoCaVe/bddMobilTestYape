package com.mobileyape.pom.pages;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.mobileyape.pom.utils.AssertionMessages.ERROR_ITEM_NOT_FOUND;
import static com.mobileyape.pom.utils.Constants.*;

public class StaysPage extends PageObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private WebElementFacade btnCloseLogin;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.booking:id/facet_entry_point_item_label' and @text='Stays']")
    private WebElementFacade txtStays;

    @FindBy(xpath = "(//android.widget.ImageView[@resource-id='com.booking:id/facet_search_box_basic_field_icon'])[1]")
    private WebElementFacade txtDestination;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.booking:id/facet_search_box_accommodation_dates']/android.widget.TextView[1]")
    private WebElementFacade txtDate;

    @FindBy(xpath = "//android.widget.TextView[contains(@text, 'room')]")
    private WebElementFacade txtOccupancy;

    @FindBy(xpath = "//android.widget.Button[@resource-id='com.booking:id/facet_search_box_cta']")
    private WebElementFacade btnSearch;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content']")
    private WebElementFacade txtPlace;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.booking:id/facet_disambiguation_content']/android.view.ViewGroup[1]")
    private WebElementFacade txtSelectSite;

    @FindBy(id = "com.booking:id/facet_with_bottom_sheet_header_content")
    private WebElementFacade frmDate;

    @FindBy(id = "com.booking:id/facet_date_picker_confirm")
    private WebElementFacade btnSelectDates;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.booking:id/facet_search_box_accommodation_dates']")
    private WebElementFacade lblSelectDate;

    @FindBy(id = "com.booking:id/group_config_main_configs")
    private WebElementFacade frmConfigs;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.booking:id/facet_search_box_accommodation_occupancy']")
    private WebElementFacade lblOccupancy;

    @FindBy(xpath = "//android.widget.NumberPicker/android.widget.Button[2]")
    private WebElementFacade btnNextAge;

    @FindBy(xpath = "//android.widget.Button[contains(@text, 'OK')]")
    private WebElementFacade btnOk;

    @FindBy(id = "com.booking:id/group_config_apply_button")
    private WebElementFacade btnApply;

    @FindBy(id = "com.booking:id/facet_search_box_cta")
    private WebElementFacade btnSearchStays;

    @FindBy(id = "com.booking:id/results_list_facet")
    private WebElementFacade frmResultList;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    private WebElementFacade imgSecondOption;

    @FindBy(id = "com.booking:id/select_room_cta")
    private WebElementFacade btnSelectRooms;

    @FindBy(id = "com.booking:id/bui_banner_close_button")
    private WebElementFacade btnCloseInformation;

    @FindBy(id = "com.booking:id/recommended_block_reserve_button")
    private WebElementFacade btnReserve;

    @FindBy(xpath = " //javaClass[@resource-id='com.booking:id/bstage1_contact_firstname_value']/android.widget.EditText")
    private WebElementFacade txtFirstName;

    @FindBy(xpath = "//javaClass[@resource-id='com.booking:id/bstage1_contact_lastname_value']/android.widget.EditText")
    private WebElementFacade txtLastName;

    @FindBy(xpath = "//javaClass[@resource-id='com.booking:id/bstage1_contact_email_value']/android.widget.EditText")
    private WebElementFacade txtEmail;

    @FindBy(xpath = "//javaClass[@resource-id='com.booking:id/bstage1_contact_address_value']/android.widget.EditText")
    private WebElementFacade txtAddress;

    @FindBy(xpath = "//javaClass[@resource-id='com.booking:id/bstage1_contact_zipcode_value']/android.widget.EditText")
    private WebElementFacade txtZipCode;

    @FindBy(xpath = "//javaClass[@resource-id='com.booking:id/bstage1_contact_city_value']/android.widget.EditText")
    private WebElementFacade txtCity;

    @FindBy(xpath = "//javaClass[@resource-id='com.booking:id/bstage1_contact_country_value']/android.widget.EditText")
    private WebElementFacade txtCountry;

    @FindBy(xpath = "//javaClass[@resource-id='com.booking:id/bstage1_contact_telephone_value']/android.widget.EditText")
    private WebElementFacade txtTelephone;

    @FindBy(xpath = "//android.widget.RadioButton[@resource-id='com.booking:id/business_purpose_leisure']")
    private WebElementFacade rdbTypeTripLeisure;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.booking:id/informative_cta_view_price_container']//android.widget.TextView[@resource-id='com.booking:id/title']")
    private WebElementFacade lblTotal;

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.booking:id/informative_cta_view_price_container']//android.widget.TextView[@resource-id='com.booking:id/subtitle']")
    private WebElementFacade lblTaxesAndCharges;

    @FindBy(id = "com.booking:id/action_image_button")
    private WebElementFacade btnAddMissing;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='com.booking:id/bp_price_summary_prices_flex']/android.widget.TextView")
    private WebElementFacade lblTotalFinal;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.booking:id/bp_price_summary_taxes_and_charges']")
    private WebElementFacade lblTaxesAndChargesFinal;

    @FindBy(id = "com.booking:id/new_credit_card_number_edit")
    private WebElementFacade txtCardNumber;

    @FindBy(id = "com.booking:id/new_credit_card_expiry_date_edit")
    private WebElementFacade txtExpiryDate;

    @FindBy(id = "com.booking:id/action_button")
    private WebElementFacade btnFinalStep;

    @FindBy(id = "com.booking:id/name")
    private WebElementFacade lblFinalName;

    @FindBy(id = "com.booking:id/email")
    private WebElementFacade lblFinalEmail;

    @FindBy(id = "com.booking:id/phone")
    private WebElementFacade lblFinalPhoneNumber;

    public StaysPage() {
        super();
    }

    public void closeLogin() {
        btnCloseLogin.click();
    }

    public void selectStays() {
        txtStays.click();
    }

    public void selectDestination() {
        txtDestination.click();
    }

    public void writeDestination(String destination) {
        txtPlace.sendKeys(destination);
    }

    public void selectPlaceOption() {
        txtSelectSite.waitUntilVisible().click();
    }

    public boolean validateDateForm() {
        return frmDate.waitUntilVisible().isDisplayed();
    }

    public void selectOccupancy() {
        lblOccupancy.click();
    }

    public void selectDates() {
        lblSelectDate.click();
    }

    public void selectApplyDates() {
        btnSelectDates.click();
    }

    public void selectApplyConfigurations() {
        btnApply.click();
    }

    public void searchStays() {
           btnSearchStays.waitUntilClickable().click();
    }

    public boolean validateResultList() {
         return frmResultList.isDisplayed();
    }

    public void selectSecondOptionResult() {
        imgSecondOption.click();
    }

    public void selectRooms() {
        btnSelectRooms.click();
    }

    public void makeReserve() {
        btnReserve.click();
    }

    public void writeFirstName(String firstName) {
        txtFirstName.sendKeys(firstName);
    }

    public void writeLastName(String lastName) {
        txtLastName.sendKeys(lastName);
    }

    public void writeEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void writeAddress(String address) {
        txtAddress.sendKeys(address);
    }

    public void writeZipCode(String zipCode) {
        txtZipCode.sendKeys(zipCode);
    }

    public void writeCity(String city) {
        txtCity.sendKeys(city);
    }

    public void writeCountry(String country) {
        txtCountry.clear();
        txtCountry.sendKeys(country);
    }

    public void writeMobilePhone(String phone) {
        txtTelephone.sendKeys(phone);
    }

    public void selectTypeTrip(String type) {
        rdbTypeTripLeisure.click();
    }

    public void nextStep() {
        btnAddMissing.click();
    }

    public String getTheTotalOfTheReserve() {
        return lblTotal.getText();
    }

    public String getTaxesAndCharges() {
        return lblTaxesAndCharges.getText();
    }

    public void writeCardNumberCredit(String cardNumber) {
        txtCardNumber.sendKeys(cardNumber);
    }

    public void writeExpiryDate(String expiryDate) {
        txtExpiryDate.sendKeys(expiryDate);
    }

    public void selectFinalStep() {
        btnFinalStep.click();
    }

    public String getFinalName() {
        return lblFinalName.getText();
    }

    public String getFinalEmail() {
        return lblFinalEmail.getText();
    }

    public String getFinalPhone() {
        return lblFinalPhoneNumber.getText();
    }

    public void discardAdditionalInformation() {
        try {
         if(btnCloseInformation.isDisplayed()){
            btnCloseInformation.click();
         }
         } catch (Exception e) {
            LOGGER.error(ERROR_ITEM_NOT_FOUND.getValue() + e);
         } finally {
            resetImplicitTimeout();
         }
    }

    public void selectAgeOfChild(String age) {
        String ageInformation;
        if(age.equals(ONE_YEAR.getValue())){
            ageInformation = age + YEAR_OLD.getValue();
        } else {
            ageInformation = age + YEARS_OLD.getValue();
        }
        boolean assessAge = false;
        while(!assessAge) {
            WebElement ageNumber = getDriver()
                    .findElement(
                            By.id("android:id/numberpicker_input"));
            if (ageNumber.getText().equals(ageInformation)) {
                btnOk.click();
                assessAge = true;
            } else {
                btnNextAge.click();
            }
        }
    }

    public void addRoomsAdults(String data, String option) {
        boolean sameRooms = false;
        while(!sameRooms) {
            if (!data.equals(returnInformationOfConfiguration(option))) {
                getDriver()
                        .findElement(
                                By.xpath("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_" + option + "_count']/android.widget.LinearLayout/android.widget.Button[@resource-id='com.booking:id/bui_input_stepper_add_button']")).click();
            } else {
                sameRooms = true;
            }
        }
    }

    public void addRoomsChildren(String data, String option, String numAgeChild) {
            for(int i = 1; i <= Integer.parseInt(data); i++){
            getDriver()
                    .findElement(
                            By.xpath("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_" + option + "_count']/android.widget.LinearLayout/android.widget.Button[@resource-id='com.booking:id/bui_input_stepper_add_button']")).click();
            selectAgeOfChild(numAgeChild);
            }
    }

    public void selectDateStay(String date) {
        try {
            getDriver()
                    .findElement(
                            By.xpath(
                                    "//android.view.View[@content-desc='" + date + "']"))
                    .click();
        } catch (Exception e) {
                LOGGER.error(ERROR_ITEM_NOT_FOUND.getValue(), e);
        } finally {
            resetImplicitTimeout();
        }
    }

    public String returnInformationOfConfiguration(String complementInformation) {
         return getDriver()
                    .findElement(
                            By.xpath(
                                    "//android.view.ViewGroup[@resource-id='com.booking:id/group_config_" + complementInformation + "_count']/android.widget.LinearLayout/android.widget.TextView"))
                    .getText();
    }

    public void scrollTextElement(String text) {
        try {
            getDriver()
                    .findElement(
                            MobileBy.AndroidUIAutomator(
                                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView("
                                            + "new UiSelector().text(\""
                                            + text
                                            + "\"));"));
        } catch (Exception e) {
            LOGGER.error(ERROR_ITEM_NOT_FOUND.getValue() + e);
        }
    }
}