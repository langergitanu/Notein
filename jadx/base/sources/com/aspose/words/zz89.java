package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz89 {
    private int zzZ4X;
    private boolean zzZ4Y;
    private boolean zzZ4Z;
    private zzZS8 zzZ50;
    private int zzZ51;
    private com.aspose.words.internal.zzZQ4 zzZ52;
    private zzZC3 zzZge;

    public zz89(zzZC3 zzzc3, com.aspose.words.internal.zzZQ4 zzzq4, int i, zzZS8 zzzs8, int i2, boolean z, boolean z2) {
        this.zzZge = zzzc3;
        this.zzZ52 = zzzq4;
        this.zzZ51 = i;
        this.zzZ50 = zzzs8;
        this.zzZ4X = i2;
        this.zzZ4Z = z;
        this.zzZ4Y = z2;
    }

    public final int getDmlEffectsRenderingMode() {
        return this.zzZge.zzZw8().getDmlEffectsRenderingMode();
    }

    public final DocumentBase getDocument() throws Exception {
        return this.zzZge.getDocument();
    }

    public final float getScaleFactor() {
        return 1.0f / this.zzZ51;
    }

    public final zzZ90 getThemeProvider() throws Exception {
        return this.zzZge.getThemeProvider();
    }

    public final void zz2(String str) {
        this.zzZge.zzI().zzZ(2, 2, str);
    }

    public final com.aspose.words.internal.zzGQ zzMk() throws Exception {
        return zzwx().zzFG();
    }

    public final boolean zzZC2() {
        return this.zzZ4Y;
    }

    public final void zzZC3() {
        this.zzZ4Z = true;
    }

    public final zzZS8 zzZC4() {
        return this.zzZ50;
    }

    public final int zzZC5() {
        return this.zzZ51;
    }

    public final com.aspose.words.internal.zzZQ4 zzZC6() {
        return this.zzZ52;
    }

    public final boolean zzZFk() {
        return this.zzZ4Z;
    }

    public final zzZC3 zzZIB() {
        return this.zzZge;
    }

    public final int zzZQ4() {
        return this.zzZ4X;
    }

    public final com.aspose.words.internal.zzH6 zzwx() throws Exception {
        return this.zzZge.getDocument().zzZqx();
    }
}
