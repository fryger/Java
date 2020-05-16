package com.company;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Device {
    Double screenSize;
    static final String Version = "latest";
    static final String url = "https://javajestsuper.com/";
    static final String proto = "https";
    List<String> names = new ArrayList<String>() {{
        add("Messenger");
        add("Wykop");
        add("Revolut");
    }};

    @Override
    public void turnOn() {
        System.out.println("Yeeah, I'm turned on");
    }

    public void installAnnApp(String name) throws IOException {
        installAnnApp(name, "latest");
    }

    public void installAnnApp(String name, String Version) throws IOException {
        installAnnApp(name, "latest", "https://javadlaubogich.com/");
    }

    public void installAnnApp(List names) throws IOException {
        for (Object a : names) {
            installAnnApp((String) a);
        }
    }

    public void installAnnApp(String name, String Version, String url) throws IOException {


        try (BufferedInputStream in = new BufferedInputStream(new URL(url, name, Version).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(name)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            // handle exception
        }
    }


}
