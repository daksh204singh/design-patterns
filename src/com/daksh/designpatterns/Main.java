package com.daksh.designpatterns;

import com.daksh.designpatterns.strategy.BlackAndWhiteFilter;
import com.daksh.designpatterns.strategy.ImageStorage;
import com.daksh.designpatterns.strategy.JpegCompressor;
import com.daksh.designpatterns.strategy.PngCompressor;

public class Main {
    public static void main(String[] args) {
    	var imageStorage = new ImageStorage();
    	imageStorage.store("a",
    				new JpegCompressor(),
    				new BlackAndWhiteFilter());
    	imageStorage.store("a", 
    			new PngCompressor(), 
    			new BlackAndWhiteFilter());
    }
}