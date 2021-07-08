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
	 * - InputStream과 OutputStream은 데이터를 byte 단위로 전송한다 - 데이터가 스트림을 통과하기 위해서는 바이트 단위로
	 * 데이터를 나눠야하기 때문에 1바이트 이상의 데이터는 다시 합치는 과정이 필요하다
	 *
	 */

	public static void main(String[] args) {

		try {
			File testFile = new File("files/c.txt");
			Charset charset = Charset.forName("UTF-8");
			
			FileWriter out = new FileWriter(testFile, charset);

			out.write("문자열을 편하게 쓸수있네\n");
			out.write("getBytes도 안쓰고\n");

			for (String charset_name : Charset.availableCharsets().keySet()) {
				out.write(charset_name + "\n");
			}

			out.close();
			
			FileReader in = new FileReader(testFile, charset);
			
			char[] buffer = new char[2048];
			
			int len = -1;		//아무것도 안읽었을때 -1
			
			while((len = in.read(buffer)) != -1) {		
				System.out.println(new String(buffer, 0, len));	//0~2048까지 읽어들인 것
			}
			
			in.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// 쓸 때의 인코딩 타입과 읽을 때의 인코딩 타입이 일치해야 한다 .
		try {
			File testFile = new File("files/b.txt");
			FileOutputStream out1 = new FileOutputStream(testFile);

			String message = "안녕하헤효";

			//getBytes() 메서드는 문자열을 바이트로 쪼갤때의 방식을 선택할 수 있다.
			// 유명 charset: UTF-8, EUC-KR, MS949...

			out1.write(message.getBytes("UTF-8")); // 쓸때 했던 언어로!

			out1.close();

			FileInputStream in = new FileInputStream(testFile);

			byte[] buffer = new byte[1024];
			
			// in.read(): 한 바이트씩 읽을 때는 바이트가 나온다
			// in.read(배열): 이번에 읽어들인 문자의 개수가 리턴
			int len = in.read(buffer);		// len = 유효한것의 갯수 (나머진 쓰레기)
			
			System.out.println(new String(buffer, 0, len, "UTF-8")); // 출력도 똑같이 해야한다!	, 0부터 10까지 유효한것을 문자열로 만든다(UTF-8로).
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}