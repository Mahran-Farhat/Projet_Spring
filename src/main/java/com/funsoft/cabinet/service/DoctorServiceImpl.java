package com.funsoft.cabinet.service;

import com.funsoft.cabinet.Repository.DoctorRepository;
import com.funsoft.cabinet.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    DoctorRepository agent;

    @Override
    public Doctor saveorupdate(Doctor doctor) {
        return this.agent.save(doctor);
    }

    @Override
    public Optional<Doctor> find_doctor(long id) {
        return this.agent.findById(id);
        // select * from doctors where id = :id
    }

    @Override
    public void delete_doctor(long id) {
        agent.deleteById(id);
        // delete from doctors where id = :id
    }

    @Override
    public List<Doctor> list_doctors() {
        return this.agent.findAll();
        // select * from doctors
    }

    @Override
    public List<Doctor> find_specialite(String spec) {
        return this.agent.findBySpecialite(spec);
    }

    @Override
    public List<Doctor> advanced_search(String spec, String pseudo) {
        return this.agent.search(spec,"%"+pseudo+"%");
    }
}
