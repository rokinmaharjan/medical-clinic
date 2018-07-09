/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tbc.clinic.controller;

import com.tbc.clinic.model.Staff;
import com.tbc.clinic.utility.HibernateUtility;
import com.tbc.clinic.view.MainFrame;
import java.awt.Dimension;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        MainFrame mainframe = new MainFrame();
        
        Session session = HibernateUtility.getSession();
        Criteria criteria = session.createCriteria(Staff.class);
        Staff staff = (Staff) criteria.add(Restrictions.eq("username", "admin"))
                .uniqueResult();
        
        if (staff == null) {
            addDefaultStaff();
        }
        

    }

    public static void addDefaultStaff() {
        Staff staff = Staff.builder()
                .name("Medical Admin")
                .username("admin")
                .password("admin")
                .gender("Male")
                .registrationNumber("DOC-2")
                .registrationDate(new Date())
                .qualificationDate(new Date())
                .type("Doctor")
//                .grade("A")
//                .prescribing(true)
                .build();

        Session session = HibernateUtility.getSession();
        Transaction tx = session.beginTransaction();
        session.save(staff);
        tx.commit();
    }

}
