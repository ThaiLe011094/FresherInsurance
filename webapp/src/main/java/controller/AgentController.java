package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
		return "agentCreate";
	}

	/*
	 * This method will be called on form submission, handling POST request It
	 * also validates the user input
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String saveRegistration(@Valid Agent agent, BindingResult result, ModelMap model) {

		if (result.hasErrors()) {
			return "agentCreate";
		}

		model.addAttribute("success", "Dear " + agent.getAgentName() + " , your Registration completed successfully");
		return "agentCreate";
	}

	
}
