package com.aspose.words.internal;

import Oooo0o0.C21009OooOooO;

/* JADX INFO: loaded from: classes5.dex */
final class zzDZ extends zzDF {
    private zzP9 zzFW;
    private float zzvC;
    private int zzvD;
    private zzE7 zzvE;
    private zzE7 zzvF;
    private int zzvG;
    private int zzvH;
    private int zzvI;

    public zzDZ(zzDL zzdl, int i) {
        this(zzdl, i, new zzP9());
    }

    private float zzZ(float f, int i, zzE7 zze7) {
        return (float) zzE0.zzZ(zzE0.zzY(f, i, zze7.zzDA()) * (zze7.zzDA() == 1 ? 3.937007874015748E-4d : 0.001d), zze7.zzDA(), this.zzvI);
    }

    private float zzi(float f) {
        return C21009OooOooO.OooO00o(f, this.zzvC, 170.0f, 680.0f);
    }

    @Override // com.aspose.words.internal.zzDF
    public final float zzDp() {
        return zzZ(super.zzDp(), this.zzvG, this.zzvE);
    }

    @Override // com.aspose.words.internal.zzDF
    public final float zzDq() {
        return zzZ(super.zzDq(), this.zzvH, this.zzvF);
    }

    @Override // com.aspose.words.internal.zzDF
    public final float zzDr() {
        if (this.zzvD < 0) {
            return 1.0f;
        }
        return zzi(super.zzDr());
    }

    @Override // com.aspose.words.internal.zzDF
    public final long zzDs() {
        return this.zzFW.isIdentity() ? super.zzDs() : this.zzFW.zzR(super.zzDs());
    }

    public zzDZ(zzDL zzdl, int i, zzP9 zzp9) {
        super(zzdl);
        this.zzvI = i;
        this.zzvH = zzdl.zzD4().zzVL(0);
        this.zzvG = zzdl.zzD4().zzVL(1);
        this.zzvF = zzdl.zzD4().zzVK(0);
        this.zzvE = zzdl.zzD4().zzVK(1);
        int iZzVM = zzdl.zzD4().zzVM(3);
        this.zzvD = iZzVM;
        if (iZzVM > 0) {
            this.zzvC = 1023.0f / ((float) ((zzE9) zzdl.zzD4().zzDu().get(this.zzvD)).getMax());
        }
        this.zzFW = zzp9;
    }
}
