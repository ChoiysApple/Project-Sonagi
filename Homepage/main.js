function head_nav(n) 
{
    if(n=='f'){
        document.getElementById("main").src="find.html";
    }
    if(n=='r'){
        document.getElementById("main").src="register.html";
    }
    if(n=='c'){
        document.getElementById("main").src="credit.html";
    }


function recentResize()
{
    document.getElementById('main_frame').style.height="2700px";
}

function resetHeight()
{
    document.getElementById('main_frame').style.height="770px";
}