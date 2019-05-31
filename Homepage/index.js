function head_nav(n) 
{
    if(n=='m') {
        document.getElementById("main").src="./index.html";
    }
    if(n=='f'){
        document.getElementById("main").src="find.html";
    }
    if(n=='r'){
        document.getElementById("main").src="register.html";
    }
    if(n=='c'){
        document.getElementById("main").src="./credit.html";
    }
}