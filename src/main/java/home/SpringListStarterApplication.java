package home;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import home.beans.Owner;
import home.beans.Pet;
import home.controller.BeanConfiguration;
import home.repository.PetRepository;

@SpringBootApplication
public class SpringListStarterApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringListStarterApplication.class, args);
		
	}
	
	@Autowired
	PetRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Pet p = appContext.getBean("pet", Pet.class);
		repo.save(p);
		
		
		Pet p2 = new Pet("Ro", "Calico", 2);
		Owner o = new Owner("Spencer", "Davis");
		p2.setOwner(o);
		repo.save(p2);

		
		List<Pet> allMyPets = repo.findAll();
		for(Pet pets: allMyPets) {
			System.out.println(pets.toString());
		}
		
		((AnnotationConfigApplicationContext) appContext).close();
	}
}
