package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWL {
    private boolean zz8O;
    private zzZYE zz8P;
    private int zzXi;
    private String zzXj;

    private static int zzSe(int i) {
        if (zzSf(i)) {
            return 1;
        }
        return zzSg(i) ? 2 : 0;
    }

    private static boolean zzSf(int i) {
        return i == 32 || i == 9;
    }

    private static boolean zzSg(int i) {
        return i == 10 || i == 13;
    }

    public final boolean moveNext() {
        if (!this.zz8O) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        do {
            int iIntValue = this.zz8P.next().intValue();
            int iZzSe = zzSe(iIntValue);
            if (z) {
                this.zzXi = iZzSe;
                z = false;
            }
            if (iZzSe != this.zzXi) {
                this.zzXj = sb.toString();
                return true;
            }
            zzZNH.zzU(sb, zzZVS.zzS7(iIntValue));
        } while (this.zz8P.hasNext());
        this.zzXj = sb.toString();
        this.zz8O = false;
        return true;
    }

    public final void setText(String str) {
        if (str == null) {
            str = "";
        }
        zzZYE zzzye = new zzZYE(str);
        this.zz8P = zzzye;
        this.zz8O = zzzye.hasNext();
    }

    public final String toString() {
        return this.zzXj;
    }

    public final int zzYb() {
        return this.zzXi;
    }

    public final String zzom() {
        return this.zzXj;
    }
}
