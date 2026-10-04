package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzR extends zzZLP {
    public com.aspose.words.internal.zz7K zzZ(com.aspose.words.internal.zz7K zz7k, double d) {
        return zz7k;
    }

    @Override // com.aspose.words.zzZLP
    public final boolean zzbU() {
        return true;
    }

    public boolean zzbV() {
        return true;
    }

    public zzTL zzbW() {
        return zzYU0.zzXSk;
    }

    public com.aspose.words.internal.zz7K zzbX() {
        return new com.aspose.words.internal.zz7K(0.0d);
    }

    @Override // com.aspose.words.zzZLP
    public final boolean zzc2() {
        return true;
    }

    @Override // com.aspose.words.zzZLP
    public final int zzc3() {
        return Integer.MAX_VALUE;
    }

    @Override // com.aspose.words.zzZLP
    public final int zzc4() {
        return 1;
    }

    public com.aspose.words.internal.zz7K zzZ(com.aspose.words.internal.zz7K zz7k, int i) {
        return zz7k;
    }

    @Override // com.aspose.words.zzZLP
    public final zzTL zzZ(zzTK zztk) {
        com.aspose.words.internal.zz7K zz7kZzbX = zzbX();
        Iterator<zzTL> it = zztk.iterator();
        int i = 0;
        int iZzZ = 0;
        while (it.hasNext()) {
            zzTL next = it.next();
            if (next.zzbY() == 8) {
                next = zzbW();
            }
            if (next.zzbY() == 0) {
                if (zzbV()) {
                    i++;
                }
            } else {
                i++;
                if (!(next instanceof zzZVZ)) {
                    return zzZU3.zzZiV();
                }
                iZzZ = zzZ(iZzZ, (zzZVZ) next);
                zz7kZzbX = zzZ(zz7kZzbX, next.zz8Y());
            }
        }
        com.aspose.words.internal.zz7K zz7kZzZ = zzZ(zz7kZzbX, i);
        if (zz7kZzZ.hasValue()) {
            return zzZVZ.zzZ(zztk, zz7kZzZ.getValue(), iZzZ);
        }
        return zzYU0.zzXSk;
    }

    public int zzZ(int i, zzZVZ zzzvz) {
        return Math.max(i, zzzvz.zzZk5());
    }
}
