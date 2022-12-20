

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insuranceapp.entities.Customer;
import com.insuranceapp.entities.Plan;


public interface PlanRepository extends JpaRepository{
	
	
	public List<Plan> findByNameContainingAndPlan(String name, Plan plan);

}
