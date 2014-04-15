/**
 * 
 */
package net.caiban.pc.event.controller;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.caiban.pc.event.domain.events.Events;
import net.caiban.pc.event.service.events.EventsService;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

/**
 * @author mays
 *
 */
@Controller
public class EventsController extends BaseController {
	
	@Resource
	private EventsService eventsService;
	
	@RequestMapping
	public ModelAndView index(HttpServletRequest request, Map<String, Object> out){
		
		return null;
	}
	
	@RequestMapping
	public ModelAndView create(HttpServletRequest request, Map<String, Object> out){
		
		RequestContext requestContext = new RequestContext(request);
		Locale locale = requestContext.getLocale();
		out.put("locale", locale.getLanguage());
		
		return null;
	}
	
	@RequestMapping
	public ModelAndView doCreate(HttpServletRequest request, Map<String, Object> out,
			Events event, String gmtStartStr, String gmtEndStr){
		
		eventsService.initGmt(event, gmtStartStr, gmtEndStr);
		
		eventsService.saveEvent(event);
		
		return new ModelAndView("/events/create");
	}
	
	@RequestMapping
	public ModelAndView ajaxAppendJoin(HttpServletRequest request, Map<String, Object> out, 
			String origin, String originId, String append){
		
		Map<String, Integer> map = eventsService.filterAppendJoiner(origin, originId, append);
		
		return ajaxResult(true, map, out);
	}
}