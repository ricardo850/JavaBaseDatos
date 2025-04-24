package org.example;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory()
                .openSession();

        session.beginTransaction();
        Usuario user1 = new Usuario();
        user1.setNombreApellido("richard");
        user1.setCedula(107474774);
        session.save(user1);

        session.getTransaction().commit();
        session.close();

    }
}