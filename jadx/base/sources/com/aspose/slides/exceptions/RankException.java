package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class RankException extends SystemException {
    public RankException() {
        super("Attempted to operate on an array with the incorrect number of dimensions.");
    }

    public RankException(String str) {
        super(str);
    }

    public RankException(String str, Throwable th) {
        super(str, th);
    }

    public RankException(Throwable th) {
        super(th);
    }
}
