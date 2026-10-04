package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY3B {
    private static int zzI(zzYN8 zzyn8) {
        boolean z;
        ArrayList<zzUZ> arrayListZzT = zzyn8.zzT((zzUZ) zzyn8.zz6x(), zzyn8.zzYql());
        int verticalAlignment = ((zzZ35) ((zzZ2D) arrayListZzT.get(0).zza9()).zzYTt()).getVerticalAlignment();
        boolean z2 = verticalAlignment == 2;
        if (!z2) {
            Iterator<zzUZ> it = arrayListZzT.iterator();
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int verticalAlignment2 = ((zzZ35) ((zzZ2D) it.next().zza9()).zzYTt()).getVerticalAlignment();
                boolean z3 = verticalAlignment2 == 2;
                if (z3) {
                    z2 = z3;
                    break;
                }
                z = z || verticalAlignment != verticalAlignment2;
                z2 = z3;
            }
        } else {
            z = false;
        }
        if (z2) {
            return zzZ7E.zzZw(arrayListZzT) ? 2 : 0;
        }
        if (!z && zzWE.zzv(arrayListZzT)) {
            return verticalAlignment;
        }
        return 0;
    }

    public static void zzJ(zzYN8 zzyn8) throws Exception {
        int iZzI;
        if (zzyn8.isEmpty() || (iZzI = zzI(zzyn8)) == 0) {
            return;
        }
        zzY(zzyn8, iZzI).zz4x();
    }

    private static zzYNE zzY(zzYN8 zzyn8, int i) {
        if (i != 1) {
            if (i == 2) {
                return new zzZ7E(zzyn8);
            }
            if (i != 3) {
                throw new IllegalStateException("Unexpected PageVerticalAlignment type.");
            }
        }
        return new zzWE(zzyn8, i);
    }
}
