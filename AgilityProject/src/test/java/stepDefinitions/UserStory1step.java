package stepDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gestionLivre.Livre;

public class UserStory1step {
	
	private Livre livre;
	private String info;
	
	@Given("Un livre caracterisé par son {string} son {double}")
	public void un_livre_caracterisé_par_son_son(String titre, Double prix) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		livre = new Livre(titre, prix);
	}

	@When("Le lecteur lui demande de lui montrer le livre")
	public void le_lecteur_lui_demande_de_lui_montrer_le_livre() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		info = livre.infoLivre();
	}

	@Then("l'application renvoie les {string} du livre demandé")
	public void l_application_renvoie_les_du_livre_demandé(String information) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		assertEquals(info, information);
	}

}
