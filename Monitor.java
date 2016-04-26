package dz.module4.monitor;
import java.io.File;
import java.text.SimpleDateFormat;

public class Monitor {
	String file;
	IFileEvent event;
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
	
	public Monitor(String file, IFileEvent event) {
		this.file = file;
		this.event = event;
	}
	
	public void start() {
		while (true) {
			File f = new File(file);
			
			if (f.exists() && f.isFile()) {
				if (event != null) {
                    event.onFileAdded(file);
                    System.out.println(sdf.format(f.lastModified()));
                }
				break;
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			System.out.println("Waiting...");
		}
	}
}
