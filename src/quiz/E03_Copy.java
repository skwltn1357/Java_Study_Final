package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E03_Copy {
	/*
	 * image ���� ������ ��� ������ image_copy ���� ���η� �����غ�����
	 * 
	 * EASY : �׳� ���۸� �ϸ� ����
	 * HARD : ���߿� ���� ������ ���� �̸��� ���ϴ��� �ùٸ��� �����ϸ� ����
	 */

	public static void main(String[] args) throws IOException {
		File src = new File("image");
		File dst = new File("image_copy");
		
		if(!dst.exists()) {
			dst.mkdir();
		}
		
		File[] src_files = src.listFiles();
		
		for(File file : src_files) {
			System.out.println(file);
			System.out.println("���丮 ���� : " + (file.isDirectory() ? "Y" : "N"));
			System.out.println("---------------------------------");
			
			if(file.isDirectory()) {
				System.out.println("Dir to creat : " + file.getName());	//���� �������ϴ� ���� �̸�
				
				File new_dir = new File(dst, file.getName()); //dst(�θ�)
				new_dir.mkdirs();
				
				File[] inner_files = file.listFiles();
				
				for(File file2 : inner_files) {
					System.out.println(file2);
					System.out.println("���丮 ���� : " + (file2.isDirectory() ? "Y" : "N"));
					System.out.println("---------------------------------");
					
					
				}
			}else {
				FileInputStream in = new FileInputStream(file);
				FileOutputStream out = new FileOutputStream(new File(dst,file.getName()));
				
				byte[] buffer = new byte[2048];
				
				//�ѱ��ھ� �о ����
				int _byte = -1;
				while((_byte = in.read()) != -1) {
					out.write(_byte);
				}
				
				//copyOf�� ���� (�� ����� �� ȿ����)
//				int len = -1;
//				while((len = in.read(buffer)) != -1) {
//					out.write(Arrays.copyOf(buffer, len));
//				}
				
				out.close();
				in.close();
			}
		}

		System.out.println("���簡 ��� �������ϴ�.");
	}
}


