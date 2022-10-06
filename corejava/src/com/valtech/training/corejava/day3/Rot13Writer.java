package com.valtech.training.corejava.day3;

import java.io.IOException;
import java.io.Writer;

public class Rot13Writer extends Writer {
	private Writer sink;
	
	public Rot13Writer(Writer sink) {
		this.sink=sink;
	}
	@Override
    public String toString() {
        // TODO Auto-generated method stub
        return sink.toString();
    }
    
    
    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        // TODO Auto-generated method stub
        
        char [] buffer=new char[cbuf.length];
        for (int i = 0; i < len; i++) {
            buffer[i]=Rot13Utility.rotate(cbuf[i]);
            
        }
        sink.write(buffer,off,len);
        
    }
    



   @Override
    public void flush() throws IOException {
        // TODO Auto-generated method stub
        
    }



   @Override
    public void close() throws IOException {
        // TODO Auto-generated method stub
        
    }



}
