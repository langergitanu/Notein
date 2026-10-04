package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzAC extends zzKO {
    private zzAG[] zzrD;
    private zz7Q zzrE;

    private zzAC(zz7Q zz7q, zzAG[] zzagArr) {
        super(zz7q.getType());
        this.zzrE = zz7q;
        this.zzrD = zzagArr;
    }

    public static zzAC zzZ(zz7Q zz7q, zzAG[] zzagArr) {
        for (zzAG zzag : zzagArr) {
            if (!zzag.zzL(zz7q)) {
                throw new IllegalStateException();
            }
        }
        return new zzAC(zz7q, zzagArr);
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzu() {
        return this.zzrE.zzu();
    }

    @Override // com.aspose.words.internal.zzZVP, com.aspose.words.internal.zzF6
    public final Object zzv() {
        return this.zzrE.zzv();
    }

    @Override // com.aspose.words.internal.zzKO, com.aspose.words.internal.zzH0
    public final Object zzx() throws Exception {
        Object objZzx = this.zzrE.zzx();
        int i = 0;
        while (true) {
            zzAG[] zzagArr = this.zzrD;
            if (i >= zzagArr.length) {
                return objZzx;
            }
            zzagArr[i].zzs(objZzx);
            i++;
        }
    }
}
