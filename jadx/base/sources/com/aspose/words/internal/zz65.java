package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz65 {
    private int zzVL;
    private int zzVN;
    private long zzla = 0;
    private byte zzlb;
    private byte[] zzlc;
    private zz69 zzls;

    public zz65(zz69 zz69Var) {
        this.zzls = zz69Var;
    }

    private void zzV(byte[] bArr, zzEP zzep) throws Exception {
        zzEG zzegZzZT = zzEF.zzZT(bArr);
        boolean z = false;
        boolean z2 = zzEF.zzZU(bArr) == 5;
        this.zzlc = z2 ? bArr : null;
        if (zzep != null && zzep.zzDX()) {
            z = true;
        }
        this.zzVL = zzegZzZT.getWidth();
        this.zzVN = zzegZzZT.getHeight();
        if (!z2 || z) {
            zzXN zzxnZzZX = z ? zzep.zzZX(bArr) : new zzXN(bArr);
            try {
                zzZOR zzzor = new zzZOR();
                try {
                    if (zzxnZzZX.zzDW().hasAlpha()) {
                        zzEF.zzZ(zzxnZzZX, zzzor, zzPV.zzI5, 90);
                    } else {
                        zzxnZzZX.zzY(zzzor, 90);
                    }
                    this.zzlc = zzzor.zzWy();
                    zzzor.close();
                    this.zzVL = zzxnZzZX.getWidth();
                    this.zzVN = zzxnZzZX.getHeight();
                    zzxnZzZX.dispose();
                } catch (Throwable th) {
                    zzzor.close();
                    throw th;
                }
            } catch (Throwable th2) {
                if (zzxnZzZX != null) {
                    zzxnZzZX.dispose();
                }
                throw th2;
            }
        }
        this.zzlb = (byte) 2;
    }

    public final void zzZ(byte[] bArr, zzEP zzep, long j) throws Exception {
        this.zzla = j;
        zzV(bArr, zzep);
    }

    public final void zzwA() throws Exception {
        this.zzls.zzZl(this.zzlc);
    }

    public final void zzwB() throws Exception {
        this.zzls.zzL(this.zzlb);
        this.zzls.zzK((byte) 101);
        this.zzls.zzP((short) 0);
        this.zzls.zzK((byte) 109);
        this.zzls.zzP((short) this.zzVN);
        this.zzls.zzK((byte) 99);
    }

    public final void zzwC() throws Exception {
        this.zzls.zzL((byte) 0);
        this.zzls.zzK((byte) 100);
        this.zzls.zzL((byte) 2);
        this.zzls.zzK((byte) 98);
        this.zzls.zzP((short) this.zzVL);
        this.zzls.zzK((byte) 108);
        this.zzls.zzP((short) this.zzVN);
        this.zzls.zzK((byte) 107);
        this.zzls.zzZa(this.zzla);
        this.zzls.zzK((byte) 103);
    }
}
