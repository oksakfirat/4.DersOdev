package odev.kodlama.io.Devs.webApi.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import odev.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import odev.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@RestController
@RequestMapping("/api/ProgrammingLanguage")
public class ProgrammingLanguageController {
	private ProgrammingLanguageService programmingLanguageService;
	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService=programmingLanguageService;
		
	}
	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll(){
		return this.programmingLanguageService.getAll();
	}
	
	@GetMapping("/{id}")
	ProgrammingLanguage byId(@PathVariable int id) {
		return programmingLanguageService.byId(id);
	}
	
	@PostMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.add(programmingLanguage);
	}
	@DeleteMapping("/delete")
	public void delete(int id) {
		programmingLanguageService.delete(id);
	}
	@PutMapping("/update")
	public void update(int id,ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.update(id, programmingLanguage);
	}
	
	

}
