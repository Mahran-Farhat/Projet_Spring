package com.funsoft.cabinet.Repository;

import com.funsoft.cabinet.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Long> {
}
