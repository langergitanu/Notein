package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3L {
    private com.aspose.words.internal.zzZO0 zzMW;
    private com.aspose.words.internal.zzZOW zzW5;

    public zzY3L(com.aspose.words.internal.zzZOW zzzow, com.aspose.words.internal.zzZO0 zzzo0) {
        this.zzW5 = zzzow;
        this.zzMW = zzzo0;
    }

    public final void writeBytes(byte[] bArr) throws Exception {
        this.zzW5.writeBytes(bArr);
    }

    public final void writeString(String str) throws Exception {
        zzY(this.zzMW, str);
    }

    public final void zzJ(short s) throws Exception {
        this.zzW5.zzJ(s);
    }

    public final com.aspose.words.internal.zzZO0 zzQZ() {
        return this.zzMW;
    }

    public final void zzT(short s, short s2) throws Exception {
        this.zzW5.zzJ(s);
        this.zzW5.zzl(2);
        this.zzW5.zzK(s2);
    }

    public final void zzV(short s, int i) throws Exception {
        this.zzW5.zzJ(s);
        this.zzW5.zzl(4);
        this.zzW5.zzl(i);
    }

    public final void zzXTU() throws Exception {
        this.zzW5.zzK((short) 0);
    }

    public final void zzY(short s, String str) throws Exception {
        zzZ(s, this.zzMW, str);
    }

    public final void zzZ(short s, com.aspose.words.internal.zzZO0 zzzo0, String str) throws Exception {
        this.zzW5.zzJ(s);
        zzY(zzzo0, str);
    }

    public final void zzk(int i) throws Exception {
        this.zzW5.zzk(i);
    }

    public final void zzl(int i) throws Exception {
        this.zzW5.zzl(i);
    }

    private void zzY(com.aspose.words.internal.zzZO0 zzzo0, String str) throws Exception {
        byte[] bytes = str != null ? zzzo0.getBytes(str) : new byte[0];
        this.zzW5.zzl(bytes.length);
        this.zzW5.writeBytes(bytes);
    }
}
