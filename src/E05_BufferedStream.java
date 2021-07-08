import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_BufferedStream {
	/*
	 	# Buffered
	 	
	 	 - �����͸� �аų� �� �� ��Ʈ���� �� ���ھ� ������ �����ϴ� �� ���� 
	 	       �ѹ��� ���� ���� �����͸� �ּ������� ����ϴ� ���� ���ɻ� �����ϴ�
	 	 - ���� ����� �̸� ������ Ŭ�������� �տ� Buffered��� �̸��� �پ� �ִ�
	 */
	
	public static void main(String[] args) {
		
		// byte����� ���ڰ� �ƴ� ��� �͵��� ������ �� ����Ѵ�. (InputStream, OutputStream)
	
		try {
			BufferedOutputStream out = new BufferedOutputStream(
					new FileOutputStream("files/d.txt"),2048);
			
			//�������� ����
			for(int i=0; i<100; ++i) {
				System.out.println("�ȳ��ϼ��� �ݰ����ϴ�.\n".getBytes());
			}
			
			//out.flush();	//���� ���� �˾Ƽ� ������
			
			out.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		// char ����� ���ڸ� ������ �� ����Ѵ� (Reader, Writer)
		BufferedWriter out;
		try {
			out = new BufferedWriter(
					new FileWriter("files/e.txt", Charset.forName("MS949")), 2048);
			
			for(int i=0; i<1000; ++i) {
				out.write("�ȳ��ϼ��� �ݰ����ϴ�.\n");
			}
			
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("�� ����ϴ�.");
		
		// try-catch�� AutoClose
		try(BufferedReader in = new BufferedReader(
				new FileReader("files/e.txt", Charset.forName("EUC-KR")),2048)){
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
}













