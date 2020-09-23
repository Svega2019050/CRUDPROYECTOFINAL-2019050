package modeloDAO;

import configuracion.Conexion;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

public class PersonaDAO implements CRUD{

    @Override
    public List listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persona list(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(Persona per) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean edit(Persona per) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
