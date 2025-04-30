package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MetodoUsuario {

    private SessionFactory sessionFactory;
    // Variable para almacenar la sesión
    private Session session;

    // Constructor para inicializar la SessionFactory y abrir una sesión
    public void ConfigHibernate() {

        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        // Abrir la sesión
        session = sessionFactory.openSession();
    }




    public void IngresarDatos(String NombreApellido, int cedula){
        ConfigHibernate();
        session.beginTransaction();
        Usuario user = new Usuario(NombreApellido,cedula);
        session.save(user);

        session.getTransaction().commit();
        session.close();

    }


    public void ActualizarDatos(int cedulaActualizar, String NombreApellidoNuevo, int cedulaNueva){
        ConfigHibernate();
        session.beginTransaction();
        Usuario usuario = (Usuario) session.createQuery("from Usuario where cedula = " + cedulaActualizar )
                                .uniqueResult();

        usuario.setNombreApellido(NombreApellidoNuevo);
   usuario.setCedula(cedulaNueva);

   session.update(usuario);

   session.getTransaction().commit();
   session.close();

    }

    public void EliminarDatos(int cedulaDatoEliminar){
        ConfigHibernate();
        session.beginTransaction();
        session.createQuery("delete from Usuario where cedula = " + cedulaDatoEliminar)
                .executeUpdate();

        session.getTransaction().commit();
        session.close();

    }

    public ArrayList<Usuario> TraerDatos(){

        ConfigHibernate();
        session.beginTransaction();
        ArrayList<Usuario>ListaUser = new ArrayList<>();

        List<Usuario> usuarios = session.createQuery("from Usuario", Usuario.class).list();
        ArrayList<Usuario> listaUsuarios = new ArrayList<>(usuarios);

        session.getTransaction().commit();
        session.close();

        return  listaUsuarios;
    }



    public MetodoUsuario() {

    }
}
