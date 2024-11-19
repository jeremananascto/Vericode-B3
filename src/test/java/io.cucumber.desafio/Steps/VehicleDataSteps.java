package io.cucumber.desafio.Steps;

import io.cucumber.desafio.Pages.VehicleDataPage;
import io.cucumber.desafio.Servicos.Configuracao;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;

public class VehicleDataSteps extends Configuracao{

    @Quando("estou no site SampleApp Tricentis")
    public void estou_no_site_sampleApp_tricentis() {
        Configuracao.open("http://sampleapp.tricentis.com/101/app.php");
    }

    @Quando("seleciono as opcoes da aba Enter Vehicle Data")
    public void seleciono_as_opcoes_da_aba_enter_vehicle_data() throws InterruptedException {
        VehicleDataPage.dropdownMake(browser).click();
        VehicleDataPage.dropdownModel(browser).click();
        VehicleDataPage.botaoCalendario(browser).click();
        Thread.sleep(2000);
        VehicleDataPage.dataCalendario(browser).click();
        VehicleDataPage.opcoesSeats(browser).click();
        WebElement element = VehicleDataPage.rightHandDrive(browser);
        Actions actions = new Actions(browser);
        actions.moveToElement(element).click().perform();
        VehicleDataPage.opcoesSeatsMotorcycle(browser).click();
        VehicleDataPage.opcoesFuel(browser).click();
    }

    @Quando("preencho os campos da aba Enter Vehicle Data:{},{},{},{},{},{} e {}")
    public void preencho_os_campos_da_aba_enter_vehicle_data(String cyl, String eng, String pay, String wei, String pri, String lic, String mil) {
        VehicleDataPage.campoCylender(browser).sendKeys(cyl);
        VehicleDataPage.campoEngine(browser).sendKeys(eng);
        VehicleDataPage.campoPayload(browser).sendKeys(pay);
        VehicleDataPage.campoWeight(browser).sendKeys(wei);
        VehicleDataPage.campoPrice(browser).sendKeys(pri);
        VehicleDataPage.campoLicense(browser).sendKeys(lic);
        VehicleDataPage.campoMileage(browser).sendKeys(mil);
    }

    @Entao("clico next para ir para a aba Insurant")
    public void clico_next_para_ir_para_a_aba_insurant() {
        VehicleDataPage.botaoNext(browser).click();
    }

}