package com.rakuten.training.iostreams;

import java.io.*;

public class BufferedStreamCopier
{
	public static void main(String[] args)
	{
		try
		{
			copy(System.in, System.out);
		}
		catch(IOException ex)
		{
			System.err.println(ex);
		}
	}
	
	public static void copy(InputStream in, OutputStream out) throws IOException
	{
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out, 1);
		while(true)
		{
			int datum = bin.read();
			if(datum == -1) break;
			bout.write(datum);
		}
		bout.flush();
	}
}
