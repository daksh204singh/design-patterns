package com.daksh.designpatterns.strategy;

// Context
public class ImageStorage {
	public void store(String fileName, Compressor compressor, Filter filter) {
		// Delegation
		
		// JPEG, PNG, ...
		compressor.compress(fileName);
		
		// B&W, High Contrast
		filter.apply(fileName);
	}
}
