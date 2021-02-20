package com.daksh.designpatterns.strategy;

public class AES implements EncryptionAlgorithm {

	@Override
	public void encrypt(String message) {
		System.out.println("Encrypting message using AES");
	}

}
