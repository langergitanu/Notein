package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzAB implements zzGR {
    private String zzBX;
    private byte[] zzTZ;

    public zzAB(byte[] bArr) {
        this(bArr, null);
    }

    @Override // com.aspose.words.internal.zzGR
    public final String getCacheKeyInternal() {
        return this.zzBX;
    }

    public final byte[] getData() {
        return this.zzTZ;
    }

    @Override // com.aspose.words.internal.zzGR
    public final String getFilePath() {
        return null;
    }

    @Override // com.aspose.words.internal.zzGR
    public final byte[] getFontBytes() {
        return this.zzTZ;
    }

    @Override // com.aspose.words.internal.zzGR
    public final int getSize() {
        return this.zzTZ.length;
    }

    @Override // com.aspose.words.internal.zzGR
    public final zzZOP openStream() throws Exception {
        return new zzZOR(this.zzTZ);
    }

    public zzAB(byte[] bArr, String str) {
        this.zzTZ = bArr;
        this.zzBX = str;
    }
}
