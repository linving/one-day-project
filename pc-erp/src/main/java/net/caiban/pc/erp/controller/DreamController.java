/**
 * 
 */
package net.caiban.pc.erp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.caiban.pc.erp.domain.Dream;
import net.caiban.pc.erp.domain.SessionUser;
import net.caiban.pc.erp.service.DreamService;
import net.caiban.pc.erp.util.CookiesUtil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author parox
 *
 */
@Controller
public class DreamController extends BaseController {
	
	@Resource
	private DreamService dreamService;

	@RequestMapping
	public ModelAndView index(HttpServletRequest request, ModelMap model){
		// TODO 填写小梦想
		return null;
	}
	
	@RequestMapping
	@ResponseBody
	public Dream queryDream(HttpServletRequest request, String email){
		//TODO 在email变化的时候检查
		return null;
	}
	
	@RequestMapping
	@ResponseBody
	public ModelAndView saveDream(HttpServletRequest request, HttpServletResponse response, 
			ModelMap model, Dream dream){
		
		SessionUser user = getSessionUser(request);
		
		if(user!=null){
			dream.setUid(user.getUid());
		}
		
		
		dreamService.save(dream);
		
		CookiesUtil.setCookie(response, "dreamFlag", "SETED", null, null);
		
		return null;
	}
	
	@RequestMapping
	public ModelAndView view(HttpServletRequest request, HttpServletResponse response, 
			ModelMap model, String email){
		//TODO 查看梦想
		//TODO 检测 cookie 以便确定新用户还是刚刚填写的用户
		
		Dream dream = dreamService.queryByEmail(email);
		
		model.put("dream", dream);
		
		String flag = CookiesUtil.getCookie(request, "dreamFlag", null);
		model.put("dreamFlag", flag);
		
		return null;
	}
	
}
