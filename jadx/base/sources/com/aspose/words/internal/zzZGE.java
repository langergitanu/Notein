package com.aspose.words.internal;

import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGE extends zzZGA {
    final zzZ[] zzWN9;
    final zzZDZ[] zzWNa;
    final boolean zzWOV;

    public static final class zzZ {
        final zzZ zzWN8;
        final zzZDZ zzWOF;

        public zzZ(zzZDZ zzzdz, zzZ zzz) {
            this.zzWOF = zzzdz;
            this.zzWN8 = zzz;
        }
    }

    public zzZGE(boolean z, zzZDZ[] zzzdzArr) {
        zzZ zzz;
        this.zzWOV = z;
        int length = zzzdzArr.length;
        int i = 8;
        while (i < ((length + 7) >> 3) + length) {
            i += i;
        }
        this.zzWNa = new zzZDZ[i];
        int i2 = i - 1;
        zzZ[] zzzArr = null;
        for (zzZDZ zzzdz : zzzdzArr) {
            int iHashCode = zzzdz.hashCode() & i2;
            zzZDZ[] zzzdzArr2 = this.zzWNa;
            if (zzzdzArr2[iHashCode] == null) {
                zzzdzArr2[iHashCode] = zzzdz;
            } else {
                int i3 = iHashCode >> 2;
                if (zzzArr == null) {
                    zzzArr = new zzZ[i >> 2];
                    zzz = null;
                } else {
                    zzz = zzzArr[i3];
                }
                zzzArr[i3] = new zzZ(zzzdz, zzz);
            }
        }
        this.zzWN9 = zzzArr;
    }

    @Override // com.aspose.words.internal.zzZGA
    public final void zzQ(StringBuilder sb, String str) {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        while (true) {
            zzZDZ[] zzzdzArr = this.zzWNa;
            if (i >= zzzdzArr.length) {
                break;
            }
            zzZDZ zzzdz = zzzdzArr[i];
            if (zzzdz != null) {
                treeSet.add(zzzdz);
            }
            i++;
        }
        if (this.zzWN9 != null) {
            for (int i2 = 0; i2 < (this.zzWNa.length >> 2); i2++) {
                for (zzZ zzz = this.zzWN9[i2]; zzz != null; zzz = zzz.zzWN8) {
                    treeSet.add(zzz.zzWOF);
                }
            }
        }
        Iterator it = treeSet.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(((zzZDZ) it.next()).toString());
        }
    }

    @Override // com.aspose.words.internal.zzZGA
    public final boolean zzX(zzZDZ zzzdz) {
        zzZDZ[] zzzdzArr = this.zzWNa;
        int iHashCode = zzzdz.hashCode() & (zzzdzArr.length - 1);
        zzZDZ zzzdz2 = zzzdzArr[iHashCode];
        if (zzzdz2 != null && zzzdz2.equals(zzzdz)) {
            return true;
        }
        zzZ[] zzzArr = this.zzWN9;
        if (zzzArr == null) {
            return false;
        }
        for (zzZ zzz = zzzArr[iHashCode >> 2]; zzz != null; zzz = zzz.zzWN8) {
            if (zzz.zzWOF.equals(zzzdz)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzZGA
    public final boolean zzXO0() {
        return true;
    }
}
