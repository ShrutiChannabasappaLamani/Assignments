package com.valtech.tx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.tx.entity.Tx;
import com.valtech.tx.service.TxService;

@RestController
public class TxRestController {
	@Autowired
	private TxService txService;
	
	@PostMapping("/api/tx")
	public Tx createTx(Tx tx) {
		return txService.createTx(tx);
	}
	@PutMapping("/api/tx/{id}")
	public Tx updateTx(Tx tx) {
		return txService.updateTx(tx);
	}
	@GetMapping("/api/tx/{id}")
	public Tx getTx(long id) {
		return txService.getTx(id);
	}
	@GetMapping("/api/tx")
	public List<Tx> geAllTx() {
		return txService.geAllTx();
	}
	
}

