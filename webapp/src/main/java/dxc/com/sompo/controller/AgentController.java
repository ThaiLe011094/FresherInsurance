package dxc.com.sompo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import dxc.com.sompo.entities.Agent;
import dxc.com.sompo.service.AgentService;

@Controller
public class AgentController {

	@Autowired
	private AgentService agentService;

	@RequestMapping(value={"/", "/agent-list"})
	public String listAgent(Model model) {
		model.addAttribute("listAgent", agentService.findAll());
		return "agent-list";
	}

	@RequestMapping("/agent-save")
	public String insertAgent(Model model) {
		model.addAttribute("agent", new Agent());
		return "agent-save";
	}

	@RequestMapping("/agent-view/{agentId}")
	public String viewAgent(@PathVariable int agentId, Model model) {
		Agent agent = agentService.findById(agentId);
		model.addAttribute("agent", agent);
		return "agent-view";
	}
	
	@RequestMapping("/agent-update/{agentId}")
	public String updateAgent(@PathVariable int agentId, Model model) {
		Agent agent = agentService.findById(agentId);
		model.addAttribute("agent", agent);
		return "agent-update";
	}

	@RequestMapping("/saveAgent")
	public String doSaveAgent(@ModelAttribute("Agent") Agent agent, Model model) {
		agentService.save(agent);
		model.addAttribute("listAgent", agentService.findAll());
		return "agent-list";
	}

	@RequestMapping("/updateAgent")
	public String doUpdateAgent(@ModelAttribute("Agent") Agent agent, Model model) {
		agentService.update(agent);
		model.addAttribute("listAgent", agentService.findAll());
		return "agent-list";
	}
	
	@RequestMapping("/agentDelete/{agentId}")
	public String doDeleteAgent(@PathVariable int agentId, Model model) {
		agentService.delete(agentId);
		model.addAttribute("listAgent", agentService.findAll());
		return "agent-list";
	}
}
