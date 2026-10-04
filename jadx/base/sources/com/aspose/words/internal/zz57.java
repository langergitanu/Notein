package com.aspose.words.internal;

import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz57 {
    private static zz57 zzk4 = new zz55();
    private static zz57 zzk3 = new zz54();
    private static zz57 zzk2 = new zz56();
    private static zz57 zzk1 = new zz53();
    private static zz57 zzk0 = new zz52();

    public static zz57 zzUa(int i) {
        if (i == 0) {
            return zzk3;
        }
        if (i == 1) {
            return zzk1;
        }
        if (i == 2) {
            return zzk4;
        }
        if (i == 3) {
            return zzk2;
        }
        throw new IllegalStateException("Unknown bitmap color space.");
    }

    public static zz57 zzu(zzPV zzpv) {
        return zzpv.zzPz() ? zzk4 : zzk3;
    }

    public static zz57 zzvI() {
        return zzk0;
    }

    public static zz57 zzvJ() {
        return zzk1;
    }

    public static zz57 zzvK() {
        return zzk3;
    }

    public static zz57 zzvL() {
        return zzk4;
    }

    public abstract float[] zzv(zzPV zzpv);

    public abstract String zzvM();

    public abstract String zzvN();

    public abstract int zzvO();

    public final String zzw(zzPV zzpv) {
        StringBuilder sb = new StringBuilder();
        for (float f : zzv(zzpv)) {
            zzZNH.zzU(sb, zz1D.zzT(f, 8));
            sb.append(ControlChar.SPACE_CHAR);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public abstract String zzwE();
}
