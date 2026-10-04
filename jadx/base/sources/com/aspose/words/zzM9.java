package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzM9 {
    private static com.aspose.words.internal.zzPV zzX(Shading shading) {
        int texture = shading.getTexture();
        if (texture != 0) {
            if (texture == 1) {
                return shading.zzYbJ();
            }
            if (texture != 65535) {
                return zzY0C.zzY(shading.zzYbJ(), shading.zzYbK().isEmpty() ? com.aspose.words.internal.zzPV.zzI5 : shading.zzYbK(), zzY0C.zzhz(shading.getTexture()));
            }
        }
        return shading.zzYbK();
    }

    public static void zzZ(Shading shading, zzLU zzlu) {
        if (shading == null || !shading.isVisible()) {
            return;
        }
        zzlu.zzY("background-color", zzX(shading));
    }
}
