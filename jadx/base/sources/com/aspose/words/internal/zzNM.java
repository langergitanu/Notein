package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzNM {
    private zzZL zzEZ;
    private byte[] zzVO;

    public zzNM(byte[] bArr) {
        this.zzVO = bArr;
    }

    public final byte[] getBytes() {
        return this.zzVO;
    }

    public final zzZL zzLZ() throws Exception {
        if (this.zzEZ == null) {
            this.zzEZ = zzME();
        }
        return this.zzEZ;
    }

    public abstract zzZL zzME() throws Exception;
}
