package com.example.demo.Repository;

import com.example.demo.Entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IAdminRepository extends JpaRepository<Admin, Integer> {


}













/*   //void addEngineer(Engineer engine);
@Query(value="select engineer u set u.domain=:n,where u.employeeId=id",nativeQuery=true)
void changeDomain(@Param("id") int id,@Param("d") String domain);
//void removeEngineer(int id);
@Query(value="select u from Complaint u where u.prodctModelNumber=:p",nativeQuery=true)
List<Complaint> getComlpaintByProduct(@Param("p") String prodctModelNumber);

@Query(value="select * from complaint ",nativeQuery=true)
List<Complaint >getComplaints();
//List<Complaint >getComplaints(String complain);

@Query(value="update engineer u set u.engineerName=:n, where u.employeeId=:id",nativeQuery=true)
Complaint replaceEngineerFromComplaint(@Param("n") String name,@Param("id") int id);


void save(Engineer engineer);*/