
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.commons.io.IOUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harsh
 */
public class FutureDemo {
    
    //final String contents = downloadContents(new URL("http://www.example.com"));
    
    private final ExecutorService pool = Executors.newFixedThreadPool(10);
    
    //
    public void getFuture () throws MalformedURLException, InterruptedException, ExecutionException {
        Future<String> contentsFuture = startDownloading(new URL("http://www.example.com"));
        
        String contents = contentsFuture.get();
    
    }


    public String downloadContents(URL url) throws IOException,MalformedURLException {
        try (InputStream input  = url.openStream() ) {
            return IOUtils.toString(input);
        } catch (Exception e){
            System.out.print("Exception");
            return null;
        }
    }
    
    public Future<String> startDownloading(URL url) throws IOException {
        return pool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                try (InputStream input = url.openStream()) {
                    return IOUtils.toString(input, "UTF-8");
                }
            }
        
        }); 
    }
    
    
}
