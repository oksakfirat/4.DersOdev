package odev.kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import odev.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import odev.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> programmingLanguages;
	@Autowired
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages=new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
		
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage byId(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId()== id) {
				return programmingLanguage;
			}
		}
		return null;
		
	}

	@Override
	public void add(ProgrammingLanguage language) {
		if (!(language.getName().trim()=="")) {
			boolean result=true;
			for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
				if (programmingLanguage.getName().toUpperCase().equals(language.getName().toUpperCase())) {
					result=false;
					break;
				}
			}
			if (result) {
				programmingLanguages.add(language);
			}
			
		}	
	}

	@Override
	public void delete(int id) {
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if (programmingLanguage.getId()==id) {
				programmingLanguages.remove(programmingLanguage);
			}
			
		}
		
	}

	@Override
	public void update(int id, ProgrammingLanguage programmingLanguage) {
		programmingLanguages.set(id-1, programmingLanguage);
		
	}

}
