function bday(){
	document.getElementById("BHall").style.display="flex";
	document.getElementById("WHall").style.display="none";
	document.getElementById("OHall").style.display="none";
	document.getElementById("hallbanner").style.display="none";
}

function wedding(){
	document.getElementById("BHall").style.display="none";
	document.getElementById("WHall").style.display="flex";
	document.getElementById("OHall").style.display="none";
	document.getElementById("hallbanner").style.display="none";
}
function other(){
	document.getElementById("WHall").style.display="none";
	document.getElementById("BHall").style.display="none";
	document.getElementById("OHall").style.display="flex";
	document.getElementById("hallbanner").style.display="none";
	
}