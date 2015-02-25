/**
 * 
 */
package net.caiban.pc.erp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import net.caiban.pc.erp.domain.Dream;
import net.caiban.pc.erp.persist.DreamMapper;
import net.caiban.pc.erp.service.DreamService;

/**
 * @author parox
 *
 */
@Component("dreamService")
public class DreamServiceImpl implements DreamService {

	@Resource
	private DreamMapper dreamMapper;
	
	@Override
	public Dream queryByEmail(String email) {
		
		return null;
	}

	@Override
	public Integer save(Dream dream) {
		
		dream.setUid(dream.getUid()==null?0:dream.getUid());
		
		dreamMapper.insert(dream);
		
		return dream.getId();
	}

}
