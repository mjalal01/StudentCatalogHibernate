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
@Table(name="student")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")})
public @Data class Student {
    
    @Column
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_student;
    private String name;
    private int version=0;
    private int deleted=0;
    
    @JoinColumn(name="id_address",referencedColumnName = "id_address")
    @ManyToOne(cascade = CascadeType.ALL)
    private Address address;
}
