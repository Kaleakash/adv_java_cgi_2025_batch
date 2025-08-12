// normal type function declaration 
// JavaScript hosting 
display1();
function display1() {
    document.writeln("This is a normal type function declaration.<br>");
}
display1();
// expression style function it doesn't support JS Hosting 
//display2();
var display2 = function() {
    document.writeln("This is an expression style function.<br>");
}
display2();
// arrow function : anonymous function like lambda in Java. 
var display3 = ()=>document.writeln("<br/> This is arrow function");
display3();
document.writeln("<br/>");

// callback function 
function greeting(fname,callback){
    return "Welcome "+callback(fname);
}

var maleInfo= function(fname){
    return "Mr "+fname;
}
var femaleInfo = (fname)=>"Miss "+fname;
document.writeln(greeting("John",maleInfo)+"<br/>");
document.writeln(greeting("Neeta",femaleInfo)+"<br/>");
document.writeln(greeting("John",function(fname){
    return "Mr "+fname;
})+"<br/>");
document.writeln(greeting("Neeta",(fname)=>"Miss "+fname)+"<br/>");
