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
@Table(name = "assign_bus", catalog = "bus_db", schema = "")
@NamedQueries({
    @NamedQuery(name = "AssignBus_1.findAll", query = "SELECT a FROM AssignBus_1 a")
    , @NamedQuery(name = "AssignBus_1.findById", query = "SELECT a FROM AssignBus_1 a WHERE a.id = :id")
    , @NamedQuery(name = "AssignBus_1.findByAssignDate", query = "SELECT a FROM AssignBus_1 a WHERE a.assignDate = :assignDate")
    , @NamedQuery(name = "AssignBus_1.findByEmployeeName", query = "SELECT a FROM AssignBus_1 a WHERE a.employeeName = :employeeName")
    , @NamedQuery(name = "AssignBus_1.findByBusNo", query = "SELECT a FROM AssignBus_1 a WHERE a.busNo = :busNo")})
public class AssignBus_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "assign_date")
    private String assignDate;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "bus_no")
    private String busNo;

    public AssignBus_1() {
    }

    public AssignBus_1(Integer id) {
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

    public String getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(String assignDate) {
        String oldAssignDate = this.assignDate;
        this.assignDate = assignDate;
        changeSupport.firePropertyChange("assignDate", oldAssignDate, assignDate);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        String oldEmployeeName = this.employeeName;
        this.employeeName = employeeName;
        changeSupport.firePropertyChange("employeeName", oldEmployeeName, employeeName);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
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
        if (!(object instanceof AssignBus_1)) {
            return false;
        }
        AssignBus_1 other = (AssignBus_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.AssignBus_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
