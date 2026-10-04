package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzBU implements zzGI {
    private double zzsT;
    private boolean zzsU = true;
    private double zzsV;

    public zzBU(zzFB zzfb, double d) {
        double leftMargin = (d - zzfb.getLeftMargin()) - zzfb.getRightMargin();
        this.zzsT = leftMargin;
        this.zzsV = leftMargin - 0.0d;
    }

    @Override // com.aspose.words.internal.zzGI
    public final double zzFy() {
        if (!this.zzsU) {
            return this.zzsT;
        }
        this.zzsU = false;
        return this.zzsV;
    }
}
