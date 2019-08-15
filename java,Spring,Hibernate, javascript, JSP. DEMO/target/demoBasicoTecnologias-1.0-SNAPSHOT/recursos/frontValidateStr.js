/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
document.addEventListener("DOMContentLoaded",()=>{
let form1 = document.getElementById("validar");
form1.addEventListener("submit", (e)=>{
e.preventDefault();
let input1 = document.getElementsByTagName("input");
const regEx= /^[a-zA-z0-9\ ]*$/;
for (input of input1) {
  if(regEx.test(input.value)){
    if(input.value=="Enviar") form1.submit();
    }else{
    alert("Los campos solo pueden contener valores alfanuméricos A-Z y 0-9");
    return false;
    }
}

});

});

