package com.stock.mvc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

import com.stock.mvc.dao.impl.FlickrDaoImpl;

public class TestFlickr {

	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		FlickrDaoImpl flickr = new FlickrDaoImpl();
		//flickr.auth();
		
		try {
			
			InputStream stream = new FileInputStream(new File("/Users/adlenkhelladi/Desktop/Image/HUNTER.png"));
			String Url = flickr.savePhoto(stream, "myImage");
			System.out.println(Url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	}


