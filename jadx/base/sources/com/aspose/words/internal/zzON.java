package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzON {
    public boolean isEmpty() {
        return false;
    }

    public boolean isInfinite() {
        return false;
    }

    public final zzON zzF(zzZQ4 zzzq4) {
        return zzY(new zzOJ(zzzq4));
    }

    public final zzON zzG(zzZQ4 zzzq4) {
        return zzZ(new zzOJ(zzzq4));
    }

    public abstract zzON zzM(zzP9 zzp9) throws Exception;

    public zzP8 zzNR() throws Exception {
        return zzZZN.zzU(this);
    }

    public final zzP8 zzNl() throws Exception {
        return zzNm().zzNR();
    }

    public zzON zzNm() {
        return this;
    }

    public zzON zzU(float f, float f2) throws Exception {
        return zzM(new zzP9(1.0f, 0.0f, 0.0f, 1.0f, f, f2));
    }

    public final zzON zzV(zzON zzon) {
        return new zzOM(this, zzon, 5);
    }

    public final zzON zzW(zzON zzon) {
        return new zzOM(this, zzon, 4);
    }

    public final zzON zzX(zzON zzon) {
        return new zzOM(this, zzon, 3);
    }

    public final zzON zzY(zzON zzon) {
        return new zzOM(this, zzon, 2);
    }

    public final zzON zzZ(zzON zzon) {
        return new zzOM(this, zzon, 1);
    }

    public abstract void zzZ(zzH1 zzh1) throws Exception;
}
