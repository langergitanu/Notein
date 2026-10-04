package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;

/* JADX INFO: loaded from: classes6.dex */
final class zzJ5 {
    private static zzJ4 zzS(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42) {
        float fMin;
        float fZzkw;
        float fMin2;
        float fZzZn;
        if (zzzq4.zzkw() < zzzq42.zzZm()) {
            fMin = zzzq4.zzkw();
            fZzkw = zzzq42.zzZm();
        } else if (zzzq4.zzZm() > zzzq42.zzkw()) {
            fMin = zzzq4.zzZm();
            fZzkw = zzzq42.zzkw();
        } else {
            fMin = (Math.min(zzzq4.zzkw(), zzzq42.zzkw()) + Math.max(zzzq4.zzZm(), zzzq42.zzZm())) / 2.0f;
            fZzkw = fMin;
        }
        if (zzzq4.zzZn() < zzzq42.zzZo()) {
            fMin2 = zzzq4.zzZn();
            fZzZn = zzzq42.zzZo();
        } else if (zzzq4.zzZo() > zzzq42.zzZn()) {
            fMin2 = zzzq4.zzZo();
            fZzZn = zzzq42.zzZn();
        } else {
            fMin2 = (Math.min(zzzq4.zzZn(), zzzq42.zzZn()) + Math.max(zzzq4.zzZo(), zzzq42.zzZo())) / 2.0f;
            fZzZn = fMin2;
        }
        return new zzJ4(com.aspose.words.internal.zzZPY.zzG(fMin, fMin2), com.aspose.words.internal.zzZPY.zzG(fZzkw, fZzZn), zzzq4, zzzq42);
    }

    private static long zzX(com.aspose.words.internal.zzZQ4 zzzq4, long j) {
        return com.aspose.words.internal.zzZPY.zzG(Math.min(Math.max(Float.intBitsToFloat((int) j), zzzq4.zzZm()), zzzq4.zzkw()), Math.min(Math.max(com.aspose.words.internal.zzZPY.zzYC(j), zzzq4.zzZo()), zzzq4.zzZn()));
    }

    private static long zzY(int i, com.aspose.words.internal.zzZQ4 zzzq4) {
        switch (i) {
            case 1:
                return com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.zzZm()), zzzq4.zzZn());
            case 2:
                return com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZn());
            case 3:
                return com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZn());
            case 4:
                return com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.zzZm()), (zzzq4.getHeight() / 2.0f) + zzzq4.zzZo());
            case 5:
                return com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), (zzzq4.getHeight() / 2.0f) + zzzq4.zzZo());
            case 6:
                return com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), (zzzq4.getHeight() / 2.0f) + zzzq4.zzZo());
            case 7:
            default:
                throw new IllegalStateException("Unexpected connector point.");
            case 8:
                return com.aspose.words.internal.zzZPY.zzG(C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.zzZm()), zzzq4.zzZo());
            case 9:
                return com.aspose.words.internal.zzZPY.zzG(zzzq4.zzZm(), zzzq4.zzZo());
            case 10:
                return com.aspose.words.internal.zzZPY.zzG(zzzq4.zzkw(), zzzq4.zzZo());
        }
    }

    public static zzJ4 zzZ(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzZQ4 zzzq42, int i, int i2) {
        long jZzY;
        long jZzY2;
        if (i == 7 || i2 == 7) {
            return zzS(zzzq4, zzzq42);
        }
        if (i == 0 && i2 == 0) {
            return zzS(zzzq4, zzzq42);
        }
        if (i == 0) {
            jZzY2 = zzY(i2, zzzq42);
            jZzY = zzX(zzzq4, jZzY2);
        } else if (i2 == 0) {
            jZzY = zzY(i, zzzq4);
            jZzY2 = zzX(zzzq42, jZzY);
        } else {
            jZzY = zzY(i, zzzq4);
            jZzY2 = zzY(i2, zzzq42);
        }
        return new zzJ4(jZzY, jZzY2, zzzq4, zzzq42);
    }
}
