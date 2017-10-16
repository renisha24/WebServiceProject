/**
 * CustomObjectInstancesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.niku.www.xog.Object;

public class CustomObjectInstancesServiceLocator extends org.apache.axis.client.Service implements com.niku.www.xog.Object.CustomObjectInstancesService {

/**
 * PPM Object Request
 *                     CustomObjectInstances
 *                     Service
 */

    public CustomObjectInstancesServiceLocator() {
    }


    public CustomObjectInstancesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomObjectInstancesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomObjectInstancesService
    private java.lang.String CustomObjectInstancesService_address = "https://ppmdev.cerner.com/niku/xog";

    public java.lang.String getCustomObjectInstancesServiceAddress() {
        return CustomObjectInstancesService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomObjectInstancesServiceWSDDServiceName = "CustomObjectInstancesService";

    public java.lang.String getCustomObjectInstancesServiceWSDDServiceName() {
        return CustomObjectInstancesServiceWSDDServiceName;
    }

    public void setCustomObjectInstancesServiceWSDDServiceName(java.lang.String name) {
        CustomObjectInstancesServiceWSDDServiceName = name;
    }

    public com.niku.www.xog.Object.CustomObjectInstancesPort getCustomObjectInstancesService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomObjectInstancesService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomObjectInstancesService(endpoint);
    }

    public com.niku.www.xog.Object.CustomObjectInstancesPort getCustomObjectInstancesService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.niku.www.xog.Object.CustomObjectInstancesSoapBindingStub _stub = new com.niku.www.xog.Object.CustomObjectInstancesSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustomObjectInstancesServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomObjectInstancesServiceEndpointAddress(java.lang.String address) {
        CustomObjectInstancesService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.niku.www.xog.Object.CustomObjectInstancesPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.niku.www.xog.Object.CustomObjectInstancesSoapBindingStub _stub = new com.niku.www.xog.Object.CustomObjectInstancesSoapBindingStub(new java.net.URL(CustomObjectInstancesService_address), this);
                _stub.setPortName(getCustomObjectInstancesServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CustomObjectInstancesService".equals(inputPortName)) {
            return getCustomObjectInstancesService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.niku.com/xog/Object", "CustomObjectInstancesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.niku.com/xog/Object", "CustomObjectInstancesService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomObjectInstancesService".equals(portName)) {
            setCustomObjectInstancesServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
