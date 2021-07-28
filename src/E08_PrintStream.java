import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class E08_PrintStream {
	/*
	 	# PrintWriter, PrintStream
	 	 
	 	  - 모든 데이터들을 더 편리하게 스트림으로 내보낼 수 있는 클래스
	 	  - printf(), println()등의 메서드들이 구현되어 있다
	 */
	public static void main(String[] args) {
		
		
		File f = new File("files/myfile.txt");
		
		try(
			// MyFile f = new MyFile("files/myfile.txt"); 이거 한줄이랑 밑에 세줄이랑 같음
			FileOutputStream fout = new FileOutputStream(f);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			PrintStream out = new PrintStream(bout);
		){
			out.println("Hello, world!"); //위에 한줄짜리 사용하면 f.out.println();
			out.println("Hello, world!2");
			out.println("Hello, world!3");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("쓰기 끝");
	}
}

class MyFile extends File implements AutoCloseable{
	
	// OutputStream으로 문자를 내보내는 역할
	FileOutputStream fout;
	BufferedOutputStream bout;
	PrintStream out;
	
	public MyFile(String pathname) throws FileNotFoundException {
		super(pathname);
		fout = new FileOutputStream(this);
		bout = new BufferedOutputStream(fout);
		out = new PrintStream(bout, true, Charset.forName("UTF-8"));
	}

	@Override
	public void close() throws Exception {
		out.close();
		bout.close();
		fout.close();
	}
}
