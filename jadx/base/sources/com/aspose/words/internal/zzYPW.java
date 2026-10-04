package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPW extends ByteArrayOutputStream {
    public final synchronized void zzXBd() {
        zzYGU.zzZP(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count);
        ((ByteArrayOutputStream) this).count = 0;
    }
}
