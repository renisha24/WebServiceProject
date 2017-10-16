package com.niku.www.xog.Object;

public class CustomObjectInstancesPortProxy implements com.niku.www.xog.Object.CustomObjectInstancesPort {
  private String _endpoint = null;
  private com.niku.www.xog.Object.CustomObjectInstancesPort customObjectInstancesPort = null;
  
  public CustomObjectInstancesPortProxy() {
    _initCustomObjectInstancesPortProxy();
  }
  
  public CustomObjectInstancesPortProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomObjectInstancesPortProxy();
  }
  
  private void _initCustomObjectInstancesPortProxy() {
    try {
      customObjectInstancesPort = (new com.niku.www.xog.Object.CustomObjectInstancesServiceLocator()).getCustomObjectInstancesService();
      if (customObjectInstancesPort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customObjectInstancesPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customObjectInstancesPort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customObjectInstancesPort != null)
      ((javax.xml.rpc.Stub)customObjectInstancesPort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.niku.www.xog.Object.CustomObjectInstancesPort getCustomObjectInstancesPort() {
    if (customObjectInstancesPort == null)
      _initCustomObjectInstancesPortProxy();
    return customObjectInstancesPort;
  }
  
  public com.niku.www.xog.Object.NikuDataBus readCustomObjectInstance(com.niku.www.xog.Object.NikuDataBus body, com.niku.www.xog.Object.Auth header) throws java.rmi.RemoteException{
    if (customObjectInstancesPort == null)
      _initCustomObjectInstancesPortProxy();
    return customObjectInstancesPort.readCustomObjectInstance(body, header);
  }
  
  public com.niku.www.xog.Object.XOGOutput writeCustomObjectInstance(com.niku.www.xog.Object.NikuDataBus body, com.niku.www.xog.Object.Auth header) throws java.rmi.RemoteException{
    if (customObjectInstancesPort == null)
      _initCustomObjectInstancesPortProxy();
    return customObjectInstancesPort.writeCustomObjectInstance(body, header);
  }
  
  public java.lang.String login(java.lang.String username, java.lang.String password, java.lang.String tenantID) throws java.rmi.RemoteException{
    if (customObjectInstancesPort == null)
      _initCustomObjectInstancesPortProxy();
    return customObjectInstancesPort.login(username, password, tenantID);
  }
  
  public void logout(java.lang.String sessionID) throws java.rmi.RemoteException{
    if (customObjectInstancesPort == null)
      _initCustomObjectInstancesPortProxy();
    customObjectInstancesPort.logout(sessionID);
  }
  
  
}