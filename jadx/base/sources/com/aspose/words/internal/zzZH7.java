package com.aspose.words.internal;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZH7 extends zzZH4 {
    final zzZH4[] zzWOT;
    final boolean zzWOU;
    final boolean zzWOV;

    public static final class zzZ extends zzZG6 {
        final zzZGA zzWOR;
        final char zzWOS;
        int zzZF = 0;

        public zzZ(char c, zzZGA zzzga) {
            this.zzWOS = c;
            this.zzWOR = zzzga;
        }

        @Override // com.aspose.words.internal.zzZG6
        public final String zzXOZ() {
            char c = this.zzWOS;
            if (c != ' ') {
                if (c != '?' && c != '*') {
                    if (c != '+') {
                        zzZE1.zzx1(null);
                    }
                }
                return null;
            }
            if (this.zzZF > 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(this.zzWOS == '+' ? "at least" : "");
            sb.append(" one of elements (");
            sb.append(this.zzWOR);
            sb.append(")");
            return sb.toString();
        }

        @Override // com.aspose.words.internal.zzZG6
        public final zzZG6 zzXP0() {
            char c = this.zzWOS;
            return c == '*' ? this : new zzZ(c, this.zzWOR);
        }

        @Override // com.aspose.words.internal.zzZG6
        public final String zzZ(zzZDZ zzzdz) {
            if (!this.zzWOR.zzX(zzzdz)) {
                if (this.zzWOR.zzXO0()) {
                    return "Expected one of (" + this.zzWOR.toString(" | ") + ")";
                }
                return "Expected <" + this.zzWOR.toString("") + ">";
            }
            int i = this.zzZF + 1;
            this.zzZF = i;
            if (i <= 1) {
                return null;
            }
            char c = this.zzWOS;
            if (c != '?' && c != ' ') {
                return null;
            }
            if (this.zzWOR.zzXO0()) {
                return "Expected $END (already had one of [" + this.zzWOR.toString(" | ") + "]";
            }
            return "Expected $END (already had one <" + this.zzWOR.toString("") + ">]";
        }
    }

    private zzZH7(boolean z, char c, boolean z2, Collection<zzZH4> collection) {
        super(c);
        this.zzWOV = z;
        this.zzWOU = z2;
        zzZH4[] zzzh4Arr = new zzZH4[collection.size()];
        this.zzWOT = zzzh4Arr;
        collection.toArray(zzzh4Arr);
    }

    public static zzZH7 zzZ(boolean z, char c, Collection<zzZH4> collection) {
        return new zzZH7(z, c, false, collection);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.zzWOU) {
            sb.append("(#PCDATA | ");
        } else {
            sb.append('(');
        }
        for (int i = 0; i < this.zzWOT.length; i++) {
            if (i > 0) {
                sb.append(" | ");
            }
            sb.append(this.zzWOT[i].toString());
        }
        sb.append(')');
        char c = this.zzWOS;
        if (c != ' ') {
            sb.append(c);
        }
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zzZH4
    public final zzZGC zzXP1() {
        zzZH4[] zzzh4Arr = this.zzWOT;
        int length = zzzh4Arr.length;
        zzZGC[] zzzgcArr = new zzZGC[length];
        for (int i = 0; i < length; i++) {
            zzzgcArr[i] = zzzh4Arr[i].zzXP1();
        }
        zzZH6 zzzh6 = new zzZH6(zzzgcArr);
        char c = this.zzWOS;
        return c == '*' ? new zzZG7(zzzh6) : c == '?' ? new zzZGB(zzzh6) : c == '+' ? new zzZH5(zzzh6, new zzZG7(zzzh6.zzXOY())) : zzzh6;
    }

    @Override // com.aspose.words.internal.zzZH4
    public final zzZG6 zzXP2() {
        int i;
        zzZH4[] zzzh4Arr = this.zzWOT;
        int length = zzzh4Arr.length;
        if (this.zzWOU) {
            i = length;
        } else {
            i = 0;
            while (i < length && zzzh4Arr[i].zzFN()) {
                i++;
            }
        }
        if (i != length) {
            return null;
        }
        return new zzZ(this.zzWOS, zzZ(this.zzWOV, zzzh4Arr));
    }

    public static zzZH7 zzZ(boolean z, Collection<zzZH4> collection) {
        return new zzZH7(z, '*', true, collection);
    }

    private static zzZGA zzZ(boolean z, zzZH4[] zzzh4Arr) {
        int length = zzzh4Arr.length;
        zzZDZ[] zzzdzArr = new zzZDZ[length];
        for (int i = 0; i < length; i++) {
            zzzdzArr[i] = ((zzZG5) zzzh4Arr[i]).zzWN3;
        }
        if (length < 5) {
            return new zzZG8(z, zzzdzArr);
        }
        return new zzZGE(z, zzzdzArr);
    }
}
