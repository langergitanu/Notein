package com.aspose.slides.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public final class DataMisalignedException extends SystemException {
    public DataMisalignedException() {
        super("A datatype misalignment was detected in a load or store instruction.");
        setErrorCode(-2146233023);
    }

    public DataMisalignedException(String str) {
        super(str);
        setErrorCode(-2146233023);
    }

    public DataMisalignedException(String str, Throwable th) {
        super(str, th);
        setErrorCode(-2146233023);
    }
}
