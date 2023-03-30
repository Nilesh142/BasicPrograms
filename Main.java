import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
 
public class Main{
    public static void main(String args[]) throws IOException{
        FastReader fr = new FastReader();
        FastWriter fw = new FastWriter();
        int l = fr.nextInt();
        int p = fr.nextInt();
        if (l<=23 && p>=500 && p<=1000){
            fw.println("Take Medicine");
        }else{
            fw.println("Don't take Medicine");
        }
 
        fw.flush();
    }
 
    private static StringBuilder solve(int n, int x, int y, int p){
        int pX, pY;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                pX = p - Math.abs(x - i);
                pY = p - Math.abs(y - j);
                if(pX > 0 && pY > 0){
                    sb.append(pX < pY ? pX + " " : pY + " ");
                }
                else{
                    sb.append("0 ");
                }
            }
            sb.append(System.lineSeparator());
        }
        return sb;
    }
}
 
class FastReader{
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;
    private boolean usedNext;
 
    public FastReader(){
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
        usedNext = false;
    }
 
    public FastReader(String file_name) throws IOException{
        din = new DataInputStream(new FileInputStream(file_name));
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
        usedNext = false;
    }
 
    public String readLine() throws IOException{
    	if(usedNext){
    		usedNext = false;
    		readLine();
    	}
        byte[] buf = new byte[110];
        int cnt = 0, c;
        while((c = read()) != -1){
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt).trim();
    }
 
    public int nextInt() throws IOException{
    	usedNext = true;
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if(neg)
            c = read();
        do{
        	ret = ret * 10 + c - '0';
        }while((c = read()) >= '0' && c <= '9');
        if(neg)
        	return -ret;
        return ret;
    }
 
    public long nextLong() throws IOException{
    	usedNext = true;
        long ret = 0;
        byte c = read();
        while(c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if(neg)
            c = read();
        do{
            ret = ret * 10 + c - '0';
        }
        while((c = read()) >= '0' && c <= '9');
        if(neg)
            return -ret;
        return ret;
    }
 
    public double nextDouble() throws IOException{
    	usedNext = true;
        double ret = 0, div = 1;
        byte c = read();
        while(c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if(neg)
            c = read();
        do{
            ret = ret * 10 + c - '0';
        }
        while((c = read()) >= '0' && c <= '9');
        if(c == '.'){
            while ((c = read()) >= '0' && c <= '9'){
                ret += (c - '0') / (div *= 10);
            }
        }
        if(neg)
            return -ret;
        return ret;
    }
 
    private void fillBuffer() throws IOException{
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if(bytesRead == -1)
            buffer[0] = -1;
    }
 
    public byte read() throws IOException{
        if(bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }
}
 
class FastWriter{
	private BufferedWriter bw;
 
	public FastWriter(){
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
	}
 
	public void print(Object o) throws IOException{
		bw.append(o.toString());
	}
 
	public void println(Object o) throws IOException{
		print(o + "\n");
	}
	
	public void flush() throws IOException{
	    bw.flush();
	}
}