package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZDB implements zzZDK {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzZDK) {
            return zzXL0().equals(((zzZDK) obj).zzXL0());
        }
        return false;
    }

    public final byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new zzZD7(byteArrayOutputStream).zzY(this);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return zzXL0().hashCode();
    }

    @Override // com.aspose.words.internal.zzZDK
    public abstract zzZD5 zzXL0();

    public final byte[] getEncoded(String str) throws IOException {
        if (str.equals("DER")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new zzZC4(byteArrayOutputStream).zzY(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (str.equals("DL")) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            new zzZBO(byteArrayOutputStream2).zzY(this);
            return byteArrayOutputStream2.toByteArray();
        }
        return getEncoded();
    }
}
