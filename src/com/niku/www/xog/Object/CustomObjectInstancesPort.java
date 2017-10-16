/**
 * CustomObjectInstancesPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.niku.www.xog.Object;

public interface CustomObjectInstancesPort extends java.rmi.Remote {
    public com.niku.www.xog.Object.NikuDataBus readCustomObjectInstance(com.niku.www.xog.Object.NikuDataBus body, com.niku.www.xog.Object.Auth header) throws java.rmi.RemoteException;
    public com.niku.www.xog.Object.XOGOutput writeCustomObjectInstance(com.niku.www.xog.Object.NikuDataBus body, com.niku.www.xog.Object.Auth header) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String username, java.lang.String password, java.lang.String tenantID) throws java.rmi.RemoteException;
    public void logout(java.lang.String sessionID) throws java.rmi.RemoteException;
}
