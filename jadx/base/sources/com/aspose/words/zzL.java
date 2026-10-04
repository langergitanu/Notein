package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzL {
    byte[] zzZGn;
    boolean zzZGo;
    boolean zzZGp;
    boolean zzZGq;
    zzK zzZGr;

    public zzL(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzZGr = new zzK(zzzox);
        this.zzZGq = zzzox.readByte() != 0;
        this.zzZGp = zzzox.readByte() != 0;
        this.zzZGo = zzzox.readByte() != 0;
        zzzox.readByte();
        this.zzZGn = zzzox.zzn(32);
    }
}
