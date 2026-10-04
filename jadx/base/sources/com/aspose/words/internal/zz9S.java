package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zz9S extends zz9V {
    private byte[] zzP;

    public zz9S(byte[] bArr) {
        this.zzP = bArr;
    }

    @Override // com.aspose.words.internal.zz9V
    public zzPY zzZ(zz9G zz9g) {
        zzOH zzoh = new zzOH(this.zzP, 0);
        zzoh.zzL(zz9g.zzzW());
        return zzoh;
    }
}
