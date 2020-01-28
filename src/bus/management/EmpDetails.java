/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author KIRAN
 */
@Entity
@Table(name = "emp_details", catalog = "bus_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "EmpDetails.findAll", query = "SELECT e FROM EmpDetails e")
    , @NamedQuery(name = "EmpDetails.findById", query = "SELECT e FROM EmpDetails e WHERE e.id = :id")
    , @NamedQuery(name = "EmpDetails.findByName", query = "SELECT e FROM EmpDetails e WHERE e.name = :name")
    , @NamedQuery(name = "EmpDetails.findByCo", query = "SELECT e FROM EmpDetails e WHERE e.co = :co")
    , @NamedQuery(name = "EmpDetails.findByMobile", query = "SELECT e FROM EmpDetails e WHERE e.mobile = :mobile")
    , @NamedQuery(name = "EmpDetails.findByEmail", query = "SELECT e FROM EmpDetails e WHERE e.email = :email")
    , @NamedQuery(name = "EmpDetails.findByAadhar", query = "SELECT e FROM EmpDetails e WHERE e.aadhar = :aadhar")
    , @NamedQuery(name = "EmpDetails.findBySalary", query = "SELECT e FROM EmpDetails e WHERE e.salary = :salary")
    , @NamedQuery(name = "EmpDetails.findByAddress", query = "SELECT e FROM EmpDetails e WHERE e.address = :address")
    , @NamedQuery(name = "EmpDetails.findByBankName", query = "SELECT e FROM EmpDetails e WHERE e.bankName = :bankName")
    , @NamedQuery(name = "EmpDetails.findByAccountNo", query = "SELECT e FROM EmpDetails e WHERE e.accountNo = :accountNo")
    , @NamedQuery(name = "EmpDetails.findByIfscCode", query = "SELECT e FROM EmpDetails e WHERE e.ifscCode = :ifscCode")
    , @NamedQuery(name = "EmpDetails.findByDateJoining", query = "SELECT e FROM EmpDetails e WHERE e.dateJoining = :dateJoining")})
public class EmpDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "co")
    private String co;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "email")
    private String email;
    @Column(name = "aadhar")
    private String aadhar;
    @Column(name = "salary")
    private String salary;
    @Column(name = "address")
    private String address;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "account_no")
    private String accountNo;
    @Column(name = "ifsc_code")
    private String ifscCode;
    @Column(name = "date_joining")
    private String dateJoining;

    public EmpDetails() {
    }

    public EmpDetails(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        String oldCo = this.co;
        this.co = co;
        changeSupport.firePropertyChange("co", oldCo, co);
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        String oldMobile = this.mobile;
        this.mobile = mobile;
        changeSupport.firePropertyChange("mobile", oldMobile, mobile);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        String oldAadhar = this.aadhar;
        this.aadhar = aadhar;
        changeSupport.firePropertyChange("aadhar", oldAadhar, aadhar);
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        String oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        String oldBankName = this.bankName;
        this.bankName = bankName;
        changeSupport.firePropertyChange("bankName", oldBankName, bankName);
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        String oldAccountNo = this.accountNo;
        this.accountNo = accountNo;
        changeSupport.firePropertyChange("accountNo", oldAccountNo, accountNo);
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        String oldIfscCode = this.ifscCode;
        this.ifscCode = ifscCode;
        changeSupport.firePropertyChange("ifscCode", oldIfscCode, ifscCode);
    }

    public String getDateJoining() {
        return dateJoining;
    }

    public void setDateJoining(String dateJoining) {
        String oldDateJoining = this.dateJoining;
        this.dateJoining = dateJoining;
        changeSupport.firePropertyChange("dateJoining", oldDateJoining, dateJoining);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpDetails)) {
            return false;
        }
        EmpDetails other = (EmpDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.EmpDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
