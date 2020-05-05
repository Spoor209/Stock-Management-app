$(document).ready(function(){
	$("#tauxTva").on("keyup", function(){
		// On appel la method 
		TvaKeyUpFunction();
	})
});

TvaKeyUpFunction = function(){
	
	//On recup la valeur de prixUnitHT
	var prixUnitHT = $("#prixUnitHT").val();
	var tauxTva = $("#tauxTva").val();
	
	var prixUnitTTC = (parseFloat(prixUnitHT) * parseFloat(tauxTva / 100)) + parseFloat(prixUnitHT);
	$("#prixUnitTTC").val(prixUnitTTC);
}
