package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEO {
    private float zzHi;
    private int zzZch;
    private com.aspose.words.internal.zzG zzZci;
    private float zzwo;

    public zzEO(com.aspose.words.internal.zzG zzg, float f, float f2, int i) {
        this.zzZci = zzg;
        this.zzHi = f;
        this.zzwo = f2;
        this.zzZch = i;
    }

    private void zzZj(float f) {
        com.aspose.words.internal.zzZG zzzg;
        if (this.zzZci.getCount() >= 2 && (zzzg = (com.aspose.words.internal.zzZG) com.aspose.words.internal.zzZKW.zzZ(this.zzZci.zzN(1), com.aspose.words.internal.zzZG.class)) != null) {
            if (zzzg.zzZO() == null) {
                zzzg.zzW(new com.aspose.words.internal.zzP9());
            }
            zzzg.zzZO().zzY((f - this.zzHi) / 2.0f, 0.0f, 0);
        }
    }

    private void zzZk(float f) {
        com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) com.aspose.words.internal.zzZKW.zzZ(this.zzZci.zzN(0), com.aspose.words.internal.zzZG.class);
        if (zzzg == null) {
            return;
        }
        if (zzzg.zzZO() == null) {
            zzzg.zzW(new com.aspose.words.internal.zzP9());
        }
        zzzg.zzZO().zzZ(f / this.zzHi, 1.0f, 0);
    }

    private void zzw(float f, float f2) {
        com.aspose.words.internal.zzZG zzzg = (com.aspose.words.internal.zzZG) com.aspose.words.internal.zzZKW.zzZ(this.zzZci.zzN(0), com.aspose.words.internal.zzZG.class);
        if (zzzg == null) {
            return;
        }
        float f3 = f / this.zzHi;
        this.zzZci.zzZO().zzZ(f3, f2 / this.zzwo, 0);
        this.zzwo = f2;
        if (zzzg.zzZ2() != null) {
            zzzg.zzZ2().setWidth(zzzg.zzZ2().getWidth() / f3);
        }
    }

    public final float getHeight() {
        return this.zzwo;
    }

    public final float getWidth() {
        return this.zzHi;
    }

    public final com.aspose.words.internal.zzG zzZLK() {
        return this.zzZci;
    }

    public final void zzx(float f, float f2) {
        if (com.aspose.words.internal.zzAN.zzS(this.zzHi, f)) {
            return;
        }
        if (this.zzZci.zzZO() == null) {
            com.aspose.words.internal.OooO0O0.OooO00o(this.zzZci);
        }
        int i = this.zzZch;
        if (i == 1 || i == 4) {
            zzZk(f);
            zzZj(f);
        } else {
            zzw(f, f2);
        }
        this.zzHi = f;
    }
}
