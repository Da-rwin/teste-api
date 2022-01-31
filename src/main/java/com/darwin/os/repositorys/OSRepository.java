package com.darwin.os.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.darwin.os.domain.OS;

@Repository
public interface OSRepository extends JpaRepository<OS, Integer>{

}
