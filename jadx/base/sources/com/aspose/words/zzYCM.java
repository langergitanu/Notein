package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYCM {
    private static com.aspose.words.internal.zzPY zzN(Shading shading) {
        com.aspose.words.internal.zzPV zzpvZz6 = zzZN8.zz6(shading.zzYbK());
        com.aspose.words.internal.zzPV zzpvZz5 = zzZN8.zz5(shading.zzYbJ());
        int texture = shading.getTexture();
        if (zzpvZz6.isEmpty() && (texture == 65535 || texture == 0)) {
            return null;
        }
        return zzY0C.zzhx(texture) ? new com.aspose.words.internal.zzPK(zzms(texture), zzpvZz5, zzpvZz6) : new com.aspose.words.internal.zzOI(zzY0C.zzY(zzpvZz5, zzpvZz6, zzY0C.zzhz(shading.getTexture())));
    }

    public static com.aspose.words.internal.zzZG zzZ(com.aspose.words.internal.zzZQ4 zzzq4, Shading shading) {
        if (zzzq4.isEmpty() || !shading.isVisible()) {
            return null;
        }
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
        zzzgZzW.zzY(zzN(shading));
        return zzzgZzW;
    }

    private static int zzms(int i) {
        switch (i) {
            case 14:
                return 29;
            case 15:
                return 28;
            case 16:
                return 20;
            case 17:
                return 21;
            case 18:
                return 49;
            case 19:
                return 46;
            case 20:
                return 25;
            case 21:
                return 24;
            case 22:
                return 18;
            case 23:
                return 19;
            case 24:
                return 48;
            case 25:
                return 51;
            default:
                return 0;
        }
    }

    public static void zzZ(com.aspose.words.internal.zzZQ4 zzzq4, Shading shading, zzZ71 zzz71) {
        com.aspose.words.internal.zzZG zzzgZzZ = zzZ(zzzq4, shading);
        if (zzzgZzZ != null) {
            zzz71.zzS(zzzgZzZ);
        }
    }
}
