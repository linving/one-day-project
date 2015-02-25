/**
 * 
 */
package net.caiban.pc.erp.persist;

import net.caiban.pc.erp.domain.Dream;

/**
 * @author parox
 *
 */
public interface DreamMapper {

	public Dream queryByEmail(String email);
	
	public Integer insert(Dream dream);
}
