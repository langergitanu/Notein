package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGN {
    private boolean zzYoO;
    private zzZGP zzYoP;
    private int zzYoQ;
    private zzZGP zzYoR;
    private ListLevel zzYoT;
    private int zzYoW;
    private boolean zzYqT;
    private int zzYoS = 1;
    private int zzYpa = 0;

    public zzZGN(int i, boolean z) {
        this.zzYoW = i;
        this.zzYqT = z;
    }

    public final int getListLevelNumber() {
        return this.zzYoW;
    }

    public final boolean isImplicit() {
        return this.zzYqT;
    }

    public final void zzVs(boolean z) {
        this.zzYoO = z;
    }

    public final void zzW(ListLevel listLevel) {
        this.zzYoT = listLevel;
    }

    public final void zzY(zzZGP zzzgp) {
        this.zzYoP = zzzgp;
    }

    public final void zzZ(zzZGP zzzgp) {
        this.zzYoR = zzzgp;
    }

    public final boolean zzZ1b() {
        return this.zzYoO;
    }

    public final int zzZ1c() {
        return this.zzYoQ;
    }

    public final zzZGP zzZ1d() {
        return this.zzYoR;
    }

    public final int zzZ1e() {
        return (this.zzYoS + this.zzYoQ) - 1;
    }

    public final ListLevel zzZ1f() {
        return this.zzYoT;
    }

    public final int zzZ1j() {
        return this.zzYpa;
    }

    public final void zzzk(int i) {
        this.zzYoQ = i;
    }

    public final void zzzl(int i) {
        this.zzYpa = i;
    }

    public final void zzzm(int i) {
        this.zzYoS = i;
    }
}
