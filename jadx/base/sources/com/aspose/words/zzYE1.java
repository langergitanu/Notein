package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE1 extends zzZLN {
    public zzYE1() {
    }

    public static zzYE1 zz8(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (com.aspose.words.internal.zzZYQ.zzT(zzzox, 2)) {
            return new zzYE1(zzzox.zzn(zzzox.zzXa()));
        }
        return null;
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzK((short) getData().length);
        zzzow.writeBytes(getData());
    }

    public zzYE1(byte[] bArr) {
        super(bArr);
    }
}
