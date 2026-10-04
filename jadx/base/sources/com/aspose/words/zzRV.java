package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzRV {
    private com.aspose.words.internal.zzPV zzZf;
    private boolean zzZrO;

    public zzRV(zzPS zzps) {
        this(zzps.zzSx("background-color"));
    }

    public final void zzY(Shading shading) {
        if (this.zzZrO) {
            shading.setTexture(0);
            shading.zzZK(this.zzZf);
        }
    }

    public zzRV(zzPT zzpt) {
        if (zzpt == null) {
            return;
        }
        zzpt.zzZWj().getCount();
        zzL4 zzl4ZzZVx = zzpt.zzZWj().zzZVx();
        if (zzl4ZzZVx.getValueType() == 2) {
            this.zzZrO = true;
            this.zzZf = ((zzQC) zzl4ZzZVx).zzZWw();
        }
    }
}
