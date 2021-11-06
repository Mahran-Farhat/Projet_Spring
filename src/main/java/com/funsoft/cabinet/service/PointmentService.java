package com.funsoft.cabinet.service;

import com.funsoft.cabinet.model.Pointment;

import java.util.List;
import java.util.Optional;

public interface PointmentService {

    public Pointment saveorupdate(Pointment pointment);
    public Optional<Pointment> find_pointment(long id);
    public void delete_pointment(long id);
    public List<Pointment> list_pointments();
}
