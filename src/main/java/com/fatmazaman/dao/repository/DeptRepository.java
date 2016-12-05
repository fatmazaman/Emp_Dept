package com.fatmazaman.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import java.io.*;

@NoRepositoryBean
public interface DeptRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>{

}
