package csc.freshertraining.springmvchibernate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import csc.freshertraining.springmvchibernate.dao.AgentDAO;
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

	
	// Homepage

	@RequestMapping(value = { "/", "/index" })
	public String index() {
		return "index";
	}

	
	// Agent Request Mapping

	@RequestMapping(value = {"/agent-list" })
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
	

	@RequestMapping("/agent-search")
	public String search(ModelMap model) {
		model.addAttribute("listAgent", agentService.findAll());
		return "agent-search";
	}
	
	@RequestMapping("/search")
	public String search(ModelMap model, @RequestParam("keywords") String keywords) {
		List<Agent> list = null;
		if(keywords.equals("")) {
			list = agentService.findAll();
		}
		else { 
			list = agentService.search(keywords);
		}
		
		model.addAttribute("listAgent", list);
		return "agent-search";
	}

	

	// Contract Request Mapping

	@RequestMapping(value = { "/contract-list" })
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
		
//		if(agentId )
		
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
	
	@RequestMapping("/contract-search")
	public String searchContract(ModelMap model) {
		model.addAttribute("listContract", contractService.findAll());
		return "contract-search";
	}
	
	@RequestMapping("/searchContract")
	public String searchContract(ModelMap model, @RequestParam("ckeywords") String ckeywords) {
		List<Contract> clist = null;
		if(ckeywords.equals("")) {
			clist = contractService.findAll();
		}
		else { 
			clist = contractService.search(ckeywords);
		}
		
		model.addAttribute("listContract", clist);
		return "contract-search";
	}
	
}
