package com.tuempresa.tecnostock.controladores;

import org.openxava.actions.*;
import org.openxava.controller.*;
import org.openxava.util.*;
import org.openxava.view.*;

public class ClienteController extends BaseAction implements IModuleContextAction { 
    // Implementa IModuleContextAction para acceder al contexto
    
    private ModuleContext context;  // Necesario para IModuleContextAction
    
    public void execute() throws Exception {
        View view = getView();  // Ahora está disponible por ser BaseAction
        
        if (Users.getCurrentUserInfo().isUserInRole("user")) {
            view.setEditable(false);
            
            // Ocultar acciones usando el contexto del módulo
            context.removeActions("CRUD.new", "CRUD.save", "CRUD.delete", "CRUD.modify");
        }
    }
    
    // Método requerido por IModuleContextAction
    public void setContext(ModuleContext context) {
        this.context = context;
    }
    
    // Método para obtener la vista (alternativa si getView() falla)
    protected View getCurrentView() {
        return (View) context.get(request, "xava_view");
    }
}