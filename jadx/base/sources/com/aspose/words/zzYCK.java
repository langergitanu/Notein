package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCK {
    public static Shading zzY(com.aspose.words.internal.zzZOX zzzox, Shading shading) throws Exception {
        if (shading == null) {
            shading = new Shading();
        }
        shading.zzZJ(zzY0E.zzhI(zzzox.zzXc()));
        shading.zzZK(zzY0E.zzhI(zzzox.zzXc()));
        shading.setTexture(zzY0C.zzhy(zzzox.zzX9() & 65535));
        if (shading.getTexture() == 65535) {
            shading.zzZK(com.aspose.words.internal.zzPV.zzHZ);
            shading.zzZJ(com.aspose.words.internal.zzPV.zzHZ);
        }
        return shading;
    }

    public static int zzYM(boolean z) {
        return z ? 10 : 2;
    }

    public static Shading zzZ(com.aspose.words.internal.zzZOX zzzox, Shading shading) throws Exception {
        if (shading == null) {
            shading = new Shading();
        }
        short sZzX9 = zzzox.zzX9();
        shading.zzZJ(zzY0E.zzhL(sZzX9 & 31));
        shading.zzZK(zzY0E.zzhL((sZzX9 & 992) >> 5));
        shading.setTexture((sZzX9 & 64512) >> 10);
        return shading;
    }

    public static void zzZ(Shading shading, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) (shading.getTexture() != 65535 ? zzY0E.zzZE(shading.zzYbJ()) | (zzY0E.zzZE(shading.zzYbK()) << 5) | (shading.getTexture() << 10) : 65535));
    }

    public static void zzY(Shading shading, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        if (shading.getTexture() == 65535) {
            zzzow.zzk(-1);
            zzzow.zzk(-1);
            zzzow.zzJ((short) -1);
        } else {
            zzzow.zzk(zzY0E.zzZC(shading.zzYbJ()));
            zzzow.zzk(zzY0E.zzZC(shading.zzYbK()));
            zzzow.zzJ((short) shading.getTexture());
        }
    }

    public static void zzZ(Shading shading, com.aspose.words.internal.zzZOW zzzow, boolean z) throws Exception {
        if (z) {
            zzY(shading, zzzow);
        } else {
            zzZ(shading, zzzow);
        }
    }
}
