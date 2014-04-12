/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repositories;
import domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
/**
 *
 * @author soffo
 */
public interface PersonRepository extends  PagingAndSortingRepository<Person, Long>{
    
}
