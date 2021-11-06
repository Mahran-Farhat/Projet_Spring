package com.funsoft.cabinet.service;

import com.funsoft.cabinet.Repository.PointmentRepository;
import com.funsoft.cabinet.model.Pointment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PointmentServiceImpl implements PointmentService{

    @Autowired
    PointmentRepository agent;

    @Override
    public Pointment saveorupdate(Pointment pointment) {
        return agent.save(pointment);
    }

    @Override
    public Optional<Pointment> find_pointment(long id) {
        return agent.findById(id);
    }

    @Override
    public void delete_pointment(long id) {
        agent.deleteById(id);
    }

    @Override
    public List<Pointment> list_pointments() {
        return (List<Pointment>) agent.findAll();
    }
}
