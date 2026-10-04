package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZE3 {
    private zzZE3 zzWJh;
    private zzZE3 zzWJi;
    private zzZDZ zzWJj;
    private final String zzWJk;
    private boolean zzWJl;
    private zzZDZ zzWN3;
    private zzZQY zzWOA;

    public zzZE3(String str, zzZQY zzzqy, boolean z, zzZDZ zzzdz, zzZDZ zzzdz2) {
        this.zzWJk = str;
        this.zzWOA = zzzqy;
        this.zzWJl = z;
        this.zzWN3 = zzzdz;
        this.zzWJj = zzzdz2;
    }

    public final String getId() {
        return this.zzWJk;
    }

    public final boolean isDefined() {
        return this.zzWJl;
    }

    public final String toString() {
        return this.zzWJk;
    }

    public final boolean zzP(char[] cArr, int i, int i2) {
        if (this.zzWJk.length() != i2 || cArr[i] != this.zzWJk.charAt(0)) {
            return false;
        }
        int i3 = i2 + i;
        int i4 = 1;
        while (true) {
            i++;
            if (i >= i3) {
                return true;
            }
            if (cArr[i] != this.zzWJk.charAt(i4)) {
                return false;
            }
            i4++;
        }
    }

    public final zzZE3 zzXLF() {
        return this.zzWJh;
    }

    public final zzZE3 zzXLG() {
        return this.zzWJi;
    }

    public final zzZDZ zzXLH() {
        return this.zzWJj;
    }

    public final zzZDZ zzXOu() {
        return this.zzWN3;
    }

    public final void zzY(zzZE3 zzze3) {
        this.zzWJh = zzze3;
    }

    public final void zzZ(zzZE3 zzze3) {
        if (this.zzWJi == null) {
            this.zzWJi = zzze3;
            return;
        }
        throw new IllegalStateException("ElementId '" + this + "' already had net undefined set ('" + this.zzWJi + "')");
    }

    public final zzZQY zzlj() {
        return this.zzWOA;
    }

    public final void zzZ(zzZQY zzzqy) {
        if (!this.zzWJl) {
            this.zzWJl = true;
            this.zzWOA = zzzqy;
            return;
        }
        throw new IllegalStateException(zzZH9.zzWPK);
    }
}
