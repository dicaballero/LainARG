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
const regExNum= /^[0-9]+$/;
for (input of input1) {
  if(regExNum.test(input.value)){
   }else{
    if(input.value=="Enviar"){
    form1.submit();
    }
    if(input.value!="Enviar"){
    alert("Los campos solo pueden contener valores numéricos 0-9");
    return false;
    }
    }
}

});

});

