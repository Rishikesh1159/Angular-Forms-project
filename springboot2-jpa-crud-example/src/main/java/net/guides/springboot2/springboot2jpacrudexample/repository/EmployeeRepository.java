/*--Rishikesh Pasham
Sivaram Prasad Muthe
Sreemanth Krishna Tirumala*/
/*This class is repository class it uses jpa*/

package net.guides.springboot2.springboot2jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
