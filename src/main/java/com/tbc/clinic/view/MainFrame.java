/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tbc.clinic.view;

import com.tbc.clinic.controller.Event;
import com.tbc.clinic.controller.EventsListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author
 */
public class MainFrame extends JFrame {

    private LoginPanel loginPanel;
    private HomePanel homePanel;

    /**
     * Creates new form MainFrame
     *
     */
    public MainFrame() {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Northampton Medical Clinic");
                frame.setSize(800, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                loginPanel = new LoginPanel();
                homePanel = new HomePanel();
                frame.add(loginPanel);

                loginPanel.loginEventListener(new EventsListener() {
                    @Override
                    public void eventOccured(Event event) {
                        frame.getContentPane().removeAll();
                        frame.add(homePanel);
                        frame.repaint();
                        frame.revalidate();
                    }
                });
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.CardLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}