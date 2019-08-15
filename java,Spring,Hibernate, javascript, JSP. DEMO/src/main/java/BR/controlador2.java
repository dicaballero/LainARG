
package BR;
import DAL.DAO;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ctrlSecundario")
public class controlador2 {
    
@RequestMapping("/registrar")
public Object registrar(HttpServletRequest req){
 Object o = DAO.registrar(req.getParameter("nombre"),req.getParameter("marca"),
 req.getParameter("precio"),req.getParameter("cantidad"),req.getParameter("codigoIdentificador"));
 if(o instanceof Exception){
 req.setAttribute("db", o);
 return "mostrarExcepciones";
    }else{
 req.setAttribute("db", o);    
 return "mostrarRegistrar";
 }
 }    

@RequestMapping("/consultar")
public Object consultar(HttpServletRequest req){
String dato = req.getParameter("dato");
Object o = DAO.consultar(dato);
if(o instanceof Exception){
 req.setAttribute("db", o);
 return "mostrarExcepciones";
    }else{
req.setAttribute("db", o);    
return "mostrarConsultar";
}
}

@RequestMapping("/eliminar")
public Object eliminar(HttpServletRequest req){
String dato = req.getParameter("dato");
Object o = DAO.eliminar(dato);
if(o instanceof Exception){
 req.setAttribute("db", o);
 return "mostrarExcepciones";
    }else{
req.setAttribute("db", o);    
return "mostrarEliminar";
}
}

@RequestMapping("/actualizar")
public Object actualizar(HttpServletRequest req){
 Object o = DAO.actualizar(req.getParameter("nombre"),req.getParameter("marca"),req.getParameter("precio"),
            req.getParameter("cantidad"),req.getParameter("codigoIdentificador"));
if(o instanceof Exception){
 req.setAttribute("db", o);
 return "mostrarExcepciones";
    }else{
 req.setAttribute("db", o);   
 return "mostrarActualizar";
}
}

@RequestMapping("/consultarDb")
public Object consultarDb(HttpServletRequest req){
Object o = DAO.consultarDb(); 
if(o instanceof Exception){
req.setAttribute("db", o);
return "mostrarExcepciones";
}else{
 req.setAttribute("db", o);   
 return "consultarDbJSP";
}
}

@RequestMapping("/eliminarDb")
public Object eliminarDb(HttpServletRequest req){
    Object o = DAO.eliminarDb();
    if(o instanceof Exception){
    req.setAttribute("db", o);
     return "mostrarExcepciones";
    }else{
    req.setAttribute("db", o);
    return "mostrarEliminarDb"; 
    }
}

@RequestMapping("/crearDb")
public Object crearDb(HttpServletRequest req){
    Object o = DAO.crearDb();
    if(o instanceof Exception){
    req.setAttribute("db", o);    
    return "mostrarExcepciones";
    }else{
    req.setAttribute("db", o);
    return "mostrarCrearDb";
    }
}

}
