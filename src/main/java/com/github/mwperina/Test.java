package com.github.mwperina;

/**
 * Simple test class
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(
                String.format("Executed as '%s'",
                        ProcessHandle.current().info().commandLine().get()));
    }
}
