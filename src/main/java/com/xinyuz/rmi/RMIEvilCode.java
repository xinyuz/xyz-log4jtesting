package com.xinyuz.rmi;

import java.io.IOException;

@SuppressWarnings("unused")
public class RMIEvilCode {

    static {
        System.out.println("Running the unexpected code1. ");

        try {
            Runtime.getRuntime().exec(new String[] { "/usr/bin/open", "-a", "/Applications/Google Chrome.app", "http://www.github.com/" });
            ProcessBuilder pb       = new ProcessBuilder("open", "/Applications/Google Chrome.app");
            Process        p        = pb.start();
            int            exitCode = p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
