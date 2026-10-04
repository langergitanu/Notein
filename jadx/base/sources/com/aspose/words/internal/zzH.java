package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class zzH extends zz6 {
    private int zzZF;
    private zzZZQ zzZG;
    private ArrayList<zzP9> zzZH;
    private boolean zzZI;
    private boolean zzZJ;
    private boolean zzZK;
    private zzZQ4 zzZL;

    public zzH() {
        this(false);
    }

    private void zzX(zzHU zzhu) throws Exception {
        this.zzZG.zzf(zzhu.zzZN() == null ? zzZQ4.zz2T : zzP6.zzY(zzhu.zzZN(), 0.0f));
    }

    private void zzZP() {
        zzZQ();
        zzZR();
        this.zzZF--;
    }

    private void zzZQ() {
        int i = this.zzZF;
        if (i > 0) {
            this.zzZG.removeAt(i - 1);
        }
    }

    private void zzZR() {
        int i = this.zzZF;
        if (i > 0) {
            this.zzZH.remove(i - 1);
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) {
        zzZP();
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) throws Exception {
        zzZ((zzHU) zzg);
    }

    public zzH(boolean z) {
        this(z, false);
    }

    private void zzY(zzHU zzhu) {
        zzP9 zzp9ZzZO = zzhu.zzZO();
        if (zzp9ZzZO == null) {
            zzp9ZzZO = new zzP9();
        }
        zzZQG.zzZ(this.zzZH, zzp9ZzZO);
    }

    @Override // com.aspose.words.internal.zz6
    public void zzZ(zzZU zzzu) throws Exception {
        if (!zzzu.isHidden() || this.zzZI) {
            zzZ((zzHU) zzzu);
            zzY(zzzu.zzZj());
            zzZP();
        }
    }

    public zzH(boolean z, boolean z2) {
        this.zzZL = zzZQ4.zz2T;
        this.zzZH = new ArrayList<>();
        this.zzZG = new zzZZQ();
        this.zzZJ = z;
        this.zzZI = z2;
    }

    private void zzX(long j) {
        zzY(new zzZQ4(j, 0L));
    }

    private void zzY(zzZQ4 zzzq4) {
        for (int i = this.zzZF - 1; i >= 0; i--) {
            zzzq4 = zzZ(zzzq4, i);
        }
        if (this.zzZK) {
            zzZQ4 zzzq42 = this.zzZL;
            zzZQ4 zzzq43 = zzZQ4.zz2T;
            if (zzZQ4.zzV(zzzq42, zzzq43)) {
                this.zzZL = zzzq4;
                return;
            } else {
                if (zzZQ4.zzV(zzzq4, zzzq43)) {
                    return;
                }
                this.zzZL = zzZQ4.zzT(this.zzZL, zzzq4);
                return;
            }
        }
        this.zzZL = zzzq4;
        this.zzZK = true;
    }

    @Override // com.aspose.words.internal.zz6
    public void zzZ(zzZG zzzg) throws Exception {
        zzZ((zzHU) zzzg);
        zzY(zzZ(zzzg.zzZ0(), zzzg.zzZ2() != null ? zzzg.zzZ2().getWidth() / 2.0f : 0.0f));
        zzZP();
    }

    public zzZQ4 zzZ(zzP8 zzp8, float f) throws Exception {
        return zzP6.zzY(zzp8, f);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) {
        zzY(zzzp.zzZj());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzI zzi) {
        zzX(zzi.zzZT());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZI zzzi) {
        zzX(zzzi.zzZT());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZB zzzb) {
        zzY(zzzb.zzZv());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZC zzzc) {
        zzY(zzzc.zzZv());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzC zzc) {
        zzY(zzc.zzZv());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zz9 zz9Var) {
        zzY(zz9Var.zzZv());
    }

    @Override // com.aspose.words.internal.zz6
    public final boolean zzZ(zzZS zzzs) {
        return (this.zzZJ && zzzs.zzZg() == 32768) ? false : true;
    }

    public final zzZQ4 zzZ(zzZL zzzl) throws Exception {
        zzZQ4 zzzq4 = zzZQ4.zz2T;
        this.zzZL = zzzq4;
        this.zzZK = false;
        if (zzzl == null) {
            return zzzq4;
        }
        zzzl.zzZ(this);
        return this.zzZL;
    }

    private void zzZ(zzHU zzhu) throws Exception {
        zzX(zzhu);
        zzY(zzhu);
        this.zzZF++;
    }

    private zzZQ4 zzZ(zzZQ4 zzzq4, int i) {
        zzZQ4 zzzq4ZzT7 = this.zzZG.zzT7(i);
        if (!zzZQ4.zzV(zzzq4ZzT7, zzZQ4.zz2T)) {
            zzzq4 = zzZQ4.zzU(zzzq4, zzzq4ZzT7);
        }
        return zzJ6.zzZ(zzzq4, this.zzZH.get(i));
    }
}
