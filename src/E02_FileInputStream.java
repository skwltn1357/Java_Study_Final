import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class E02_FileInputStream {
	
	public static void main(String[] args) {
		try {
			// 파일을 읽어들이는 통로
			FileInputStream in = new FileInputStream("a.txt");
			
			/*
			  InputStream.read() : 한 바이트씩 읽어들인다. (한글이 깨진다)
			  InputStream.read(byte[]) : 파일의 데이터를 byte[]의 크기만큼 읽어들인다.
			  InputStream.read(byte[], start, end) : 버퍼의 일부분에만 읽기가 가능하다
			  
			  	세 메서드 모두 더이상 읽을 것이 없다면 -1을 반환한다.
			 */
			byte[] buffer = new byte[16];
			//line1:
			buffer[0] = 'l';
			buffer[1] = 'i';
			buffer[2] = 'n';
			buffer[3] = 'e';
			buffer[5] = ':';
			
			int len = -1, count = 0;
			while((len = in.read(buffer, 6, 10)) != -1) {    //6번째 위치부터 10글자 읽어주세요.
				buffer[4] = (byte)(count++ + '0');
				
				System.out.println(new String(buffer));
				System.out.println("--------------------------");
				
			}
			
			
//			// 여러 글자(byte)를 읽을 때 사용
//			byte[] buffer = new byte[10];
//			
//			int len = -1;
//			while((len = in.read(buffer)) != -1) {
//				System.out.println(Arrays.toString(buffer));
//				System.out.printf("-- %d글자\n",len);
//			}
//			
			
			//한글자씩 읽을 때 사용
//			int ch = -1;
//			while((ch = in.read()) != -1) {
//				System.out.println((char)ch);
//			}
			
			
//			while(true) {
//				int ch = in.read();
//				
//				if(ch == -1) {
//					System.out.println("파일의 끝까지 읽었습니다!");
//					break;
//				}else {
//					System.out.println((char)ch);
//				}
//			}

			in.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
