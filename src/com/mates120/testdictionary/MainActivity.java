package com.mates120.testdictionary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
//import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		createSomeFiles("dict_file1", "I am dictionary1");
		createSomeFiles("dict_file2", "I am dictionary2");
		createSomeFiles("dict_file3", "I am dictionary3");
	}
	
	private void createSomeFiles(String fileName, String fileText)
	{
		FileOutputStream fileHandler = null;
		try {
			fileHandler = openFileOutput(fileName, Context.MODE_PRIVATE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fileHandler.write(fileText.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fileHandler.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
