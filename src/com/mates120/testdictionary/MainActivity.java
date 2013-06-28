package com.mates120.testdictionary;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
//import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent();
//		intent.addCategory(Intent.CATEGORY_LAUNCHER);
		intent.setComponent(new ComponentName("com.mates120.myword", "com.mates120.myword.InstallDictActivity"));
		startActivity(intent);

//		createFileInInternalStorage("dict_file1", "I am dictionary1");
//		createFileInInternalStorage("dict_file2", "I am dictionary2");
//		createFileInInternalStorage("dict_file3", "I am dictionary3");
	}
	
	private void createFileInInternalStorage(String fileName, String fileText)
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
