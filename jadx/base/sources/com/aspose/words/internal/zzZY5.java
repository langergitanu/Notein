package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZY5 extends zzZV8 {
    private int zzbE;
    private boolean zzbF;
    private boolean zzbG;
    private boolean zzbH;

    public zzZY5(zzH6 zzh6) {
        super(zzh6);
        this.zzbE = 1;
    }

    public final boolean getFitToViewPort() {
        return this.zzbG;
    }

    public final int getTextOutputMode() {
        return this.zzbE;
    }

    public final void setFitToViewPort(boolean z) {
        this.zzbG = z;
    }

    public final void setTextOutputMode(int i) {
        this.zzbE = i;
    }

    public final void zzZx(boolean z) {
        this.zzbH = z;
    }

    public final void zzqU() {
        this.zzbF = true;
    }

    public final boolean zzqV() {
        return this.zzbF;
    }

    public final boolean zzqW() {
        return this.zzbH;
    }
}
