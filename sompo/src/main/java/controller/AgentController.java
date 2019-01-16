package controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Agent;

@Controller
@RequestMapping("/")
public class AgentController {
	/*
	 * This method will serve as default GET handler.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String newRegistration(ModelMap model) {
		Agent agent = new Agent();
		model.addAttribute("agent", agent);
		return "enroll";
	}

	/*
	 * This method will be called on form submission, handling POST request It
	 * also validates the user input
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String saveRegistration(@Valid Agent agent, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "enroll";
		}

		model.addAttribute("success", "Dear " + agent.getagentName() + " , your Registration completed successfully");
		return "success";
	}

	
}
