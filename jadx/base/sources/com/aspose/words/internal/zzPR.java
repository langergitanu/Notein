package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPR extends zzPW {
    private boolean zzHW = false;

    private zzPR() {
    }

    public static boolean zzV(zzPY zzpy) throws Exception {
        zzPR zzpr = new zzPR();
        zzpy.zzZ(zzpr);
        return zzpr.zzHW;
    }

    @Override // com.aspose.words.internal.zzPW
    public final void zzY(zzPK zzpk) {
        this.zzHW = (zzPS.zzP(zzpk.zzOK()) && zzPS.zzP(zzpk.zzOL())) ? false : true;
    }

    @Override // com.aspose.words.internal.zzPW
    public final void zzZ(zzOI zzoi) {
        this.zzHW = !zzPS.zzP(zzoi.zzZy());
    }

    @Override // com.aspose.words.internal.zzPW
    public final void zzZ(zzOH zzoh) throws Exception {
        if (zzZ(zzoh.zzNe())) {
            return;
        }
        if (zzEF.zzZs(zzoh.getImageBytes())) {
            this.zzHW = true;
        } else {
            super.zzZ(zzoh);
        }
    }

    @Override // com.aspose.words.internal.zzPW
    public final void zzV(zzPA zzpa) throws Exception {
        if (zzZ(zzpa.zzOP())) {
            return;
        }
        this.zzHW = (zzPS.zzP(zzpa.zzOv()) && zzPS.zzP(zzpa.zzOu())) ? false : true;
        super.zzV(zzpa);
    }

    @Override // com.aspose.words.internal.zzPW
    public final void zzY(zzP0 zzp0) throws Exception {
        boolean zZzP = zzPS.zzP(zzp0.zzNT());
        this.zzHW = !zZzP;
        if (zZzP) {
            for (int i = 0; i < zzp0.zzNU().length; i++) {
                if (!zzPS.zzP(zzp0.zzNU()[i])) {
                    this.zzHW = true;
                    return;
                }
            }
            if (zzZ(zzp0.zzOP())) {
                return;
            }
            super.zzY(zzp0);
        }
    }

    private boolean zzZ(zzPV[] zzpvArr) {
        if (zzpvArr == null) {
            return false;
        }
        for (int i = 0; i < zzpvArr.length; i++) {
            if (!zzPS.zzP(zzpvArr[(i * 2) + 1])) {
                this.zzHW = true;
                return true;
            }
        }
        return false;
    }

    private boolean zzZ(zzPI[] zzpiArr) {
        for (zzPI zzpi : zzpiArr) {
            if (!zzPS.zzP(zzpi.zzZy())) {
                this.zzHW = true;
                return true;
            }
        }
        return false;
    }
}
