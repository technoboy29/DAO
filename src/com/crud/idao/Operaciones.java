package com.crud.idao;

import java.util.ArrayList;

public interface Operaciones {
    public boolean insertar(Object obj);
    public boolean eliminar(Object obj);
    public boolean modificar(Object obj);
    public ArrayList<Object[]> consultar();
}
