package springangularjs.springangularjs.repositories;
/**
 * @author guilherme
 *	@date 06/06/2018
 */
import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;
 import springangularjs.springangularjs.entities.Server;

@Repository
public interface ServerRepository extends JpaRepository<Server, Integer>{

}