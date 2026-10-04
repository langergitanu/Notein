package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class PathTooLongException extends IOException {
    public PathTooLongException() {
        super("The specified path, file name, or both are too long. The fully qualified file name must be less than 260 characters, and the directory name must be less than 248 characters.");
    }

    public PathTooLongException(String str) {
        super(str);
    }

    public PathTooLongException(String str, Throwable th) {
        super(str, th);
    }
}
