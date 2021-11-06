package com.funsoft.cabinet.Repository;

import com.funsoft.cabinet.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.print.Doc;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    public List<Doctor> findByLastname(String lastname);
    public List<Doctor> findByLastnameAndFirstname(String lastname,String firstname);
    public List<Doctor> findBySpecialite(String specialite);

    @Query(value = "select d from Doctor d where d.specialite = :spec "+
    "and (d.firstname like :pseudo or d.lastname like :pseudo)")
    public List<Doctor> search(@Param("spec") String spec, @Param("pseudo") String p);
}
