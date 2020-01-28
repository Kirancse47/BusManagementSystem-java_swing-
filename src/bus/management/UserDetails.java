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
@Table(name = "user_details", catalog = "bus_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "UserDetails.findAll", query = "SELECT u FROM UserDetails u")
    , @NamedQuery(name = "UserDetails.findById", query = "SELECT u FROM UserDetails u WHERE u.id = :id")
    , @NamedQuery(name = "UserDetails.findByFirstname", query = "SELECT u FROM UserDetails u WHERE u.firstname = :firstname")
    , @NamedQuery(name = "UserDetails.findByLastname", query = "SELECT u FROM UserDetails u WHERE u.lastname = :lastname")
    , @NamedQuery(name = "UserDetails.findByUsername", query = "SELECT u FROM UserDetails u WHERE u.username = :username")
    , @NamedQuery(name = "UserDetails.findByPassword", query = "SELECT u FROM UserDetails u WHERE u.password = :password")
    , @NamedQuery(name = "UserDetails.findByEmailid", query = "SELECT u FROM UserDetails u WHERE u.emailid = :emailid")
    , @NamedQuery(name = "UserDetails.findByMobileno", query = "SELECT u FROM UserDetails u WHERE u.mobileno = :mobileno")})
public class UserDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "emailid")
    private String emailid;
    @Column(name = "mobileno")
    private String mobileno;

    public UserDetails() {
    }

    public UserDetails(Integer id) {
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        String oldEmailid = this.emailid;
        this.emailid = emailid;
        changeSupport.firePropertyChange("emailid", oldEmailid, emailid);
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        String oldMobileno = this.mobileno;
        this.mobileno = mobileno;
        changeSupport.firePropertyChange("mobileno", oldMobileno, mobileno);
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
        if (!(object instanceof UserDetails)) {
            return false;
        }
        UserDetails other = (UserDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.UserDetails[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
