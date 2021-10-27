package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("second-api")
public class SecondRest {

	
	@Autowired
	private Client fiegn; 
	
	@GetMapping
	public String hello() {
		String msg = fiegn.callingHello();
		return "Second Microservice got message from  : "+msg;
	}
	@GetMapping("stmts")
	public ResponseEntity<Object> fetchStatements() {
		Transaction tx = fiegn.callingFetchStatements(); 
		Wallet wallet = new Wallet();
		wallet.setWalletNumber(tx.getTransactionId());
		wallet.setAmount(wallet.getAmount() + tx.getAmount());
		return ResponseEntity.status(200).body(wallet);
	}
}
