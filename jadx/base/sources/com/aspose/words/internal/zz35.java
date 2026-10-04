package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz35 extends zz4I {
    private zz3H zzhX;

    public zz35(zz3H zz3h) {
        this.zzhX = zz3h;
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzI(zzFY zzfy) throws Exception {
        zzfy.zzH("/Encoding", "/Identity-H");
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzX(zz4X zz4x) throws Exception {
        zz4x.zzsZ();
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzY(zz4X zz4x) throws Exception {
        zz4x.zzt0();
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzZ(int i, int i2, zz4X zz4x) throws Exception {
        int iZzTV = this.zzhX.zzTV(i);
        zz4x.zzJ((byte) (iZzTV >> 8));
        zz4x.zzJ((byte) iZzTV);
    }
}
