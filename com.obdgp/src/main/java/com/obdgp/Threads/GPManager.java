package com.obdgp.Threads;



public class GPManager {

	public static void main(String[] args) {
		// TODO get the offline configurations 
		
ConfigLoader loader = new ConfigLoader();
loader.start();

    // TODO start web server 
try {
	Thread.sleep(5000); 
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
loader.setShutdown(true);
	}

}
