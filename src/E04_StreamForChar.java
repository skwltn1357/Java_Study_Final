import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E04_StreamForChar {
	/*
	 * # Reader/Writer
	 *
	 * - InputStream�� OutputStream�� �����͸� byte ������ �����Ѵ� - �����Ͱ� ��Ʈ���� ����ϱ� ���ؼ��� ����Ʈ ������
	 * �����͸� �������ϱ� ������ 1����Ʈ �̻��� �����ʹ� �ٽ� ��ġ�� ������ �ʿ��ϴ�
	 *
	 */

	public static void main(String[] args) {

		try {
			File testFile = new File("files/c.txt");
			Charset charset = Charset.forName("UTF-8");
			
			FileWriter out = new FileWriter(testFile, charset);

			out.write("���ڿ��� ���ϰ� �����ֳ�\n");
			out.write("getBytes�� �Ⱦ���\n");

			for (String charset_name : Charset.availableCharsets().keySet()) {
				out.write(charset_name + "\n");
			}

			out.close();
			
			FileReader in = new FileReader(testFile, charset);
			
			char[] buffer = new char[2048];
			
			int len = -1;		//�ƹ��͵� ���о����� -1
			
			while((len = in.read(buffer)) != -1) {		
				System.out.println(new String(buffer, 0, len));	//0~2048���� �о���� ��
			}
			
			in.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// �� ���� ���ڵ� Ÿ�԰� ���� ���� ���ڵ� Ÿ���� ��ġ�ؾ� �Ѵ� .
		try {
			File testFile = new File("files/b.txt");
			FileOutputStream out1 = new FileOutputStream(testFile);

			String message = "�ȳ�����ȿ";

			//getBytes() �޼���� ���ڿ��� ����Ʈ�� �ɰ����� ����� ������ �� �ִ�.
			// ���� charset: UTF-8, EUC-KR, MS949...

			out1.write(message.getBytes("UTF-8")); // ���� �ߴ� ����!

			out1.close();

			FileInputStream in = new FileInputStream(testFile);

			byte[] buffer = new byte[1024];
			
			// in.read(): �� ����Ʈ�� ���� ���� ����Ʈ�� ���´�
			// in.read(�迭): �̹��� �о���� ������ ������ ����
			int len = in.read(buffer);		// len = ��ȿ�Ѱ��� ���� (������ ������)
			
			System.out.println(new String(buffer, 0, len, "UTF-8")); // ��µ� �Ȱ��� �ؾ��Ѵ�!	, 0���� 10���� ��ȿ�Ѱ��� ���ڿ��� �����(UTF-8��).
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}