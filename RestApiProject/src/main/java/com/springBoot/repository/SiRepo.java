package com.springBoot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.entities.SignUp;
public interface SiRepo  extends JpaRepository<SignUp,Long>
{

}
