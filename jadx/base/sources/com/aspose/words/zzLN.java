package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzLN {
    private byte zzZo6;
    private com.aspose.words.internal.zzPV zzZo7;
    private byte zzZo8;

    public zzLN() {
    }

    private static zzQC zzN(zzPS zzps) {
        zzQC zzqc;
        zzPT zzptZzSx = zzps.zzSx("color");
        if (zzptZzSx == null || (zzqc = (zzQC) com.aspose.words.internal.zzZKW.zzZ(zzptZzSx.zzZWj().zzZVx(), zzQC.class)) == null) {
            return null;
        }
        return zzqc;
    }

    private static zzLL zzO(zzPS zzps) {
        zzLL zzll;
        zzPT zzptZzSx = zzps.zzSx("text-decoration");
        if (zzptZzSx == null || (zzll = (zzLL) com.aspose.words.internal.zzZKW.zzZ(zzptZzSx.zzZWj(), zzLL.class)) == null) {
            return null;
        }
        return zzll;
    }

    public final zzLN zzX(zzPS zzps, boolean z) {
        byte b = this.zzZo8;
        byte b2 = this.zzZo6;
        com.aspose.words.internal.zzPV zzpvZzZWw = this.zzZo7;
        if (b == 0) {
            b = -1;
        }
        if (b2 == 0) {
            b2 = -1;
        }
        zzLL zzllZzO = zzO(zzps);
        if (zzllZzO != null) {
            if (!zzllZzO.zzZXi()) {
                if (zzllZzO.zzO(zzL4.zzZna)) {
                    zzQC zzqcZzN = zzN(zzps);
                    zzpvZzZWw = zzqcZzN != null ? zzqcZzN.zzZWw() : null;
                    b = 1;
                }
                if (zzllZzO.zzO(zzL4.zzZn8)) {
                    b2 = 1;
                }
            } else if (z) {
                b = 0;
                b2 = 0;
                zzpvZzZWw = null;
            }
        }
        return new zzLN(b, b2, zzpvZzZWw);
    }

    public final byte zzZUb() {
        return this.zzZo6;
    }

    public final com.aspose.words.internal.zzPV zzZUc() {
        return this.zzZo7;
    }

    public final byte zzZUd() {
        return this.zzZo8;
    }

    private zzLN(byte b, byte b2, com.aspose.words.internal.zzPV zzpv) {
        this.zzZo8 = b;
        this.zzZo6 = b2;
        this.zzZo7 = zzpv;
    }
}
