package com.aspose.words.internal;

import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzRJ {
    protected static Class zzMU = zzZW6.class;
    private int zzMV;

    private static boolean zzS(zzZW5 zzzw5) {
        return zzzw5.isVarArgs() || zzzw5.zzAE().length > zzYs(5);
    }

    private static void zzT(zzZW5 zzzw5) {
        for (int i = 0; i <= 5; i++) {
            zzZ(zzzw5, i);
        }
        zzS(zzzw5);
    }

    private static int zzYs(int i) {
        if (i <= 5) {
            return i;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: constructedMethod");
    }

    public final Object zzQU() {
        int i = this.zzMV;
        this.zzMV = i + 1;
        return Integer.valueOf(i);
    }

    public final void zzZ(zzZW5 zzzw5, Object obj, Member member) {
        int iZzAG = zzzw5.zzAG();
        if (iZzAG == 1 || iZzAG == 2) {
            zzT(zzzw5);
        } else if (iZzAG != 6) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: binding");
        }
    }

    private static boolean zzZ(zzZW5 zzzw5, int i) {
        int iZzYs = zzYs(i);
        zz6P[] zz6pArrZzAE = zzzw5.zzAE();
        if (zz6pArrZzAE.length < iZzYs) {
            return zzzw5.isVarArgs();
        }
        while (iZzYs < zz6pArrZzAE.length) {
            zz6P zz6p = zz6pArrZzAE[iZzYs];
            if (!zz6p.zzwT() && !zz6p.isVarArgs()) {
                return false;
            }
            iZzYs++;
        }
        return true;
    }
}
