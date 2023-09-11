//document.getElementById('curiousity').addEventListener('click',function(){
//	alert('curiousity was clicked')
//})

//document.getElementById('opportunity').addEventListener('click',function(){
//	alert('opportunity was clicked')
//})
//document.getElementById('spirit').addEventListener('click',function(){
//	alert('spirit was clicked')
//})

let marsapirover = document.querySelectorAll("button[id*='marsApi']")

marsapirover.forEach(button => button.addEventListener('click',function(){
	const buttonid = this.id
	const roverid = buttonid.split('marsApi')[1]
	let apiData = document.getElementById('marsRoverApiData')
	apiData.value = roverid
	document.getElementById('frmRoverType').submit()
	//alert(roverid)
	
}))


function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    var results = regex.exec(location.search);
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};

let roverType =getUrlParameter('marsRoverApiData')


highLightButton(roverType)

let solDate =getUrlParameter('marsSol')
document.getElementById('marsSol').value= solDate

function highLightButton(roverType)
{
	if(roverType=='')
	   roverType= 'Opportunity'
	   
	 
	 document.getElementById('marsApi'+roverType).classList.remove('btn-success')
	 document.getElementById('marsApi'+roverType).classList.add('w3-hover-green')
	
};