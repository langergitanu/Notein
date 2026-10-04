package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFH {
    public static void zzZ(zzYEM zzyem, Shading shading, String str, String str2, String str3, String str4) throws Exception {
        zzYHZ zzyhzZzYfW = zzyem.zzYfW();
        int texture = shading.getTexture();
        if (texture == 0) {
            zzyhzZzYfW.zzt(str3, zzyem.zzZM(shading.zzYbJ()), 0);
            zzyhzZzYfW.zzZ5(str2, zzyem.zzZM(shading.zzYbK()));
            return;
        }
        if (texture == 1) {
            zzyhzZzYfW.zzZ5(str, 10000);
            zzyhzZzYfW.zzt(str2, zzyem.zzZM(shading.zzYbK()), 0);
            zzyhzZzYfW.zzZ5(str3, zzyem.zzZM(shading.zzYbJ()));
        } else if (texture != 65535) {
            double dZzhz = zzY0C.zzhz(shading.getTexture());
            if (str4 == null) {
                zzyhzZzYfW.zzZ5(str, zzYEO.zzWi(dZzhz));
            } else {
                zzyhzZzYfW.zzCD(str4);
            }
            zzyhzZzYfW.zzZ5(str2, zzyem.zzZM(shading.zzYbK()));
            zzyhzZzYfW.zzZ5(str3, zzyem.zzZM(shading.zzYbJ()));
        }
    }
}
