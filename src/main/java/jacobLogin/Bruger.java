/**
 * Bruger.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jacobLogin;

public class Bruger  implements java.io.Serializable {
    private java.lang.String brugernavn;

    private java.lang.String email;

    private long sidstAktiv;

    private java.lang.String campusnetId;

    private java.lang.String studeretning;

    private java.lang.String fornavn;

    private java.lang.String efternavn;

    private java.lang.String adgangskode;

    private jacobLogin.BrugerEkstraFelterEntry[] ekstraFelter;

    public Bruger() {
    }

    public Bruger(
           java.lang.String brugernavn,
           java.lang.String email,
           long sidstAktiv,
           java.lang.String campusnetId,
           java.lang.String studeretning,
           java.lang.String fornavn,
           java.lang.String efternavn,
           java.lang.String adgangskode,
           jacobLogin.BrugerEkstraFelterEntry[] ekstraFelter) {
           this.brugernavn = brugernavn;
           this.email = email;
           this.sidstAktiv = sidstAktiv;
           this.campusnetId = campusnetId;
           this.studeretning = studeretning;
           this.fornavn = fornavn;
           this.efternavn = efternavn;
           this.adgangskode = adgangskode;
           this.ekstraFelter = ekstraFelter;
    }


    /**
     * Gets the brugernavn value for this Bruger.
     * 
     * @return brugernavn
     */
    public java.lang.String getBrugernavn() {
        return brugernavn;
    }


    /**
     * Sets the brugernavn value for this Bruger.
     * 
     * @param brugernavn
     */
    public void setBrugernavn(java.lang.String brugernavn) {
        this.brugernavn = brugernavn;
    }


    /**
     * Gets the email value for this Bruger.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Bruger.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the sidstAktiv value for this Bruger.
     * 
     * @return sidstAktiv
     */
    public long getSidstAktiv() {
        return sidstAktiv;
    }


    /**
     * Sets the sidstAktiv value for this Bruger.
     * 
     * @param sidstAktiv
     */
    public void setSidstAktiv(long sidstAktiv) {
        this.sidstAktiv = sidstAktiv;
    }


    /**
     * Gets the campusnetId value for this Bruger.
     * 
     * @return campusnetId
     */
    public java.lang.String getCampusnetId() {
        return campusnetId;
    }


    /**
     * Sets the campusnetId value for this Bruger.
     * 
     * @param campusnetId
     */
    public void setCampusnetId(java.lang.String campusnetId) {
        this.campusnetId = campusnetId;
    }


    /**
     * Gets the studeretning value for this Bruger.
     * 
     * @return studeretning
     */
    public java.lang.String getStuderetning() {
        return studeretning;
    }


    /**
     * Sets the studeretning value for this Bruger.
     * 
     * @param studeretning
     */
    public void setStuderetning(java.lang.String studeretning) {
        this.studeretning = studeretning;
    }


    /**
     * Gets the fornavn value for this Bruger.
     * 
     * @return fornavn
     */
    public java.lang.String getFornavn() {
        return fornavn;
    }


    /**
     * Sets the fornavn value for this Bruger.
     * 
     * @param fornavn
     */
    public void setFornavn(java.lang.String fornavn) {
        this.fornavn = fornavn;
    }


    /**
     * Gets the efternavn value for this Bruger.
     * 
     * @return efternavn
     */
    public java.lang.String getEfternavn() {
        return efternavn;
    }


    /**
     * Sets the efternavn value for this Bruger.
     * 
     * @param efternavn
     */
    public void setEfternavn(java.lang.String efternavn) {
        this.efternavn = efternavn;
    }


    /**
     * Gets the adgangskode value for this Bruger.
     * 
     * @return adgangskode
     */
    public java.lang.String getAdgangskode() {
        return adgangskode;
    }


    /**
     * Sets the adgangskode value for this Bruger.
     * 
     * @param adgangskode
     */
    public void setAdgangskode(java.lang.String adgangskode) {
        this.adgangskode = adgangskode;
    }


    /**
     * Gets the ekstraFelter value for this Bruger.
     * 
     * @return ekstraFelter
     */
    public jacobLogin.BrugerEkstraFelterEntry[] getEkstraFelter() {
        return ekstraFelter;
    }


    /**
     * Sets the ekstraFelter value for this Bruger.
     * 
     * @param ekstraFelter
     */
    public void setEkstraFelter(jacobLogin.BrugerEkstraFelterEntry[] ekstraFelter) {
        this.ekstraFelter = ekstraFelter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bruger)) return false;
        Bruger other = (Bruger) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brugernavn==null && other.getBrugernavn()==null) || 
             (this.brugernavn!=null &&
              this.brugernavn.equals(other.getBrugernavn()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.sidstAktiv == other.getSidstAktiv() &&
            ((this.campusnetId==null && other.getCampusnetId()==null) || 
             (this.campusnetId!=null &&
              this.campusnetId.equals(other.getCampusnetId()))) &&
            ((this.studeretning==null && other.getStuderetning()==null) || 
             (this.studeretning!=null &&
              this.studeretning.equals(other.getStuderetning()))) &&
            ((this.fornavn==null && other.getFornavn()==null) || 
             (this.fornavn!=null &&
              this.fornavn.equals(other.getFornavn()))) &&
            ((this.efternavn==null && other.getEfternavn()==null) || 
             (this.efternavn!=null &&
              this.efternavn.equals(other.getEfternavn()))) &&
            ((this.adgangskode==null && other.getAdgangskode()==null) || 
             (this.adgangskode!=null &&
              this.adgangskode.equals(other.getAdgangskode()))) &&
            ((this.ekstraFelter==null && other.getEkstraFelter()==null) || 
             (this.ekstraFelter!=null &&
              java.util.Arrays.equals(this.ekstraFelter, other.getEkstraFelter())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBrugernavn() != null) {
            _hashCode += getBrugernavn().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += new Long(getSidstAktiv()).hashCode();
        if (getCampusnetId() != null) {
            _hashCode += getCampusnetId().hashCode();
        }
        if (getStuderetning() != null) {
            _hashCode += getStuderetning().hashCode();
        }
        if (getFornavn() != null) {
            _hashCode += getFornavn().hashCode();
        }
        if (getEfternavn() != null) {
            _hashCode += getEfternavn().hashCode();
        }
        if (getAdgangskode() != null) {
            _hashCode += getAdgangskode().hashCode();
        }
        if (getEkstraFelter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEkstraFelter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEkstraFelter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bruger.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.transport.brugerautorisation/", "bruger"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brugernavn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "brugernavn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sidstAktiv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sidstAktiv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campusnetId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campusnetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studeretning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "studeretning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fornavn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fornavn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("efternavn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "efternavn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adgangskode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adgangskode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ekstraFelter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ekstraFelter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.transport.brugerautorisation/", ">>bruger>ekstraFelter>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
