package com.aspose.words.internal;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZG9 extends zzZH4 {
    final zzZH4[] zzWOT;
    final boolean zzWOV;

    private zzZG9(boolean z, char c, zzZH4[] zzzh4Arr) {
        super(c);
        this.zzWOV = z;
        this.zzWOT = zzzh4Arr;
    }

    public static zzZG9 zzY(boolean z, char c, Collection<zzZH4> collection) {
        zzZH4[] zzzh4Arr = new zzZH4[collection.size()];
        collection.toArray(zzzh4Arr);
        return new zzZG9(z, c, zzzh4Arr);
    }

    private zzZGC zzZ(zzZH4[] zzzh4Arr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > 3) {
            int i4 = ((i2 + i) + 1) >> 1;
            return new zzZH5(zzZ(zzzh4Arr, i, i4), zzZ(zzzh4Arr, i4, i2));
        }
        zzZH5 zzzh5 = new zzZH5(zzzh4Arr[i].zzXP1(), zzzh4Arr[i + 1].zzXP1());
        return i3 == 3 ? new zzZH5(zzzh5, zzzh4Arr[i + 2].zzXP1()) : zzzh5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < this.zzWOT.length; i++) {
            if (i > 0) {
                sb.append(", ");
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
        zzZGC zzzgcZzZ = zzZ(zzzh4Arr, 0, zzzh4Arr.length);
        char c = this.zzWOS;
        return c == '*' ? new zzZG7(zzzgcZzZ) : c == '?' ? new zzZGB(zzzgcZzZ) : c == '+' ? new zzZH5(zzzgcZzZ, new zzZG7(zzzgcZzZ.zzXOY())) : zzzgcZzZ;
    }

    @Override // com.aspose.words.internal.zzZH4
    public final zzZG6 zzXP2() {
        zzZH4[] zzzh4Arr = this.zzWOT;
        int length = zzzh4Arr.length;
        int i = 0;
        while (i < length && zzzh4Arr[i].zzFN()) {
            i++;
        }
        if (i != length) {
            return null;
        }
        zzZDZ[] zzzdzArr = new zzZDZ[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzzdzArr[i2] = ((zzZG5) zzzh4Arr[i2]).zzWN3;
        }
        return new zzZ(this.zzWOS, zzzdzArr);
    }

    public static final class zzZ extends zzZG6 {
        final zzZDZ[] zzWNa;
        final char zzWOS;
        int zzWN6 = 0;
        int zzZpV = 0;

        public zzZ(char c, zzZDZ[] zzzdzArr) {
            this.zzWOS = c;
            this.zzWNa = zzzdzArr;
        }

        private String zzgT(int i) {
            StringBuilder sb = new StringBuilder("expected element <");
            sb.append(this.zzWNa[i]);
            sb.append("> in sequence (");
            return androidx.concurrent.futures.OooO00o.OooO0OO(sb, zzZ(this.zzWNa), ")");
        }

        @Override // com.aspose.words.internal.zzZG6
        public final String zzXOZ() {
            if (this.zzZpV != 0) {
                return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzgT(this.zzZpV), "; got end element");
            }
            char c = this.zzWOS;
            if (c != ' ') {
                if (c == '?' || c == '*') {
                    return null;
                }
                if (c != '+') {
                    throw new IllegalStateException("Internal error");
                }
            }
            if (this.zzWN6 > 0) {
                return null;
            }
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("Expected sequence ("), zzZ(this.zzWNa), "); got end element");
        }

        @Override // com.aspose.words.internal.zzZG6
        public final zzZG6 zzXP0() {
            return new zzZ(this.zzWOS, this.zzWNa);
        }

        @Override // com.aspose.words.internal.zzZG6
        public final String zzZ(zzZDZ zzzdz) {
            char c;
            int i = this.zzZpV;
            if (i == 0 && this.zzWN6 == 1 && ((c = this.zzWOS) == '?' || c == ' ')) {
                return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("was not expecting any more elements in the sequence ("), zzZ(this.zzWNa), ")");
            }
            if (!zzzdz.equals(this.zzWNa[i])) {
                return zzgT(this.zzZpV);
            }
            int i2 = this.zzZpV + 1;
            this.zzZpV = i2;
            if (i2 != this.zzWNa.length) {
                return null;
            }
            this.zzWN6++;
            this.zzZpV = 0;
            return null;
        }

        private static String zzZ(zzZDZ[] zzzdzArr) {
            StringBuilder sb = new StringBuilder();
            int length = zzzdzArr.length;
            for (int i = 0; i < length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(zzzdzArr[i].toString());
            }
            return sb.toString();
        }
    }
}
