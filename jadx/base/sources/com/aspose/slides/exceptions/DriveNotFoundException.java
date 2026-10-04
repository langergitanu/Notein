package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class DriveNotFoundException extends IOException {
    public DriveNotFoundException() {
        super("Attempted to access a drive that is not available.");
    }

    public DriveNotFoundException(String str) {
        super(str);
    }

    public DriveNotFoundException(String str, Throwable th) {
        super(str, th);
    }
}
