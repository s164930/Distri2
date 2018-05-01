/**
 * Brugeradmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jacobLogin;

public interface Brugeradmin extends java.rmi.Remote {
    public jacobLogin.Bruger hentBrugerOffentligt(java.lang.String arg0) throws java.rmi.RemoteException;
    public jacobLogin.Bruger hentBruger(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public jacobLogin.Bruger ændrAdgangskode(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public void sendEmail(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
    public void sendGlemtAdgangskodeEmail(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public java.lang.Object getEkstraFelt(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public void setEkstraFelt(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.Object arg3) throws java.rmi.RemoteException;
}
