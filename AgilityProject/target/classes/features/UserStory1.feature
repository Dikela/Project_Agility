Feature: Presenter un Livre
	As a : Employé
	I want : Presenter un livre
	So that : Faciliter son utilisation par les lecteurs
	 
	Scenario Outline: Un livre est caractérisé par un Titre et un prix
		Given Un livre caracterisé par son titre <titre> son prix <prixVent>
		When Le lecteur lui demande de lui montrer le livre
		Then l'application renvoie <infoLivre> du livre demandé
		Examples:
		| titre     | prixVent  | infoLivre       	  		  |   
		|"mister1"	| 15.0	    |"Le livre mister1 coûte 15.0"|