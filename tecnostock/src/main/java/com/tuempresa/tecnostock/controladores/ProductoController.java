package com.tuempresa.tecnostock.controladores;

import org.openxava.actions.*;
import org.openxava.util.*;
import org.openxava.view.*;

public class ProductoController extends BaseAction {
    
    public void execute() throws Exception {
        View view = getView();
        if (Users.getCurrentUserInfo().isUserInRole("user")) {
            view.setEditable(false); // Hace la vista de solo lectura
            view.removeActions("CRUD.new", "CRUD.save", "CRUD.delete", "CRUD.modify");
        }
    }
}