package odev.kodlama.io.Devs.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import odev.kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import odev.kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import odev.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository=programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage byId(int id) {
		return programmingLanguageRepository.byId(id);
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.add(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);
		
	}

	@Override
	public void update(int id, ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.update(id, programmingLanguage);
		
	}



	

	
	

}
