package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class EndOfStreamException extends IOException {
    public EndOfStreamException() {
        super("Attempted to read past the end of the stream.");
    }

    public EndOfStreamException(String str) {
        super(str);
    }

    public EndOfStreamException(String str, Throwable th) {
        super(str, th);
    }
}
