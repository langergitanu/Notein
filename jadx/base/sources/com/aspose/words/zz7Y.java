package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz7Y {
    public static boolean zzZ(zz2S zz2s, zz2N zz2n) {
        if (zz2s != null && zz2s.zzZvF() != null) {
            if (zz2n != null && (zz2n.zzZvs() != null || zz2n.zzZvr() != null || !com.aspose.words.internal.zzAN.zzZD(zz2n.zzZvo()) || !com.aspose.words.internal.zzAN.zzZD(zz2n.zzZvn()))) {
                return true;
            }
            if ((zz2s.zzZvF().zzZPw() != null && (!com.aspose.words.internal.zzAN.zzZD(zz2s.zzZvF().zzZPw().zzZw5().getValue()) || !com.aspose.words.internal.zzAN.zzZD(zz2s.zzZvF().zzZPw().zzZw4().getValue()) || !com.aspose.words.internal.zzAN.zzZD(zz2s.zzZvF().zzZPw().zzZw3().getValue()))) || (zz2s.zzZvF().zzZPy() != 18 && zz2s.zzZvF().zzZPy() != 47 && zz2s.zzZvF().zzZPy() != 13)) {
                return true;
            }
        }
        return false;
    }
}
