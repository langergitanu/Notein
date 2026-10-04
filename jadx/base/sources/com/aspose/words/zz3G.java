package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz3G extends zzAX {
    private int zzYZR = 0;
    private static float[] zzYZX = {4.0f, 3.0f, 1.0f, 3.0f};
    private static float[] zzYZW = {4.0f, 3.0f};
    private static float[] zzYZV = {1.0f, 3.0f};
    private static float[] zzYZU = {8.0f, 3.0f, 1.0f, 3.0f, 1.0f, 3.0f};
    private static float[] zzYZT = {8.0f, 3.0f, 1.0f, 3.0f};
    private static float[] zzYZS = {8.0f, 3.0f};

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return com.aspose.words.internal.zzZ4.zzW(this, obj) && ((zz3G) obj).zzYZR == this.zzYZR;
    }

    public final int hashCode() {
        return this.zzYZR ^ 1;
    }

    @Override // com.aspose.words.zzAX
    public final void zzG(com.aspose.words.internal.zzOU zzou) {
        switch (this.zzYZR) {
            case 0:
                zzou.setDashStyle(0);
                return;
            case 1:
                zzou.setDashStyle(1);
                return;
            case 2:
                zzou.setDashStyle(2);
                return;
            case 3:
                zzou.setDashStyle(3);
                return;
            case 4:
                zzou.setDashStyle(4);
                return;
            case 5:
                zzou.zzW(zzYZV);
                return;
            case 6:
                zzou.zzW(zzYZW);
                return;
            case 7:
                zzou.zzW(zzYZS);
                return;
            case 8:
                zzou.zzW(zzYZX);
                return;
            case 9:
                zzou.zzW(zzYZT);
                return;
            case 10:
                zzou.zzW(zzYZU);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void zzHa(int i) {
        this.zzYZR = i;
    }

    @Override // com.aspose.words.zzAX
    public final int zzZEW() {
        return 1;
    }

    @Override // com.aspose.words.zzAX
    public final zzAX zzZEY() {
        zz3G zz3g = new zz3G();
        zz3g.zzYZR = this.zzYZR;
        return zz3g;
    }

    public final int zzZwm() {
        return this.zzYZR;
    }
}
