package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzV1 {
    private zzP5 zzSo;
    private long zzSp = 0;
    private zzP8 zzSq = new zzP8();

    public zzV1() {
        zzUt();
    }

    private void zzUt() {
        zzP5 zzp5 = new zzP5();
        this.zzSo = zzp5;
        zzp5.zze(true);
        zzZQG.zzZ(this.zzSq.zzO7(), this.zzSo);
    }

    public final zzP8 zzUu() {
        return this.zzSq;
    }

    public final void zzX(double d, double d2) {
        long jZzC = zzZPY.zzC(this.zzSp, zzZPW.zzG((float) d, (float) d2));
        this.zzSo.zzR(this.zzSp, jZzC);
        this.zzSp = jZzC;
    }

    public final void zzY(double d, double d2) {
        if (this.zzSo.zzNY().size() > 0) {
            zzUt();
        }
        this.zzSp = zzZPY.zzC(this.zzSp, zzZPW.zzG((float) d, (float) d2));
    }

    public final void zzZ(double d, double d2, double d3, double d4, double d5, double d6) {
        long jZzC = zzZPY.zzC(this.zzSp, zzZPW.zzG((float) d, (float) d2));
        long jZzC2 = zzZPY.zzC(jZzC, zzZPW.zzG((float) d3, (float) d4));
        long jZzC3 = zzZPY.zzC(jZzC2, zzZPW.zzG((float) d5, (float) d6));
        zzZQG.zzZ((ArrayList<zzPZ>) this.zzSo.zzNY(), new zzPZ(this.zzSp, jZzC, jZzC2, jZzC3));
        this.zzSp = jZzC3;
    }
}
