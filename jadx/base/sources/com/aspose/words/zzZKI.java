package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKI {
    static com.aspose.words.internal.zzPV zzYtz = com.aspose.words.internal.zzPV.zzJu;
    private zzZ9A zzYtA;

    public zzZKI(zzZ9A zzz9a) {
        this.zzYtA = zzz9a;
    }

    private Object zzPj(int i) {
        return this.zzYtA.fetchShapeAttr(i);
    }

    private void zzQ(int i, Object obj) {
        this.zzYtA.setShapeAttr(i, obj);
    }

    private void zzR(double d, boolean z) {
        zzQ(915, Integer.valueOf((int) (com.aspose.words.internal.zzZ4.zzZ(d, 0.0d, 0.0d, 100.0d, 100.0d, z, "percent") * 10.0d)));
    }

    public final boolean getNoShade() {
        return ((Boolean) zzPj(947)).booleanValue();
    }

    public final boolean getOn() {
        return ((Boolean) zzPj(948)).booleanValue();
    }

    public final void setNoShade(boolean z) {
        zzQ(947, Boolean.valueOf(z));
    }

    public final void zzAc(int i) {
        zzQ(916, Integer.valueOf(i));
    }

    public final void zzX2(double d) {
        zzR(d, false);
    }

    public final void zzX3(double d) {
        zzR(d, true);
    }

    public final double zzZ4v() {
        return ((double) ((Integer) zzPj(915)).intValue()) / 10.0d;
    }

    public final int zzZ4w() {
        return ((Integer) zzPj(916)).intValue();
    }

    public final void zzZ4x() {
        zzQ(946, Boolean.TRUE);
    }

    public final void zzZ4y() {
        zzQ(948, Boolean.TRUE);
    }
}
