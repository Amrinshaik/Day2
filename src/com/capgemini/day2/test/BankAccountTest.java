package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day2.BankAccount;

class BankAccountTest {
	BankAccount account;

	@BeforeEach
	void setUp() {
		account = new BankAccount(1234, "john", "SAVING", 50000);
	}

	@Test
	void testWithdraw() {
		assertEquals(45000.0, account.withdraw(5000), 0.04);
		assertEquals(38000.0, account.withdraw(7000), 0.04);
		assertEquals(33432.66, account.withdraw(4567.34), 0.04);
		assertEquals(33432.66, account.withdraw(120000), 0.04);
	}

	@Test
	void testDeposit() {
		assertEquals(55000.0, account.deposit(5000));
		assertEquals(59567.34, account.deposit(4567.34));
	}
	@Test
	void TotalBankAcounts() {
		assertEquals(1, BankAccount.totalBankAccounts());
	
	}

	@AfterEach
	void tearDown() {
		account = null;
	}
}
