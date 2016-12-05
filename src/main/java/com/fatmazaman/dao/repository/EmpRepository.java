package com.fatmazaman.dao.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.yaml.snakeyaml.events.Event.ID;

import com.fatmazaman.dao.model.Emp;

@NoRepositoryBean
public interface EmpRepository extends DeptRepository<Emp, ID>{
}
