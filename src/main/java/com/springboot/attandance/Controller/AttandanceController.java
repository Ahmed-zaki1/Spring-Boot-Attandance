package com.springboot.attandance.Controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springboot.attandance.repository.AttandanceRepo;
import com.springboot.attandance.service.AttandanceService;
@Controller
public class AttandanceController {
	@Autowired
	AttandanceService Service;
	@Autowired
	AttandanceRepo AttandanceRepository;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}
	@RequestMapping(value = "/Attandance", method = RequestMethod.GET)
	public String showAttandances(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("Attandance", Service.retrieveAttandances(name));
		return "Attandance";
	}
	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(principal instanceof UserDetails) {
			return ((UserDetails)principal).getUsername();
		}
		return principal.toString();
	}
}