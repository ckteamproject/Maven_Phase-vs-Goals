package com.projects;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello from App.main()");
        System.out.println("Args: " + java.util.Arrays.toString(args));
        Path marker = Path.of("target", "exec-package-run.txt");
        Files.createDirectories(marker.getParent());
        Files.writeString(marker, "Exec ran at: " + Instant.now() + " args: " + java.util.Arrays.toString(args));
        System.out.println("Wrote " + marker.toAbsolutePath());
    }
}
