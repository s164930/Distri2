/**
 * BrugeradminImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jacobLogin;

public class BrugeradminImplServiceLocator extends org.apache.axis.client.Service implements jacobLogin.BrugeradminImplService {

    public BrugeradminImplServiceLocator() {
    }


    public BrugeradminImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BrugeradminImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BrugeradminImplPort
    private java.lang.String BrugeradminImplPort_address = "http://javabog.dk:9901/brugeradmin";

    public java.lang.String getBrugeradminImplPortAddress() {
        return BrugeradminImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BrugeradminImplPortWSDDServiceName = "BrugeradminImplPort";

    public java.lang.String getBrugeradminImplPortWSDDServiceName() {
        return BrugeradminImplPortWSDDServiceName;
    }

    public void setBrugeradminImplPortWSDDServiceName(java.lang.String name) {
        BrugeradminImplPortWSDDServiceName = name;
    }

    public jacobLogin.Brugeradmin getBrugeradminImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BrugeradminImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBrugeradminImplPort(endpoint);
    }

    public jacobLogin.Brugeradmin getBrugeradminImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            jacobLogin.BrugeradminImplPortBindingStub _stub = new jacobLogin.BrugeradminImplPortBindingStub(portAddress, this);
            _stub.setPortName(getBrugeradminImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBrugeradminImplPortEndpointAddress(java.lang.String address) {
        BrugeradminImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (jacobLogin.Brugeradmin.class.isAssignableFrom(serviceEndpointInterface)) {
                jacobLogin.BrugeradminImplPortBindingStub _stub = new jacobLogin.BrugeradminImplPortBindingStub(new java.net.URL(BrugeradminImplPort_address), this);
                _stub.setPortName(getBrugeradminImplPortWSDDServiceName());
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
        if ("BrugeradminImplPort".equals(inputPortName)) {
            return getBrugeradminImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.transport.brugerautorisation/", "BrugeradminImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.transport.brugerautorisation/", "BrugeradminImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BrugeradminImplPort".equals(portName)) {
            setBrugeradminImplPortEndpointAddress(address);
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
