package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class MemoryFontSource extends FontSourceBase implements com.aspose.words.internal.zzGP {
    private String zzBX;
    private byte[] zzY05;

    public MemoryFontSource(byte[] bArr) {
        this.zzY05 = bArr;
    }

    public String getCacheKey() {
        return this.zzBX;
    }

    public byte[] getFontData() {
        return this.zzY05;
    }

    @Override // com.aspose.words.FontSourceBase, com.aspose.words.internal.zzGP
    @ReservedForInternalUse
    @Deprecated
    public Iterable<com.aspose.words.internal.zzGR> getFontDataInternal() {
        byte[] bArr = this.zzY05;
        return bArr == null ? com.aspose.words.internal.zzZKV.zzZY(new com.aspose.words.internal.zzGR[0]) : com.aspose.words.internal.zzZKV.zzZY(new com.aspose.words.internal.zzGR[]{new com.aspose.words.internal.zzAB(bArr, getCacheKey())});
    }

    @Override // com.aspose.words.FontSourceBase
    public int getType() {
        return 2;
    }

    public MemoryFontSource(byte[] bArr, int i) {
        super(i);
        this.zzY05 = bArr;
    }

    public MemoryFontSource(byte[] bArr, int i, String str) {
        super(i);
        this.zzY05 = bArr;
        this.zzBX = str;
    }
}
