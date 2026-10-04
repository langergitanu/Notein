package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FileCorruptedException extends Exception {
    public FileCorruptedException(String str) {
        super(str);
    }

    private FileCorruptedException(String str, Exception exc) {
        super(str, exc);
    }

    public FileCorruptedException(Exception exc) {
        this("The document appears to be corrupted and cannot be loaded.", exc);
    }
}
