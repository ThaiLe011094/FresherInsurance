package csc.freshertraining.springmvchibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import csc.freshertraining.springmvchibernate.dao.ContractDAO;
import csc.freshertraining.springmvchibernate.entities.Contract;

@Service
@Transactional
public class ContractService {

	@Autowired
	private ContractDAO contractDAO;

	public List<Contract> findAll() {
		return contractDAO.findAll();
	}

	public Contract findById(final int contractId) {
		return contractDAO.findById(contractId);
	}

	public void save(final Contract contract) {
		contractDAO.save(contract);
	}

	public void update(final Contract contract) {
		contractDAO.update(contract);
	}

	public void delete(final int contractId) {
		Contract contract = contractDAO.findById(contractId);
		if (contract != null) {
			contractDAO.delete(contract);
		}
	}
}
