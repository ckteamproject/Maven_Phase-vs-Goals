package com.example;

import java.nio.file.*;
import java.time.Instant;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello from App.main()");
        System.out.println("Args: " + java.util.Arrays.toString(args));
        Path marker = Path.of("target", "exec-package-run.txt");
        Files.createDirectories(marker.getParent());
        Files.writeString(marker, "Exec ran at: " + Instant.now());
        System.out.println("Wrote " + marker.toAbsolutePath());
    }
}
