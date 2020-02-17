/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mehdiyevcs.domain;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Incognito
 */
@Entity
@Table(name="address")
@NamedQueries({
    @NamedQuery(name = "Address.findAll",query = "select a from Address a")
})
public @Data class Address {
    
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_address; 
    private String street_name;
    private String street_number;
    private String country;
    private int version=0;
    private int deleted=0;
    
}
