package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzN2 implements zzHC {
    private double zzE0;

    public zzN2(double d) {
        this.zzE0 = d;
    }

    private static double zzW(zzYK zzyk) {
        return zzyk.zzY7().getWidth();
    }

    private static int zzX(zzYK zzyk) {
        Iterator<zzZZG> it = zzyk.zzY7().zzyD().iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().zzZh().length;
        }
        return length;
    }

    @Override // com.aspose.words.internal.zzHC
    public final double zzY(zzYK zzyk) {
        int iZzX = zzX(zzyk);
        double dZzW = zzW(zzyk);
        if (iZzX != 0) {
            return ((this.zzE0 - 1.0d) * dZzW) / ((double) iZzX);
        }
        return 0.0d;
    }

    @Override // com.aspose.words.internal.zzHC
    public final double zzZ(zzYK zzyk) {
        return zzW(zzyk) * this.zzE0;
    }
}
