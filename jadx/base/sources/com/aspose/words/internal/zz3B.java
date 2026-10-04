package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz3B extends zz21 {
    private int zzhM;
    private int zzhN;
    private float[] zzj;
    private float[] zzk;

    public zz3B(zz4W zz4w, int i, int i2, float[] fArr, float[] fArr2) throws Exception {
        super(zz4w);
        this.zzhN = i;
        this.zzhM = i2;
        zzZ(fArr, i);
        this.zzk = fArr;
        zzZ(fArr2, this.zzhM);
        this.zzj = fArr2;
    }

    private static void zzZ(float[] fArr, int i) {
        if (fArr.length % i != 0) {
            throw new IllegalArgumentException("Incorrect array dimension.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            if (fArr[i3] > fArr[i3 + 1]) {
                throw new IllegalArgumentException("Min is greater than Max.");
            }
        }
    }

    @Override // com.aspose.words.internal.zz21
    public void zzN(zzFY zzfy) throws Exception {
        zzfy.zzM("/FunctionType", 0);
        zzfy.zzZ("/Domain", this.zzk);
        zzfy.zzZ("/Range", this.zzj);
        super.zzN(zzfy);
    }
}
