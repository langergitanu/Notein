package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ41 extends OutputStream {
    public final void update(byte b) {
        try {
            write(b);
        } catch (IOException e) {
            if (e.getCause() == null) {
                throw new zzZ42(C21111o0ooOoO.OooO00o(e, new StringBuilder("Exception processing data: ")), e);
            }
            throw new zzZ42(e.getClass().getName() + ": " + e.getMessage(), e.getCause());
        }
    }

    public final void update(byte[] bArr) {
        update(bArr, 0, bArr.length);
    }

    public final void update(byte[] bArr, int i, int i2) {
        try {
            write(bArr, i, i2);
        } catch (IOException e) {
            if (e.getCause() != null) {
                throw new zzZ42(e.getClass().getName() + ": " + e.getMessage(), e.getCause());
            }
            throw new zzZ42(C21111o0ooOoO.OooO00o(e, new StringBuilder("Exception processing data: ")), e);
        }
    }
}
