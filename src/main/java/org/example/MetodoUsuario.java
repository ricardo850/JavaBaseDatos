package org.example;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class MetodoUsuario {

    public void IngresarDatos(String NombreApellido, int cedula){
        Session session = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory()
                .openSession();
        session.beginTransaction();
        Usuario user = new Usuario(NombreApellido,cedula);
        session.save(user);

        session.getTransaction().commit();
        session.close();

    }

    public MetodoUsuario() {
    }
}
