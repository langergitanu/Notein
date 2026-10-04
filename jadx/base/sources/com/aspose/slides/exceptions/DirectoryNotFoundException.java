package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class DirectoryNotFoundException extends IOException {
    public DirectoryNotFoundException() {
        super("Attempted to access a path that is not on the disk.");
    }

    public DirectoryNotFoundException(String str) {
        super(str);
    }

    public DirectoryNotFoundException(String str, Throwable th) {
        super(str, th);
    }
}
