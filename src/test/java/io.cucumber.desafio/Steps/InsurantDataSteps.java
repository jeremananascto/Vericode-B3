package io.cucumber.desafio.Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.desafio.Pages.InsurantDataPage;
import io.cucumber.desafio.Servicos.Configuracao;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;


public class InsurantDataSteps extends Configuracao {

    @Quando("seleciono as opcoes da aba Enter Insurant Data")
    public void seleciono_as_opcoes_da_aba_enter_insurant_data() {
        WebElement element = InsurantDataPage.campoGender(browser);
        Actions actions = new Actions(browser);
        actions.moveToElement(element).click().perform();
        InsurantDataPage.opcoesCountry(browser).click();
        InsurantDataPage.opcoesOccupation(browser).click();
        WebElement hobbies = InsurantDataPage.campoHobbies(browser);
        actions.moveToElement(hobbies).click().perform();
    }

    @Quando("preencho os campos da aba Enter Insurant Data: {},{},{},{},{},{} e {}")
    public void preencho_os_campos_da_aba_enter_insurant_data(String fir, String las, String bir, String add, String zip, String cit, String web) {
        InsurantDataPage.campoFirstName(browser).sendKeys(fir);
        InsurantDataPage.campoLastName(browser).sendKeys(las);
        InsurantDataPage.dataBirth(browser).sendKeys(bir);
        InsurantDataPage.campoAddress(browser).sendKeys(add);
        InsurantDataPage.campoZipecode(browser).sendKeys(zip);
        InsurantDataPage.campoCity(browser).sendKeys(cit);
        InsurantDataPage.campoWebsite(browser).sendKeys(web);
    }

    @Entao("clico next para a aba Product")
    public void clico_next_para_a_aba_product() {
        InsurantDataPage.botaoNext(browser).click();
    }

}
