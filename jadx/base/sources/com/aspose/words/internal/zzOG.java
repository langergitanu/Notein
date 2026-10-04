package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzOG extends zzPY {
    private int zzFV;
    private zzP9 zzFW;

    public zzOG(int i) {
        super(i);
        this.zzFV = 0;
    }

    public final void zzL(zzP9 zzp9) {
        this.zzFW = zzp9;
    }

    public final int zzNa() {
        return this.zzFV;
    }

    public final zzP9 zzNb() {
        if (this.zzFW == null) {
            this.zzFW = new zzP9();
        }
        return this.zzFW;
    }

    @Override // com.aspose.words.internal.zzPY
    public zzPY zzPI() {
        zzOG zzog = (zzOG) super.zzPI();
        zzog.zzFW = zzNb().zzOh();
        return zzog;
    }

    public final void zzXR(int i) {
        this.zzFV = i;
    }
}
