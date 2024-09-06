/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnc.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "import_wh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImportWh.findAll", query = "SELECT i FROM ImportWh i"),
    @NamedQuery(name = "ImportWh.findById", query = "SELECT i FROM ImportWh i WHERE i.id = :id"),
    @NamedQuery(name = "ImportWh.findByDateIm", query = "SELECT i FROM ImportWh i WHERE i.dateIm = :dateIm"),
    @NamedQuery(name = "ImportWh.findByProductId", query = "SELECT i FROM ImportWh i WHERE i.productId = :productId"),
    @NamedQuery(name = "ImportWh.findByQuantity", query = "SELECT i FROM ImportWh i WHERE i.quantity = :quantity")})
public class ImportWh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_im")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateIm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Column(name = "quantity")
    private Integer quantity;

    public ImportWh() {
    }

    public ImportWh(Integer id) {
        this.id = id;
    }

    public ImportWh(Integer id, int productId) {
        this.id = id;
        this.productId = productId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateIm() {
        return dateIm;
    }

    public void setDateIm(Date dateIm) {
        this.dateIm = dateIm;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
        if (!(object instanceof ImportWh)) {
            return false;
        }
        ImportWh other = (ImportWh) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hnc.pojo.ImportWh[ id=" + id + " ]";
    }
    
}
