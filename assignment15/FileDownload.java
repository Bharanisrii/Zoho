package assignment15;


	import java.io.*;
	import java.net.URL;

	public class FileDownload extends Thread {
	    private String fileURL;
	    private String destinationPath;
	    private volatile boolean stopDownload;

	    public FileDownload(String fileURL, String destinationPath) {
	        this.fileURL = fileURL;
	        this.destinationPath = destinationPath;
	        this.stopDownload = false;
	    }

	    public void interruptDownload() {
	        stopDownload = true;
	        interrupt();
	    }

	    @Override
	    public void run() {
	        try {
	            URL url = new URL(fileURL);
	            try (InputStream in = url.openStream();
	                 FileOutputStream out = new FileOutputStream(destinationPath)) {
	                byte[] buffer = new byte[1024];
	                int bytesRead;
	                long totalBytesRead = 0;
	                long fileSize = url.openConnection().getContentLengthLong();

	                while ((bytesRead = in.read(buffer)) != -1 && !stopDownload) {
	                    out.write(buffer, 0, bytesRead);
	                    totalBytesRead += bytesRead;
	                    int percentage = (int) ((totalBytesRead * 100) / fileSize);
	                    System.out.println("Downloaded: " + percentage + "%");
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void main(String[] args) {
	        String fileURL = "https://media.istockphoto.com/id/1313232209/photo/brown-chihuahua-sitting-on-floor-small-dog-in-asian-house-feeling-happy-and-relax-dog.jpg?s=2048x2048&w=is&k=20&c=B4kP3tnbN_0IgJqOmvRZE4m8paRsfpYntTZYQHCync8=";
	        String destinationPath = "downloaded-file.jpg";

	        FileDownload downloader = new FileDownload(fileURL, destinationPath);
	        downloader.start();

	        	        try {
	            Thread.sleep(5000);
	            downloader.interruptDownload();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}


