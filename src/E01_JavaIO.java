import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_JavaIO {
	/*
	 	# Java I/O (Input/Output)
	 	
	 	 - �ڹٴ� ��Ʈ���̶�� ������ �̿��� ���α׷��� ��/����� �ٷ��.
	 	 - ���α׷����� ������ ��� �����͵��� �Է��̶�� �θ���(Input)
	 	 - ���α׷����� ���Ǿ� ������ �����͵��� ����̶�� �θ���(Output)
	 	 
	 	# Stream
	 	
	 	 - �����͵��� ������ ���
	 	 - �����͵��� ���������� ���α׷����� ������ ��θ� InputStream�̶�� �θ���
	 	 - �����͵��� ��µǴ� ������ �������� ��θ� OutputStream�̶�� �θ���
	 	 - �����Ͱ� Stream�� ���� �̵��ϱ� ���ؼ��� �����͸� byteŸ������ ��ȯ���Ѿ� �Ѵ� (2�������� ��ȯ�� �� ���ϱ� ����)
	 */
	
	public static void main(String[] args) {
		
		try {
			// FileOutputStream : ���Ϸ� ������ �� �ִ� ��θ� �����Ѵ�.
			FileOutputStream out = new FileOutputStream("a.txt", false); // true�ϸ� ��� ����
			
			out.write(65); //A
			out.write(66); //B
			out.write(67); //C
			out.write(68); //D
			
			out.write("\nHello World!!\n".getBytes());
			
			// �� �� ��δ� �ݵ�� �ݾ���� �Ѵ�.
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
