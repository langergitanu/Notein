package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKV extends zzY9C {
    private zzYN8 zzYBS;
    private int zzYQi;

    public static class zzZ extends zzY9A {
        public zzZ(zzZKV zzzkv) {
            super(zzzkv);
        }

        @Override // com.aspose.words.zzY9A
        public final void zzJ(zzYMD zzymd) throws Exception {
            zzZKY zzzky = (zzZKY) zzymd;
            if (zzzky != null) {
                zzzky.isActive();
            }
            if (zzzky.isEmpty()) {
                zzzky.zzYU(true);
                return;
            }
            zzYMD.zzr(zzzky);
            zzzky.zzZoN();
            zzzky.zza9().zza9().zzYU(true);
            zzYMD.zzq(zzzky);
        }
    }

    public zzZKV(zzZYW zzzyw, int i) {
        super(zzzyw);
        this.zzYQi = i;
    }

    public static void zzT(zzYN8 zzyn8) throws Exception {
        zzZKY zzzkyZzX = zzX(zzyn8, true);
        zzZKY zzzkyZzX2 = zzX(zzyn8, false);
        int iZzYqo = zzyn8.zzYqo();
        int iZzYqn = zzyn8.zzYqn();
        boolean zZzX = zzX(zzzkyZzX);
        boolean zZzX2 = zzX(zzzkyZzX2);
        if (zZzX || zZzX2) {
            zzZNL zzznlZzYF = zzyn8.zzYF(true);
            zzZNL zzznlZzYE = zzyn8.zzYE(true);
            zzyn8.zzYqj();
            zzyn8.zzYF(true).zzZ(zzznlZzYF, zzzkyZzX);
            zzyn8.zzYE(true).zzZ(zzznlZzYE, zzzkyZzX);
            zzW(zzzkyZzX);
            if (zzzkyZzX2 != null) {
                zzyn8.zzYF(true).zzZ(zzznlZzYF, zzzkyZzX2);
                zzyn8.zzYE(true).zzZ(zzznlZzYE, zzzkyZzX2);
                zzzkyZzX2.zzAl(iZzYqo);
                zzW(zzzkyZzX2);
            }
            zzW(zzzkyZzX);
            zzyn8.zzZ(iZzYqo, iZzYqn, zzznlZzYF, zzznlZzYE);
        }
    }

    private static void zzW(zzZKY zzzky) throws Exception {
        if (zzzky == null || zzzky.zzac()) {
            return;
        }
        zzzky.zzaa().zzYU(false);
        zzzky.zzaa().zzJ(null);
    }

    @Override // com.aspose.words.zzY9C
    public final int getStoryType() {
        return this.zzYQi;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        return zzZXY().zz6w();
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        return zzZXZ().zz6x();
    }

    public final void zzU(zzYN8 zzyn8) {
        this.zzYBS = zzyn8;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzY(zzYMD zzymd) {
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd) {
    }

    @Override // com.aspose.words.zzY9C
    public final zzY9A zzZ4B() {
        if (super.zzZ4B() == null) {
            zzZ(new zzZ(this));
        }
        return super.zzZ4B();
    }

    public final zzZ2D zzZ4C() {
        zzYN8 zzyn8 = this.zzYBS;
        if (zzyn8 == null) {
            return null;
        }
        return (zzZ2D) zzyn8.zza9();
    }

    public final boolean zzZ4D() {
        int i = this.zzYQi;
        return i == 6 || i == 7 || i == 10;
    }

    @Override // com.aspose.words.zzY9C
    public final boolean zzZ4E() {
        return true;
    }

    public final zzYN8 zzZ8m() {
        return this.zzYBS;
    }

    private static boolean zzX(zzZKY zzzky) throws Exception {
        boolean z = (zzzky == null || zzzky.zzac()) ? false : true;
        if (z) {
            zzzky.zzZ4Y();
        }
        return z;
    }

    public static zzZKY zzX(zzYN8 zzyn8, boolean z) throws Exception {
        zzZKY zzzkyZzYqq = z ? zzyn8.zzYqq() : zzyn8.zzYqp();
        if (zzzkyZzYqq != null && zzZKW.zzY(zzyn8, z) != zzzkyZzYqq.zzaa().getStoryType()) {
            zzzkyZzYqq = null;
        }
        if (zzzkyZzYqq == null) {
            zzZKV zzzkvZzZ = zzZKW.zzZ(zzyn8, z);
            if (zzzkvZzZ != null) {
                zzzkyZzYqq = (zzZKY) zzzkvZzZ.zzZXZ().zz6x();
            }
            if (z) {
                zzyn8.zzV(zzzkyZzYqq);
            } else {
                zzyn8.zzU(zzzkyZzYqq);
            }
            if (zzzkyZzYqq != null) {
                zzzkyZzYqq.zzaa().getStoryType();
                if (z) {
                    zzZNC.zzV(zzyn8);
                }
            }
        }
        return zzzkyZzYqq;
    }
}
