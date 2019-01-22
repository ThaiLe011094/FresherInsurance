package csc.freshertraining.springmvchibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import csc.freshertraining.springmvchibernate.entities.Agent;
import csc.freshertraining.springmvchibernate.service.AgentService;

import csc.freshertraining.springmvchibernate.entities.Contract;
import csc.freshertraining.springmvchibernate.service.ContractService;

@Controller
public class AgentController {

	@Autowired
	private AgentService agentService;
	
	@Autowired
	private ContractService contractService;

	
	// Agent Request Mapping
	
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
	
	
	
	// Contract Request Mapping
	
	@RequestMapping(value={"/contract-list"})
	public String listContract(Model model) {
		model.addAttribute("listContract", contractService.findAll());
		return "contract-list";
	}

	@RequestMapping("/contract-save")
	public String insertContract(Model model) {
		model.addAttribute("contract", new Contract());
		return "contract-save";
	}

	@RequestMapping("/contract-view/{contractId}")
	public String viewContract(@PathVariable int contractId, Model model) {
		Contract contract = contractService.findById(contractId);
		model.addAttribute("contract", contract);
		return "contract-view";
	}
	
	@RequestMapping("/contract-update/{contractId}")
	public String updateContract(@PathVariable int contractId, Model model) {
		Contract contract = contractService.findById(contractId);
		model.addAttribute("contract", contract);
		return "contract-update";
	}

	@RequestMapping("/saveContract")
	public String doSaveContract(@ModelAttribute("Contract") Contract contract, Model model) {
		contractService.save(contract);
		model.addAttribute("listContract", contractService.findAll());
		return "contract-list";
	}

	@RequestMapping("/updateContract")
	public String doUpdateContract(@ModelAttribute("Contract") Contract contract, Model model) {
		contractService.update(contract);
		model.addAttribute("listContract", contractService.findAll());
		return "contract-list";
	}
	
	@RequestMapping("/contractDelete/{contractId}")
	public String doDeleteContract(@PathVariable int contractId, Model model) {
		contractService.delete(contractId);
		model.addAttribute("listContract", contractService.findAll());
		return "contract-list";
	}

}
