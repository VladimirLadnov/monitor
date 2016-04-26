package dz.module4.monitor;
public class Main {
	public static void main(String[] args) {
		Monitor[] list = {
				new Monitor("c:\\1.txt", new FileEvent()),
				new Monitor("c:\\2.txt", new FileEvent()),
				new Monitor("c:\\3.txt", new FileEvent())

		};

		for(Monitor d : list){
			d.start();
		}
	}
}