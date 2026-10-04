package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz4X extends zz1D {
    private zz50 zzjH;

    public zz4X(zz50 zz50Var) {
        super(zz50Var.zzq());
        this.zzjH = zz50Var;
    }

    private static int zz7(float f) {
        return Math.min(Math.max(((int) zzZKQ.zzZa(Math.log10(Math.abs(f)))) + 2, 0), 8);
    }

    private void zzXU(String str) throws Exception {
        zzXE(str);
        zzFg();
    }

    private long zzve() {
        float[] fArrZzOs = this.zzjH.zzvi().zztV().zzua().zzOs();
        return zzZPY.zzG(fArrZzOs[0], fArrZzOs[1]);
    }

    public final void zzJ(byte b) throws Exception {
        zzXE(new String(zzZYD.zzD(b)));
    }

    public final void zzS(String str, String str2, String str3) throws Exception {
        zzXV(zzZKN.format(str, str2, str3));
    }

    public final void zzXV(String str) throws Exception {
        zzXE(str);
        zzFh();
    }

    public final void zzXW(String str) throws Exception {
        zzXE(str);
    }

    public final void zzZ7(long j) throws Exception {
        int iZz7;
        int iZz72;
        if (this.zzjH.zzuN().zzvc().getOptimizeOutput()) {
            long jZzve = zzve();
            iZz7 = zz7(Float.intBitsToFloat((int) jZzve));
            iZz72 = zz7(zzZPY.zzYC(jZzve));
        } else {
            iZz7 = 8;
            iZz72 = 8;
        }
        zzU(Float.intBitsToFloat((int) j), iZz7);
        zzFh();
        zzU(zzZPY.zzYC(j), iZz72);
    }

    public final void zzo(String str, String str2) throws Exception {
        zzXU(zzZKN.format(str, str2));
    }

    public final void zzp(String str, String str2) throws Exception {
        zzXV(zzZKN.format(str, str2));
    }
}
