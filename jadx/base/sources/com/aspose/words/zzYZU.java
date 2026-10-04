package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYZU implements Cloneable {
    private boolean zzY0B;
    private boolean zzY0D;
    private int zzY0E;
    private int zzY0F;
    private int zzY0I;
    private int zzY0J;
    private int zzY0K;
    private int zzY0L;
    private int zzY0Q = 0;
    private int zzY0P = 0;
    private int zzY0O = 1;
    private boolean zzY0N = true;
    private int zzY0M = 0;
    private String zzY0H = "";
    private int zzY0G = 1;
    private int zzY0C = 1440;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzHi(int i) {
        this.zzY0I = i;
    }

    public final void zzHj(int i) {
        this.zzY0J = i;
    }

    public final void zzIk(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzY0H = str;
        }
    }

    public final void zzSP(boolean z) {
        this.zzY0B = z;
    }

    public final void zzSQ(boolean z) {
        this.zzY0D = z;
    }

    public final void zzSR(boolean z) {
        this.zzY0N = z;
    }

    public final int zzYEA() {
        return this.zzY0Q;
    }

    public final boolean zzYEB() {
        return (this.zzY0Q == 0 && this.zzY0P == 0 && this.zzY0O == 1 && this.zzY0N && this.zzY0M == 0 && this.zzY0L == 0 && this.zzY0K == 0 && this.zzY0J == 0 && this.zzY0I == 0 && "".equals(this.zzY0H) && this.zzY0G == 1 && this.zzY0F == 0 && this.zzY0E == 0 && !this.zzY0D && this.zzY0C == 1440 && !this.zzY0B) ? false : true;
    }

    public final zzYZU zzYEC() {
        return (zzYZU) memberwiseClone();
    }

    public final boolean zzYEn() {
        return this.zzY0B;
    }

    public final int zzYEo() {
        return this.zzY0C;
    }

    public final boolean zzYEp() {
        return this.zzY0D;
    }

    public final int zzYEq() {
        return this.zzY0E;
    }

    public final int zzYEr() {
        return this.zzY0F;
    }

    public final int zzYEs() {
        return this.zzY0G;
    }

    public final String zzYEt() {
        return this.zzY0H;
    }

    public final int zzYEu() {
        return this.zzY0M;
    }

    public final int zzYEv() {
        return this.zzY0K;
    }

    public final int zzYEw() {
        return this.zzY0L;
    }

    public final boolean zzYEx() {
        return this.zzY0N;
    }

    public final int zzYEy() {
        return this.zzY0O;
    }

    public final int zzYEz() {
        return this.zzY0P;
    }

    public final int zzZRh() {
        return this.zzY0I;
    }

    public final int zzZRi() {
        return this.zzY0J;
    }

    public final void zzui(int i) {
        this.zzY0C = i;
    }

    public final void zzuj(int i) {
        this.zzY0E = i;
    }

    public final void zzuk(int i) {
        this.zzY0F = i;
    }

    public final void zzul(int i) {
        if (i == -1) {
            throw new IllegalArgumentException("This enum value is not allowed.");
        }
        this.zzY0G = i;
    }

    public final void zzum(int i) {
        if (i == -1) {
            throw new IllegalArgumentException("This enum value is not allowed.");
        }
        this.zzY0M = i;
    }

    public final void zzun(int i) {
        this.zzY0K = i;
    }

    public final void zzuo(int i) {
        this.zzY0L = i;
    }

    public final void zzup(int i) {
        this.zzY0O = i;
    }

    public final void zzuq(int i) {
        this.zzY0P = i;
    }

    public final void zzur(int i) {
        this.zzY0Q = i;
    }
}
