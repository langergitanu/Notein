package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ0S {
    private boolean zzY1o;
    private int zzY1q;
    private String zzY1r;
    private OfficeMath zzY1s;
    private zzZ0S zzY1t;
    private int zzY1p = -1;
    private int zzY1n = -1;

    public zzZ0S(OfficeMath officeMath, String str, zzZ0S zzz0s) {
        this.zzY1s = officeMath;
        this.zzY1r = str;
        this.zzY1t = zzz0s;
    }

    private void zzYFG() {
        this.zzY1q++;
        zzZ07 zzz07 = (zzZ07) this.zzY1s.zzZsL();
        if (this.zzY1q > zzz07.zzYEI().getCount()) {
            zzz07.zzYEI().zzZ(new zzZ0O(), 1);
        }
    }

    private zzZ0S zzYFH() {
        zzZ0S zzz0s = this;
        while (zzz0s != null && !"mtable".equals(zzz0s.zzY1r)) {
            zzz0s = zzz0s.zzY1t;
        }
        return zzz0s;
    }

    public final boolean zzYFA() {
        int i = this.zzY1n;
        return i != -1 && (this.zzY1p - i) % 2 == 0;
    }

    public final int zzYFB() {
        int i = this.zzY1n;
        if (i != -1) {
            return this.zzY1p - i;
        }
        return -1;
    }

    public final boolean zzYFC() {
        return this.zzY1n != -1;
    }

    public final int zzYFD() {
        return this.zzY1p;
    }

    public final String zzYFE() {
        return this.zzY1r;
    }

    public final OfficeMath zzYFF() {
        return this.zzY1s;
    }

    public final zzZ0S zzYFI() {
        zzZ0S zzz0s = this;
        while (zzz0s != null && !"munder".equals(zzz0s.zzY1r)) {
            zzz0s = zzz0s.zzY1t;
        }
        return zzz0s;
    }

    public final zzZ0S zzYFJ() {
        zzZ0S zzz0s = this;
        while (zzz0s != null && !"mover".equals(zzz0s.zzY1r)) {
            zzz0s = zzz0s.zzY1t;
        }
        return zzz0s;
    }

    public final void zzYFK() {
        this.zzY1n = this.zzY1p + 1;
    }

    public final void zzYFL() {
        zzZ0S zzz0sZzYFH = zzYFH();
        if (zzz0sZzYFH != null) {
            zzz0sZzYFH.zzYFG();
        }
    }

    public final void zzYFM() {
        zzZ0S zzz0sZzYFH = zzYFH();
        if (zzz0sZzYFH != null) {
            zzz0sZzYFH.zzY1q = 0;
        }
    }

    public final void zzYFy() {
        this.zzY1o = true;
    }

    public final boolean zzYFz() {
        return this.zzY1o;
    }

    public final void zzuL(int i) {
        this.zzY1p = i;
    }
}
