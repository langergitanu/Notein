package com.aspose.words.internal;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZVQ {
    public static zzZOP zz8(Object obj) {
        if (obj instanceof InputStream) {
            return zzZOP.zzY((InputStream) obj);
        }
        if (obj instanceof OutputStream) {
            return zzZOP.zzY((OutputStream) obj);
        }
        throw new IllegalArgumentException("stream should be java.io.InputStream or java.io.OutputStream.");
    }

    public static InputStream zzZT(zzZOP zzzop) {
        return new zzZK7(zzzop);
    }
}
