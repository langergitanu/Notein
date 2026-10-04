package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIJ extends zzZLP {
    @Override // com.aspose.words.zzZLP
    public final zzTL zzZ(zzTK zztk) {
        double dZzS;
        double dZz8Y = zztk.zzMI(0).zz8Y();
        int iFloor = (int) Math.floor(zztk.zzMI(1).zz8Y());
        if (iFloor < 0) {
            double dPow = Math.pow(10.0d, -iFloor);
            dZzS = com.aspose.words.internal.zzZKQ.zzZa(dZz8Y / dPow) * dPow;
            iFloor = 0;
        } else {
            dZzS = com.aspose.words.internal.zzZKQ.zzS(dZz8Y, iFloor);
        }
        return zzZVZ.zzZ(zztk.zzMI(0), zztk.zzMI(1), dZzS, iFloor);
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
