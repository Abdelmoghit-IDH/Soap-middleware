/**
 * BanqueServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class BanqueServiceServiceLocator extends org.apache.axis.client.Service implements service.BanqueServiceService {

    public BanqueServiceServiceLocator() {
    }


    public BanqueServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BanqueServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BanqueServicePort
    private java.lang.String BanqueServicePort_address = "http://localhost:8585/";

    public java.lang.String getBanqueServicePortAddress() {
        return BanqueServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BanqueServicePortWSDDServiceName = "BanqueServicePort";

    public java.lang.String getBanqueServicePortWSDDServiceName() {
        return BanqueServicePortWSDDServiceName;
    }

    public void setBanqueServicePortWSDDServiceName(java.lang.String name) {
        BanqueServicePortWSDDServiceName = name;
    }

    public service.BanqueService getBanqueServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BanqueServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBanqueServicePort(endpoint);
    }

    public service.BanqueService getBanqueServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.BanqueServicePortBindingStub _stub = new service.BanqueServicePortBindingStub(portAddress, this);
            _stub.setPortName(getBanqueServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBanqueServicePortEndpointAddress(java.lang.String address) {
        BanqueServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.BanqueService.class.isAssignableFrom(serviceEndpointInterface)) {
                service.BanqueServicePortBindingStub _stub = new service.BanqueServicePortBindingStub(new java.net.URL(BanqueServicePort_address), this);
                _stub.setPortName(getBanqueServicePortWSDDServiceName());
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
        if ("BanqueServicePort".equals(inputPortName)) {
            return getBanqueServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "BanqueServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "BanqueServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BanqueServicePort".equals(portName)) {
            setBanqueServicePortEndpointAddress(address);
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
