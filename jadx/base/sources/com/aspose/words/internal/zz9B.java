package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9B {
    private zz9G zzqq;
    private zzP8 zzqs;
    private boolean zzqt;
    private zzP8 zzqr = new zzP8();
    private zzP5 zzSo = new zzP5();

    public zz9B(zz9G zz9g) {
        this.zzqq = zz9g;
    }

    private void zzZ(zzP5 zzp5, boolean z) {
        zzzE();
        if (z) {
            zzp5 = zzp5.zzNZ();
            zzp5.zzY(this.zzqq.zzzV().zzMq());
        }
        zzZQG.zzZ(this.zzqr.zzO7(), zzp5);
    }

    private void zzZH(long j) {
        if (this.zzSo.getCount() == 0 || zzAN.zzH(this.zzSo.zzPQ(), j)) {
            return;
        }
        zzZQG.zzZ(this.zzqr.zzO7(), this.zzSo);
        this.zzSo = new zzP5();
    }

    private void zzzE() {
        if (this.zzqt && this.zzSo.getCount() != 0) {
            zzZQG.zzZ(this.zzqr.zzO7(), this.zzSo);
            this.zzSo = new zzP5();
        }
    }

    public final boolean isOpened() {
        return this.zzqt;
    }

    public final void zzI(zzP8 zzp8) {
        for (int i = 0; i < zzp8.getCount(); i++) {
            zzZ(zzp8.zzO7().get(i), false);
        }
    }

    public final void zzJ(zzP8 zzp8) {
        for (int i = 0; i < zzp8.getCount(); i++) {
            zzZ(zzp8.zzO7().get(i), true);
        }
    }

    public final void zzU(zzP5 zzp5) {
        zzP5 zzp5ZzNZ = zzp5.zzNZ();
        zzp5ZzNZ.zzY(this.zzqq.zzzV().zzMq());
        zzZH(zzp5ZzNZ.zzPR());
        this.zzSo.zzU(zzp5ZzNZ);
    }

    public final void zzY(zz9A zz9a) {
        this.zzqt = zz9a.isOpened();
        this.zzSo = zz9a.zzzz();
        this.zzqr = zz9a.zzzA();
        this.zzqs = zz9a.zzzB();
    }

    public final zzP8 zzzB() {
        return this.zzqs;
    }

    public final void zzzC() {
        if (this.zzqs == null) {
            return;
        }
        for (int i = 0; i < this.zzqs.getCount(); i++) {
            this.zzqs.zzO7().get(i).zze(true);
        }
    }

    public final void zzzD() {
        this.zzqs = null;
    }

    public final void zzzF() {
        if (this.zzqt && this.zzSo.getCount() != 0) {
            this.zzSo.zze(true);
            zzzE();
        }
    }

    public final void zzzG() {
        zzzE();
        this.zzqs = this.zzqr;
        this.zzqt = false;
        this.zzqr = null;
    }

    public final void zzzH() {
        this.zzqs = null;
        this.zzqt = true;
        this.zzqr = new zzP8();
        this.zzSo = new zzP5();
    }

    public final void zzzI() {
        this.zzqs = null;
        this.zzqt = false;
        this.zzqr = null;
    }

    public final zz9A zzzJ() {
        zz9A zz9a = new zz9A();
        zz9a.zzZQ(this.zzqt);
        zzP5 zzp5 = this.zzSo;
        zz9a.zzP(zzp5 != null ? zzp5.zzNZ() : null);
        zzP8 zzp8 = this.zzqr;
        zz9a.zzG(zzp8 != null ? zzp8.zzO8() : null);
        zzP8 zzp82 = this.zzqs;
        zz9a.zzH(zzp82 != null ? zzp82.zzO8() : null);
        return zz9a;
    }
}
