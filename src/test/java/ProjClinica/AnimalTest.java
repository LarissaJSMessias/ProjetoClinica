package ProjClinica;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.ProjClinica.model.models.Animal;
import com.ProjClinica.model.service.AnimalService;



public class AnimalTest {
	
	//@Test (expected = Exception.class)
	public void SalvarAnimalBancoDadosTeste() {
		
		
		Animal animal = new Animal();
		
		
		animal.setNome_animal("Bili");
		animal.setEspecie("Cachoro");
		animal.setRaca("pintcher");
		animal.setSexo("Masculino");
		animal.setNome_dono("Matheus Ferreira");
		animal.setTelefone("999201132");
		
		
		AnimalService animalService = new AnimalService();
		
		animalService.save(animal);
		System.out.println("gravando animal no banco de dados ");
			
	}
	
	//@Test (expected = Exception.class)
		public void excluirAnimalDaTabela() {
			Animal animal = new Animal();
			animal.setId(2);
			AnimalService animalService = new AnimalService();
			
			animalService.delete(animal);
			System.out.println("animal excluído do banco de dados ");
			
			
		}
	
	
	   //@Test (expected = Exception.class)
		public void alterarAnimalBancoDadosTeste() {
			
			Animal animal = new Animal();
				
			animal.setId(1);
			
			AnimalService animalService = new AnimalService();
		
			animal =  animalService.findById(animal.getId());
			
			System.out.println(animal.toString());
			
			animal.setRaca("pincthers");
			
			animalService.update(animal);
			System.out.println("alteração do animal no banco de dados ");
			
		
			
		}
	
	

	
	
	
}
