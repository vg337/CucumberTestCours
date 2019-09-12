package test.java;

import org.openqa.selenium.*;
import cucumber.api.java.en.*;
import main.resources.GenericPage;

public class test extends GenericPage{

	//Verifier la correction des quetes d'un pair.

private String urlSite = "https://www.test-odyssey.wildcodeschool.com";
private By monDashboard = By.xpath("//a[contains(@class,'dashboard')]");
private By solution = ;


@Given("^je suis connecté sur le site d'Odyssey.$")
public void ouvrirOdyssey(){
    driver.get(urlSite);
}
@When("^je clique sur l'onglet \"Mon dashboard\" en haut à gauche de la page.$")
public void selectMonDashBoard (){
    driver.findElement(monDashboard).click();
}
@And("^je parcours la page.$")
public void scrolPage (){

}
@And("^je clique sur le lien posté par le pair.$")
public void iugi () {
    if listeSolutionsPairs >= 0 
        driver.clickElement(solutionPair)
    else
}
@Then("^la solution s'ouvre.$")
public void etyi(){
    //comparer les titres
}
@And("^je peux voir la solution.$")
public void oitif (){

}
@And("^je peux écrire un commentaire.$")
public void oiyu (){

}
@And("^je peux valider ou pas.$")
public void ^poyii (){

}
}