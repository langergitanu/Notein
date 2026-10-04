package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzN7 {
    private zzNG zzEi;
    private zzN9 zzEj;
    private zzO1 zzEk;
    private zzL5 zzEl;
    private zzZOP zzEm;
    private float zzEn;
    private float zzUj;
    private zzF4 zzv;

    public zzN7(zzZOP zzzop, float f, float f2, zzF4 zzf4) throws Exception {
        this.zzEn = f;
        this.zzUj = f2;
        this.zzEm = zzzop;
        zzZOW zzzow = new zzZOW(zzzop);
        this.zzEl = new zzL5(zzzow);
        this.zzEk = new zzO1(zzzow);
        this.zzEj = new zzN9(this);
        this.zzEi = new zzNG(this);
        this.zzv = zz7M.zznW;
    }

    public final float getHorizontalResolution() {
        return this.zzEn;
    }

    public final float getVerticalResolution() {
        return this.zzUj;
    }

    public final void zz2(String str) {
        this.zzv.zzZ(2, 6, str);
    }

    public final zzNG zzKr() {
        return this.zzEi;
    }

    public final zzN9 zzKs() {
        return this.zzEj;
    }

    public final zzO1 zzKt() {
        return this.zzEk;
    }

    public final zzL5 zzKu() {
        return this.zzEl;
    }

    public final zzZOP zzq() {
        return this.zzEm;
    }
}
