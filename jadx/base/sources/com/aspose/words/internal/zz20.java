package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz20 extends zz33 {
    private int mLength;

    public zz20(zz4W zz4w) {
        super(zz4w);
    }

    public final void setLength(int i) {
        this.mLength = i;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.writeInt(this.mLength);
    }
}
