package com.aspose.slides.exceptions;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class CryptographicException extends SystemException {
    public CryptographicException() {
        super("Error occurred during a cryptographic operation.");
    }

    public CryptographicException(int i) {
    }

    public CryptographicException(String str) {
        super(str);
    }

    public CryptographicException(String str, String str2) {
        super(C14113y2.m67402k4(str, str2));
    }

    public CryptographicException(String str, Throwable th) {
        super(str, th);
    }
}
