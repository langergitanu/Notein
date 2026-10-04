package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHW {
    private static boolean zzB(float f, float f2) {
        return f <= f2 + 0.01f;
    }

    public static float zzW(zz65 zz65Var) {
        if (!Float.isInfinite(zz65Var.zzZze()) && zz65Var.zzZze() > 0.0f) {
            return zz65Var.zzZze();
        }
        return 0.0f;
    }

    public static float zzX(zz65 zz65Var) {
        if (Float.isInfinite(zz65Var.zzZze())) {
            return 0.0f;
        }
        return zz65Var.zzZze();
    }

    public static boolean zzz(long j, long j2) {
        return zzB(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) j2)) && zzB(com.aspose.words.internal.zzZPW.zzYz(j), com.aspose.words.internal.zzZPW.zzYz(j2));
    }
}
