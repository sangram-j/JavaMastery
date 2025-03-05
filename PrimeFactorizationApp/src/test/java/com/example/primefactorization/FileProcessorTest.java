package com.example.primefactorization;

import com.example.primefactorization.fileprocessor.FileProcessor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
public class FileProcessorTest {
    @Test
    void testProcessFileWithValidInput() throws Exception {

        String testFilePath = "src/main/resources/test_input.txt";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        FileProcessor.processFile(testFilePath);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("12 -> 2,2,3"));
        assertTrue(output.contains("25 -> 5,5"));

        System.setOut(System.out);
    }
}
