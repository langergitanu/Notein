package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz4R {
    private float zzjo;
    private float zzjp;
    private float zzjq;
    private int zzjr;
    private String zzky;
    private float zzvA;
    private float zzvB;

    private zz4R(String str) {
        this.zzky = str;
        this.zzjr = 0;
    }

    private void zzJ(zzFY zzfy) throws Exception {
        int i = (int) this.zzvB;
        int i2 = (int) this.zzjp;
        int i3 = (int) this.zzjo;
        int i4 = (int) this.zzvA;
        switch (this.zzjr) {
            case 0:
                zzfy.zzFh();
                zzfy.writeInt(i);
                zzfy.zzFh();
                zzfy.writeInt(i4);
                zzfy.zzFh();
                zzfy.zzn(this.zzjq);
                return;
            case 1:
            case 5:
                return;
            case 2:
            case 6:
                zzfy.zzFh();
                zzfy.writeInt(i4);
                return;
            case 3:
            case 7:
                zzfy.zzFh();
                zzfy.writeInt(i);
                return;
            case 4:
                zzfy.zzFh();
                zzfy.writeInt(i);
                zzfy.zzFh();
                zzfy.writeInt(i2);
                zzfy.writeInt(i3);
                zzfy.zzFh();
                zzfy.writeInt(i4);
                return;
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: FitType");
        }
    }

    private void zzK(zzFY zzfy) throws Exception {
        zzfy.zzYU(this.zzky);
        zzfy.zzFh();
        zzfy.zzYY(zz4C.zzU2(this.zzjr));
    }

    public static zz4R zzZ(String str, float f, float f2, float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("ZoomFactor");
        }
        zz4R zz4r = new zz4R(str);
        zz4r.zzvB = f;
        zz4r.zzvA = f2;
        zz4r.zzjq = f3;
        return zz4r;
    }

    public final void zzW(zzFY zzfy) throws Exception {
        zzfy.zzFf();
        zzK(zzfy);
        zzJ(zzfy);
        zzfy.zzFe();
    }

    public zz4R(String str, int i, float f) {
        this.zzky = str;
        this.zzjr = i;
        this.zzvA = f;
    }

    public static zz4R zzZ(String str, long j) {
        return zzZ(str, Float.intBitsToFloat((int) j), zzZPY.zzYC(j), 0.0f);
    }
}
