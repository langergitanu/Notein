package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz3V extends zz3W {
    private float zzUj;
    private int zzVz;
    private int zzid;

    public zz3V(zzZOP zzzop, int i, float f, int i2) {
        super(zzzop);
        this.zzVz = i;
        this.zzUj = f;
        this.zzid = i2;
    }

    @Override // com.aspose.words.internal.zz3W, com.aspose.words.internal.zzZOP
    public final void write(byte[] bArr, int i, int i2) throws Exception {
        zzX5 zzx5 = new zzX5();
        zzx5.setAlignment(1);
        zzx5.zzx(false);
        zzx5.zzw(false);
        zzx5.zzZ(bArr, this.zzVz, this.zzUj, this.zzid, zzuy());
    }
}
