package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYSZ {
    protected zzYPO zzXRj;
    private String zzXRk;

    public zzYSZ(zzYPO zzypo) {
        this.zzXRj = zzypo;
    }

    public final String getStyleName() {
        return this.zzXRk;
    }

    public final void setStyleName(String str) {
        this.zzXRk = str;
    }

    public final zzYSR zzYxl() {
        return (zzYSR) this.zzXRj.zzYh(this.zzXRk, "chart");
    }

    public final String zzYxm() {
        zzYSD zzysd;
        zzYSR zzysrZzYxl = zzYxl();
        if (zzysrZzYxl == null || (zzysd = (zzYSD) this.zzXRj.zzYh(zzysrZzYxl.zzYu4(), null)) == null) {
            return null;
        }
        String strZzZ = zzysd.zzZ(this.zzXRj);
        if ("0".equals(strZzZ)) {
            return null;
        }
        return strZzZ;
    }
}
