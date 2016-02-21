$(document).ready(function(){
	var pathname = window.location.href;
	
	$("#home").removeClass("active");
	$("#mealplanner").removeClass("active");
	$("#recipemanager").removeClass("active");
	$("#productmanager").removeClass("active");
	$("#people").removeClass("active");
	
	if(pathname.indexOf("mealplanner") > -1) {
		$("#mealplanner").addClass("active");
	} else if(pathname.indexOf("recipemanager") > -1) {
		$("#recipemanager").addClass("active");		
	} else if(pathname.indexOf("productmanager") > -1) {
		$("#productmanager").addClass("active");		
	} else if(pathname.indexOf("people") > -1) {
		$("#people").addClass("active");		
	} else if(pathname.indexOf("meal") > -1) {
		$("#mealplanner").addClass("active");		
	} else if(pathname.indexOf("settings") > -1) {
		$("#settings").addClass("active");		
	}  else {
		$("#home").addClass("active");
	}
});