package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz58 extends zz21 {
    private zz3H zzko;

    public zz58(zz4W zz4w, zz3H zz3h) throws Exception {
        super(zz4w);
        this.zzko = zz3h;
    }

    public final void zzvP() throws Exception {
        zzZYV<Integer> zzzyvZzuc = this.zzko.zzuc();
        int iZzT3 = zzzyvZzuc.zzT3(zzzyvZzuc.getCount() - 1);
        int iZzO = zzAN.zzO(iZzT3 + 1, 8);
        byte[] bArr = new byte[iZzO];
        zzXT zzxt = new zzXT(bArr);
        for (int i = 0; i <= iZzT3; i++) {
            if (zzzyvZzuc.zzVE(i)) {
                zzxt.zzWX();
            }
            zzxt.zzWW();
        }
        zzxt.flush();
        zzq().write(bArr, 0, iZzO);
    }
}
