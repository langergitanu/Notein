package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzN1 {
    private double zzDZ = 96.0d;
    private double zzDY = 96.0d;

    public final void zz0(double d) {
        this.zzDY = d;
    }

    public final void zz1(double d) {
        this.zzDZ = d;
    }

    public final zzZQ4 zzX(zzZQ4 zzzq4, int i) {
        return zzZQ4.zzX((float) zzY(zzzq4.zzZm(), i), (float) zzY(zzzq4.zzZo(), i), (float) zzY(zzzq4.zzkw(), i), (float) zzY(zzzq4.zzZn(), i));
    }

    public final double zzY(double d, int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return d;
            case 3:
                return (d / 72.0d) * this.zzDZ;
            case 4:
                return d * this.zzDZ;
            case 5:
                return (d / 300.0d) * this.zzDZ;
            case 6:
                return (d * this.zzDZ) / 25.4d;
            default:
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: unitType");
        }
    }
}
