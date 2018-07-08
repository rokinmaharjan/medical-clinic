/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tbc.clinic.controller;

import java.util.EventListener;

/**
 *
 * 
 */
public interface EventsListener extends EventListener{
    public void eventOccured(Event event);
}
