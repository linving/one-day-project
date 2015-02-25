package net.caiban.pc.erp.service;

import net.caiban.pc.erp.domain.Dream;

public interface DreamService {

	public Dream queryByEmail(String email);
	
	public Integer save(Dream dream);
	
}
