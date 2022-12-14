package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перемещение файлов
Напиши программу, которая будет считывать с клавиатуры пути к двум директориям и перемещать файлы из одной директории в другую (только файлы, директории игнорируй).
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> dir = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : dir) {
                if (Files.isRegularFile(path)) {
                    Files.move(path, targetDirectory.resolve(path.getFileName()));
                }
            }
        }
        //напишите тут ваш код
    }
}

