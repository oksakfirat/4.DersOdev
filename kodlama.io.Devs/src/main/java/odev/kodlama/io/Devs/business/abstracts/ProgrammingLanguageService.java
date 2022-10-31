package odev.kodlama.io.Devs.business.abstracts;

import java.util.List;

import odev.kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage byId(int id);
	public void add(ProgrammingLanguage programmingLanguage);
	public void delete(int id);
	public void update(int id,ProgrammingLanguage programmingLanguage);

}
