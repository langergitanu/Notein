package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZD5 extends zzZDB {
    public static zzZD5 zzXo(byte[] bArr) throws IOException {
        zzZDE zzzde = new zzZDE(bArr);
        try {
            zzZD5 zzzd5ZzXKN = zzzde.zzXKN();
            if (zzzde.available() == 0) {
                return zzzd5ZzXKN;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // com.aspose.words.internal.zzZDB
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzZDK) && zzZ(((zzZDK) obj).zzXL0());
    }

    @Override // com.aspose.words.internal.zzZDB
    public abstract int hashCode();

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this;
    }

    public zzZD5 zzXL2() {
        return this;
    }

    public zzZD5 zzXL3() {
        return this;
    }

    public abstract int zzXL6() throws IOException;

    public abstract boolean zzXLa();

    public abstract void zzZ(zzZD7 zzzd7) throws IOException;

    public abstract boolean zzZ(zzZD5 zzzd5);
}
