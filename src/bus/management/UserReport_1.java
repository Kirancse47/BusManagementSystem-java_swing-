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
@Table(name = "user_report", catalog = "bus_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "UserReport_1.findAll", query = "SELECT u FROM UserReport_1 u")
    , @NamedQuery(name = "UserReport_1.findById", query = "SELECT u FROM UserReport_1 u WHERE u.id = :id")
    , @NamedQuery(name = "UserReport_1.findByUsername", query = "SELECT u FROM UserReport_1 u WHERE u.username = :username")
    , @NamedQuery(name = "UserReport_1.findByName", query = "SELECT u FROM UserReport_1 u WHERE u.name = :name")
    , @NamedQuery(name = "UserReport_1.findByMobileNo", query = "SELECT u FROM UserReport_1 u WHERE u.mobileNo = :mobileNo")
    , @NamedQuery(name = "UserReport_1.findByProblem", query = "SELECT u FROM UserReport_1 u WHERE u.problem = :problem")
    , @NamedQuery(name = "UserReport_1.findBySolution", query = "SELECT u FROM UserReport_1 u WHERE u.solution = :solution")})
public class UserReport_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "mobile_no")
    private String mobileNo;
    @Basic(optional = false)
    @Column(name = "problem")
    private String problem;
    @Column(name = "solution")
    private String solution;

    public UserReport_1() {
    }

    public UserReport_1(Integer id) {
        this.id = id;
    }

    public UserReport_1(Integer id, String username, String name, String mobileNo, String problem) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.mobileNo = mobileNo;
        this.problem = problem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        String oldMobileNo = this.mobileNo;
        this.mobileNo = mobileNo;
        changeSupport.firePropertyChange("mobileNo", oldMobileNo, mobileNo);
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        String oldProblem = this.problem;
        this.problem = problem;
        changeSupport.firePropertyChange("problem", oldProblem, problem);
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        String oldSolution = this.solution;
        this.solution = solution;
        changeSupport.firePropertyChange("solution", oldSolution, solution);
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
        if (!(object instanceof UserReport_1)) {
            return false;
        }
        UserReport_1 other = (UserReport_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.UserReport_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
