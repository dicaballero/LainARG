
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador1 {

    
@RequestMapping
public String iniciar(){
return "presentacion";
}        

@RequestMapping("/registrar")
public String registrar(){
return "ingresarRegistro";
}
@RequestMapping("/consultar")
public String consultar(){
return "consultarJSP";
}
@RequestMapping("/actualizar")
public String actualizar(){
return "actualizarJSP";
}
@RequestMapping("/eliminar")
public String eliminar(){
return "eliminarJSP";
}

}
