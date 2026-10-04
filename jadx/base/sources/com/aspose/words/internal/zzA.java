package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzA extends zz6 {
    private boolean zzZo = false;

    private zzA() {
    }

    public static boolean zzY(zzZL zzzl) throws Exception {
        zzA zza = new zzA();
        zzzl.zzZ(zza);
        return zza.zzZo;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        if (this.zzZo) {
            return;
        }
        if (zzzg.zzZ1() != null) {
            boolean zZzV = zzPR.zzV(zzzg.zzZ1());
            this.zzZo = zZzV;
            if (zZzV) {
                return;
            }
        }
        if (zzzg.zzZ2() == null || zzzg.zzZ2().zzZ1() == null) {
            return;
        }
        this.zzZo = zzPR.zzV(zzzg.zzZ2().zzZ1());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        if (this.zzZo) {
            return;
        }
        this.zzZo = zzEF.zzZs(zzzp.getImageBytes());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) {
        if (this.zzZo) {
            return;
        }
        if (zzPS.zzP(zzzu.zzZy()) && zzPS.zzP(zzzu.zzZq())) {
            return;
        }
        this.zzZo = true;
    }
}
