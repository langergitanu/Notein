package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZE1 {
    private static void zzW(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    public static void zzX(Throwable th) {
        zzW(th);
        throw new RuntimeException("[was " + th.getClass() + "] " + th.getMessage(), th);
    }

    public static IOException zzY(String str, Throwable th) {
        IOException iOException = new IOException(str);
        zzZ(iOException, th);
        return iOException;
    }

    private static void zzZ(Throwable th, Throwable th2) {
        if (th.getCause() == null) {
            th.initCause(th2);
        }
    }

    public static void zzx1(String str) {
        if (str == null) {
            str = "[no description]";
        }
        throw new RuntimeException("Internal error: ".concat(str));
    }
}
