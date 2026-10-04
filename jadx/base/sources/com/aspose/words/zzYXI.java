package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXI extends zzZLP {
    @Override // com.aspose.words.zzZLP
    public final zzTL zzZ(zzTK zztk) {
        double dZz8Y = zztk.zzMI(0).zz8Y();
        double dZz8Y2 = zztk.zzMI(1).zz8Y();
        if (dZz8Y2 == 0.0d) {
            return new zzZU3("!Zero Divide");
        }
        zzZVZ zzzvz = (zzZVZ) com.aspose.words.internal.zzZKW.zzZ(zztk.zzMI(0), zzZVZ.class);
        zzZVZ zzzvz2 = (zzZVZ) com.aspose.words.internal.zzZKW.zzZ(zztk.zzMI(1), zzZVZ.class);
        return zzZVZ.zzZ(zztk.zzMI(0), zztk.zzMI(1), dZz8Y % dZz8Y2, Math.max(zzzvz != null ? zzzvz.zzZk5() : 0, zzzvz2 != null ? zzzvz2.zzZk5() : 0));
    }

    @Override // com.aspose.words.zzZLP
    public final boolean zzc2() {
        return false;
    }

    @Override // com.aspose.words.zzZLP
    public final int zzc3() {
        return 2;
    }

    @Override // com.aspose.words.zzZLP
    public final int zzc4() {
        return 2;
    }
}
