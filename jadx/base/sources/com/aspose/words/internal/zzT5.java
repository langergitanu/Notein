package com.aspose.words.internal;

import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
final class zzT5 {
    private int zzQe;
    private zzH0 zzQf;

    public zzT5(zzH0 zzh0) {
        this.zzQf = zzh0;
        this.zzQe = zzU(zzh0);
    }

    private static int getColor(int i) {
        if ((i & ViewCompat.MEASURED_STATE_MASK) == 0) {
            i |= ViewCompat.MEASURED_STATE_MASK;
        }
        return zzZQ1.zzRj(i);
    }

    private static int zzC(String str) {
        int iZzZc;
        if (str.length() == 7 && (iZzZc = zzJB.zzZc(str.substring(1))) != Integer.MIN_VALUE) {
            return zzZQ1.zzRj(iZzZc | ViewCompat.MEASURED_STATE_MASK);
        }
        return zzZQ1.zz2p;
    }

    private static int zzD(String str) {
        if (str.length() != 0) {
            str = zzZKN.zzTX(str);
        }
        return str.length() == 0 ? zzZQ1.zz2p : zzZKN.zzS(str, "#", zzZOF.ORDINAL$4894b8c8) ? zzC(str) : zzZQ1.fromName(str);
    }

    private static int zzU(zzH0 zzh0) {
        if (zzh0.zzs()) {
            return 0;
        }
        if (zzh0.getType() == String.class) {
            return 18;
        }
        if (zzh0.zzw() == Integer.class) {
            return 1;
        }
        int iZzr = zzZKM.zzr(zzh0.zzw());
        if (iZzr == 4 || !zz7F.zzUj(iZzr)) {
            throw new zzCW(zzZKN.format("An expression providing color data should return a number, a string, or an instance of type '{0}'.", Integer.class));
        }
        return iZzr;
    }

    public final int zzTq() throws Exception {
        Object objZzx = this.zzQf.zzx();
        if (objZzx == null) {
            return zzZQ1.zz2p;
        }
        int i = this.zzQe;
        return i != 1 ? i != 18 ? getColor(zz7F.zzT(objZzx, i)) : zzD((String) objZzx) : ((Integer) objZzx).intValue();
    }
}
