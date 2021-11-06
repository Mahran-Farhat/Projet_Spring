package com.funsoft.cabinet.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="firstname_patient",length = 30,nullable = false,unique = true)
    private String firstname;
    private String lastname;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    private List<Pointment> pointments;

}
