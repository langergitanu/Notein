package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzI8 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("tL", "tR", "bL", "bR");

    public static com.aspose.words.internal.zzZQ4 zzP(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        return new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(zzzq4.getX(), zzW(zzzq4.getY(), zzzq4.getHeight(), zzzq42.getY(), zzzq42.getHeight())), zzzq4.getSize());
    }

    public static com.aspose.words.internal.zzZQ4 zzQ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        return new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzG(zzW(zzzq4.getX(), zzzq4.getWidth(), zzzq42.getX(), zzzq42.getWidth()), zzzq4.getY()), zzzq4.getSize());
    }

    public static zzI8 zzRF(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return new zzI5();
        }
        if (iZzTP == 1) {
            return new zzI4();
        }
        if (iZzTP == 2) {
            return new zzI7();
        }
        if (iZzTP == 3) {
            return new zzI6();
        }
        throw new IllegalStateException("Unexpected grow direction parameter.");
    }

    private static float zzW(float f, float f2, float f3, float f4) {
        return ((f3 + f4) - (f - f3)) - f2;
    }

    public abstract com.aspose.words.internal.zzZQ4 zzR(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42);
}
