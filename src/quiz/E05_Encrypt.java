package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E05_Encrypt {
	
	// frankenstein.txt�� ��ȣȭ�� ���� frankenstein_encrypted.txt�� ��������
	// 	�� ���谪�� ���������� ������ ���� ����� ���ͼ��� �ȵ�
	
	/*
	 # ��ȣ ���谪�� 2�� ���
	 	  +2
	 	C --> E
	 	A --> C
	 	R --> T
	 	
	 	CAR --> ECT
	 	ZOO --> BQ
	*/
	
	public static void main(String[] args) {
		
		int randomKey = (int)(Math.random() * 26);
		int keyValue = randomKey;
		
		System.out.println("���谪 : " + keyValue);
		
		File franken = new File("frankenstein");
		File franken_copy = new File("frankenstein_copy");
		
		if(!franken_copy.exists()) {
			franken_copy.mkdir();
		}
		
		File[] franken_files = franken.listFiles();
		
		for(File file : franken_files) {
			System.out.println(file);
			
			if(file.isDirectory()) {
				File new_dir = new File(franken_copy, file.getName());
				new_dir.mkdirs();
				
				File[] inner_files = file.listFiles();
				
				for(File file2 : inner_files) {
					System.out.println(file2);
				}
			}else {
				FileInputStream in = null;
				try {
					in = new FileInputStream(file);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				FileOutputStream out = null;
				try {
					out = new FileOutputStream(new File(franken_copy,file.getName()));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				int _byte = -1;
				try {
					while((_byte = in.read()) != -1) {
						out.write(_byte);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	
	}
}








